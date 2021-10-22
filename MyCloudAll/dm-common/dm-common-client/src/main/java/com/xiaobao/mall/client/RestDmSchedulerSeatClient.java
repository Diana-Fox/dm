package com.xiaobao.mall.client;
import java.util.List;
import java.util.Map;

import com.xiaobao.mall.config.DmConfiguration;
import com.xiaobao.mall.fallback.DmSchedulerSeatClientFallBack;
import com.xiaobao.mall.pojo.DmSchedulerSeat;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;
/**
* Created by dm
*/
@FeignClient(name = "dm-user-provider", configuration = DmConfiguration.class, fallback = DmSchedulerSeatClientFallBack.class)
public interface RestDmSchedulerSeatClient {
@RequestMapping(value = "/getDmSchedulerSeatById",method = RequestMethod.POST)
public DmSchedulerSeat getDmSchedulerSeatById(@RequestParam("id") Long id)throws Exception;

@RequestMapping(value = "/getDmSchedulerSeatListByMap",method = RequestMethod.POST)
public List<DmSchedulerSeat> getDmSchedulerSeatListByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/getDmSchedulerSeatCountByMap",method = RequestMethod.POST)
public Integer getDmSchedulerSeatCountByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/qdtxAddDmSchedulerSeat",method = RequestMethod.POST)
public Integer qdtxAddDmSchedulerSeat(@RequestBody DmSchedulerSeat dmSchedulerSeat)throws Exception;

@RequestMapping(value = "/qdtxModifyDmSchedulerSeat",method = RequestMethod.POST)
public Integer qdtxModifyDmSchedulerSeat(@RequestBody DmSchedulerSeat dmSchedulerSeat)throws Exception;
}

