package com.xiaobao.mall.service;

import com.xiaobao.mall.mapper.DmImageMapper;
import com.xiaobao.mall.pojo.DmImage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Map;
/**
 * Created by dm
 */
@RestController
public class RestDmImageService {

     @Autowired
     private DmImageMapper dmImageMapper;

     @RequestMapping(value = "/getDmImageById",method = RequestMethod.POST)
     public DmImage getDmImageById(@RequestParam("id") Long id)throws Exception{
        return dmImageMapper.getDmImageById(id);
     }

     @RequestMapping(value = "/getDmImageListByMap",method = RequestMethod.POST)
     public List<DmImage> getDmImageListByMap(@RequestParam Map<String,Object> param)throws Exception{
        return dmImageMapper.getDmImageListByMap(param);
     }

     @RequestMapping(value = "/getDmImageCountByMap",method = RequestMethod.POST)
     public Integer getDmImageCountByMap(@RequestParam Map<String,Object> param)throws Exception{
        return dmImageMapper.getDmImageCountByMap(param);
     }

     @RequestMapping(value = "/qdtxAddDmImage",method = RequestMethod.POST)
     public Integer qdtxAddDmImage(@RequestBody DmImage dmImage)throws Exception{
        dmImage.setCreatedTime(new Date());
        return dmImageMapper.insertDmImage(dmImage);
     }

     @RequestMapping(value = "/qdtxModifyDmImage",method = RequestMethod.POST)
     public Integer qdtxModifyDmImage(@RequestBody DmImage dmImage)throws Exception{
        dmImage.setUpdatedTime(new Date());
        return dmImageMapper.updateDmImage(dmImage);
     }
}
