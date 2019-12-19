package cn.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;

import cn.pojo.Master;
import cn.service.MasterService;
import cn.util.IPUtil;

@Controller
@RequestMapping("/ice")
public class MainController {
	@Resource
	private MasterService masterService;

	@RequestMapping("/tologin")
	public String tologin() {
		return "login";
	}

	@RequestMapping(value = "/checkName", produces = "application/json;charset=utf-8")
	@ResponseBody
	public String update(@RequestParam(name = "name") String name) {
		Master master = masterService.checkName(name);
		if (master != null) {
			return JSON.toJSONString("ok");
		}
		return null;
	}

	@RequestMapping(value = "/checkPass", produces = "application/json;charset=utf-8")
	@ResponseBody
	public String checkPass(@RequestParam(name = "name") String name, @RequestParam(name = "pass") String pass) {
		Master m = new Master();
		m.setName(name);
		m.setPass(pass);
		Master master = masterService.login(m);
		if (master != null) {
			Integer loginnum = master.getLoginnum() + 1;
			master.setLoginnum(loginnum);
			String ipaddress = IPUtil.getIP();
			master.setIpaddress(ipaddress);
			int i = masterService.updateMaster(master);
			if (i > 0) {
				return JSON.toJSONString("ok");
			}

		}
		return null;
	}
}
