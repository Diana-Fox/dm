package com.xiaobao.ticket.mapper;

import com.xiaobao.ticket.pojo.DmLinkUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface DmLinkUserMapper {

	public DmLinkUser getDmLinkUserById(@Param(value = "id") Long id)throws Exception;

	public List<DmLinkUser>	getDmLinkUserListByMap(Map<String,Object> param)throws Exception;

	public Integer getDmLinkUserCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertDmLinkUser(DmLinkUser dmLinkUser)throws Exception;

	public Integer updateDmLinkUser(DmLinkUser dmLinkUser)throws Exception;

	public Integer deleteDmLinkUserById(@Param(value = "id") Long id)throws Exception;

	public Integer batchDeleteDmLinkUser(Map<String,List<String>> params);

}
