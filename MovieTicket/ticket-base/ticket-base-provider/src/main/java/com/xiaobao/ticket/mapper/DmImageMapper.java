package com.xiaobao.ticket.mapper;

import com.xiaobao.ticket.pojo.DmImage;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface DmImageMapper {

	public DmImage getDmImageById(@Param(value = "id") Long id)throws Exception;

	public List<DmImage>	getDmImageListByMap(Map<String,Object> param)throws Exception;

	public Integer getDmImageCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertDmImage(DmImage dmImage)throws Exception;

	public Integer updateDmImage(DmImage dmImage)throws Exception;

	public Integer deleteDmImageById(@Param(value = "id") Long id)throws Exception;

	public Integer batchDeleteDmImage(Map<String,List<String>> params);

}
