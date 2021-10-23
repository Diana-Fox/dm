package com.xiaobao.ticket.client;

import com.xiaobao.ticket.config.DmConfiguration;
import com.xiaobao.ticket.fallback.DmImageClientFallBack;
import com.xiaobao.ticket.pojo.DmImage;
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
@FeignClient(name = "dm-item-provider", configuration = DmConfiguration.class, fallback = DmImageClientFallBack.class)
public interface RestDmImageClient {

    @RequestMapping(value = "/getDmImageById", method = RequestMethod.POST)
    public DmImage getDmImageById(@RequestParam("id") Long id) throws Exception;

    @RequestMapping(value = "/getDmImageListByMap", method = RequestMethod.POST)
    public List<DmImage> getDmImageListByMap(@RequestParam Map<String, Object> param) throws Exception;

    @RequestMapping(value = "/getDmImageCountByMap", method = RequestMethod.POST)
    public Integer getDmImageCountByMap(@RequestParam Map<String, Object> param) throws Exception;

    @RequestMapping(value = "/qdtxAddDmImage", method = RequestMethod.POST)
    public Integer qdtxAddDmImage(@RequestBody DmImage dmImage) throws Exception;

    @RequestMapping(value = "/qdtxModifyDmImage", method = RequestMethod.POST)
    public Integer qdtxModifyDmImage(@RequestBody DmImage dmImage) throws Exception;

    @RequestMapping(value = "/queryModifyDmImage", method = RequestMethod.POST)
    public List<DmImage> queryDmImageList(@RequestParam("targetId") Long targetId,
                                          @RequestParam("type") Integer type,
                                          @RequestParam("category") Integer category) throws Exception;
}
