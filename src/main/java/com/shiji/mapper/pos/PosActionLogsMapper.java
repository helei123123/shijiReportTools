package com.shiji.mapper.pos;

import com.shiji.entity.PosActionLogs;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;
import java.util.Map;

public interface PosActionLogsMapper {
	int deleteByPrimaryKey(String alogId);

	int insert(PosActionLogs record);

	PosActionLogs selectByPrimaryKey(String alogId);

	List<PosActionLogs> selectAll();

	int updateByPrimaryKey(PosActionLogs record);

	List<Map<String, Object>> findByBusinessDayAndCheckNum(@Param("beginDate") Date beginDate, @Param("endDate") Date endDate, @Param("checkNum") String checkNum);
}