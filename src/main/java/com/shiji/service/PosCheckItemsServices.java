package com.shiji.service;

import com.shiji.entity.PosCheckVo;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author ：jaylen
 * @date ：Created in 2019/8/21 14:29
 * @description：PosCheckItemsServices
 * @modified By：
 * @version: v1.0$
 */
public interface PosCheckItemsServices {
	List<Map<String, Object>> selectAll();

	List<Map<String, Object>> findPoscheckItemsByChksid(List<Object> chksid);

	List<Map<String, Object>> findPoscheckItemsByChksidAndItemtotal(List<Object> chksid);

	List<PosCheckVo> findAllByBusinessDayIdAndTimeRang(Date businessDayBeginDate, Date businessDayEndDate, Date checkBeginTime, Date checkEndTime, String typeTime);
}
