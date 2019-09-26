package com.shiji.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class PosBusinessDays implements Serializable {
	private String bdayId;

	private Integer bdayShopId;

	private Integer bdayOletId;

	private Date bdayDate;

	private Integer bdayWeek;

	private Integer bdayDayOfWeek;

	private Integer bdayHolidayCaldId;

	private Integer bdayDayBeforeHolidayCaldId;

	private Integer bdaySpecialDayCaldId;

	private Integer bdayDayBeforeSpecialDayCaldId;

	private Date bdayStartTime;

	private Date bdayStartLoctime;

	private Date bdayEndTime;

	private Date bdayEndLoctime;

	private Date bdayLastRecallTime;

	private Date bdayLastRecallLoctime;

	private Integer bdayStartUserId;

	private Integer bdayEndUserId;

	private Integer bdayRecallUserId;

	private Integer bdayRecallCount;

	private Integer bdayPriceLevel;

	private Float bdaySc1Rate;

	private Float bdaySc2Rate;

	private Float bdaySc3Rate;

	private Float bdaySc4Rate;

	private Float bdaySc5Rate;

	private Float bdayTax1Rate;

	private Float bdayTax2Rate;

	private Float bdayTax3Rate;

	private Float bdayTax4Rate;

	private Float bdayTax5Rate;

	private Float bdayTax6Rate;

	private Float bdayTax7Rate;

	private Float bdayTax8Rate;

	private Float bdayTax9Rate;

	private Float bdayTax10Rate;

	private Float bdayTax11Rate;

	private Float bdayTax12Rate;

	private Float bdayTax13Rate;

	private Float bdayTax14Rate;

	private Float bdayTax15Rate;

	private Float bdayTax16Rate;

	private Float bdayTax17Rate;

	private Float bdayTax18Rate;

	private Float bdayTax19Rate;

	private Float bdayTax20Rate;

	private Float bdayTax21Rate;

	private Float bdayTax22Rate;

	private Float bdayTax23Rate;

	private Float bdayTax24Rate;

	private Float bdayTax25Rate;

	private String bdayItemRound;

	private String bdayScRound;

	private String bdayTaxRound;

	private String bdayDiscRound;

	private String bdayCheckRound;

	private String bdayPayRound;

	private String bdayGratuityRound;

	private Integer bdayItemDecimal;

	private Integer bdayScDecimal;

	private Integer bdayTaxDecimal;

	private Integer bdayDiscDecimal;

	private Integer bdayCheckDecimal;

	private Integer bdayPayDecimal;

	private Integer bdayGratuityDecimal;

	private String bdayTaxScIncludeTaxScMask1;

	private String bdayTaxScIncludeTaxScMask2;

	private String bdayTaxScIncludeTaxScMask3;

	private String bdayTaxScIncludeTaxScMask4;

	private String bdayTaxScIncludeTaxScMask5;

	private String bdayTaxScIncludeTaxScMask6;

	private String bdayTaxScIncludeTaxScMask7;

	private String bdayTaxScIncludeTaxScMask8;

	private String bdayTaxScIncludeTaxScMask9;

	private String bdayTaxScIncludeTaxScMask10;

	private String bdayTaxScIncludeTaxScMask11;

	private String bdayTaxScIncludeTaxScMask12;

	private String bdayTaxScIncludeTaxScMask13;

	private String bdayTaxScIncludeTaxScMask14;

	private String bdayTaxScIncludeTaxScMask15;

	private String bdayTaxScIncludeTaxScMask16;

	private String bdayTaxScIncludeTaxScMask17;

	private String bdayTaxScIncludeTaxScMask18;

	private String bdayTaxScIncludeTaxScMask19;

	private String bdayTaxScIncludeTaxScMask20;

	private String bdayTaxScIncludeTaxScMask21;

	private String bdayTaxScIncludeTaxScMask22;

	private String bdayTaxScIncludeTaxScMask23;

	private String bdayTaxScIncludeTaxScMask24;

	private String bdayTaxScIncludeTaxScMask25;

	private String bdayTaxScIncludeTaxScMask26;

	private String bdayTaxScIncludeTaxScMask27;

	private String bdayTaxScIncludeTaxScMask28;

	private String bdayTaxScIncludeTaxScMask29;

	private String bdayTaxScIncludeTaxScMask30;

	private String bdayTaxScIncludePreDisc;

	private String bdayTaxIncludeMidDisc;

	private String bdayGenerateCheckNumBy;

	private String bdayCheckPrefix;

	private Integer bdayStartCheckNum;

	private Integer bdayEndCheckNum;

	private Integer bdayNextCheckNum;

	private String bdayResetCheckNum;

	private Integer bdayResetCheckNumMonth;

	private Integer bdayResetCheckNumDay;

	private Integer bdaySphrId;

	private String bdayBaseCurrencyCode;

	private BigDecimal bdayBaseCurrencyRate;

	private String bdayCustomData1;

	private String bdayStatus;

	private Integer bdaySlaveId;

	private Date bdaySlaveCreated;

	private Date bdaySlaveModified;

	private Integer bdaySyncId;

	private Date created;

	private Date modified;

	private static final long serialVersionUID = 1L;

	public String getBdayId() {
		return bdayId;
	}

	public void setBdayId(String bdayId) {
		this.bdayId = bdayId == null ? null : bdayId.trim();
	}

	public Integer getBdayShopId() {
		return bdayShopId;
	}

	public void setBdayShopId(Integer bdayShopId) {
		this.bdayShopId = bdayShopId;
	}

	public Integer getBdayOletId() {
		return bdayOletId;
	}

	public void setBdayOletId(Integer bdayOletId) {
		this.bdayOletId = bdayOletId;
	}

	public Date getBdayDate() {
		return bdayDate;
	}

	public void setBdayDate(Date bdayDate) {
		this.bdayDate = bdayDate;
	}

	public Integer getBdayWeek() {
		return bdayWeek;
	}

	public void setBdayWeek(Integer bdayWeek) {
		this.bdayWeek = bdayWeek;
	}

	public Integer getBdayDayOfWeek() {
		return bdayDayOfWeek;
	}

	public void setBdayDayOfWeek(Integer bdayDayOfWeek) {
		this.bdayDayOfWeek = bdayDayOfWeek;
	}

	public Integer getBdayHolidayCaldId() {
		return bdayHolidayCaldId;
	}

	public void setBdayHolidayCaldId(Integer bdayHolidayCaldId) {
		this.bdayHolidayCaldId = bdayHolidayCaldId;
	}

	public Integer getBdayDayBeforeHolidayCaldId() {
		return bdayDayBeforeHolidayCaldId;
	}

	public void setBdayDayBeforeHolidayCaldId(Integer bdayDayBeforeHolidayCaldId) {
		this.bdayDayBeforeHolidayCaldId = bdayDayBeforeHolidayCaldId;
	}

	public Integer getBdaySpecialDayCaldId() {
		return bdaySpecialDayCaldId;
	}

	public void setBdaySpecialDayCaldId(Integer bdaySpecialDayCaldId) {
		this.bdaySpecialDayCaldId = bdaySpecialDayCaldId;
	}

	public Integer getBdayDayBeforeSpecialDayCaldId() {
		return bdayDayBeforeSpecialDayCaldId;
	}

	public void setBdayDayBeforeSpecialDayCaldId(Integer bdayDayBeforeSpecialDayCaldId) {
		this.bdayDayBeforeSpecialDayCaldId = bdayDayBeforeSpecialDayCaldId;
	}

	public Date getBdayStartTime() {
		return bdayStartTime;
	}

	public void setBdayStartTime(Date bdayStartTime) {
		this.bdayStartTime = bdayStartTime;
	}

	public Date getBdayStartLoctime() {
		return bdayStartLoctime;
	}

	public void setBdayStartLoctime(Date bdayStartLoctime) {
		this.bdayStartLoctime = bdayStartLoctime;
	}

	public Date getBdayEndTime() {
		return bdayEndTime;
	}

	public void setBdayEndTime(Date bdayEndTime) {
		this.bdayEndTime = bdayEndTime;
	}

	public Date getBdayEndLoctime() {
		return bdayEndLoctime;
	}

	public void setBdayEndLoctime(Date bdayEndLoctime) {
		this.bdayEndLoctime = bdayEndLoctime;
	}

	public Date getBdayLastRecallTime() {
		return bdayLastRecallTime;
	}

	public void setBdayLastRecallTime(Date bdayLastRecallTime) {
		this.bdayLastRecallTime = bdayLastRecallTime;
	}

	public Date getBdayLastRecallLoctime() {
		return bdayLastRecallLoctime;
	}

	public void setBdayLastRecallLoctime(Date bdayLastRecallLoctime) {
		this.bdayLastRecallLoctime = bdayLastRecallLoctime;
	}

	public Integer getBdayStartUserId() {
		return bdayStartUserId;
	}

	public void setBdayStartUserId(Integer bdayStartUserId) {
		this.bdayStartUserId = bdayStartUserId;
	}

	public Integer getBdayEndUserId() {
		return bdayEndUserId;
	}

	public void setBdayEndUserId(Integer bdayEndUserId) {
		this.bdayEndUserId = bdayEndUserId;
	}

	public Integer getBdayRecallUserId() {
		return bdayRecallUserId;
	}

	public void setBdayRecallUserId(Integer bdayRecallUserId) {
		this.bdayRecallUserId = bdayRecallUserId;
	}

	public Integer getBdayRecallCount() {
		return bdayRecallCount;
	}

	public void setBdayRecallCount(Integer bdayRecallCount) {
		this.bdayRecallCount = bdayRecallCount;
	}

	public Integer getBdayPriceLevel() {
		return bdayPriceLevel;
	}

	public void setBdayPriceLevel(Integer bdayPriceLevel) {
		this.bdayPriceLevel = bdayPriceLevel;
	}

	public Float getBdaySc1Rate() {
		return bdaySc1Rate;
	}

	public void setBdaySc1Rate(Float bdaySc1Rate) {
		this.bdaySc1Rate = bdaySc1Rate;
	}

	public Float getBdaySc2Rate() {
		return bdaySc2Rate;
	}

	public void setBdaySc2Rate(Float bdaySc2Rate) {
		this.bdaySc2Rate = bdaySc2Rate;
	}

	public Float getBdaySc3Rate() {
		return bdaySc3Rate;
	}

	public void setBdaySc3Rate(Float bdaySc3Rate) {
		this.bdaySc3Rate = bdaySc3Rate;
	}

	public Float getBdaySc4Rate() {
		return bdaySc4Rate;
	}

	public void setBdaySc4Rate(Float bdaySc4Rate) {
		this.bdaySc4Rate = bdaySc4Rate;
	}

	public Float getBdaySc5Rate() {
		return bdaySc5Rate;
	}

	public void setBdaySc5Rate(Float bdaySc5Rate) {
		this.bdaySc5Rate = bdaySc5Rate;
	}

	public Float getBdayTax1Rate() {
		return bdayTax1Rate;
	}

	public void setBdayTax1Rate(Float bdayTax1Rate) {
		this.bdayTax1Rate = bdayTax1Rate;
	}

	public Float getBdayTax2Rate() {
		return bdayTax2Rate;
	}

	public void setBdayTax2Rate(Float bdayTax2Rate) {
		this.bdayTax2Rate = bdayTax2Rate;
	}

	public Float getBdayTax3Rate() {
		return bdayTax3Rate;
	}

	public void setBdayTax3Rate(Float bdayTax3Rate) {
		this.bdayTax3Rate = bdayTax3Rate;
	}

	public Float getBdayTax4Rate() {
		return bdayTax4Rate;
	}

	public void setBdayTax4Rate(Float bdayTax4Rate) {
		this.bdayTax4Rate = bdayTax4Rate;
	}

	public Float getBdayTax5Rate() {
		return bdayTax5Rate;
	}

	public void setBdayTax5Rate(Float bdayTax5Rate) {
		this.bdayTax5Rate = bdayTax5Rate;
	}

	public Float getBdayTax6Rate() {
		return bdayTax6Rate;
	}

	public void setBdayTax6Rate(Float bdayTax6Rate) {
		this.bdayTax6Rate = bdayTax6Rate;
	}

	public Float getBdayTax7Rate() {
		return bdayTax7Rate;
	}

	public void setBdayTax7Rate(Float bdayTax7Rate) {
		this.bdayTax7Rate = bdayTax7Rate;
	}

	public Float getBdayTax8Rate() {
		return bdayTax8Rate;
	}

	public void setBdayTax8Rate(Float bdayTax8Rate) {
		this.bdayTax8Rate = bdayTax8Rate;
	}

	public Float getBdayTax9Rate() {
		return bdayTax9Rate;
	}

	public void setBdayTax9Rate(Float bdayTax9Rate) {
		this.bdayTax9Rate = bdayTax9Rate;
	}

	public Float getBdayTax10Rate() {
		return bdayTax10Rate;
	}

	public void setBdayTax10Rate(Float bdayTax10Rate) {
		this.bdayTax10Rate = bdayTax10Rate;
	}

	public Float getBdayTax11Rate() {
		return bdayTax11Rate;
	}

	public void setBdayTax11Rate(Float bdayTax11Rate) {
		this.bdayTax11Rate = bdayTax11Rate;
	}

	public Float getBdayTax12Rate() {
		return bdayTax12Rate;
	}

	public void setBdayTax12Rate(Float bdayTax12Rate) {
		this.bdayTax12Rate = bdayTax12Rate;
	}

	public Float getBdayTax13Rate() {
		return bdayTax13Rate;
	}

	public void setBdayTax13Rate(Float bdayTax13Rate) {
		this.bdayTax13Rate = bdayTax13Rate;
	}

	public Float getBdayTax14Rate() {
		return bdayTax14Rate;
	}

	public void setBdayTax14Rate(Float bdayTax14Rate) {
		this.bdayTax14Rate = bdayTax14Rate;
	}

	public Float getBdayTax15Rate() {
		return bdayTax15Rate;
	}

	public void setBdayTax15Rate(Float bdayTax15Rate) {
		this.bdayTax15Rate = bdayTax15Rate;
	}

	public Float getBdayTax16Rate() {
		return bdayTax16Rate;
	}

	public void setBdayTax16Rate(Float bdayTax16Rate) {
		this.bdayTax16Rate = bdayTax16Rate;
	}

	public Float getBdayTax17Rate() {
		return bdayTax17Rate;
	}

	public void setBdayTax17Rate(Float bdayTax17Rate) {
		this.bdayTax17Rate = bdayTax17Rate;
	}

	public Float getBdayTax18Rate() {
		return bdayTax18Rate;
	}

	public void setBdayTax18Rate(Float bdayTax18Rate) {
		this.bdayTax18Rate = bdayTax18Rate;
	}

	public Float getBdayTax19Rate() {
		return bdayTax19Rate;
	}

	public void setBdayTax19Rate(Float bdayTax19Rate) {
		this.bdayTax19Rate = bdayTax19Rate;
	}

	public Float getBdayTax20Rate() {
		return bdayTax20Rate;
	}

	public void setBdayTax20Rate(Float bdayTax20Rate) {
		this.bdayTax20Rate = bdayTax20Rate;
	}

	public Float getBdayTax21Rate() {
		return bdayTax21Rate;
	}

	public void setBdayTax21Rate(Float bdayTax21Rate) {
		this.bdayTax21Rate = bdayTax21Rate;
	}

	public Float getBdayTax22Rate() {
		return bdayTax22Rate;
	}

	public void setBdayTax22Rate(Float bdayTax22Rate) {
		this.bdayTax22Rate = bdayTax22Rate;
	}

	public Float getBdayTax23Rate() {
		return bdayTax23Rate;
	}

	public void setBdayTax23Rate(Float bdayTax23Rate) {
		this.bdayTax23Rate = bdayTax23Rate;
	}

	public Float getBdayTax24Rate() {
		return bdayTax24Rate;
	}

	public void setBdayTax24Rate(Float bdayTax24Rate) {
		this.bdayTax24Rate = bdayTax24Rate;
	}

	public Float getBdayTax25Rate() {
		return bdayTax25Rate;
	}

	public void setBdayTax25Rate(Float bdayTax25Rate) {
		this.bdayTax25Rate = bdayTax25Rate;
	}

	public String getBdayItemRound() {
		return bdayItemRound;
	}

	public void setBdayItemRound(String bdayItemRound) {
		this.bdayItemRound = bdayItemRound == null ? null : bdayItemRound.trim();
	}

	public String getBdayScRound() {
		return bdayScRound;
	}

	public void setBdayScRound(String bdayScRound) {
		this.bdayScRound = bdayScRound == null ? null : bdayScRound.trim();
	}

	public String getBdayTaxRound() {
		return bdayTaxRound;
	}

	public void setBdayTaxRound(String bdayTaxRound) {
		this.bdayTaxRound = bdayTaxRound == null ? null : bdayTaxRound.trim();
	}

	public String getBdayDiscRound() {
		return bdayDiscRound;
	}

	public void setBdayDiscRound(String bdayDiscRound) {
		this.bdayDiscRound = bdayDiscRound == null ? null : bdayDiscRound.trim();
	}

	public String getBdayCheckRound() {
		return bdayCheckRound;
	}

	public void setBdayCheckRound(String bdayCheckRound) {
		this.bdayCheckRound = bdayCheckRound == null ? null : bdayCheckRound.trim();
	}

	public String getBdayPayRound() {
		return bdayPayRound;
	}

	public void setBdayPayRound(String bdayPayRound) {
		this.bdayPayRound = bdayPayRound == null ? null : bdayPayRound.trim();
	}

	public String getBdayGratuityRound() {
		return bdayGratuityRound;
	}

	public void setBdayGratuityRound(String bdayGratuityRound) {
		this.bdayGratuityRound = bdayGratuityRound == null ? null : bdayGratuityRound.trim();
	}

	public Integer getBdayItemDecimal() {
		return bdayItemDecimal;
	}

	public void setBdayItemDecimal(Integer bdayItemDecimal) {
		this.bdayItemDecimal = bdayItemDecimal;
	}

	public Integer getBdayScDecimal() {
		return bdayScDecimal;
	}

	public void setBdayScDecimal(Integer bdayScDecimal) {
		this.bdayScDecimal = bdayScDecimal;
	}

	public Integer getBdayTaxDecimal() {
		return bdayTaxDecimal;
	}

	public void setBdayTaxDecimal(Integer bdayTaxDecimal) {
		this.bdayTaxDecimal = bdayTaxDecimal;
	}

	public Integer getBdayDiscDecimal() {
		return bdayDiscDecimal;
	}

	public void setBdayDiscDecimal(Integer bdayDiscDecimal) {
		this.bdayDiscDecimal = bdayDiscDecimal;
	}

	public Integer getBdayCheckDecimal() {
		return bdayCheckDecimal;
	}

	public void setBdayCheckDecimal(Integer bdayCheckDecimal) {
		this.bdayCheckDecimal = bdayCheckDecimal;
	}

	public Integer getBdayPayDecimal() {
		return bdayPayDecimal;
	}

	public void setBdayPayDecimal(Integer bdayPayDecimal) {
		this.bdayPayDecimal = bdayPayDecimal;
	}

	public Integer getBdayGratuityDecimal() {
		return bdayGratuityDecimal;
	}

	public void setBdayGratuityDecimal(Integer bdayGratuityDecimal) {
		this.bdayGratuityDecimal = bdayGratuityDecimal;
	}

	public String getBdayTaxScIncludeTaxScMask1() {
		return bdayTaxScIncludeTaxScMask1;
	}

	public void setBdayTaxScIncludeTaxScMask1(String bdayTaxScIncludeTaxScMask1) {
		this.bdayTaxScIncludeTaxScMask1 = bdayTaxScIncludeTaxScMask1 == null ? null : bdayTaxScIncludeTaxScMask1.trim();
	}

	public String getBdayTaxScIncludeTaxScMask2() {
		return bdayTaxScIncludeTaxScMask2;
	}

	public void setBdayTaxScIncludeTaxScMask2(String bdayTaxScIncludeTaxScMask2) {
		this.bdayTaxScIncludeTaxScMask2 = bdayTaxScIncludeTaxScMask2 == null ? null : bdayTaxScIncludeTaxScMask2.trim();
	}

	public String getBdayTaxScIncludeTaxScMask3() {
		return bdayTaxScIncludeTaxScMask3;
	}

	public void setBdayTaxScIncludeTaxScMask3(String bdayTaxScIncludeTaxScMask3) {
		this.bdayTaxScIncludeTaxScMask3 = bdayTaxScIncludeTaxScMask3 == null ? null : bdayTaxScIncludeTaxScMask3.trim();
	}

	public String getBdayTaxScIncludeTaxScMask4() {
		return bdayTaxScIncludeTaxScMask4;
	}

	public void setBdayTaxScIncludeTaxScMask4(String bdayTaxScIncludeTaxScMask4) {
		this.bdayTaxScIncludeTaxScMask4 = bdayTaxScIncludeTaxScMask4 == null ? null : bdayTaxScIncludeTaxScMask4.trim();
	}

	public String getBdayTaxScIncludeTaxScMask5() {
		return bdayTaxScIncludeTaxScMask5;
	}

	public void setBdayTaxScIncludeTaxScMask5(String bdayTaxScIncludeTaxScMask5) {
		this.bdayTaxScIncludeTaxScMask5 = bdayTaxScIncludeTaxScMask5 == null ? null : bdayTaxScIncludeTaxScMask5.trim();
	}

	public String getBdayTaxScIncludeTaxScMask6() {
		return bdayTaxScIncludeTaxScMask6;
	}

	public void setBdayTaxScIncludeTaxScMask6(String bdayTaxScIncludeTaxScMask6) {
		this.bdayTaxScIncludeTaxScMask6 = bdayTaxScIncludeTaxScMask6 == null ? null : bdayTaxScIncludeTaxScMask6.trim();
	}

	public String getBdayTaxScIncludeTaxScMask7() {
		return bdayTaxScIncludeTaxScMask7;
	}

	public void setBdayTaxScIncludeTaxScMask7(String bdayTaxScIncludeTaxScMask7) {
		this.bdayTaxScIncludeTaxScMask7 = bdayTaxScIncludeTaxScMask7 == null ? null : bdayTaxScIncludeTaxScMask7.trim();
	}

	public String getBdayTaxScIncludeTaxScMask8() {
		return bdayTaxScIncludeTaxScMask8;
	}

	public void setBdayTaxScIncludeTaxScMask8(String bdayTaxScIncludeTaxScMask8) {
		this.bdayTaxScIncludeTaxScMask8 = bdayTaxScIncludeTaxScMask8 == null ? null : bdayTaxScIncludeTaxScMask8.trim();
	}

	public String getBdayTaxScIncludeTaxScMask9() {
		return bdayTaxScIncludeTaxScMask9;
	}

	public void setBdayTaxScIncludeTaxScMask9(String bdayTaxScIncludeTaxScMask9) {
		this.bdayTaxScIncludeTaxScMask9 = bdayTaxScIncludeTaxScMask9 == null ? null : bdayTaxScIncludeTaxScMask9.trim();
	}

	public String getBdayTaxScIncludeTaxScMask10() {
		return bdayTaxScIncludeTaxScMask10;
	}

	public void setBdayTaxScIncludeTaxScMask10(String bdayTaxScIncludeTaxScMask10) {
		this.bdayTaxScIncludeTaxScMask10 = bdayTaxScIncludeTaxScMask10 == null ? null : bdayTaxScIncludeTaxScMask10.trim();
	}

	public String getBdayTaxScIncludeTaxScMask11() {
		return bdayTaxScIncludeTaxScMask11;
	}

	public void setBdayTaxScIncludeTaxScMask11(String bdayTaxScIncludeTaxScMask11) {
		this.bdayTaxScIncludeTaxScMask11 = bdayTaxScIncludeTaxScMask11 == null ? null : bdayTaxScIncludeTaxScMask11.trim();
	}

	public String getBdayTaxScIncludeTaxScMask12() {
		return bdayTaxScIncludeTaxScMask12;
	}

	public void setBdayTaxScIncludeTaxScMask12(String bdayTaxScIncludeTaxScMask12) {
		this.bdayTaxScIncludeTaxScMask12 = bdayTaxScIncludeTaxScMask12 == null ? null : bdayTaxScIncludeTaxScMask12.trim();
	}

	public String getBdayTaxScIncludeTaxScMask13() {
		return bdayTaxScIncludeTaxScMask13;
	}

	public void setBdayTaxScIncludeTaxScMask13(String bdayTaxScIncludeTaxScMask13) {
		this.bdayTaxScIncludeTaxScMask13 = bdayTaxScIncludeTaxScMask13 == null ? null : bdayTaxScIncludeTaxScMask13.trim();
	}

	public String getBdayTaxScIncludeTaxScMask14() {
		return bdayTaxScIncludeTaxScMask14;
	}

	public void setBdayTaxScIncludeTaxScMask14(String bdayTaxScIncludeTaxScMask14) {
		this.bdayTaxScIncludeTaxScMask14 = bdayTaxScIncludeTaxScMask14 == null ? null : bdayTaxScIncludeTaxScMask14.trim();
	}

	public String getBdayTaxScIncludeTaxScMask15() {
		return bdayTaxScIncludeTaxScMask15;
	}

	public void setBdayTaxScIncludeTaxScMask15(String bdayTaxScIncludeTaxScMask15) {
		this.bdayTaxScIncludeTaxScMask15 = bdayTaxScIncludeTaxScMask15 == null ? null : bdayTaxScIncludeTaxScMask15.trim();
	}

	public String getBdayTaxScIncludeTaxScMask16() {
		return bdayTaxScIncludeTaxScMask16;
	}

	public void setBdayTaxScIncludeTaxScMask16(String bdayTaxScIncludeTaxScMask16) {
		this.bdayTaxScIncludeTaxScMask16 = bdayTaxScIncludeTaxScMask16 == null ? null : bdayTaxScIncludeTaxScMask16.trim();
	}

	public String getBdayTaxScIncludeTaxScMask17() {
		return bdayTaxScIncludeTaxScMask17;
	}

	public void setBdayTaxScIncludeTaxScMask17(String bdayTaxScIncludeTaxScMask17) {
		this.bdayTaxScIncludeTaxScMask17 = bdayTaxScIncludeTaxScMask17 == null ? null : bdayTaxScIncludeTaxScMask17.trim();
	}

	public String getBdayTaxScIncludeTaxScMask18() {
		return bdayTaxScIncludeTaxScMask18;
	}

	public void setBdayTaxScIncludeTaxScMask18(String bdayTaxScIncludeTaxScMask18) {
		this.bdayTaxScIncludeTaxScMask18 = bdayTaxScIncludeTaxScMask18 == null ? null : bdayTaxScIncludeTaxScMask18.trim();
	}

	public String getBdayTaxScIncludeTaxScMask19() {
		return bdayTaxScIncludeTaxScMask19;
	}

	public void setBdayTaxScIncludeTaxScMask19(String bdayTaxScIncludeTaxScMask19) {
		this.bdayTaxScIncludeTaxScMask19 = bdayTaxScIncludeTaxScMask19 == null ? null : bdayTaxScIncludeTaxScMask19.trim();
	}

	public String getBdayTaxScIncludeTaxScMask20() {
		return bdayTaxScIncludeTaxScMask20;
	}

	public void setBdayTaxScIncludeTaxScMask20(String bdayTaxScIncludeTaxScMask20) {
		this.bdayTaxScIncludeTaxScMask20 = bdayTaxScIncludeTaxScMask20 == null ? null : bdayTaxScIncludeTaxScMask20.trim();
	}

	public String getBdayTaxScIncludeTaxScMask21() {
		return bdayTaxScIncludeTaxScMask21;
	}

	public void setBdayTaxScIncludeTaxScMask21(String bdayTaxScIncludeTaxScMask21) {
		this.bdayTaxScIncludeTaxScMask21 = bdayTaxScIncludeTaxScMask21 == null ? null : bdayTaxScIncludeTaxScMask21.trim();
	}

	public String getBdayTaxScIncludeTaxScMask22() {
		return bdayTaxScIncludeTaxScMask22;
	}

	public void setBdayTaxScIncludeTaxScMask22(String bdayTaxScIncludeTaxScMask22) {
		this.bdayTaxScIncludeTaxScMask22 = bdayTaxScIncludeTaxScMask22 == null ? null : bdayTaxScIncludeTaxScMask22.trim();
	}

	public String getBdayTaxScIncludeTaxScMask23() {
		return bdayTaxScIncludeTaxScMask23;
	}

	public void setBdayTaxScIncludeTaxScMask23(String bdayTaxScIncludeTaxScMask23) {
		this.bdayTaxScIncludeTaxScMask23 = bdayTaxScIncludeTaxScMask23 == null ? null : bdayTaxScIncludeTaxScMask23.trim();
	}

	public String getBdayTaxScIncludeTaxScMask24() {
		return bdayTaxScIncludeTaxScMask24;
	}

	public void setBdayTaxScIncludeTaxScMask24(String bdayTaxScIncludeTaxScMask24) {
		this.bdayTaxScIncludeTaxScMask24 = bdayTaxScIncludeTaxScMask24 == null ? null : bdayTaxScIncludeTaxScMask24.trim();
	}

	public String getBdayTaxScIncludeTaxScMask25() {
		return bdayTaxScIncludeTaxScMask25;
	}

	public void setBdayTaxScIncludeTaxScMask25(String bdayTaxScIncludeTaxScMask25) {
		this.bdayTaxScIncludeTaxScMask25 = bdayTaxScIncludeTaxScMask25 == null ? null : bdayTaxScIncludeTaxScMask25.trim();
	}

	public String getBdayTaxScIncludeTaxScMask26() {
		return bdayTaxScIncludeTaxScMask26;
	}

	public void setBdayTaxScIncludeTaxScMask26(String bdayTaxScIncludeTaxScMask26) {
		this.bdayTaxScIncludeTaxScMask26 = bdayTaxScIncludeTaxScMask26 == null ? null : bdayTaxScIncludeTaxScMask26.trim();
	}

	public String getBdayTaxScIncludeTaxScMask27() {
		return bdayTaxScIncludeTaxScMask27;
	}

	public void setBdayTaxScIncludeTaxScMask27(String bdayTaxScIncludeTaxScMask27) {
		this.bdayTaxScIncludeTaxScMask27 = bdayTaxScIncludeTaxScMask27 == null ? null : bdayTaxScIncludeTaxScMask27.trim();
	}

	public String getBdayTaxScIncludeTaxScMask28() {
		return bdayTaxScIncludeTaxScMask28;
	}

	public void setBdayTaxScIncludeTaxScMask28(String bdayTaxScIncludeTaxScMask28) {
		this.bdayTaxScIncludeTaxScMask28 = bdayTaxScIncludeTaxScMask28 == null ? null : bdayTaxScIncludeTaxScMask28.trim();
	}

	public String getBdayTaxScIncludeTaxScMask29() {
		return bdayTaxScIncludeTaxScMask29;
	}

	public void setBdayTaxScIncludeTaxScMask29(String bdayTaxScIncludeTaxScMask29) {
		this.bdayTaxScIncludeTaxScMask29 = bdayTaxScIncludeTaxScMask29 == null ? null : bdayTaxScIncludeTaxScMask29.trim();
	}

	public String getBdayTaxScIncludeTaxScMask30() {
		return bdayTaxScIncludeTaxScMask30;
	}

	public void setBdayTaxScIncludeTaxScMask30(String bdayTaxScIncludeTaxScMask30) {
		this.bdayTaxScIncludeTaxScMask30 = bdayTaxScIncludeTaxScMask30 == null ? null : bdayTaxScIncludeTaxScMask30.trim();
	}

	public String getBdayTaxScIncludePreDisc() {
		return bdayTaxScIncludePreDisc;
	}

	public void setBdayTaxScIncludePreDisc(String bdayTaxScIncludePreDisc) {
		this.bdayTaxScIncludePreDisc = bdayTaxScIncludePreDisc == null ? null : bdayTaxScIncludePreDisc.trim();
	}

	public String getBdayTaxIncludeMidDisc() {
		return bdayTaxIncludeMidDisc;
	}

	public void setBdayTaxIncludeMidDisc(String bdayTaxIncludeMidDisc) {
		this.bdayTaxIncludeMidDisc = bdayTaxIncludeMidDisc == null ? null : bdayTaxIncludeMidDisc.trim();
	}

	public String getBdayGenerateCheckNumBy() {
		return bdayGenerateCheckNumBy;
	}

	public void setBdayGenerateCheckNumBy(String bdayGenerateCheckNumBy) {
		this.bdayGenerateCheckNumBy = bdayGenerateCheckNumBy == null ? null : bdayGenerateCheckNumBy.trim();
	}

	public String getBdayCheckPrefix() {
		return bdayCheckPrefix;
	}

	public void setBdayCheckPrefix(String bdayCheckPrefix) {
		this.bdayCheckPrefix = bdayCheckPrefix == null ? null : bdayCheckPrefix.trim();
	}

	public Integer getBdayStartCheckNum() {
		return bdayStartCheckNum;
	}

	public void setBdayStartCheckNum(Integer bdayStartCheckNum) {
		this.bdayStartCheckNum = bdayStartCheckNum;
	}

	public Integer getBdayEndCheckNum() {
		return bdayEndCheckNum;
	}

	public void setBdayEndCheckNum(Integer bdayEndCheckNum) {
		this.bdayEndCheckNum = bdayEndCheckNum;
	}

	public Integer getBdayNextCheckNum() {
		return bdayNextCheckNum;
	}

	public void setBdayNextCheckNum(Integer bdayNextCheckNum) {
		this.bdayNextCheckNum = bdayNextCheckNum;
	}

	public String getBdayResetCheckNum() {
		return bdayResetCheckNum;
	}

	public void setBdayResetCheckNum(String bdayResetCheckNum) {
		this.bdayResetCheckNum = bdayResetCheckNum == null ? null : bdayResetCheckNum.trim();
	}

	public Integer getBdayResetCheckNumMonth() {
		return bdayResetCheckNumMonth;
	}

	public void setBdayResetCheckNumMonth(Integer bdayResetCheckNumMonth) {
		this.bdayResetCheckNumMonth = bdayResetCheckNumMonth;
	}

	public Integer getBdayResetCheckNumDay() {
		return bdayResetCheckNumDay;
	}

	public void setBdayResetCheckNumDay(Integer bdayResetCheckNumDay) {
		this.bdayResetCheckNumDay = bdayResetCheckNumDay;
	}

	public Integer getBdaySphrId() {
		return bdaySphrId;
	}

	public void setBdaySphrId(Integer bdaySphrId) {
		this.bdaySphrId = bdaySphrId;
	}

	public String getBdayBaseCurrencyCode() {
		return bdayBaseCurrencyCode;
	}

	public void setBdayBaseCurrencyCode(String bdayBaseCurrencyCode) {
		this.bdayBaseCurrencyCode = bdayBaseCurrencyCode == null ? null : bdayBaseCurrencyCode.trim();
	}

	public BigDecimal getBdayBaseCurrencyRate() {
		return bdayBaseCurrencyRate;
	}

	public void setBdayBaseCurrencyRate(BigDecimal bdayBaseCurrencyRate) {
		this.bdayBaseCurrencyRate = bdayBaseCurrencyRate;
	}

	public String getBdayCustomData1() {
		return bdayCustomData1;
	}

	public void setBdayCustomData1(String bdayCustomData1) {
		this.bdayCustomData1 = bdayCustomData1 == null ? null : bdayCustomData1.trim();
	}

	public String getBdayStatus() {
		return bdayStatus;
	}

	public void setBdayStatus(String bdayStatus) {
		this.bdayStatus = bdayStatus == null ? null : bdayStatus.trim();
	}

	public Integer getBdaySlaveId() {
		return bdaySlaveId;
	}

	public void setBdaySlaveId(Integer bdaySlaveId) {
		this.bdaySlaveId = bdaySlaveId;
	}

	public Date getBdaySlaveCreated() {
		return bdaySlaveCreated;
	}

	public void setBdaySlaveCreated(Date bdaySlaveCreated) {
		this.bdaySlaveCreated = bdaySlaveCreated;
	}

	public Date getBdaySlaveModified() {
		return bdaySlaveModified;
	}

	public void setBdaySlaveModified(Date bdaySlaveModified) {
		this.bdaySlaveModified = bdaySlaveModified;
	}

	public Integer getBdaySyncId() {
		return bdaySyncId;
	}

	public void setBdaySyncId(Integer bdaySyncId) {
		this.bdaySyncId = bdaySyncId;
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

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", bdayId=").append(bdayId);
		sb.append(", bdayShopId=").append(bdayShopId);
		sb.append(", bdayOletId=").append(bdayOletId);
		sb.append(", bdayDate=").append(bdayDate);
		sb.append(", bdayWeek=").append(bdayWeek);
		sb.append(", bdayDayOfWeek=").append(bdayDayOfWeek);
		sb.append(", bdayHolidayCaldId=").append(bdayHolidayCaldId);
		sb.append(", bdayDayBeforeHolidayCaldId=").append(bdayDayBeforeHolidayCaldId);
		sb.append(", bdaySpecialDayCaldId=").append(bdaySpecialDayCaldId);
		sb.append(", bdayDayBeforeSpecialDayCaldId=").append(bdayDayBeforeSpecialDayCaldId);
		sb.append(", bdayStartTime=").append(bdayStartTime);
		sb.append(", bdayStartLoctime=").append(bdayStartLoctime);
		sb.append(", bdayEndTime=").append(bdayEndTime);
		sb.append(", bdayEndLoctime=").append(bdayEndLoctime);
		sb.append(", bdayLastRecallTime=").append(bdayLastRecallTime);
		sb.append(", bdayLastRecallLoctime=").append(bdayLastRecallLoctime);
		sb.append(", bdayStartUserId=").append(bdayStartUserId);
		sb.append(", bdayEndUserId=").append(bdayEndUserId);
		sb.append(", bdayRecallUserId=").append(bdayRecallUserId);
		sb.append(", bdayRecallCount=").append(bdayRecallCount);
		sb.append(", bdayPriceLevel=").append(bdayPriceLevel);
		sb.append(", bdaySc1Rate=").append(bdaySc1Rate);
		sb.append(", bdaySc2Rate=").append(bdaySc2Rate);
		sb.append(", bdaySc3Rate=").append(bdaySc3Rate);
		sb.append(", bdaySc4Rate=").append(bdaySc4Rate);
		sb.append(", bdaySc5Rate=").append(bdaySc5Rate);
		sb.append(", bdayTax1Rate=").append(bdayTax1Rate);
		sb.append(", bdayTax2Rate=").append(bdayTax2Rate);
		sb.append(", bdayTax3Rate=").append(bdayTax3Rate);
		sb.append(", bdayTax4Rate=").append(bdayTax4Rate);
		sb.append(", bdayTax5Rate=").append(bdayTax5Rate);
		sb.append(", bdayTax6Rate=").append(bdayTax6Rate);
		sb.append(", bdayTax7Rate=").append(bdayTax7Rate);
		sb.append(", bdayTax8Rate=").append(bdayTax8Rate);
		sb.append(", bdayTax9Rate=").append(bdayTax9Rate);
		sb.append(", bdayTax10Rate=").append(bdayTax10Rate);
		sb.append(", bdayTax11Rate=").append(bdayTax11Rate);
		sb.append(", bdayTax12Rate=").append(bdayTax12Rate);
		sb.append(", bdayTax13Rate=").append(bdayTax13Rate);
		sb.append(", bdayTax14Rate=").append(bdayTax14Rate);
		sb.append(", bdayTax15Rate=").append(bdayTax15Rate);
		sb.append(", bdayTax16Rate=").append(bdayTax16Rate);
		sb.append(", bdayTax17Rate=").append(bdayTax17Rate);
		sb.append(", bdayTax18Rate=").append(bdayTax18Rate);
		sb.append(", bdayTax19Rate=").append(bdayTax19Rate);
		sb.append(", bdayTax20Rate=").append(bdayTax20Rate);
		sb.append(", bdayTax21Rate=").append(bdayTax21Rate);
		sb.append(", bdayTax22Rate=").append(bdayTax22Rate);
		sb.append(", bdayTax23Rate=").append(bdayTax23Rate);
		sb.append(", bdayTax24Rate=").append(bdayTax24Rate);
		sb.append(", bdayTax25Rate=").append(bdayTax25Rate);
		sb.append(", bdayItemRound=").append(bdayItemRound);
		sb.append(", bdayScRound=").append(bdayScRound);
		sb.append(", bdayTaxRound=").append(bdayTaxRound);
		sb.append(", bdayDiscRound=").append(bdayDiscRound);
		sb.append(", bdayCheckRound=").append(bdayCheckRound);
		sb.append(", bdayPayRound=").append(bdayPayRound);
		sb.append(", bdayGratuityRound=").append(bdayGratuityRound);
		sb.append(", bdayItemDecimal=").append(bdayItemDecimal);
		sb.append(", bdayScDecimal=").append(bdayScDecimal);
		sb.append(", bdayTaxDecimal=").append(bdayTaxDecimal);
		sb.append(", bdayDiscDecimal=").append(bdayDiscDecimal);
		sb.append(", bdayCheckDecimal=").append(bdayCheckDecimal);
		sb.append(", bdayPayDecimal=").append(bdayPayDecimal);
		sb.append(", bdayGratuityDecimal=").append(bdayGratuityDecimal);
		sb.append(", bdayTaxScIncludeTaxScMask1=").append(bdayTaxScIncludeTaxScMask1);
		sb.append(", bdayTaxScIncludeTaxScMask2=").append(bdayTaxScIncludeTaxScMask2);
		sb.append(", bdayTaxScIncludeTaxScMask3=").append(bdayTaxScIncludeTaxScMask3);
		sb.append(", bdayTaxScIncludeTaxScMask4=").append(bdayTaxScIncludeTaxScMask4);
		sb.append(", bdayTaxScIncludeTaxScMask5=").append(bdayTaxScIncludeTaxScMask5);
		sb.append(", bdayTaxScIncludeTaxScMask6=").append(bdayTaxScIncludeTaxScMask6);
		sb.append(", bdayTaxScIncludeTaxScMask7=").append(bdayTaxScIncludeTaxScMask7);
		sb.append(", bdayTaxScIncludeTaxScMask8=").append(bdayTaxScIncludeTaxScMask8);
		sb.append(", bdayTaxScIncludeTaxScMask9=").append(bdayTaxScIncludeTaxScMask9);
		sb.append(", bdayTaxScIncludeTaxScMask10=").append(bdayTaxScIncludeTaxScMask10);
		sb.append(", bdayTaxScIncludeTaxScMask11=").append(bdayTaxScIncludeTaxScMask11);
		sb.append(", bdayTaxScIncludeTaxScMask12=").append(bdayTaxScIncludeTaxScMask12);
		sb.append(", bdayTaxScIncludeTaxScMask13=").append(bdayTaxScIncludeTaxScMask13);
		sb.append(", bdayTaxScIncludeTaxScMask14=").append(bdayTaxScIncludeTaxScMask14);
		sb.append(", bdayTaxScIncludeTaxScMask15=").append(bdayTaxScIncludeTaxScMask15);
		sb.append(", bdayTaxScIncludeTaxScMask16=").append(bdayTaxScIncludeTaxScMask16);
		sb.append(", bdayTaxScIncludeTaxScMask17=").append(bdayTaxScIncludeTaxScMask17);
		sb.append(", bdayTaxScIncludeTaxScMask18=").append(bdayTaxScIncludeTaxScMask18);
		sb.append(", bdayTaxScIncludeTaxScMask19=").append(bdayTaxScIncludeTaxScMask19);
		sb.append(", bdayTaxScIncludeTaxScMask20=").append(bdayTaxScIncludeTaxScMask20);
		sb.append(", bdayTaxScIncludeTaxScMask21=").append(bdayTaxScIncludeTaxScMask21);
		sb.append(", bdayTaxScIncludeTaxScMask22=").append(bdayTaxScIncludeTaxScMask22);
		sb.append(", bdayTaxScIncludeTaxScMask23=").append(bdayTaxScIncludeTaxScMask23);
		sb.append(", bdayTaxScIncludeTaxScMask24=").append(bdayTaxScIncludeTaxScMask24);
		sb.append(", bdayTaxScIncludeTaxScMask25=").append(bdayTaxScIncludeTaxScMask25);
		sb.append(", bdayTaxScIncludeTaxScMask26=").append(bdayTaxScIncludeTaxScMask26);
		sb.append(", bdayTaxScIncludeTaxScMask27=").append(bdayTaxScIncludeTaxScMask27);
		sb.append(", bdayTaxScIncludeTaxScMask28=").append(bdayTaxScIncludeTaxScMask28);
		sb.append(", bdayTaxScIncludeTaxScMask29=").append(bdayTaxScIncludeTaxScMask29);
		sb.append(", bdayTaxScIncludeTaxScMask30=").append(bdayTaxScIncludeTaxScMask30);
		sb.append(", bdayTaxScIncludePreDisc=").append(bdayTaxScIncludePreDisc);
		sb.append(", bdayTaxIncludeMidDisc=").append(bdayTaxIncludeMidDisc);
		sb.append(", bdayGenerateCheckNumBy=").append(bdayGenerateCheckNumBy);
		sb.append(", bdayCheckPrefix=").append(bdayCheckPrefix);
		sb.append(", bdayStartCheckNum=").append(bdayStartCheckNum);
		sb.append(", bdayEndCheckNum=").append(bdayEndCheckNum);
		sb.append(", bdayNextCheckNum=").append(bdayNextCheckNum);
		sb.append(", bdayResetCheckNum=").append(bdayResetCheckNum);
		sb.append(", bdayResetCheckNumMonth=").append(bdayResetCheckNumMonth);
		sb.append(", bdayResetCheckNumDay=").append(bdayResetCheckNumDay);
		sb.append(", bdaySphrId=").append(bdaySphrId);
		sb.append(", bdayBaseCurrencyCode=").append(bdayBaseCurrencyCode);
		sb.append(", bdayBaseCurrencyRate=").append(bdayBaseCurrencyRate);
		sb.append(", bdayCustomData1=").append(bdayCustomData1);
		sb.append(", bdayStatus=").append(bdayStatus);
		sb.append(", bdaySlaveId=").append(bdaySlaveId);
		sb.append(", bdaySlaveCreated=").append(bdaySlaveCreated);
		sb.append(", bdaySlaveModified=").append(bdaySlaveModified);
		sb.append(", bdaySyncId=").append(bdaySyncId);
		sb.append(", created=").append(created);
		sb.append(", modified=").append(modified);
		sb.append(", serialVersionUID=").append(serialVersionUID);
		sb.append("]");
		return sb.toString();
	}
}