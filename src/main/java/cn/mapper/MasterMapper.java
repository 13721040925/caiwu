package cn.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import cn.pojo.Master;

public interface MasterMapper {
	@Select(" select * from master where name=#{name} ")
	Master checkName(@Param("pay_id") String name);

	@Select(" select * from master where name=#{name} and pass=#{pass} ")
	Master login(Master master);

	int updateMaster(Master master);
}
