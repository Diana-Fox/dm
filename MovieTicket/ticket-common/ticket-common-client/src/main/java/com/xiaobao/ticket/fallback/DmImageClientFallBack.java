package com.xiaobao.ticket.fallback;

import com.xiaobao.ticket.client.RestDmImageClient;
import com.xiaobao.ticket.pojo.DmImage;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class DmImageClientFallBack implements RestDmImageClient {


    @Override
    public DmImage getDmImageById(Long id)throws Exception{
        return null;
    }

    @Override
    public List<DmImage> getDmImageListByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer getDmImageCountByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxAddDmImage(DmImage dmImage)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxModifyDmImage(DmImage dmImage)throws Exception{
        return null;
    }

    @Override
    public List<DmImage> queryDmImageList(Long targetId, Integer type, Integer category) throws Exception {
        return null;
    }
}
