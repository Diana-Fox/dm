package com.xiaobao.mall.client;
import java.util.List;
import java.util.Map;

import com.xiaobao.mall.config.DmConfiguration;
import com.xiaobao.mall.fallback.DmItemCommentClientFallBack;
import com.xiaobao.mall.pojo.DmItemComment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;
/**
* Created by dm
*/
@FeignClient(name = "dm-user-provider", configuration = DmConfiguration.class, fallback = DmItemCommentClientFallBack.class)
public interface RestDmItemCommentClient {
@RequestMapping(value = "/getDmItemCommentById",method = RequestMethod.POST)
public DmItemComment getDmItemCommentById(@RequestParam("id") Long id)throws Exception;

@RequestMapping(value = "/getDmItemCommentListByMap",method = RequestMethod.POST)
public List<DmItemComment> getDmItemCommentListByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/getDmItemCommentCountByMap",method = RequestMethod.POST)
public Integer getDmItemCommentCountByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/qdtxAddDmItemComment",method = RequestMethod.POST)
public Integer qdtxAddDmItemComment(@RequestBody DmItemComment dmItemComment)throws Exception;

@RequestMapping(value = "/qdtxModifyDmItemComment",method = RequestMethod.POST)
public Integer qdtxModifyDmItemComment(@RequestBody DmItemComment dmItemComment)throws Exception;
}

