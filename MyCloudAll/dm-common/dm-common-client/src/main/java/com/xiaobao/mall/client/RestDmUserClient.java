package com.xiaobao.mall.client;
import java.util.List;
import java.util.Map;

import com.xiaobao.mall.config.DmConfiguration;
import com.xiaobao.mall.fallback.DmUserClientFallBack;
import com.xiaobao.mall.pojo.DmUser;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;
/**
* Created by dm
*/
@FeignClient(name = "dm-user-provider", configuration = DmConfiguration.class, fallback = DmUserClientFallBack.class)
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

