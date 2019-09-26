package com.shiji.mapper.pos;

import com.shiji.entity.PosCheckPayments;

import java.util.List;
import java.util.Map;

public interface PosCheckPaymentsMapper {
	int deleteByPrimaryKey(String cpayId);

	int insert(PosCheckPayments record);

	PosCheckPayments selectByPrimaryKey(String cpayId);

	List<PosCheckPayments> selectAll();

	int updateByPrimaryKey(PosCheckPayments record);

	List<Map<String, Object>> findPoscheckPaymentsByChksid(List<Object> chksid);
	List<Map<String, Object>> findPoscheckPaymentsTotalByChksid(List<Object> chksid);
}