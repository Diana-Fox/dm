package com.xiaobao.ticket.mapper;

import com.xiaobao.ticket.pojo.DmScheduler;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface DmSchedulerMapper {

	public DmScheduler getDmSchedulerById(@Param(value = "id") Long id)throws Exception;

	public List<DmScheduler>	getDmSchedulerListByMap(Map<String,Object> param)throws Exception;

	public Integer getDmSchedulerCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertDmScheduler(DmScheduler dmScheduler)throws Exception;

	public Integer updateDmScheduler(DmScheduler dmScheduler)throws Exception;

	public Integer deleteDmSchedulerById(@Param(value = "id") Long id)throws Exception;

	public Integer batchDeleteDmScheduler(Map<String,List<String>> params);

}
