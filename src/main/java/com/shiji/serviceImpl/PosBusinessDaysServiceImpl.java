package com.shiji.serviceImpl;

import com.shiji.mapper.pos.PosBusinessDaysMapper;
import com.shiji.service.PosBusinessDaysServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author ：jaylen
 * @date ：Created in 2019/8/23 15:40
 * @description：businessDay
 * @modified By：
 * @version: v1.0$
 */
@Service
public class PosBusinessDaysServiceImpl implements PosBusinessDaysServices {
	@Autowired
	private PosBusinessDaysMapper posBusinessDaysMapper;

	@Override
	public List<Map<String, Object>> selectAll() {
		return null;
	}

	@Override
	public String findByDayId(Date businessDay) {
		return posBusinessDaysMapper.findByDayId(businessDay);
	}

	@Override
	public List<String> findByDayId(Date businessDayBeginDate, Date businessDayEndDate) {
		return posBusinessDaysMapper.findDateRangByDayId(businessDayBeginDate,businessDayEndDate);
	}
}
