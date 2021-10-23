package com.xiaobao.ticket.service;

import com.xiaobao.ticket.common.ImageCommon;
import com.xiaobao.ticket.pojo.DmImage;
import com.xiaobao.ticket.mapper.DmImageMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * Created by dm
 */
@RestController
public class RestDmImageService {

    @Autowired
    private DmImageMapper dmImageMapper;

    @RequestMapping(value = "/getDmImageById", method = RequestMethod.POST)
    public DmImage getDmImageById(@RequestParam("id") Long id) throws Exception {
        return dmImageMapper.getDmImageById(id);
    }

    @RequestMapping(value = "/getDmImageListByMap", method = RequestMethod.POST)
    public List<DmImage> getDmImageListByMap(@RequestParam Map<String, Object> param) throws Exception {
        return dmImageMapper.getDmImageListByMap(param);
    }

    @RequestMapping(value = "/getDmImageCountByMap", method = RequestMethod.POST)
    public Integer getDmImageCountByMap(@RequestParam Map<String, Object> param) throws Exception {
        return dmImageMapper.getDmImageCountByMap(param);
    }

    @RequestMapping(value = "/qdtxAddDmImage", method = RequestMethod.POST)
    public Integer qdtxAddDmImage(@RequestBody DmImage dmImage) throws Exception {
        dmImage.setCreatedTime(new Date());
        return dmImageMapper.insertDmImage(dmImage);
    }

    @RequestMapping(value = "/qdtxModifyDmImage", method = RequestMethod.POST)
    public Integer qdtxModifyDmImage(@RequestBody DmImage dmImage) throws Exception {
        dmImage.setUpdatedTime(new Date());
        return dmImageMapper.updateDmImage(dmImage);
    }

    /**
     * @param targetId 商品ID
     * @param type     图片类型
     * @param category 图片分类
     * @return 图片集合
     * @throws Exception
     */
    @RequestMapping(value = "/queryModifyDmImage", method = RequestMethod.POST)
    public List<DmImage> queryDmImageList(@RequestParam("targetId") Long targetId,
                                          @RequestParam("type") Integer type,
                                          @RequestParam("category") Integer category) throws Exception {
        HashMap<String, Object> imageParam = new HashMap<>();
        imageParam.put("targetId", targetId);
        imageParam.put("type", type);
        imageParam.put("category", category);
        List<DmImage> dmImageList = dmImageMapper.getDmImageListByMap(imageParam);
        ImageCommon.setDefaultImageList(dmImageList, category, type);
        return dmImageList;
    }


}
