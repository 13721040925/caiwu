package cn.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cn.mapper.MasterMapper;
import cn.pojo.Master;

@Service("masterService")
@Transactional(propagation = Propagation.REQUIRED, timeout = -1)
public class MasterServiceImpl implements MasterService {
	@Resource
	private MasterMapper mapper;

	@Override
	public Master checkName(String name) {
		// TODO Auto-generated method stub
		return mapper.checkName(name);
	}

	@Override
	public Master login(Master master) {
		// TODO Auto-generated method stub
		return mapper.login(master);
	}

	@Override
	public int updateMaster(Master master) {
		// TODO Auto-generated method stub
		return mapper.updateMaster(master);
	}

}
