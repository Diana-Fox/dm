package com.xiaobao.ticket.fallback;

import com.xiaobao.ticket.client.RestDmSchedulerSeatClient;
import com.xiaobao.ticket.pojo.DmSchedulerSeat;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class DmSchedulerSeatClientFallBack implements RestDmSchedulerSeatClient {


    @Override
    public DmSchedulerSeat getDmSchedulerSeatById(Long id)throws Exception{
        return null;
    }

    @Override
    public List<DmSchedulerSeat>	getDmSchedulerSeatListByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer getDmSchedulerSeatCountByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxAddDmSchedulerSeat(DmSchedulerSeat dmSchedulerSeat)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxModifyDmSchedulerSeat(DmSchedulerSeat dmSchedulerSeat)throws Exception{
        return null;
    }
}
