package com.xiaobao.ticket.service;

import com.xiaobao.ticket.mapper.DmOrderLinkUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.xiaobao.ticket.pojo.DmOrderLinkUser;

import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Map;
/**
 * Created by dm
 */
@RestController
public class RestDmOrderLinkUserService {

     @Autowired
     private DmOrderLinkUserMapper dmOrderLinkUserMapper;

     @RequestMapping(value = "/getDmOrderLinkUserById",method = RequestMethod.POST)
     public DmOrderLinkUser getDmOrderLinkUserById(@RequestParam("id") Long id)throws Exception{
        return dmOrderLinkUserMapper.getDmOrderLinkUserById(id);
     }

     @RequestMapping(value = "/getDmOrderLinkUserListByMap",method = RequestMethod.POST)
     public List<DmOrderLinkUser>	getDmOrderLinkUserListByMap(@RequestParam Map<String,Object> param)throws Exception{
        return dmOrderLinkUserMapper.getDmOrderLinkUserListByMap(param);
     }

     @RequestMapping(value = "/getDmOrderLinkUserCountByMap",method = RequestMethod.POST)
     public Integer getDmOrderLinkUserCountByMap(@RequestParam Map<String,Object> param)throws Exception{
        return dmOrderLinkUserMapper.getDmOrderLinkUserCountByMap(param);
     }

     @RequestMapping(value = "/qdtxAddDmOrderLinkUser",method = RequestMethod.POST)
     public Integer qdtxAddDmOrderLinkUser(@RequestBody DmOrderLinkUser dmOrderLinkUser)throws Exception{
        dmOrderLinkUser.setCreatedTime(new Date());
        return dmOrderLinkUserMapper.insertDmOrderLinkUser(dmOrderLinkUser);
     }

     @RequestMapping(value = "/qdtxModifyDmOrderLinkUser",method = RequestMethod.POST)
     public Integer qdtxModifyDmOrderLinkUser(@RequestBody DmOrderLinkUser dmOrderLinkUser)throws Exception{
        dmOrderLinkUser.setUpdatedTime(new Date());
        return dmOrderLinkUserMapper.updateDmOrderLinkUser(dmOrderLinkUser);
     }

    @RequestMapping(value = "/deleteDmOrderLinkUserByOrderId",method = RequestMethod.POST)
    public Integer deleteDmOrderLinkUserByOrderId(@RequestParam("orderId") Long orderId)throws Exception{
        return dmOrderLinkUserMapper.deleteDmOrderLinkUserByOrderId(orderId);
    }
}
