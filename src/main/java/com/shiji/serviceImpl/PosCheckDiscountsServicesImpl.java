package com.shiji.serviceImpl;

import com.shiji.mapper.pos.PosCheckDiscountsMapper;
import com.shiji.service.PosCheckDiscountsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * author helei
 * date 2019/9/17
 */
@Service
public class PosCheckDiscountsServicesImpl implements PosCheckDiscountsServices {
	@Autowired
	private PosCheckDiscountsMapper posCheckDiscountsMapper;

	@Override
	public List<Map<String, Object>> findPosCheckDiscountsByChksid(List<Object> chksId) {
		return posCheckDiscountsMapper.findPosCheckDiscountsByChksid(chksId);
	}

	@Override
	public List<Map<String, Object>> findPosCheckDiscountsByChksidAndDiscounttotal(List<Object> chksIds) {
		return posCheckDiscountsMapper.findPosCheckDiscountsByChksidAndDiscounttotal(chksIds);
	}
}
