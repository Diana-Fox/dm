package com.xiaobao.ticket.mapper;

import com.xiaobao.ticket.pojo.DmSchedulerSeat;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface DmSchedulerSeatMapper {

	public DmSchedulerSeat getDmSchedulerSeatById(@Param(value = "id") Long id)throws Exception;

	public List<DmSchedulerSeat>	getDmSchedulerSeatListByMap(Map<String,Object> param)throws Exception;

	public Integer getDmSchedulerSeatCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertDmSchedulerSeat(DmSchedulerSeat dmSchedulerSeat)throws Exception;

	public Integer updateDmSchedulerSeat(DmSchedulerSeat dmSchedulerSeat)throws Exception;

	public Integer deleteDmSchedulerSeatById(@Param(value = "id") Long id)throws Exception;

	public Integer batchDeleteDmSchedulerSeat(Map<String,List<String>> params);

}
