package com.shiji.service;

import com.shiji.util.ResultFormat;

import java.util.List;
import java.util.Map;

/**
 * @author ：jaylen
 * @date ：Created in 2019/8/21 14:29
 * @description：poschecks业务层
 * @modified By：
 * @version: v1.0$
 */
public interface PosChecksServices {
	List<Map<String, Object>> selectAll();

	ResultFormat findPosChecksByCheckNumAndOutletCodeAndBusinessDay(String outletCode, String checkNum, String businessDay,String typeTime,String rangTime) throws Exception;
	ResultFormat findPosChecksByBusinessDay(String businessDay,String typeTime,String rangTime) throws Exception;
}
