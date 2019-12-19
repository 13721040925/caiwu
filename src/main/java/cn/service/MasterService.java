package cn.service;

import cn.pojo.Master;

public interface MasterService {
	Master checkName(String name);

	Master login(Master master);

	int updateMaster(Master master);
}
