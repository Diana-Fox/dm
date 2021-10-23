package com.xiaobao.ticket.fallback;

import com.xiaobao.ticket.client.RestDmItemTypeClient;
import com.xiaobao.ticket.pojo.DmItemType;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class DmItemTypeClientFallBack implements RestDmItemTypeClient {
    @Override
    public DmItemType getDmItemTypeById(Long id)throws Exception{
        return null;
    }

    @Override
    public List<DmItemType> getDmItemTypeListByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer getDmItemTypeCountByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxAddDmItemType(DmItemType dmItemType)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxModifyDmItemType(DmItemType dmItemType)throws Exception{
        return null;
    }
}
