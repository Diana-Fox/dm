package com.xiaobao.ticket.client;

import com.xiaobao.ticket.config.DmConfiguration;
import com.xiaobao.ticket.fallback.DmItemClientFallBack;
import com.xiaobao.ticket.pojo.DmItem;
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
@FeignClient(name = "dm-user-provider", configuration = DmConfiguration.class, fallback = DmItemClientFallBack.class)
public interface RestDmItemClient {
@RequestMapping(value = "/getDmItemById",method = RequestMethod.POST)
public DmItem getDmItemById(@RequestParam("id") Long id)throws Exception;

@RequestMapping(value = "/getDmItemListByMap",method = RequestMethod.POST)
public List<DmItem> getDmItemListByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/getDmItemCountByMap",method = RequestMethod.POST)
public Integer getDmItemCountByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/qdtxAddDmItem",method = RequestMethod.POST)
public Integer qdtxAddDmItem(@RequestBody DmItem dmItem)throws Exception;

@RequestMapping(value = "/qdtxModifyDmItem",method = RequestMethod.POST)
public Integer qdtxModifyDmItem(@RequestBody DmItem dmItem)throws Exception;
}

