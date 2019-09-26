package com.shiji.service;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author ：jaylen
 * @date ：Created in 2019/8/21 14:29
 * @description：PosBusinessDaysServices
 * @modified By：
 * @version: v1.0$
 */
public interface PosBusinessDaysServices {
	List<Map<String, Object>> selectAll();

	String findByDayId(Date businessDay);

	List<String> findByDayId(Date businessDayBeginDate,Date businessDayEndDate);
}
