package com.xiaobao.ticket.fallback;

import com.xiaobao.ticket.client.RestDmCinemaClient;
import com.xiaobao.ticket.pojo.DmCinema;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class DmCinemaClientFallBack implements RestDmCinemaClient {


    @Override
    public DmCinema getDmCinemaById(Long id)throws Exception{
        return null;
    }

    @Override
    public List<DmCinema>	getDmCinemaListByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer getDmCinemaCountByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxAddDmCinema(DmCinema dmCinema)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxModifyDmCinema(DmCinema dmCinema)throws Exception{
        return null;
    }
}
