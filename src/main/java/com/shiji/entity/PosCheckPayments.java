package com.shiji.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class PosCheckPayments implements Serializable {
	private String cpayId;

	private String cpayBdayId;

	private String cpayBperId;

	private Integer cpayShopId;

	private Integer cpayOletId;

	private String cpayChksId;

	private String cpayCptyId;

	private Integer cpayPaymId;

	private String cpayNameL1;

	private String cpayNameL2;

	private String cpayNameL3;

	private String cpayNameL4;

	private String cpayNameL5;

	private String cpayShortNameL1;

	private String cpayShortNameL2;

	private String cpayShortNameL3;

	private String cpayShortNameL4;

	private String cpayShortNameL5;

	private String cpayPaymentType;

	private Integer cpaySeq;

	private BigDecimal cpayPayTotal;

	private BigDecimal cpayPayTips;

	private BigDecimal cpayPaySurcharge;

	private BigDecimal cpayPayChange;

	private String cpayPayForeignCurrency;

	private BigDecimal cpayPayForeignTotal;

	private BigDecimal cpayPayForeignTips;

	private BigDecimal cpayPayForeignSurcharge;

	private BigDecimal cpayPayForeignChange;

	private String cpayCurrencyCode;

	private BigDecimal cpayCurrencyRate;

	private String cpayChangeBackCurrency;

	private String cpaySpecial;

	private String cpayNonRevenue;

	private Integer cpayMembId;

	private Integer cpayMealUserId;

	private Date cpayPayTime;

	private Date cpayPayLoctime;

	private Integer cpayPayUserId;

	private Integer cpayPayStatId;

	private Date cpayVoidTime;

	private Date cpayVoidLoctime;

	private Integer cpayVoidUserId;

	private Integer cpayVoidStatId;

	private Integer cpayVoidVdrsId;

	private String cpayStatus;

	private Integer cpaySlaveId;

	private Date cpaySlaveCreated;

	private Date cpaySlaveModified;

	private Integer cpaySyncId;

	private Date created;

	private Date modified;

	private String cpayRefData1;

	private String cpayRefData2;

	private String cpayRefData3;

	private static final long serialVersionUID = 1L;

	public String getCpayId() {
		return cpayId;
	}

	public void setCpayId(String cpayId) {
		this.cpayId = cpayId == null ? null : cpayId.trim();
	}

	public String getCpayBdayId() {
		return cpayBdayId;
	}

	public void setCpayBdayId(String cpayBdayId) {
		this.cpayBdayId = cpayBdayId == null ? null : cpayBdayId.trim();
	}

	public String getCpayBperId() {
		return cpayBperId;
	}

	public void setCpayBperId(String cpayBperId) {
		this.cpayBperId = cpayBperId == null ? null : cpayBperId.trim();
	}

	public Integer getCpayShopId() {
		return cpayShopId;
	}

	public void setCpayShopId(Integer cpayShopId) {
		this.cpayShopId = cpayShopId;
	}

	public Integer getCpayOletId() {
		return cpayOletId;
	}

	public void setCpayOletId(Integer cpayOletId) {
		this.cpayOletId = cpayOletId;
	}

	public String getCpayChksId() {
		return cpayChksId;
	}

	public void setCpayChksId(String cpayChksId) {
		this.cpayChksId = cpayChksId == null ? null : cpayChksId.trim();
	}

	public String getCpayCptyId() {
		return cpayCptyId;
	}

	public void setCpayCptyId(String cpayCptyId) {
		this.cpayCptyId = cpayCptyId == null ? null : cpayCptyId.trim();
	}

	public Integer getCpayPaymId() {
		return cpayPaymId;
	}

	public void setCpayPaymId(Integer cpayPaymId) {
		this.cpayPaymId = cpayPaymId;
	}

	public String getCpayNameL1() {
		return cpayNameL1;
	}

	public void setCpayNameL1(String cpayNameL1) {
		this.cpayNameL1 = cpayNameL1 == null ? null : cpayNameL1.trim();
	}

	public String getCpayNameL2() {
		return cpayNameL2;
	}

	public void setCpayNameL2(String cpayNameL2) {
		this.cpayNameL2 = cpayNameL2 == null ? null : cpayNameL2.trim();
	}

	public String getCpayNameL3() {
		return cpayNameL3;
	}

	public void setCpayNameL3(String cpayNameL3) {
		this.cpayNameL3 = cpayNameL3 == null ? null : cpayNameL3.trim();
	}

	public String getCpayNameL4() {
		return cpayNameL4;
	}

	public void setCpayNameL4(String cpayNameL4) {
		this.cpayNameL4 = cpayNameL4 == null ? null : cpayNameL4.trim();
	}

	public String getCpayNameL5() {
		return cpayNameL5;
	}

	public void setCpayNameL5(String cpayNameL5) {
		this.cpayNameL5 = cpayNameL5 == null ? null : cpayNameL5.trim();
	}

	public String getCpayShortNameL1() {
		return cpayShortNameL1;
	}

	public void setCpayShortNameL1(String cpayShortNameL1) {
		this.cpayShortNameL1 = cpayShortNameL1 == null ? null : cpayShortNameL1.trim();
	}

	public String getCpayShortNameL2() {
		return cpayShortNameL2;
	}

	public void setCpayShortNameL2(String cpayShortNameL2) {
		this.cpayShortNameL2 = cpayShortNameL2 == null ? null : cpayShortNameL2.trim();
	}

	public String getCpayShortNameL3() {
		return cpayShortNameL3;
	}

	public void setCpayShortNameL3(String cpayShortNameL3) {
		this.cpayShortNameL3 = cpayShortNameL3 == null ? null : cpayShortNameL3.trim();
	}

	public String getCpayShortNameL4() {
		return cpayShortNameL4;
	}

	public void setCpayShortNameL4(String cpayShortNameL4) {
		this.cpayShortNameL4 = cpayShortNameL4 == null ? null : cpayShortNameL4.trim();
	}

	public String getCpayShortNameL5() {
		return cpayShortNameL5;
	}

	public void setCpayShortNameL5(String cpayShortNameL5) {
		this.cpayShortNameL5 = cpayShortNameL5 == null ? null : cpayShortNameL5.trim();
	}

	public String getCpayPaymentType() {
		return cpayPaymentType;
	}

	public void setCpayPaymentType(String cpayPaymentType) {
		this.cpayPaymentType = cpayPaymentType == null ? null : cpayPaymentType.trim();
	}

	public Integer getCpaySeq() {
		return cpaySeq;
	}

	public void setCpaySeq(Integer cpaySeq) {
		this.cpaySeq = cpaySeq;
	}

	public BigDecimal getCpayPayTotal() {
		return cpayPayTotal;
	}

	public void setCpayPayTotal(BigDecimal cpayPayTotal) {
		this.cpayPayTotal = cpayPayTotal;
	}

	public BigDecimal getCpayPayTips() {
		return cpayPayTips;
	}

	public void setCpayPayTips(BigDecimal cpayPayTips) {
		this.cpayPayTips = cpayPayTips;
	}

	public BigDecimal getCpayPaySurcharge() {
		return cpayPaySurcharge;
	}

	public void setCpayPaySurcharge(BigDecimal cpayPaySurcharge) {
		this.cpayPaySurcharge = cpayPaySurcharge;
	}

	public BigDecimal getCpayPayChange() {
		return cpayPayChange;
	}

	public void setCpayPayChange(BigDecimal cpayPayChange) {
		this.cpayPayChange = cpayPayChange;
	}

	public String getCpayPayForeignCurrency() {
		return cpayPayForeignCurrency;
	}

	public void setCpayPayForeignCurrency(String cpayPayForeignCurrency) {
		this.cpayPayForeignCurrency = cpayPayForeignCurrency == null ? null : cpayPayForeignCurrency.trim();
	}

	public BigDecimal getCpayPayForeignTotal() {
		return cpayPayForeignTotal;
	}

	public void setCpayPayForeignTotal(BigDecimal cpayPayForeignTotal) {
		this.cpayPayForeignTotal = cpayPayForeignTotal;
	}

	public BigDecimal getCpayPayForeignTips() {
		return cpayPayForeignTips;
	}

	public void setCpayPayForeignTips(BigDecimal cpayPayForeignTips) {
		this.cpayPayForeignTips = cpayPayForeignTips;
	}

	public BigDecimal getCpayPayForeignSurcharge() {
		return cpayPayForeignSurcharge;
	}

	public void setCpayPayForeignSurcharge(BigDecimal cpayPayForeignSurcharge) {
		this.cpayPayForeignSurcharge = cpayPayForeignSurcharge;
	}

	public BigDecimal getCpayPayForeignChange() {
		return cpayPayForeignChange;
	}

	public void setCpayPayForeignChange(BigDecimal cpayPayForeignChange) {
		this.cpayPayForeignChange = cpayPayForeignChange;
	}

	public String getCpayCurrencyCode() {
		return cpayCurrencyCode;
	}

	public void setCpayCurrencyCode(String cpayCurrencyCode) {
		this.cpayCurrencyCode = cpayCurrencyCode == null ? null : cpayCurrencyCode.trim();
	}

	public BigDecimal getCpayCurrencyRate() {
		return cpayCurrencyRate;
	}

	public void setCpayCurrencyRate(BigDecimal cpayCurrencyRate) {
		this.cpayCurrencyRate = cpayCurrencyRate;
	}

	public String getCpayChangeBackCurrency() {
		return cpayChangeBackCurrency;
	}

	public void setCpayChangeBackCurrency(String cpayChangeBackCurrency) {
		this.cpayChangeBackCurrency = cpayChangeBackCurrency == null ? null : cpayChangeBackCurrency.trim();
	}

	public String getCpaySpecial() {
		return cpaySpecial;
	}

	public void setCpaySpecial(String cpaySpecial) {
		this.cpaySpecial = cpaySpecial == null ? null : cpaySpecial.trim();
	}

	public String getCpayNonRevenue() {
		return cpayNonRevenue;
	}

	public void setCpayNonRevenue(String cpayNonRevenue) {
		this.cpayNonRevenue = cpayNonRevenue == null ? null : cpayNonRevenue.trim();
	}

	public Integer getCpayMembId() {
		return cpayMembId;
	}

	public void setCpayMembId(Integer cpayMembId) {
		this.cpayMembId = cpayMembId;
	}

	public Integer getCpayMealUserId() {
		return cpayMealUserId;
	}

	public void setCpayMealUserId(Integer cpayMealUserId) {
		this.cpayMealUserId = cpayMealUserId;
	}

	public Date getCpayPayTime() {
		return cpayPayTime;
	}

	public void setCpayPayTime(Date cpayPayTime) {
		this.cpayPayTime = cpayPayTime;
	}

	public Date getCpayPayLoctime() {
		return cpayPayLoctime;
	}

	public void setCpayPayLoctime(Date cpayPayLoctime) {
		this.cpayPayLoctime = cpayPayLoctime;
	}

	public Integer getCpayPayUserId() {
		return cpayPayUserId;
	}

	public void setCpayPayUserId(Integer cpayPayUserId) {
		this.cpayPayUserId = cpayPayUserId;
	}

	public Integer getCpayPayStatId() {
		return cpayPayStatId;
	}

	public void setCpayPayStatId(Integer cpayPayStatId) {
		this.cpayPayStatId = cpayPayStatId;
	}

	public Date getCpayVoidTime() {
		return cpayVoidTime;
	}

	public void setCpayVoidTime(Date cpayVoidTime) {
		this.cpayVoidTime = cpayVoidTime;
	}

	public Date getCpayVoidLoctime() {
		return cpayVoidLoctime;
	}

	public void setCpayVoidLoctime(Date cpayVoidLoctime) {
		this.cpayVoidLoctime = cpayVoidLoctime;
	}

	public Integer getCpayVoidUserId() {
		return cpayVoidUserId;
	}

	public void setCpayVoidUserId(Integer cpayVoidUserId) {
		this.cpayVoidUserId = cpayVoidUserId;
	}

	public Integer getCpayVoidStatId() {
		return cpayVoidStatId;
	}

	public void setCpayVoidStatId(Integer cpayVoidStatId) {
		this.cpayVoidStatId = cpayVoidStatId;
	}

	public Integer getCpayVoidVdrsId() {
		return cpayVoidVdrsId;
	}

	public void setCpayVoidVdrsId(Integer cpayVoidVdrsId) {
		this.cpayVoidVdrsId = cpayVoidVdrsId;
	}

	public String getCpayStatus() {
		return cpayStatus;
	}

	public void setCpayStatus(String cpayStatus) {
		this.cpayStatus = cpayStatus == null ? null : cpayStatus.trim();
	}

	public Integer getCpaySlaveId() {
		return cpaySlaveId;
	}

	public void setCpaySlaveId(Integer cpaySlaveId) {
		this.cpaySlaveId = cpaySlaveId;
	}

	public Date getCpaySlaveCreated() {
		return cpaySlaveCreated;
	}

	public void setCpaySlaveCreated(Date cpaySlaveCreated) {
		this.cpaySlaveCreated = cpaySlaveCreated;
	}

	public Date getCpaySlaveModified() {
		return cpaySlaveModified;
	}

	public void setCpaySlaveModified(Date cpaySlaveModified) {
		this.cpaySlaveModified = cpaySlaveModified;
	}

	public Integer getCpaySyncId() {
		return cpaySyncId;
	}

	public void setCpaySyncId(Integer cpaySyncId) {
		this.cpaySyncId = cpaySyncId;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getModified() {
		return modified;
	}

	public void setModified(Date modified) {
		this.modified = modified;
	}

	public String getCpayRefData1() {
		return cpayRefData1;
	}

	public void setCpayRefData1(String cpayRefData1) {
		this.cpayRefData1 = cpayRefData1 == null ? null : cpayRefData1.trim();
	}

	public String getCpayRefData2() {
		return cpayRefData2;
	}

	public void setCpayRefData2(String cpayRefData2) {
		this.cpayRefData2 = cpayRefData2 == null ? null : cpayRefData2.trim();
	}

	public String getCpayRefData3() {
		return cpayRefData3;
	}

	public void setCpayRefData3(String cpayRefData3) {
		this.cpayRefData3 = cpayRefData3 == null ? null : cpayRefData3.trim();
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", cpayId=").append(cpayId);
		sb.append(", cpayBdayId=").append(cpayBdayId);
		sb.append(", cpayBperId=").append(cpayBperId);
		sb.append(", cpayShopId=").append(cpayShopId);
		sb.append(", cpayOletId=").append(cpayOletId);
		sb.append(", cpayChksId=").append(cpayChksId);
		sb.append(", cpayCptyId=").append(cpayCptyId);
		sb.append(", cpayPaymId=").append(cpayPaymId);
		sb.append(", cpayNameL1=").append(cpayNameL1);
		sb.append(", cpayNameL2=").append(cpayNameL2);
		sb.append(", cpayNameL3=").append(cpayNameL3);
		sb.append(", cpayNameL4=").append(cpayNameL4);
		sb.append(", cpayNameL5=").append(cpayNameL5);
		sb.append(", cpayShortNameL1=").append(cpayShortNameL1);
		sb.append(", cpayShortNameL2=").append(cpayShortNameL2);
		sb.append(", cpayShortNameL3=").append(cpayShortNameL3);
		sb.append(", cpayShortNameL4=").append(cpayShortNameL4);
		sb.append(", cpayShortNameL5=").append(cpayShortNameL5);
		sb.append(", cpayPaymentType=").append(cpayPaymentType);
		sb.append(", cpaySeq=").append(cpaySeq);
		sb.append(", cpayPayTotal=").append(cpayPayTotal);
		sb.append(", cpayPayTips=").append(cpayPayTips);
		sb.append(", cpayPaySurcharge=").append(cpayPaySurcharge);
		sb.append(", cpayPayChange=").append(cpayPayChange);
		sb.append(", cpayPayForeignCurrency=").append(cpayPayForeignCurrency);
		sb.append(", cpayPayForeignTotal=").append(cpayPayForeignTotal);
		sb.append(", cpayPayForeignTips=").append(cpayPayForeignTips);
		sb.append(", cpayPayForeignSurcharge=").append(cpayPayForeignSurcharge);
		sb.append(", cpayPayForeignChange=").append(cpayPayForeignChange);
		sb.append(", cpayCurrencyCode=").append(cpayCurrencyCode);
		sb.append(", cpayCurrencyRate=").append(cpayCurrencyRate);
		sb.append(", cpayChangeBackCurrency=").append(cpayChangeBackCurrency);
		sb.append(", cpaySpecial=").append(cpaySpecial);
		sb.append(", cpayNonRevenue=").append(cpayNonRevenue);
		sb.append(", cpayMembId=").append(cpayMembId);
		sb.append(", cpayMealUserId=").append(cpayMealUserId);
		sb.append(", cpayPayTime=").append(cpayPayTime);
		sb.append(", cpayPayLoctime=").append(cpayPayLoctime);
		sb.append(", cpayPayUserId=").append(cpayPayUserId);
		sb.append(", cpayPayStatId=").append(cpayPayStatId);
		sb.append(", cpayVoidTime=").append(cpayVoidTime);
		sb.append(", cpayVoidLoctime=").append(cpayVoidLoctime);
		sb.append(", cpayVoidUserId=").append(cpayVoidUserId);
		sb.append(", cpayVoidStatId=").append(cpayVoidStatId);
		sb.append(", cpayVoidVdrsId=").append(cpayVoidVdrsId);
		sb.append(", cpayStatus=").append(cpayStatus);
		sb.append(", cpaySlaveId=").append(cpaySlaveId);
		sb.append(", cpaySlaveCreated=").append(cpaySlaveCreated);
		sb.append(", cpaySlaveModified=").append(cpaySlaveModified);
		sb.append(", cpaySyncId=").append(cpaySyncId);
		sb.append(", created=").append(created);
		sb.append(", modified=").append(modified);
		sb.append(", cpayRefData1=").append(cpayRefData1);
		sb.append(", cpayRefData2=").append(cpayRefData2);
		sb.append(", cpayRefData3=").append(cpayRefData3);
		sb.append(", serialVersionUID=").append(serialVersionUID);
		sb.append("]");
		return sb.toString();
	}
}