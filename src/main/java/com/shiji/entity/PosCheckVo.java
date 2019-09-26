package com.shiji.entity;

import java.io.Serializable;

/**
 * @author ：jaylen
 * @date ：Created in 2019/9/23 10:35
 * @description：POSCheckVo数据封装类
 * @modified By：
 * @version: v1.0$
 */
public class PosCheckVo implements Serializable {
	//账单id
	private String chksId;
	//营业区名字
	private String outlet;
	//营业日
	private String date;
	// 账单编号
	private String checkNo;
	//桌号
	private String tableNo;
	//桌号后缀
	private String tableExt;

	public String getTableExt() {
		return tableExt;
	}

	public void setTableExt(String tableExt) {
		this.tableExt = tableExt;
	}

	//账单的项目总额
	private double checkItemTotal;
	//一个账单的项目总额
	private double itemTotal;
	//账单支付总额
	private double checkTotal;
	//折扣总和
	private double discountTotal;
	//折扣总和
	private double checkDiscountTotal;
	//项目折扣总和
	private double checkItemDiscountTotal;

	public String getChksId() {
		return chksId;
	}

	public void setChksId(String chksId) {
		this.chksId = chksId;
	}

	public String getOutlet() {
		return outlet;
	}

	public void setOutlet(String outlet) {
		this.outlet = outlet;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getCheckNo() {
		return checkNo;
	}

	public void setCheckNo(String checkNo) {
		this.checkNo = checkNo;
	}

	public String getTableNo() {
		return tableNo;
	}

	public void setTableNo(String tableNo) {
		this.tableNo = tableNo;
	}

	public double getCheckItemTotal() {
		return checkItemTotal;
	}

	public void setCheckItemTotal(double checkItemTotal) {
		this.checkItemTotal = checkItemTotal;
	}

	public double getItemTotal() {
		return itemTotal;
	}

	public void setItemTotal(double itemTotal) {
		this.itemTotal = itemTotal;
	}

	public double getCheckTotal() {
		return checkTotal;
	}

	public void setCheckTotal(double checkTotal) {
		this.checkTotal = checkTotal;
	}

	public double getDiscountTotal() {
		return discountTotal;
	}

	public void setDiscountTotal(double discountTotal) {
		this.discountTotal = discountTotal;
	}

	public double getCheckDiscountTotal() {
		return checkDiscountTotal;
	}

	public void setCheckDiscountTotal(double checkDiscountTotal) {
		this.checkDiscountTotal = checkDiscountTotal;
	}

	public double getCheckItemDiscountTotal() {
		return checkItemDiscountTotal;
	}

	public void setCheckItemDiscountTotal(double checkItemDiscountTotal) {
		this.checkItemDiscountTotal = checkItemDiscountTotal;
	}

	public double getCheckDiscountItemTotal() {
		return CheckDiscountItemTotal;
	}

	public void setCheckDiscountItemTotal(double checkDiscountItemTotal) {
		CheckDiscountItemTotal = checkDiscountItemTotal;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getTips() {
		return tips;
	}

	public void setTips(double tips) {
		this.tips = tips;
	}

	//项目折扣总和
	private double CheckDiscountItemTotal;
	//支付类型
	private String paymentType;
	//实际分批支付总额
	private double amount;

	private double paymentPayTotal;

	public double getPaymentPayTotal() {
		return paymentPayTotal;
	}

	public void setPaymentPayTotal(double paymentPayTotal) {
		this.paymentPayTotal = paymentPayTotal;
	}

	//小费
	private double tips;


}
