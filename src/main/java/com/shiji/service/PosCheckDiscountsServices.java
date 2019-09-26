package com.shiji.service;

import java.util.List;
import java.util.Map;

/**
 * author helei
 * date 2019/9/17
 */
public interface PosCheckDiscountsServices {
	List<Map<String, Object>> findPosCheckDiscountsByChksid(List<Object> chksId);

	List<Map<String, Object>> findPosCheckDiscountsByChksidAndDiscounttotal(List<Object> chksIds);
}
