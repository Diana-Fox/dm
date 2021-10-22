package com.xiaobao.mall.client;
import java.util.List;
import java.util.Map;

import com.xiaobao.mall.config.DmConfiguration;
import com.xiaobao.mall.fallback.DmSchedulerSeatPriceClientFallBack;
import com.xiaobao.mall.pojo.DmSchedulerSeatPrice;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;
/**
* Created by dm
*/
@FeignClient(name = "dm-user-provider", configuration = DmConfiguration.class, fallback = DmSchedulerSeatPriceClientFallBack.class)
public interface RestDmSchedulerSeatPriceClient {
@RequestMapping(value = "/getDmSchedulerSeatPriceById",method = RequestMethod.POST)
public DmSchedulerSeatPrice getDmSchedulerSeatPriceById(@RequestParam("id") Long id)throws Exception;

@RequestMapping(value = "/getDmSchedulerSeatPriceListByMap",method = RequestMethod.POST)
public List<DmSchedulerSeatPrice> getDmSchedulerSeatPriceListByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/getDmSchedulerSeatPriceCountByMap",method = RequestMethod.POST)
public Integer getDmSchedulerSeatPriceCountByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/qdtxAddDmSchedulerSeatPrice",method = RequestMethod.POST)
public Integer qdtxAddDmSchedulerSeatPrice(@RequestBody DmSchedulerSeatPrice dmSchedulerSeatPrice)throws Exception;

@RequestMapping(value = "/qdtxModifyDmSchedulerSeatPrice",method = RequestMethod.POST)
public Integer qdtxModifyDmSchedulerSeatPrice(@RequestBody DmSchedulerSeatPrice dmSchedulerSeatPrice)throws Exception;
}

