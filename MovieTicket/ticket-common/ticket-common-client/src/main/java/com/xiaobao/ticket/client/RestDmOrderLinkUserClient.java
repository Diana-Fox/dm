package com.xiaobao.ticket.client;

import com.xiaobao.ticket.config.DmConfiguration;
import com.xiaobao.ticket.fallback.DmOrderLinkUserClientFallBack;
import com.xiaobao.ticket.pojo.DmOrderLinkUser;
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
@FeignClient(name = "dm-order-provider", configuration = DmConfiguration.class, fallback = DmOrderLinkUserClientFallBack.class)
public interface RestDmOrderLinkUserClient {
@RequestMapping(value = "/getDmOrderLinkUserById",method = RequestMethod.POST)
public DmOrderLinkUser getDmOrderLinkUserById(@RequestParam("id") Long id)throws Exception;

@RequestMapping(value = "/getDmOrderLinkUserListByMap",method = RequestMethod.POST)
public List<DmOrderLinkUser> getDmOrderLinkUserListByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/getDmOrderLinkUserCountByMap",method = RequestMethod.POST)
public Integer getDmOrderLinkUserCountByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/qdtxAddDmOrderLinkUser",method = RequestMethod.POST)
public Integer qdtxAddDmOrderLinkUser(@RequestBody DmOrderLinkUser dmOrderLinkUser)throws Exception;

@RequestMapping(value = "/qdtxModifyDmOrderLinkUser",method = RequestMethod.POST)
public Integer qdtxModifyDmOrderLinkUser(@RequestBody DmOrderLinkUser dmOrderLinkUser)throws Exception;
}

