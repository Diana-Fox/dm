package com.xiaobao.ticket.client;

import com.xiaobao.ticket.config.DmConfiguration;
import com.xiaobao.ticket.fallback.DmCinemaClientFallBack;
import com.xiaobao.ticket.pojo.DmCinema;
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
@FeignClient(name = "dm-user-provider", configuration = DmConfiguration.class, fallback = DmCinemaClientFallBack.class)
public interface RestDmCinemaClient {
@RequestMapping(value = "/getDmCinemaById",method = RequestMethod.POST)
public DmCinema getDmCinemaById(@RequestParam("id") Long id)throws Exception;

@RequestMapping(value = "/getDmCinemaListByMap",method = RequestMethod.POST)
public List<DmCinema> getDmCinemaListByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/getDmCinemaCountByMap",method = RequestMethod.POST)
public Integer getDmCinemaCountByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/qdtxAddDmCinema",method = RequestMethod.POST)
public Integer qdtxAddDmCinema(@RequestBody DmCinema dmCinema)throws Exception;

@RequestMapping(value = "/qdtxModifyDmCinema",method = RequestMethod.POST)
public Integer qdtxModifyDmCinema(@RequestBody DmCinema dmCinema)throws Exception;
}

