package com.shiji.service;

import java.util.List;
import java.util.Map;

/**
 * author helei
 * date 2019/9/17
 */
public interface PosCheckDiscountsItemsServices {
	List<Map<String, Object>> findPosCheckDiscountItemsByCdisId(List<Object> lfieldResults);
	List<Map<String, Object>> findPosCheckDiscountItemsTotalByCdisId(List<Object> chksId);
}
