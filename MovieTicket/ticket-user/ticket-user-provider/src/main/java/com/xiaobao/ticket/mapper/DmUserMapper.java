package com.xiaobao.ticket.mapper;

import com.xiaobao.ticket.pojo.DmUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface DmUserMapper {

    DmUser getDmUserById(@Param(value = "id") Long id) throws Exception;

    List<DmUser> getDmUserListByMap(Map<String, Object> param) throws Exception;

    Integer getDmUserCountByMap(Map<String, Object> param) throws Exception;

    Integer insertDmUser(DmUser dmUser) throws Exception;

    Integer updateDmUser(DmUser dmUser) throws Exception;

    Integer deleteDmUserById(@Param(value = "id") Long id) throws Exception;

    Integer batchDeleteDmUser(Map<String, List<String>> params);

}
