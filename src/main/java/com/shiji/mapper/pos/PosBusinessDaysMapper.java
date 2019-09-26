package com.shiji.mapper.pos;

import com.shiji.entity.PosBusinessDays;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface PosBusinessDaysMapper {
	int deleteByPrimaryKey(String bdayId);

	int insert(PosBusinessDays record);

	PosBusinessDays selectByPrimaryKey(String bdayId);

	List<PosBusinessDays> selectAll();

	int updateByPrimaryKey(PosBusinessDays record);

	String findByDayId(Date businessDay);

	List<String> findDateRangByDayId(@Param("dbeginDateBusinessDay") Date dbeginDateBusinessDay, @Param("dendDateBusinessDay") Date dendDateBusinessDay);
}