package com.xiaobao.ticket.fallback;

import com.xiaobao.ticket.client.RestDmKeywordSortClient;
import com.xiaobao.ticket.pojo.DmKeywordSort;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class DmKeywordSortClientFallBack implements RestDmKeywordSortClient {


    @Override
    public DmKeywordSort getDmKeywordSortById(Long id)throws Exception{
        return null;
    }

    @Override
    public List<DmKeywordSort>	getDmKeywordSortListByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer getDmKeywordSortCountByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxAddDmKeywordSort(DmKeywordSort dmKeywordSort)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxModifyDmKeywordSort(DmKeywordSort dmKeywordSort)throws Exception{
        return null;
    }
}
