package com.shiji.mapper.pos;

import com.shiji.entity.PosCheckVo;
import com.shiji.entity.PosChecks;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;
import java.util.Map;

public interface PosChecksMapper {
	int deleteByPrimaryKey(String chksId);

	int insert(PosChecks record);

	PosChecks selectByPrimaryKey(String chksId);

	List<Map<String, Object>> selectAll();

	int updateByPrimaryKey(PosChecks record);

	List<Map<String, Object>> findPosChecksByCheckNumAndOutletIdAndBdayId(@Param("checkNum") String checkNum, @Param("outletId") String outletId, @Param("sDayId") String sDayId, @Param("stypeTime") String stypeTime, @Param("dbeginTime") Date dbeginTime, @Param("dendTime") Date dendTime);

	List<PosCheckVo> findAllByBusinessDayIdAndTimeRang(@Param("businessDayBeginDate") Date businessDayBeginDate,@Param("businessDayEndDate") Date businessDayEndDate,@Param("checkBeginTime") Date checkBeginTime,@Param("checkEndTime") Date checkEndTime,@Param("typeTime") String typeTime);

	List<PosCheckVo> findAllByBusinessDayIdAndTimeRang1(@Param("businessDayBeginDate") Date businessDayBeginDate,@Param("businessDayEndDate") Date businessDayEndDate,@Param("checkBeginTime") Date checkBeginTime,@Param("checkEndTime") Date checkEndTime,@Param("typeTime") String typeTime);

	List<PosCheckVo> findAllByBusinessDayIdAndTimeRang2(@Param("businessDayBeginDate") Date businessDayBeginDate,@Param("businessDayEndDate") Date businessDayEndDate,@Param("checkBeginTime") Date checkBeginTime,@Param("checkEndTime") Date checkEndTime,@Param("typeTime") String typeTime);
}