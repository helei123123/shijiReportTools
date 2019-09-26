package com.shiji.mapper.pos;

import com.shiji.entity.PosCheckDiscountsItems;

import java.util.List;
import java.util.Map;

public interface PosCheckDiscountsItemsMapper {
	int deleteByPrimaryKey(String cditId);

	int insert(PosCheckDiscountsItems record);

	PosCheckDiscountsItems selectByPrimaryKey(String cditId);

	List<PosCheckDiscountsItems> selectAll();

	int updateByPrimaryKey(PosCheckDiscountsItems record);

	List<Map<String, Object>> findPosCheckDiscountItemsByCdisId(List<Object> lfieldResults);
	List<Map<String, Object>> findPosCheckDiscountItemsTotalByCdisId(List<Object> chksId);
}