package com.shiji.service;

import com.shiji.util.ResultFormat;

/**
 * @author ：jaylen
 * @date ：Created in 2019/10/15 9:26
 * @description：
 * @modified By：
 * @version: $
 */
public interface PosActionLogsServices {
	ResultFormat findByBusinessDayAndCheckNum(String businessDayRang, String checkNum) throws Exception;
}
