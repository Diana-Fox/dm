package com.xiaobao.mall.client;
import com.xiaobao.mall.config.DmConfiguration;
import com.xiaobao.mall.fallback.DmAreaClientFallBack;
import com.xiaobao.mall.pojo.DmArea;
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
@FeignClient(name = "dm-item-provider", configuration = DmConfiguration.class, fallback = DmAreaClientFallBack.class)
public interface RestDmAreaClient {

@RequestMapping(value = "/getDmAreaById",method = RequestMethod.POST)
public DmArea getDmAreaById(@RequestParam("id") Long id)throws Exception;

@RequestMapping(value = "/getDmAreaListByMap",method = RequestMethod.POST)
public List<DmArea> getDmAreaListByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/getDmAreaCountByMap",method = RequestMethod.POST)
public Integer getDmAreaCountByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/qdtxAddDmArea",method = RequestMethod.POST)
public Integer qdtxAddDmArea(@RequestBody DmArea dmArea)throws Exception;

@RequestMapping(value = "/qdtxModifyDmArea",method = RequestMethod.POST)
public Integer qdtxModifyDmArea(@RequestBody DmArea dmArea)throws Exception;
}
