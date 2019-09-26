package com.shiji.mapper.outlet;

import com.shiji.entity.OutOutlets;

import java.util.List;

public interface OutOutletsMapper {
	int deleteByPrimaryKey(Integer oletId);

	int insert(OutOutlets record);

	OutOutlets selectByPrimaryKey(Integer oletId);

	List<OutOutlets> selectAll();

	int updateByPrimaryKey(OutOutlets record);

	String findByOutletId(String outletCode);
}