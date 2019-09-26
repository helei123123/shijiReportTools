package com.shiji.mapper.pos;

import com.shiji.entity.PosCheckTables;

import java.util.List;

public interface PosCheckTablesMapper {
	int deleteByPrimaryKey(String ctblId);

	int insert(PosCheckTables record);

	PosCheckTables selectByPrimaryKey(String ctblId);

	List<PosCheckTables> selectAll();

	int updateByPrimaryKey(PosCheckTables record);
}