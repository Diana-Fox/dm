package com.xiaobao.mall.fallback;

import com.xiaobao.mall.client.RestDmItemCommentClient;
import com.xiaobao.mall.pojo.DmItemComment;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
@Component
public class DmItemCommentClientFallBack implements RestDmItemCommentClient {


    @Override
    public DmItemComment getDmItemCommentById(Long id)throws Exception{
        return null;
    }

    @Override
    public List<DmItemComment> getDmItemCommentListByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer getDmItemCommentCountByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxAddDmItemComment(DmItemComment dmItemComment)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxModifyDmItemComment(DmItemComment dmItemComment)throws Exception{
        return null;
    }
}
