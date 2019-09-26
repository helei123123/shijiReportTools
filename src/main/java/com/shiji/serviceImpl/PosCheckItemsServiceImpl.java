package com.shiji.serviceImpl;

import com.shiji.entity.PosCheckVo;
import com.shiji.mapper.pos.PosCheckItemsMapper;
import com.shiji.service.PosCheckItemsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author ：jaylen
 * @date ：Created in 2019/8/21 14:30
 * @description：posChecks业务层
 * @modified By：
 * @version: v1.0$
 */
@Service
public class PosCheckItemsServiceImpl implements PosCheckItemsServices {

	@Autowired
	private PosCheckItemsMapper posCheckItemsMapper;

	@Override
	public List<Map<String, Object>> selectAll() {
		return posCheckItemsMapper.selectAll();
	}

	@Override
	public List<Map<String, Object>> findPoscheckItemsByChksid(List<Object> chksid) {
		return posCheckItemsMapper.findPoscheckItemsByChksid(chksid);
	}

	@Override
	public List<Map<String, Object>> findPoscheckItemsByChksidAndItemtotal(List<Object> chksid) {
		return posCheckItemsMapper.findPoscheckItemsByChksidAndItemtotal(chksid);
	}

	@Override
	public List<PosCheckVo> findAllByBusinessDayIdAndTimeRang(Date businessDayBeginDate, Date businessDayEndDate, Date checkBeginTime, Date checkEndTime, String typeTime) {
		return posCheckItemsMapper.findAllByBusinessDayIdAndTimeRang(businessDayBeginDate,businessDayEndDate,checkBeginTime,checkEndTime,typeTime);
	}
}
