package com.xiaobao.mall.client;
import java.util.List;
import java.util.Map;

import com.xiaobao.mall.config.DmConfiguration;
import com.xiaobao.mall.fallback.DmKeywordSortClientFallBack;
import com.xiaobao.mall.pojo.DmKeywordSort;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;
/**
* Created by dm
*/
@FeignClient(name = "dm-item-provider", configuration = DmConfiguration.class, fallback = DmKeywordSortClientFallBack.class)
public interface RestDmKeywordSortClient {

@RequestMapping(value = "/getDmKeywordSortById",method = RequestMethod.POST)
public DmKeywordSort getDmKeywordSortById(@RequestParam("id") Long id)throws Exception;

@RequestMapping(value = "/getDmKeywordSortListByMap",method = RequestMethod.POST)
public List<DmKeywordSort> getDmKeywordSortListByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/getDmKeywordSortCountByMap",method = RequestMethod.POST)
public Integer getDmKeywordSortCountByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/qdtxAddDmKeywordSort",method = RequestMethod.POST)
public Integer qdtxAddDmKeywordSort(@RequestBody DmKeywordSort dmKeywordSort)throws Exception;

@RequestMapping(value = "/qdtxModifyDmKeywordSort",method = RequestMethod.POST)
public Integer qdtxModifyDmKeywordSort(@RequestBody DmKeywordSort dmKeywordSort)throws Exception;
}
