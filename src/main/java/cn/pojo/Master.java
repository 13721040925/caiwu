package cn.pojo;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component("master")
public class Master implements Serializable  {
	private static final long serialVersionUID = -6506924321704264684L;
	private Integer id;
	private String name;
	private String truename;
	private String pass;
	private String joindate;
	private Integer departmentid;
	private Integer loginnum;
	private String ipaddress;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTruename() {
		return truename;
	}
	public void setTruename(String truename) {
		this.truename = truename;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getJoindate() {
		return joindate;
	}
	public void setJoindate(String joindate) {
		this.joindate = joindate;
	}
	public Integer getDepartmentid() {
		return departmentid;
	}
	public void setDepartmentid(Integer departmentid) {
		this.departmentid = departmentid;
	}
	public Integer getLoginnum() {
		return loginnum;
	}
	public void setLoginnum(Integer loginnum) {
		this.loginnum = loginnum;
	}
	public String getIpaddress() {
		return ipaddress;
	}
	public void setIpaddress(String ipaddress) {
		this.ipaddress = ipaddress;
	}
	@Override
	public String toString() {
		return "Master [id=" + id + ", name=" + name + ", truename=" + truename + ", pass=" + pass + ", joindate="
				+ joindate + ", departmentid=" + departmentid + ", loginnum=" + loginnum + ", ipaddress=" + ipaddress
				+ "]";
	}
	
}
