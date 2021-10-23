package com.xiaobao.ticket.common;

import com.xiaobao.ticket.pojo.DmImage;

import java.util.ArrayList;
import java.util.List;

/**
 * 图片相关的处理方法
 */
public class ImageCommon {
    //    //设置图片为空时
    public static List<DmImage> setDefaultImageList(List<DmImage> dmImageList, Integer category, Integer type) {
        //如果为空
        if (EmptyUtils.isEmpty(dmImageList)) {
            dmImageList = new ArrayList<>();
            DmImage dmImage = new DmImage();
            dmImage.setType(type);
            dmImage.setCategory(category);
            dmImageList.add(dmImage);
        }
        dmImageList.forEach((image) -> {
            if (EmptyUtils.isEmpty(image.getImgUrl())) {
                //默认图片地址，其实应该根据类型生成
                image.setImgUrl(Constants.DEFAULT_CAROUSEL);
            }
        });
        return dmImageList;
    }
}
