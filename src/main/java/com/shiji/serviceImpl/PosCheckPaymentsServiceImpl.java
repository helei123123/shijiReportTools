package com.shiji.serviceImpl;

import com.shiji.mapper.pos.PosCheckPaymentsMapper;
import com.shiji.service.PosCheckPaymentsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author ：jaylen
 * @date ：Created in 2019/8/23 14:53
 * @description：PosCheckPaymentsImpl
 * @modified By：
 * @version: v1.0$
 */
@Service
public class PosCheckPaymentsServiceImpl implements PosCheckPaymentsServices {
	@Autowired
	private PosCheckPaymentsMapper posCheckPaymentsMapper;

	@Override
	public List<Map<String, Object>> selectAll() {
		return null;
	}

	@Override
	public List<Map<String, Object>> findPoscheckPaymentsByChksid(List<Object> chksid) {
		return posCheckPaymentsMapper.findPoscheckPaymentsByChksid(chksid);
	}

	@Override
	public List<Map<String, Object>> findPoscheckPaymentsTotalByChksid(List<Object> chksid) {
		return posCheckPaymentsMapper.findPoscheckPaymentsTotalByChksid(chksid);
	}
}
