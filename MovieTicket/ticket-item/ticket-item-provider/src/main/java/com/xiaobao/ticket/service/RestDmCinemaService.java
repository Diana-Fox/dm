package com.xiaobao.ticket.service;

import com.xiaobao.ticket.mapper.DmCinemaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xiaobao.ticket.pojo.DmCinema;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Map;
/**
 * Created by dm
 */
@RestController
public class RestDmCinemaService {

     @Autowired
     private DmCinemaMapper dmCinemaMapper;

     @RequestMapping(value = "/getDmCinemaById",method = RequestMethod.POST)
     public DmCinema getDmCinemaById(@RequestParam("id") Long id)throws Exception{
        return dmCinemaMapper.getDmCinemaById(id);
     }

     @RequestMapping(value = "/getDmCinemaListByMap",method = RequestMethod.POST)
     public List<DmCinema>	getDmCinemaListByMap(@RequestParam Map<String,Object> param)throws Exception{
        return dmCinemaMapper.getDmCinemaListByMap(param);
     }

     @RequestMapping(value = "/getDmCinemaCountByMap",method = RequestMethod.POST)
     public Integer getDmCinemaCountByMap(@RequestParam Map<String,Object> param)throws Exception{
        return dmCinemaMapper.getDmCinemaCountByMap(param);
     }

     @RequestMapping(value = "/qdtxAddDmCinema",method = RequestMethod.POST)
     public Integer qdtxAddDmCinema(@RequestBody DmCinema dmCinema)throws Exception{
        dmCinema.setCreatedTime(new Date());
        return dmCinemaMapper.insertDmCinema(dmCinema);
     }

     @RequestMapping(value = "/qdtxModifyDmCinema",method = RequestMethod.POST)
     public Integer qdtxModifyDmCinema(@RequestBody DmCinema dmCinema)throws Exception{
        dmCinema.setUpdatedTime(new Date());
        return dmCinemaMapper.updateDmCinema(dmCinema);
     }
}
