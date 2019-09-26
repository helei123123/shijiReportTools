package com.shiji.util;

/**
 * @author ：jaylen
 * @date ：Created in 2019/7/5 13:47
 * @description：返回结果集
 * @modified By：
 * @version: v1.0$
 */

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * json结果集
 */
public class ResultFormat implements Serializable {

	// 定义jackson对象
	private static final ObjectMapper MAPPER = new ObjectMapper();

	// 响应业务状态 成功200, 营业区编码不存在0，营业日不存在1，账单编号不存在2，文件正在被使用3，导出失败4，日期格式不正确5
	private Integer status;

	// 响应消息
	private String msg;

	// 响应中的数据
	private Object data;

	public static ResultFormat build(Integer status, String msg, Object data) {
		return new ResultFormat(status, msg, data);
	}

	public static ResultFormat ok(Object data) {
		return new ResultFormat(data);
	}

	public static ResultFormat ok() {
		return new ResultFormat(null);
	}

	public ResultFormat() {

	}

	public static ResultFormat build(Integer status, String msg) {
		return new ResultFormat(status, msg, null);
	}

	public ResultFormat(Integer status, String msg, Object data) {
		this.status = status;
		this.msg = msg;
		this.data = data;
	}

	public ResultFormat(Object data) {
		this.status = 200;
		this.msg = "OK";
		this.data = data;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	/**
	 * 将json结果集转化为Result对象
	 *
	 * @param jsonData json数据 传的是Result的对象的Json字符串
	 * @param clazz    TaotaoResult中的object类型
	 * @return
	 */
	public static ResultFormat formatToPojo(String jsonData, Class<?> clazz) {
		try {
			if (clazz == null)
				return MAPPER.readValue(jsonData, ResultFormat.class);
			JsonNode jsonNode = MAPPER.readTree(jsonData);
			JsonNode data = jsonNode.get("data");
			Object obj = null;
			if (clazz != null) {
				if (data.isObject())
					obj = MAPPER.readValue(data.traverse(), clazz);
				else if (data.isTextual())
					obj = MAPPER.readValue(data.asText(), clazz);
			}
			return build(jsonNode.get("status").intValue(), jsonNode.get("msg").asText(), obj);
		} catch (Exception e) {
			return null;
		}
	}

	/**
	 * 没有object对象的转化
	 *
	 * @param json
	 * @return
	 */
	public static ResultFormat format(String json) {
		try {
			return MAPPER.readValue(json, ResultFormat.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * Object是集合转化
	 *
	 * @param jsonData 传的是Result的对象的Json字符串
	 *                 json数据
	 * @param clazz    集合中的类型
	 * @return
	 */
	public static ResultFormat formatToList(String jsonData, Class<?> clazz) {
		try {
			JsonNode jsonNode = MAPPER.readTree(jsonData);
			JsonNode data = jsonNode.get("data");
			Object obj = null;
			if (data.isArray() && data.size() > 0)
				obj = MAPPER.readValue(data.traverse(),
						MAPPER.getTypeFactory().constructCollectionType(List.class, clazz));
			return build(jsonNode.get("status").intValue(), jsonNode.get("msg").asText(), obj);
		} catch (Exception e) {
			return null;
		}
	}

}
