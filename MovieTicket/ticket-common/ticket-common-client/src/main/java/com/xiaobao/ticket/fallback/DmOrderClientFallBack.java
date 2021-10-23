package com.xiaobao.ticket.fallback;

import com.xiaobao.ticket.client.RestDmOrderClient;
import com.xiaobao.ticket.pojo.DmOrder;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class DmOrderClientFallBack implements RestDmOrderClient {


    @Override
    public DmOrder getDmOrderById(Long id)throws Exception{
        return null;
    }

    @Override
    public List<DmOrder>	getDmOrderListByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer getDmOrderCountByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxAddDmOrder(DmOrder dmOrder)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxModifyDmOrder(DmOrder dmOrder)throws Exception{
        return null;
    }
}
