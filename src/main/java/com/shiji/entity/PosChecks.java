package com.shiji.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class PosChecks implements Serializable {
	private String chksId;

	private String chksBdayId;

	private String chksBperId;

	private Integer chksShopId;

	private Integer chksOletId;

	private Integer chksSectId;

	private Integer chksAif;

	private Integer chksTxn;

	private String chksCheckPrefix;

	private Integer chksCheckNum;

	private String chksCheckPrefixNum;

	private String chksGenCheckNumType;

	private String chksCtblId;

	private Integer chksGuests;

	private Integer chksChildren;

	private Integer chksPrintCount;

	private Integer chksReceiptPrintCount;

	private Integer chksPartyCount;

	private BigDecimal chksCheckTotal;

	private BigDecimal chksItemTotal;

	private BigDecimal chksSc1;

	private BigDecimal chksSc2;

	private BigDecimal chksSc3;

	private BigDecimal chksSc4;

	private BigDecimal chksSc5;

	private BigDecimal chksTax1;

	private BigDecimal chksTax2;

	private BigDecimal chksTax3;

	private BigDecimal chksTax4;

	private BigDecimal chksTax5;

	private BigDecimal chksTax6;

	private BigDecimal chksTax7;

	private BigDecimal chksTax8;

	private BigDecimal chksTax9;

	private BigDecimal chksTax10;

	private BigDecimal chksTax11;

	private BigDecimal chksTax12;

	private BigDecimal chksTax13;

	private BigDecimal chksTax14;

	private BigDecimal chksTax15;

	private BigDecimal chksTax16;

	private BigDecimal chksTax17;

	private BigDecimal chksTax18;

	private BigDecimal chksTax19;

	private BigDecimal chksTax20;

	private BigDecimal chksTax21;

	private BigDecimal chksTax22;

	private BigDecimal chksTax23;

	private BigDecimal chksTax24;

	private BigDecimal chksTax25;

	private BigDecimal chksInclTaxRef1;

	private BigDecimal chksInclTaxRef2;

	private BigDecimal chksInclTaxRef3;

	private BigDecimal chksInclTaxRef4;

	private BigDecimal chksPreDisc;

	private BigDecimal chksMidDisc;

	private BigDecimal chksPostDisc;

	private BigDecimal chksGratuityTotal;

	private BigDecimal chksRoundAmount;

	private BigDecimal chksPaymentTotal;

	private BigDecimal chksTipsTotal;

	private BigDecimal chksSurchargeTotal;

	private String chksPaid;

	private Date chksResvBookDate;

	private String chksResvRefnoWithPrefix;

	private String chksOrderingType;

	private String chksOrderingMode;

	private String chksNonRevenue;

	private Integer chksMembId;

	private Integer chksCtypId;

	private Integer chksSettleShiftNum;

	private Date chksOpenTime;

	private Date chksOpenLoctime;

	private Integer chksOpenUserId;

	private Integer chksOpenStatId;

	private Date chksCloseTime;

	private Date chksCloseLoctime;

	private Integer chksCloseUserId;

	private Integer chksCloseStatId;

	private String chksCloseBperId;

	private Date chksModifiedTime;

	private Date chksModifiedLoctime;

	private Integer chksModifiedUserId;

	private Integer chksModifiedStatId;

	private Date chksPrintTime;

	private Date chksPrintLoctime;

	private Integer chksPrintUserId;

	private Integer chksPrintStatId;

	private Date chksLockTime;

	private Date chksLockLoctime;

	private Integer chksLockUserId;

	private Integer chksLockStatId;

	private Date chksVoidTime;

	private Date chksVoidLoctime;

	private Integer chksVoidUserId;

	private Integer chksVoidStatId;

	private Integer chksVoidVdrsId;

	private Integer chksOwnerUserId;

	private String chksStatus;

	private Integer chksSlaveId;

	private Date chksSlaveCreated;

	private Date chksSlaveModified;

	private Integer chksSyncId;

	private Date created;

	private Date modified;

	private String chksRemark;

	private static final long serialVersionUID = 1L;

	public String getChksId() {
		return chksId;
	}

	public void setChksId(String chksId) {
		this.chksId = chksId == null ? null : chksId.trim();
	}

	public String getChksBdayId() {
		return chksBdayId;
	}

	public void setChksBdayId(String chksBdayId) {
		this.chksBdayId = chksBdayId == null ? null : chksBdayId.trim();
	}

	public String getChksBperId() {
		return chksBperId;
	}

	public void setChksBperId(String chksBperId) {
		this.chksBperId = chksBperId == null ? null : chksBperId.trim();
	}

	public Integer getChksShopId() {
		return chksShopId;
	}

	public void setChksShopId(Integer chksShopId) {
		this.chksShopId = chksShopId;
	}

	public Integer getChksOletId() {
		return chksOletId;
	}

	public void setChksOletId(Integer chksOletId) {
		this.chksOletId = chksOletId;
	}

	public Integer getChksSectId() {
		return chksSectId;
	}

	public void setChksSectId(Integer chksSectId) {
		this.chksSectId = chksSectId;
	}

	public Integer getChksAif() {
		return chksAif;
	}

	public void setChksAif(Integer chksAif) {
		this.chksAif = chksAif;
	}

	public Integer getChksTxn() {
		return chksTxn;
	}

	public void setChksTxn(Integer chksTxn) {
		this.chksTxn = chksTxn;
	}

	public String getChksCheckPrefix() {
		return chksCheckPrefix;
	}

	public void setChksCheckPrefix(String chksCheckPrefix) {
		this.chksCheckPrefix = chksCheckPrefix == null ? null : chksCheckPrefix.trim();
	}

	public Integer getChksCheckNum() {
		return chksCheckNum;
	}

	public void setChksCheckNum(Integer chksCheckNum) {
		this.chksCheckNum = chksCheckNum;
	}

	public String getChksCheckPrefixNum() {
		return chksCheckPrefixNum;
	}

	public void setChksCheckPrefixNum(String chksCheckPrefixNum) {
		this.chksCheckPrefixNum = chksCheckPrefixNum == null ? null : chksCheckPrefixNum.trim();
	}

	public String getChksGenCheckNumType() {
		return chksGenCheckNumType;
	}

	public void setChksGenCheckNumType(String chksGenCheckNumType) {
		this.chksGenCheckNumType = chksGenCheckNumType == null ? null : chksGenCheckNumType.trim();
	}

	public String getChksCtblId() {
		return chksCtblId;
	}

	public void setChksCtblId(String chksCtblId) {
		this.chksCtblId = chksCtblId == null ? null : chksCtblId.trim();
	}

	public Integer getChksGuests() {
		return chksGuests;
	}

	public void setChksGuests(Integer chksGuests) {
		this.chksGuests = chksGuests;
	}

	public Integer getChksChildren() {
		return chksChildren;
	}

	public void setChksChildren(Integer chksChildren) {
		this.chksChildren = chksChildren;
	}

	public Integer getChksPrintCount() {
		return chksPrintCount;
	}

	public void setChksPrintCount(Integer chksPrintCount) {
		this.chksPrintCount = chksPrintCount;
	}

	public Integer getChksReceiptPrintCount() {
		return chksReceiptPrintCount;
	}

	public void setChksReceiptPrintCount(Integer chksReceiptPrintCount) {
		this.chksReceiptPrintCount = chksReceiptPrintCount;
	}

	public Integer getChksPartyCount() {
		return chksPartyCount;
	}

	public void setChksPartyCount(Integer chksPartyCount) {
		this.chksPartyCount = chksPartyCount;
	}

	public BigDecimal getChksCheckTotal() {
		return chksCheckTotal;
	}

	public void setChksCheckTotal(BigDecimal chksCheckTotal) {
		this.chksCheckTotal = chksCheckTotal;
	}

	public BigDecimal getChksItemTotal() {
		return chksItemTotal;
	}

	public void setChksItemTotal(BigDecimal chksItemTotal) {
		this.chksItemTotal = chksItemTotal;
	}

	public BigDecimal getChksSc1() {
		return chksSc1;
	}

	public void setChksSc1(BigDecimal chksSc1) {
		this.chksSc1 = chksSc1;
	}

	public BigDecimal getChksSc2() {
		return chksSc2;
	}

	public void setChksSc2(BigDecimal chksSc2) {
		this.chksSc2 = chksSc2;
	}

	public BigDecimal getChksSc3() {
		return chksSc3;
	}

	public void setChksSc3(BigDecimal chksSc3) {
		this.chksSc3 = chksSc3;
	}

	public BigDecimal getChksSc4() {
		return chksSc4;
	}

	public void setChksSc4(BigDecimal chksSc4) {
		this.chksSc4 = chksSc4;
	}

	public BigDecimal getChksSc5() {
		return chksSc5;
	}

	public void setChksSc5(BigDecimal chksSc5) {
		this.chksSc5 = chksSc5;
	}

	public BigDecimal getChksTax1() {
		return chksTax1;
	}

	public void setChksTax1(BigDecimal chksTax1) {
		this.chksTax1 = chksTax1;
	}

	public BigDecimal getChksTax2() {
		return chksTax2;
	}

	public void setChksTax2(BigDecimal chksTax2) {
		this.chksTax2 = chksTax2;
	}

	public BigDecimal getChksTax3() {
		return chksTax3;
	}

	public void setChksTax3(BigDecimal chksTax3) {
		this.chksTax3 = chksTax3;
	}

	public BigDecimal getChksTax4() {
		return chksTax4;
	}

	public void setChksTax4(BigDecimal chksTax4) {
		this.chksTax4 = chksTax4;
	}

	public BigDecimal getChksTax5() {
		return chksTax5;
	}

	public void setChksTax5(BigDecimal chksTax5) {
		this.chksTax5 = chksTax5;
	}

	public BigDecimal getChksTax6() {
		return chksTax6;
	}

	public void setChksTax6(BigDecimal chksTax6) {
		this.chksTax6 = chksTax6;
	}

	public BigDecimal getChksTax7() {
		return chksTax7;
	}

	public void setChksTax7(BigDecimal chksTax7) {
		this.chksTax7 = chksTax7;
	}

	public BigDecimal getChksTax8() {
		return chksTax8;
	}

	public void setChksTax8(BigDecimal chksTax8) {
		this.chksTax8 = chksTax8;
	}

	public BigDecimal getChksTax9() {
		return chksTax9;
	}

	public void setChksTax9(BigDecimal chksTax9) {
		this.chksTax9 = chksTax9;
	}

	public BigDecimal getChksTax10() {
		return chksTax10;
	}

	public void setChksTax10(BigDecimal chksTax10) {
		this.chksTax10 = chksTax10;
	}

	public BigDecimal getChksTax11() {
		return chksTax11;
	}

	public void setChksTax11(BigDecimal chksTax11) {
		this.chksTax11 = chksTax11;
	}

	public BigDecimal getChksTax12() {
		return chksTax12;
	}

	public void setChksTax12(BigDecimal chksTax12) {
		this.chksTax12 = chksTax12;
	}

	public BigDecimal getChksTax13() {
		return chksTax13;
	}

	public void setChksTax13(BigDecimal chksTax13) {
		this.chksTax13 = chksTax13;
	}

	public BigDecimal getChksTax14() {
		return chksTax14;
	}

	public void setChksTax14(BigDecimal chksTax14) {
		this.chksTax14 = chksTax14;
	}

	public BigDecimal getChksTax15() {
		return chksTax15;
	}

	public void setChksTax15(BigDecimal chksTax15) {
		this.chksTax15 = chksTax15;
	}

	public BigDecimal getChksTax16() {
		return chksTax16;
	}

	public void setChksTax16(BigDecimal chksTax16) {
		this.chksTax16 = chksTax16;
	}

	public BigDecimal getChksTax17() {
		return chksTax17;
	}

	public void setChksTax17(BigDecimal chksTax17) {
		this.chksTax17 = chksTax17;
	}

	public BigDecimal getChksTax18() {
		return chksTax18;
	}

	public void setChksTax18(BigDecimal chksTax18) {
		this.chksTax18 = chksTax18;
	}

	public BigDecimal getChksTax19() {
		return chksTax19;
	}

	public void setChksTax19(BigDecimal chksTax19) {
		this.chksTax19 = chksTax19;
	}

	public BigDecimal getChksTax20() {
		return chksTax20;
	}

	public void setChksTax20(BigDecimal chksTax20) {
		this.chksTax20 = chksTax20;
	}

	public BigDecimal getChksTax21() {
		return chksTax21;
	}

	public void setChksTax21(BigDecimal chksTax21) {
		this.chksTax21 = chksTax21;
	}

	public BigDecimal getChksTax22() {
		return chksTax22;
	}

	public void setChksTax22(BigDecimal chksTax22) {
		this.chksTax22 = chksTax22;
	}

	public BigDecimal getChksTax23() {
		return chksTax23;
	}

	public void setChksTax23(BigDecimal chksTax23) {
		this.chksTax23 = chksTax23;
	}

	public BigDecimal getChksTax24() {
		return chksTax24;
	}

	public void setChksTax24(BigDecimal chksTax24) {
		this.chksTax24 = chksTax24;
	}

	public BigDecimal getChksTax25() {
		return chksTax25;
	}

	public void setChksTax25(BigDecimal chksTax25) {
		this.chksTax25 = chksTax25;
	}

	public BigDecimal getChksInclTaxRef1() {
		return chksInclTaxRef1;
	}

	public void setChksInclTaxRef1(BigDecimal chksInclTaxRef1) {
		this.chksInclTaxRef1 = chksInclTaxRef1;
	}

	public BigDecimal getChksInclTaxRef2() {
		return chksInclTaxRef2;
	}

	public void setChksInclTaxRef2(BigDecimal chksInclTaxRef2) {
		this.chksInclTaxRef2 = chksInclTaxRef2;
	}

	public BigDecimal getChksInclTaxRef3() {
		return chksInclTaxRef3;
	}

	public void setChksInclTaxRef3(BigDecimal chksInclTaxRef3) {
		this.chksInclTaxRef3 = chksInclTaxRef3;
	}

	public BigDecimal getChksInclTaxRef4() {
		return chksInclTaxRef4;
	}

	public void setChksInclTaxRef4(BigDecimal chksInclTaxRef4) {
		this.chksInclTaxRef4 = chksInclTaxRef4;
	}

	public BigDecimal getChksPreDisc() {
		return chksPreDisc;
	}

	public void setChksPreDisc(BigDecimal chksPreDisc) {
		this.chksPreDisc = chksPreDisc;
	}

	public BigDecimal getChksMidDisc() {
		return chksMidDisc;
	}

	public void setChksMidDisc(BigDecimal chksMidDisc) {
		this.chksMidDisc = chksMidDisc;
	}

	public BigDecimal getChksPostDisc() {
		return chksPostDisc;
	}

	public void setChksPostDisc(BigDecimal chksPostDisc) {
		this.chksPostDisc = chksPostDisc;
	}

	public BigDecimal getChksGratuityTotal() {
		return chksGratuityTotal;
	}

	public void setChksGratuityTotal(BigDecimal chksGratuityTotal) {
		this.chksGratuityTotal = chksGratuityTotal;
	}

	public BigDecimal getChksRoundAmount() {
		return chksRoundAmount;
	}

	public void setChksRoundAmount(BigDecimal chksRoundAmount) {
		this.chksRoundAmount = chksRoundAmount;
	}

	public BigDecimal getChksPaymentTotal() {
		return chksPaymentTotal;
	}

	public void setChksPaymentTotal(BigDecimal chksPaymentTotal) {
		this.chksPaymentTotal = chksPaymentTotal;
	}

	public BigDecimal getChksTipsTotal() {
		return chksTipsTotal;
	}

	public void setChksTipsTotal(BigDecimal chksTipsTotal) {
		this.chksTipsTotal = chksTipsTotal;
	}

	public BigDecimal getChksSurchargeTotal() {
		return chksSurchargeTotal;
	}

	public void setChksSurchargeTotal(BigDecimal chksSurchargeTotal) {
		this.chksSurchargeTotal = chksSurchargeTotal;
	}

	public String getChksPaid() {
		return chksPaid;
	}

	public void setChksPaid(String chksPaid) {
		this.chksPaid = chksPaid == null ? null : chksPaid.trim();
	}

	public Date getChksResvBookDate() {
		return chksResvBookDate;
	}

	public void setChksResvBookDate(Date chksResvBookDate) {
		this.chksResvBookDate = chksResvBookDate;
	}

	public String getChksResvRefnoWithPrefix() {
		return chksResvRefnoWithPrefix;
	}

	public void setChksResvRefnoWithPrefix(String chksResvRefnoWithPrefix) {
		this.chksResvRefnoWithPrefix = chksResvRefnoWithPrefix == null ? null : chksResvRefnoWithPrefix.trim();
	}

	public String getChksOrderingType() {
		return chksOrderingType;
	}

	public void setChksOrderingType(String chksOrderingType) {
		this.chksOrderingType = chksOrderingType == null ? null : chksOrderingType.trim();
	}

	public String getChksOrderingMode() {
		return chksOrderingMode;
	}

	public void setChksOrderingMode(String chksOrderingMode) {
		this.chksOrderingMode = chksOrderingMode == null ? null : chksOrderingMode.trim();
	}

	public String getChksNonRevenue() {
		return chksNonRevenue;
	}

	public void setChksNonRevenue(String chksNonRevenue) {
		this.chksNonRevenue = chksNonRevenue == null ? null : chksNonRevenue.trim();
	}

	public Integer getChksMembId() {
		return chksMembId;
	}

	public void setChksMembId(Integer chksMembId) {
		this.chksMembId = chksMembId;
	}

	public Integer getChksCtypId() {
		return chksCtypId;
	}

	public void setChksCtypId(Integer chksCtypId) {
		this.chksCtypId = chksCtypId;
	}

	public Integer getChksSettleShiftNum() {
		return chksSettleShiftNum;
	}

	public void setChksSettleShiftNum(Integer chksSettleShiftNum) {
		this.chksSettleShiftNum = chksSettleShiftNum;
	}

	public Date getChksOpenTime() {
		return chksOpenTime;
	}

	public void setChksOpenTime(Date chksOpenTime) {
		this.chksOpenTime = chksOpenTime;
	}

	public Date getChksOpenLoctime() {
		return chksOpenLoctime;
	}

	public void setChksOpenLoctime(Date chksOpenLoctime) {
		this.chksOpenLoctime = chksOpenLoctime;
	}

	public Integer getChksOpenUserId() {
		return chksOpenUserId;
	}

	public void setChksOpenUserId(Integer chksOpenUserId) {
		this.chksOpenUserId = chksOpenUserId;
	}

	public Integer getChksOpenStatId() {
		return chksOpenStatId;
	}

	public void setChksOpenStatId(Integer chksOpenStatId) {
		this.chksOpenStatId = chksOpenStatId;
	}

	public Date getChksCloseTime() {
		return chksCloseTime;
	}

	public void setChksCloseTime(Date chksCloseTime) {
		this.chksCloseTime = chksCloseTime;
	}

	public Date getChksCloseLoctime() {
		return chksCloseLoctime;
	}

	public void setChksCloseLoctime(Date chksCloseLoctime) {
		this.chksCloseLoctime = chksCloseLoctime;
	}

	public Integer getChksCloseUserId() {
		return chksCloseUserId;
	}

	public void setChksCloseUserId(Integer chksCloseUserId) {
		this.chksCloseUserId = chksCloseUserId;
	}

	public Integer getChksCloseStatId() {
		return chksCloseStatId;
	}

	public void setChksCloseStatId(Integer chksCloseStatId) {
		this.chksCloseStatId = chksCloseStatId;
	}

	public String getChksCloseBperId() {
		return chksCloseBperId;
	}

	public void setChksCloseBperId(String chksCloseBperId) {
		this.chksCloseBperId = chksCloseBperId == null ? null : chksCloseBperId.trim();
	}

	public Date getChksModifiedTime() {
		return chksModifiedTime;
	}

	public void setChksModifiedTime(Date chksModifiedTime) {
		this.chksModifiedTime = chksModifiedTime;
	}

	public Date getChksModifiedLoctime() {
		return chksModifiedLoctime;
	}

	public void setChksModifiedLoctime(Date chksModifiedLoctime) {
		this.chksModifiedLoctime = chksModifiedLoctime;
	}

	public Integer getChksModifiedUserId() {
		return chksModifiedUserId;
	}

	public void setChksModifiedUserId(Integer chksModifiedUserId) {
		this.chksModifiedUserId = chksModifiedUserId;
	}

	public Integer getChksModifiedStatId() {
		return chksModifiedStatId;
	}

	public void setChksModifiedStatId(Integer chksModifiedStatId) {
		this.chksModifiedStatId = chksModifiedStatId;
	}

	public Date getChksPrintTime() {
		return chksPrintTime;
	}

	public void setChksPrintTime(Date chksPrintTime) {
		this.chksPrintTime = chksPrintTime;
	}

	public Date getChksPrintLoctime() {
		return chksPrintLoctime;
	}

	public void setChksPrintLoctime(Date chksPrintLoctime) {
		this.chksPrintLoctime = chksPrintLoctime;
	}

	public Integer getChksPrintUserId() {
		return chksPrintUserId;
	}

	public void setChksPrintUserId(Integer chksPrintUserId) {
		this.chksPrintUserId = chksPrintUserId;
	}

	public Integer getChksPrintStatId() {
		return chksPrintStatId;
	}

	public void setChksPrintStatId(Integer chksPrintStatId) {
		this.chksPrintStatId = chksPrintStatId;
	}

	public Date getChksLockTime() {
		return chksLockTime;
	}

	public void setChksLockTime(Date chksLockTime) {
		this.chksLockTime = chksLockTime;
	}

	public Date getChksLockLoctime() {
		return chksLockLoctime;
	}

	public void setChksLockLoctime(Date chksLockLoctime) {
		this.chksLockLoctime = chksLockLoctime;
	}

	public Integer getChksLockUserId() {
		return chksLockUserId;
	}

	public void setChksLockUserId(Integer chksLockUserId) {
		this.chksLockUserId = chksLockUserId;
	}

	public Integer getChksLockStatId() {
		return chksLockStatId;
	}

	public void setChksLockStatId(Integer chksLockStatId) {
		this.chksLockStatId = chksLockStatId;
	}

	public Date getChksVoidTime() {
		return chksVoidTime;
	}

	public void setChksVoidTime(Date chksVoidTime) {
		this.chksVoidTime = chksVoidTime;
	}

	public Date getChksVoidLoctime() {
		return chksVoidLoctime;
	}

	public void setChksVoidLoctime(Date chksVoidLoctime) {
		this.chksVoidLoctime = chksVoidLoctime;
	}

	public Integer getChksVoidUserId() {
		return chksVoidUserId;
	}

	public void setChksVoidUserId(Integer chksVoidUserId) {
		this.chksVoidUserId = chksVoidUserId;
	}

	public Integer getChksVoidStatId() {
		return chksVoidStatId;
	}

	public void setChksVoidStatId(Integer chksVoidStatId) {
		this.chksVoidStatId = chksVoidStatId;
	}

	public Integer getChksVoidVdrsId() {
		return chksVoidVdrsId;
	}

	public void setChksVoidVdrsId(Integer chksVoidVdrsId) {
		this.chksVoidVdrsId = chksVoidVdrsId;
	}

	public Integer getChksOwnerUserId() {
		return chksOwnerUserId;
	}

	public void setChksOwnerUserId(Integer chksOwnerUserId) {
		this.chksOwnerUserId = chksOwnerUserId;
	}

	public String getChksStatus() {
		return chksStatus;
	}

	public void setChksStatus(String chksStatus) {
		this.chksStatus = chksStatus == null ? null : chksStatus.trim();
	}

	public Integer getChksSlaveId() {
		return chksSlaveId;
	}

	public void setChksSlaveId(Integer chksSlaveId) {
		this.chksSlaveId = chksSlaveId;
	}

	public Date getChksSlaveCreated() {
		return chksSlaveCreated;
	}

	public void setChksSlaveCreated(Date chksSlaveCreated) {
		this.chksSlaveCreated = chksSlaveCreated;
	}

	public Date getChksSlaveModified() {
		return chksSlaveModified;
	}

	public void setChksSlaveModified(Date chksSlaveModified) {
		this.chksSlaveModified = chksSlaveModified;
	}

	public Integer getChksSyncId() {
		return chksSyncId;
	}

	public void setChksSyncId(Integer chksSyncId) {
		this.chksSyncId = chksSyncId;
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

	public String getChksRemark() {
		return chksRemark;
	}

	public void setChksRemark(String chksRemark) {
		this.chksRemark = chksRemark == null ? null : chksRemark.trim();
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", chksId=").append(chksId);
		sb.append(", chksBdayId=").append(chksBdayId);
		sb.append(", chksBperId=").append(chksBperId);
		sb.append(", chksShopId=").append(chksShopId);
		sb.append(", chksOletId=").append(chksOletId);
		sb.append(", chksSectId=").append(chksSectId);
		sb.append(", chksAif=").append(chksAif);
		sb.append(", chksTxn=").append(chksTxn);
		sb.append(", chksCheckPrefix=").append(chksCheckPrefix);
		sb.append(", chksCheckNum=").append(chksCheckNum);
		sb.append(", chksCheckPrefixNum=").append(chksCheckPrefixNum);
		sb.append(", chksGenCheckNumType=").append(chksGenCheckNumType);
		sb.append(", chksCtblId=").append(chksCtblId);
		sb.append(", chksGuests=").append(chksGuests);
		sb.append(", chksChildren=").append(chksChildren);
		sb.append(", chksPrintCount=").append(chksPrintCount);
		sb.append(", chksReceiptPrintCount=").append(chksReceiptPrintCount);
		sb.append(", chksPartyCount=").append(chksPartyCount);
		sb.append(", chksCheckTotal=").append(chksCheckTotal);
		sb.append(", chksItemTotal=").append(chksItemTotal);
		sb.append(", chksSc1=").append(chksSc1);
		sb.append(", chksSc2=").append(chksSc2);
		sb.append(", chksSc3=").append(chksSc3);
		sb.append(", chksSc4=").append(chksSc4);
		sb.append(", chksSc5=").append(chksSc5);
		sb.append(", chksTax1=").append(chksTax1);
		sb.append(", chksTax2=").append(chksTax2);
		sb.append(", chksTax3=").append(chksTax3);
		sb.append(", chksTax4=").append(chksTax4);
		sb.append(", chksTax5=").append(chksTax5);
		sb.append(", chksTax6=").append(chksTax6);
		sb.append(", chksTax7=").append(chksTax7);
		sb.append(", chksTax8=").append(chksTax8);
		sb.append(", chksTax9=").append(chksTax9);
		sb.append(", chksTax10=").append(chksTax10);
		sb.append(", chksTax11=").append(chksTax11);
		sb.append(", chksTax12=").append(chksTax12);
		sb.append(", chksTax13=").append(chksTax13);
		sb.append(", chksTax14=").append(chksTax14);
		sb.append(", chksTax15=").append(chksTax15);
		sb.append(", chksTax16=").append(chksTax16);
		sb.append(", chksTax17=").append(chksTax17);
		sb.append(", chksTax18=").append(chksTax18);
		sb.append(", chksTax19=").append(chksTax19);
		sb.append(", chksTax20=").append(chksTax20);
		sb.append(", chksTax21=").append(chksTax21);
		sb.append(", chksTax22=").append(chksTax22);
		sb.append(", chksTax23=").append(chksTax23);
		sb.append(", chksTax24=").append(chksTax24);
		sb.append(", chksTax25=").append(chksTax25);
		sb.append(", chksInclTaxRef1=").append(chksInclTaxRef1);
		sb.append(", chksInclTaxRef2=").append(chksInclTaxRef2);
		sb.append(", chksInclTaxRef3=").append(chksInclTaxRef3);
		sb.append(", chksInclTaxRef4=").append(chksInclTaxRef4);
		sb.append(", chksPreDisc=").append(chksPreDisc);
		sb.append(", chksMidDisc=").append(chksMidDisc);
		sb.append(", chksPostDisc=").append(chksPostDisc);
		sb.append(", chksGratuityTotal=").append(chksGratuityTotal);
		sb.append(", chksRoundAmount=").append(chksRoundAmount);
		sb.append(", chksPaymentTotal=").append(chksPaymentTotal);
		sb.append(", chksTipsTotal=").append(chksTipsTotal);
		sb.append(", chksSurchargeTotal=").append(chksSurchargeTotal);
		sb.append(", chksPaid=").append(chksPaid);
		sb.append(", chksResvBookDate=").append(chksResvBookDate);
		sb.append(", chksResvRefnoWithPrefix=").append(chksResvRefnoWithPrefix);
		sb.append(", chksOrderingType=").append(chksOrderingType);
		sb.append(", chksOrderingMode=").append(chksOrderingMode);
		sb.append(", chksNonRevenue=").append(chksNonRevenue);
		sb.append(", chksMembId=").append(chksMembId);
		sb.append(", chksCtypId=").append(chksCtypId);
		sb.append(", chksSettleShiftNum=").append(chksSettleShiftNum);
		sb.append(", chksOpenTime=").append(chksOpenTime);
		sb.append(", chksOpenLoctime=").append(chksOpenLoctime);
		sb.append(", chksOpenUserId=").append(chksOpenUserId);
		sb.append(", chksOpenStatId=").append(chksOpenStatId);
		sb.append(", chksCloseTime=").append(chksCloseTime);
		sb.append(", chksCloseLoctime=").append(chksCloseLoctime);
		sb.append(", chksCloseUserId=").append(chksCloseUserId);
		sb.append(", chksCloseStatId=").append(chksCloseStatId);
		sb.append(", chksCloseBperId=").append(chksCloseBperId);
		sb.append(", chksModifiedTime=").append(chksModifiedTime);
		sb.append(", chksModifiedLoctime=").append(chksModifiedLoctime);
		sb.append(", chksModifiedUserId=").append(chksModifiedUserId);
		sb.append(", chksModifiedStatId=").append(chksModifiedStatId);
		sb.append(", chksPrintTime=").append(chksPrintTime);
		sb.append(", chksPrintLoctime=").append(chksPrintLoctime);
		sb.append(", chksPrintUserId=").append(chksPrintUserId);
		sb.append(", chksPrintStatId=").append(chksPrintStatId);
		sb.append(", chksLockTime=").append(chksLockTime);
		sb.append(", chksLockLoctime=").append(chksLockLoctime);
		sb.append(", chksLockUserId=").append(chksLockUserId);
		sb.append(", chksLockStatId=").append(chksLockStatId);
		sb.append(", chksVoidTime=").append(chksVoidTime);
		sb.append(", chksVoidLoctime=").append(chksVoidLoctime);
		sb.append(", chksVoidUserId=").append(chksVoidUserId);
		sb.append(", chksVoidStatId=").append(chksVoidStatId);
		sb.append(", chksVoidVdrsId=").append(chksVoidVdrsId);
		sb.append(", chksOwnerUserId=").append(chksOwnerUserId);
		sb.append(", chksStatus=").append(chksStatus);
		sb.append(", chksSlaveId=").append(chksSlaveId);
		sb.append(", chksSlaveCreated=").append(chksSlaveCreated);
		sb.append(", chksSlaveModified=").append(chksSlaveModified);
		sb.append(", chksSyncId=").append(chksSyncId);
		sb.append(", created=").append(created);
		sb.append(", modified=").append(modified);
		sb.append(", chksRemark=").append(chksRemark);
		sb.append(", serialVersionUID=").append(serialVersionUID);
		sb.append("]");
		return sb.toString();
	}
}