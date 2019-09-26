package com.shiji.serviceImpl;

import com.shiji.mapper.pos.PosCheckDiscountsItemsMapper;
import com.shiji.service.PosCheckDiscountsItemsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * author helei
 * date 2019/9/17
 */
@Service
public class PosCheckDiscountsItemsServicesImpl implements PosCheckDiscountsItemsServices {
	@Autowired
	private PosCheckDiscountsItemsMapper posCheckDiscountsItemsMapper;

	@Override
	public List<Map<String, Object>> findPosCheckDiscountItemsByCdisId(List<Object> lfieldResults) {
		return posCheckDiscountsItemsMapper.findPosCheckDiscountItemsByCdisId(lfieldResults);
	}

	@Override
	public List<Map<String, Object>> findPosCheckDiscountItemsTotalByCdisId(List<Object> chksId) {
		return posCheckDiscountsItemsMapper.findPosCheckDiscountItemsTotalByCdisId(chksId);
	}
}
