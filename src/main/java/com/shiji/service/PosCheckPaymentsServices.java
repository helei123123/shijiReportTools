package com.shiji.service;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author ：jaylen
 * @date ：Created in 2019/8/21 14:29
 * @description：PosCheckPaymentsServices
 * @modified By：
 * @version: v1.0$
 */
@Service
public interface PosCheckPaymentsServices {
	List<Map<String, Object>> selectAll();
	List<Map<String, Object>> findPoscheckPaymentsByChksid(List<Object> chksid);
	List<Map<String, Object>> findPoscheckPaymentsTotalByChksid(List<Object> chksid);
}
