package com.xiaobao.ticket.client;

import com.xiaobao.ticket.config.DmConfiguration;
import com.xiaobao.ticket.fallback.DmCinemaSeatClientFallBack;
import com.xiaobao.ticket.pojo.DmCinemaSeat;
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
@FeignClient(name = "dm-user-provider", configuration = DmConfiguration.class, fallback = DmCinemaSeatClientFallBack.class)
public interface RestDmCinemaSeatClient {
@RequestMapping(value = "/getDmCinemaSeatById",method = RequestMethod.POST)
public DmCinemaSeat getDmCinemaSeatById(@RequestParam("id") Long id)throws Exception;

@RequestMapping(value = "/getDmCinemaSeatListByMap",method = RequestMethod.POST)
public List<DmCinemaSeat> getDmCinemaSeatListByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/getDmCinemaSeatCountByMap",method = RequestMethod.POST)
public Integer getDmCinemaSeatCountByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/qdtxAddDmCinemaSeat",method = RequestMethod.POST)
public Integer qdtxAddDmCinemaSeat(@RequestBody DmCinemaSeat dmCinemaSeat)throws Exception;

@RequestMapping(value = "/qdtxModifyDmCinemaSeat",method = RequestMethod.POST)
public Integer qdtxModifyDmCinemaSeat(@RequestBody DmCinemaSeat dmCinemaSeat)throws Exception;
}

