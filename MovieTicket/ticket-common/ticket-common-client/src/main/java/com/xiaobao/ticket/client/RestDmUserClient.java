package com.xiaobao.ticket.client;

import com.xiaobao.ticket.config.DmConfiguration;
import com.xiaobao.ticket.fallback.DmUserClientFallBack;
import com.xiaobao.ticket.pojo.DmUser;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

/**
* Created by dm
*/
@FeignClient(name = "CLOUD-USER-PROVIDER", configuration = DmConfiguration.class, fallback = DmUserClientFallBack.class)
public interface RestDmUserClient {
@RequestMapping(value = "/getDmUserById",method = RequestMethod.POST)
public DmUser getDmUserById(@RequestParam("id") Long id)throws Exception;

@RequestMapping(value = "/getDmUserListByMap",method = RequestMethod.POST)
public List<DmUser>	getDmUserListByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/getDmUserCountByMap",method = RequestMethod.POST)
public Integer getDmUserCountByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/qdtxAddDmUser",method = RequestMethod.POST)
public Integer qdtxAddDmUser(@RequestBody DmUser dmUser)throws Exception;

@RequestMapping(value = "/qdtxModifyDmUser",method = RequestMethod.POST)
public Integer qdtxModifyDmUser(@RequestBody DmUser dmUser)throws Exception;
}

