package com.shiji.mapper.pos;

import com.shiji.entity.PosCheckDiscounts;
import java.util.List;
import java.util.Map;

public interface PosCheckDiscountsMapper {
	int deleteByPrimaryKey(String cdisId);

	int insert(PosCheckDiscounts record);

	PosCheckDiscounts selectByPrimaryKey(String cdisId);

	List<PosCheckDiscounts> selectAll();

	int updateByPrimaryKey(PosCheckDiscounts record);

	List<Map<String, Object>> findPosCheckDiscountsByChksid(List<Object> chksId);

	List<Map<String, Object>> findPosCheckDiscountsByChksidAndDiscounttotal(List<Object> chksId);
}