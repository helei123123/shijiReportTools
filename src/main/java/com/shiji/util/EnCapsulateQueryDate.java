package com.shiji.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author ：jaylen
 * @date ：Created in 2019/8/24 10:17
 * @description：工具类
 * @modified By：
 * @version: v1.0$
 */
public class EnCapsulateQueryDate {
	public static List<Object[]> encapsulateQueryData(List<Map<String, Object>> results, String[] filed) {
		List<Object[]> list = new ArrayList<>();
		for (int i = 0; i < results.size(); i++) {
			Object[] objs = new Object[filed.length];
			Map<String, Object> stringStringMap = results.get(i);
			for (int j = 0; j < filed.length; j++) {
				if (stringStringMap.get(filed[j]) == null || stringStringMap.get(filed[j]) == "")
					objs[j] = "null";
				else
					objs[j] = stringStringMap.get(filed[j]);
			}
			list.add(objs);
		}
		return list;
	}
	public static List<Object> encapsulateFieldListByFieldKey(List<Map<String, Object>> results, String fieldKey) {
		List<Object> lfieldResults = new ArrayList<>();
		for (int i = 0; i < results.size(); i++) {
			Map<String, Object> sCellMap = results.get(i);
			lfieldResults.add(sCellMap.get(fieldKey));
		}
		return lfieldResults;
	}
}
