package com.xiaobao.mall.fallback;

import com.xiaobao.mall.client.RestDmAreaClient;
import com.xiaobao.mall.pojo.DmArea;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
@Component
public class DmAreaClientFallBack implements RestDmAreaClient {


    @Override
    public DmArea getDmAreaById(Long id)throws Exception{
        return null;
    }

    @Override
    public List<DmArea> getDmAreaListByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer getDmAreaCountByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxAddDmArea(DmArea dmArea)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxModifyDmArea(DmArea dmArea)throws Exception{
        return null;
    }
}
