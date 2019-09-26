package com.shiji.mapper.pos;

import com.shiji.entity.PosCheckItems;
import com.shiji.entity.PosCheckVo;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;
import java.util.Map;

public interface PosCheckItemsMapper {
	int deleteByPrimaryKey(String citmId);

	int insert(PosCheckItems record);

	PosCheckItems selectByPrimaryKey(String citmId);

	List<Map<String, Object>> selectAll();

	int updateByPrimaryKey(PosCheckItems record);

	List<Map<String, Object>> findPoscheckItemsByChksid(List<Object> chksid);

	List<Map<String, Object>> findPoscheckItemsByChksidAndItemtotal(List<Object> chksid);

	List<PosCheckVo> findAllByBusinessDayIdAndTimeRang(@Param("businessDayBeginDate") Date businessDayBeginDate, @Param("businessDayEndDate") Date businessDayEndDate, @Param("checkBeginTime") Date checkBeginTime, @Param("checkEndTime") Date checkEndTime, @Param("typeTime") String typeTime);
}