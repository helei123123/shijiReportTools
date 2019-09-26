package com.shiji.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class PosCheckItems implements Serializable {
	private String citmId;

	private String citmBdayId;

	private String citmBperId;

	private Integer citmShopId;

	private Integer citmOletId;

	private String citmChksId;

	private String citmCptyId;

	private Integer citmItemId;

	private String citmCode;

	private String citmNameL1;

	private String citmNameL2;

	private String citmNameL3;

	private String citmNameL4;

	private String citmNameL5;

	private String citmShortNameL1;

	private String citmShortNameL2;

	private String citmShortNameL3;

	private String citmShortNameL4;

	private String citmShortNameL5;

	private String citmParentCitmId;

	private String citmRole;

	private Integer citmChildCount;

	private Integer citmModifierCount;

	private Integer citmSeat;

	private String citmMixAndMatchCitmId;

	private Integer citmSeq;

	private BigDecimal citmRoundTotal;

	private Double citmTotal;

	private Double citmRoundAmount;

	private Double citmCarryTotal;

	private Double citmQty;

	private Double citmBaseQty;

	private Double citmPrice;

	private Double citmOriginalPrice;

	private Double citmBasicPrice;

	private String citmBasicCalculateMethod;

	private Double citmSc1;

	private Double citmSc2;

	private Double citmSc3;

	private Double citmSc4;

	private Double citmSc5;

	private Double citmTax1;

	private Double citmTax2;

	private Double citmTax3;

	private Double citmTax4;

	private Double citmTax5;

	private Double citmTax6;

	private Double citmTax7;

	private Double citmTax8;

	private Double citmTax9;

	private Double citmTax10;

	private Double citmTax11;

	private Double citmTax12;

	private Double citmTax13;

	private Double citmTax14;

	private Double citmTax15;

	private Double citmTax16;

	private Double citmTax17;

	private Double citmTax18;

	private Double citmTax19;

	private Double citmTax20;

	private Double citmTax21;

	private Double citmTax22;

	private Double citmTax23;

	private Double citmTax24;

	private Double citmTax25;

	private Double citmInclTaxRef1;

	private Double citmInclTaxRef2;

	private Double citmInclTaxRef3;

	private Double citmInclTaxRef4;

	private Double citmPreDisc;

	private Double citmMidDisc;

	private Double citmPostDisc;

	private Integer citmOriginalPriceLevel;

	private Integer citmPriceLevel;

	private Double citmRevenue;

	private Double citmCarryRevenue;

	private BigDecimal citmUnitCost;

	private Integer citmPrintQueue1ItpqId;

	private Integer citmPrintQueue2ItpqId;

	private Integer citmPrintQueue3ItpqId;

	private Integer citmPrintQueue4ItpqId;

	private Integer citmPrintQueue5ItpqId;

	private Integer citmPrintQueue6ItpqId;

	private Integer citmPrintQueue7ItpqId;

	private Integer citmPrintQueue8ItpqId;

	private Integer citmPrintQueue9ItpqId;

	private Integer citmPrintQueue10ItpqId;

	private String citmNoPrint;

	private String citmChargeSc1;

	private String citmChargeSc2;

	private String citmChargeSc3;

	private String citmChargeSc4;

	private String citmChargeSc5;

	private String citmChargeTax1;

	private String citmChargeTax2;

	private String citmChargeTax3;

	private String citmChargeTax4;

	private String citmChargeTax5;

	private String citmChargeTax6;

	private String citmChargeTax7;

	private String citmChargeTax8;

	private String citmChargeTax9;

	private String citmChargeTax10;

	private String citmChargeTax11;

	private String citmChargeTax12;

	private String citmChargeTax13;

	private String citmChargeTax14;

	private String citmChargeTax15;

	private String citmChargeTax16;

	private String citmChargeTax17;

	private String citmChargeTax18;

	private String citmChargeTax19;

	private String citmChargeTax20;

	private String citmChargeTax21;

	private String citmChargeTax22;

	private String citmChargeTax23;

	private String citmChargeTax24;

	private String citmChargeTax25;

	private String citmHide;

	private Integer citmOriginalOletId;

	private Integer citmIcatId;

	private Integer citmIdepId;

	private Integer citmIcouId;

	private Integer citmDigpId;

	private String citmGetRevenue;

	private String citmServingStatus;

	private String citmPending;

	private String citmOrderingType;

	private String citmRoundStatus;

	private Date citmOrderTime;

	private Date citmOrderLoctime;

	private Integer citmOrderUserId;

	private Integer citmOrderStatId;

	private Date citmRushTime;

	private Date citmRushLoctime;

	private Integer citmRushUserId;

	private Integer citmRushStatId;

	private Integer citmRushCount;

	private Date citmDeliveryTime;

	private Date citmVoidTime;

	private Date citmVoidLoctime;

	private Integer citmVoidUserId;

	private Integer citmVoidStatId;

	private Integer citmVoidVdrsId;

	private String citmVoidConsumed;

	private String citmStatus;

	private Integer citmSlaveId;

	private Date citmSlaveCreated;

	private Date citmSlaveModified;

	private Integer citmSyncId;

	private Date created;

	private Date modified;

	private static final long serialVersionUID = 1L;

	public String getCitmId() {
		return citmId;
	}

	public void setCitmId(String citmId) {
		this.citmId = citmId == null ? null : citmId.trim();
	}

	public String getCitmBdayId() {
		return citmBdayId;
	}

	public void setCitmBdayId(String citmBdayId) {
		this.citmBdayId = citmBdayId == null ? null : citmBdayId.trim();
	}

	public String getCitmBperId() {
		return citmBperId;
	}

	public void setCitmBperId(String citmBperId) {
		this.citmBperId = citmBperId == null ? null : citmBperId.trim();
	}

	public Integer getCitmShopId() {
		return citmShopId;
	}

	public void setCitmShopId(Integer citmShopId) {
		this.citmShopId = citmShopId;
	}

	public Integer getCitmOletId() {
		return citmOletId;
	}

	public void setCitmOletId(Integer citmOletId) {
		this.citmOletId = citmOletId;
	}

	public String getCitmChksId() {
		return citmChksId;
	}

	public void setCitmChksId(String citmChksId) {
		this.citmChksId = citmChksId == null ? null : citmChksId.trim();
	}

	public String getCitmCptyId() {
		return citmCptyId;
	}

	public void setCitmCptyId(String citmCptyId) {
		this.citmCptyId = citmCptyId == null ? null : citmCptyId.trim();
	}

	public Integer getCitmItemId() {
		return citmItemId;
	}

	public void setCitmItemId(Integer citmItemId) {
		this.citmItemId = citmItemId;
	}

	public String getCitmCode() {
		return citmCode;
	}

	public void setCitmCode(String citmCode) {
		this.citmCode = citmCode == null ? null : citmCode.trim();
	}

	public String getCitmNameL1() {
		return citmNameL1;
	}

	public void setCitmNameL1(String citmNameL1) {
		this.citmNameL1 = citmNameL1 == null ? null : citmNameL1.trim();
	}

	public String getCitmNameL2() {
		return citmNameL2;
	}

	public void setCitmNameL2(String citmNameL2) {
		this.citmNameL2 = citmNameL2 == null ? null : citmNameL2.trim();
	}

	public String getCitmNameL3() {
		return citmNameL3;
	}

	public void setCitmNameL3(String citmNameL3) {
		this.citmNameL3 = citmNameL3 == null ? null : citmNameL3.trim();
	}

	public String getCitmNameL4() {
		return citmNameL4;
	}

	public void setCitmNameL4(String citmNameL4) {
		this.citmNameL4 = citmNameL4 == null ? null : citmNameL4.trim();
	}

	public String getCitmNameL5() {
		return citmNameL5;
	}

	public void setCitmNameL5(String citmNameL5) {
		this.citmNameL5 = citmNameL5 == null ? null : citmNameL5.trim();
	}

	public String getCitmShortNameL1() {
		return citmShortNameL1;
	}

	public void setCitmShortNameL1(String citmShortNameL1) {
		this.citmShortNameL1 = citmShortNameL1 == null ? null : citmShortNameL1.trim();
	}

	public String getCitmShortNameL2() {
		return citmShortNameL2;
	}

	public void setCitmShortNameL2(String citmShortNameL2) {
		this.citmShortNameL2 = citmShortNameL2 == null ? null : citmShortNameL2.trim();
	}

	public String getCitmShortNameL3() {
		return citmShortNameL3;
	}

	public void setCitmShortNameL3(String citmShortNameL3) {
		this.citmShortNameL3 = citmShortNameL3 == null ? null : citmShortNameL3.trim();
	}

	public String getCitmShortNameL4() {
		return citmShortNameL4;
	}

	public void setCitmShortNameL4(String citmShortNameL4) {
		this.citmShortNameL4 = citmShortNameL4 == null ? null : citmShortNameL4.trim();
	}

	public String getCitmShortNameL5() {
		return citmShortNameL5;
	}

	public void setCitmShortNameL5(String citmShortNameL5) {
		this.citmShortNameL5 = citmShortNameL5 == null ? null : citmShortNameL5.trim();
	}

	public String getCitmParentCitmId() {
		return citmParentCitmId;
	}

	public void setCitmParentCitmId(String citmParentCitmId) {
		this.citmParentCitmId = citmParentCitmId == null ? null : citmParentCitmId.trim();
	}

	public String getCitmRole() {
		return citmRole;
	}

	public void setCitmRole(String citmRole) {
		this.citmRole = citmRole == null ? null : citmRole.trim();
	}

	public Integer getCitmChildCount() {
		return citmChildCount;
	}

	public void setCitmChildCount(Integer citmChildCount) {
		this.citmChildCount = citmChildCount;
	}

	public Integer getCitmModifierCount() {
		return citmModifierCount;
	}

	public void setCitmModifierCount(Integer citmModifierCount) {
		this.citmModifierCount = citmModifierCount;
	}

	public Integer getCitmSeat() {
		return citmSeat;
	}

	public void setCitmSeat(Integer citmSeat) {
		this.citmSeat = citmSeat;
	}

	public String getCitmMixAndMatchCitmId() {
		return citmMixAndMatchCitmId;
	}

	public void setCitmMixAndMatchCitmId(String citmMixAndMatchCitmId) {
		this.citmMixAndMatchCitmId = citmMixAndMatchCitmId == null ? null : citmMixAndMatchCitmId.trim();
	}

	public Integer getCitmSeq() {
		return citmSeq;
	}

	public void setCitmSeq(Integer citmSeq) {
		this.citmSeq = citmSeq;
	}

	public BigDecimal getCitmRoundTotal() {
		return citmRoundTotal;
	}

	public void setCitmRoundTotal(BigDecimal citmRoundTotal) {
		this.citmRoundTotal = citmRoundTotal;
	}

	public Double getCitmTotal() {
		return citmTotal;
	}

	public void setCitmTotal(Double citmTotal) {
		this.citmTotal = citmTotal;
	}

	public Double getCitmRoundAmount() {
		return citmRoundAmount;
	}

	public void setCitmRoundAmount(Double citmRoundAmount) {
		this.citmRoundAmount = citmRoundAmount;
	}

	public Double getCitmCarryTotal() {
		return citmCarryTotal;
	}

	public void setCitmCarryTotal(Double citmCarryTotal) {
		this.citmCarryTotal = citmCarryTotal;
	}

	public Double getCitmQty() {
		return citmQty;
	}

	public void setCitmQty(Double citmQty) {
		this.citmQty = citmQty;
	}

	public Double getCitmBaseQty() {
		return citmBaseQty;
	}

	public void setCitmBaseQty(Double citmBaseQty) {
		this.citmBaseQty = citmBaseQty;
	}

	public Double getCitmPrice() {
		return citmPrice;
	}

	public void setCitmPrice(Double citmPrice) {
		this.citmPrice = citmPrice;
	}

	public Double getCitmOriginalPrice() {
		return citmOriginalPrice;
	}

	public void setCitmOriginalPrice(Double citmOriginalPrice) {
		this.citmOriginalPrice = citmOriginalPrice;
	}

	public Double getCitmBasicPrice() {
		return citmBasicPrice;
	}

	public void setCitmBasicPrice(Double citmBasicPrice) {
		this.citmBasicPrice = citmBasicPrice;
	}

	public String getCitmBasicCalculateMethod() {
		return citmBasicCalculateMethod;
	}

	public void setCitmBasicCalculateMethod(String citmBasicCalculateMethod) {
		this.citmBasicCalculateMethod = citmBasicCalculateMethod == null ? null : citmBasicCalculateMethod.trim();
	}

	public Double getCitmSc1() {
		return citmSc1;
	}

	public void setCitmSc1(Double citmSc1) {
		this.citmSc1 = citmSc1;
	}

	public Double getCitmSc2() {
		return citmSc2;
	}

	public void setCitmSc2(Double citmSc2) {
		this.citmSc2 = citmSc2;
	}

	public Double getCitmSc3() {
		return citmSc3;
	}

	public void setCitmSc3(Double citmSc3) {
		this.citmSc3 = citmSc3;
	}

	public Double getCitmSc4() {
		return citmSc4;
	}

	public void setCitmSc4(Double citmSc4) {
		this.citmSc4 = citmSc4;
	}

	public Double getCitmSc5() {
		return citmSc5;
	}

	public void setCitmSc5(Double citmSc5) {
		this.citmSc5 = citmSc5;
	}

	public Double getCitmTax1() {
		return citmTax1;
	}

	public void setCitmTax1(Double citmTax1) {
		this.citmTax1 = citmTax1;
	}

	public Double getCitmTax2() {
		return citmTax2;
	}

	public void setCitmTax2(Double citmTax2) {
		this.citmTax2 = citmTax2;
	}

	public Double getCitmTax3() {
		return citmTax3;
	}

	public void setCitmTax3(Double citmTax3) {
		this.citmTax3 = citmTax3;
	}

	public Double getCitmTax4() {
		return citmTax4;
	}

	public void setCitmTax4(Double citmTax4) {
		this.citmTax4 = citmTax4;
	}

	public Double getCitmTax5() {
		return citmTax5;
	}

	public void setCitmTax5(Double citmTax5) {
		this.citmTax5 = citmTax5;
	}

	public Double getCitmTax6() {
		return citmTax6;
	}

	public void setCitmTax6(Double citmTax6) {
		this.citmTax6 = citmTax6;
	}

	public Double getCitmTax7() {
		return citmTax7;
	}

	public void setCitmTax7(Double citmTax7) {
		this.citmTax7 = citmTax7;
	}

	public Double getCitmTax8() {
		return citmTax8;
	}

	public void setCitmTax8(Double citmTax8) {
		this.citmTax8 = citmTax8;
	}

	public Double getCitmTax9() {
		return citmTax9;
	}

	public void setCitmTax9(Double citmTax9) {
		this.citmTax9 = citmTax9;
	}

	public Double getCitmTax10() {
		return citmTax10;
	}

	public void setCitmTax10(Double citmTax10) {
		this.citmTax10 = citmTax10;
	}

	public Double getCitmTax11() {
		return citmTax11;
	}

	public void setCitmTax11(Double citmTax11) {
		this.citmTax11 = citmTax11;
	}

	public Double getCitmTax12() {
		return citmTax12;
	}

	public void setCitmTax12(Double citmTax12) {
		this.citmTax12 = citmTax12;
	}

	public Double getCitmTax13() {
		return citmTax13;
	}

	public void setCitmTax13(Double citmTax13) {
		this.citmTax13 = citmTax13;
	}

	public Double getCitmTax14() {
		return citmTax14;
	}

	public void setCitmTax14(Double citmTax14) {
		this.citmTax14 = citmTax14;
	}

	public Double getCitmTax15() {
		return citmTax15;
	}

	public void setCitmTax15(Double citmTax15) {
		this.citmTax15 = citmTax15;
	}

	public Double getCitmTax16() {
		return citmTax16;
	}

	public void setCitmTax16(Double citmTax16) {
		this.citmTax16 = citmTax16;
	}

	public Double getCitmTax17() {
		return citmTax17;
	}

	public void setCitmTax17(Double citmTax17) {
		this.citmTax17 = citmTax17;
	}

	public Double getCitmTax18() {
		return citmTax18;
	}

	public void setCitmTax18(Double citmTax18) {
		this.citmTax18 = citmTax18;
	}

	public Double getCitmTax19() {
		return citmTax19;
	}

	public void setCitmTax19(Double citmTax19) {
		this.citmTax19 = citmTax19;
	}

	public Double getCitmTax20() {
		return citmTax20;
	}

	public void setCitmTax20(Double citmTax20) {
		this.citmTax20 = citmTax20;
	}

	public Double getCitmTax21() {
		return citmTax21;
	}

	public void setCitmTax21(Double citmTax21) {
		this.citmTax21 = citmTax21;
	}

	public Double getCitmTax22() {
		return citmTax22;
	}

	public void setCitmTax22(Double citmTax22) {
		this.citmTax22 = citmTax22;
	}

	public Double getCitmTax23() {
		return citmTax23;
	}

	public void setCitmTax23(Double citmTax23) {
		this.citmTax23 = citmTax23;
	}

	public Double getCitmTax24() {
		return citmTax24;
	}

	public void setCitmTax24(Double citmTax24) {
		this.citmTax24 = citmTax24;
	}

	public Double getCitmTax25() {
		return citmTax25;
	}

	public void setCitmTax25(Double citmTax25) {
		this.citmTax25 = citmTax25;
	}

	public Double getCitmInclTaxRef1() {
		return citmInclTaxRef1;
	}

	public void setCitmInclTaxRef1(Double citmInclTaxRef1) {
		this.citmInclTaxRef1 = citmInclTaxRef1;
	}

	public Double getCitmInclTaxRef2() {
		return citmInclTaxRef2;
	}

	public void setCitmInclTaxRef2(Double citmInclTaxRef2) {
		this.citmInclTaxRef2 = citmInclTaxRef2;
	}

	public Double getCitmInclTaxRef3() {
		return citmInclTaxRef3;
	}

	public void setCitmInclTaxRef3(Double citmInclTaxRef3) {
		this.citmInclTaxRef3 = citmInclTaxRef3;
	}

	public Double getCitmInclTaxRef4() {
		return citmInclTaxRef4;
	}

	public void setCitmInclTaxRef4(Double citmInclTaxRef4) {
		this.citmInclTaxRef4 = citmInclTaxRef4;
	}

	public Double getCitmPreDisc() {
		return citmPreDisc;
	}

	public void setCitmPreDisc(Double citmPreDisc) {
		this.citmPreDisc = citmPreDisc;
	}

	public Double getCitmMidDisc() {
		return citmMidDisc;
	}

	public void setCitmMidDisc(Double citmMidDisc) {
		this.citmMidDisc = citmMidDisc;
	}

	public Double getCitmPostDisc() {
		return citmPostDisc;
	}

	public void setCitmPostDisc(Double citmPostDisc) {
		this.citmPostDisc = citmPostDisc;
	}

	public Integer getCitmOriginalPriceLevel() {
		return citmOriginalPriceLevel;
	}

	public void setCitmOriginalPriceLevel(Integer citmOriginalPriceLevel) {
		this.citmOriginalPriceLevel = citmOriginalPriceLevel;
	}

	public Integer getCitmPriceLevel() {
		return citmPriceLevel;
	}

	public void setCitmPriceLevel(Integer citmPriceLevel) {
		this.citmPriceLevel = citmPriceLevel;
	}

	public Double getCitmRevenue() {
		return citmRevenue;
	}

	public void setCitmRevenue(Double citmRevenue) {
		this.citmRevenue = citmRevenue;
	}

	public Double getCitmCarryRevenue() {
		return citmCarryRevenue;
	}

	public void setCitmCarryRevenue(Double citmCarryRevenue) {
		this.citmCarryRevenue = citmCarryRevenue;
	}

	public BigDecimal getCitmUnitCost() {
		return citmUnitCost;
	}

	public void setCitmUnitCost(BigDecimal citmUnitCost) {
		this.citmUnitCost = citmUnitCost;
	}

	public Integer getCitmPrintQueue1ItpqId() {
		return citmPrintQueue1ItpqId;
	}

	public void setCitmPrintQueue1ItpqId(Integer citmPrintQueue1ItpqId) {
		this.citmPrintQueue1ItpqId = citmPrintQueue1ItpqId;
	}

	public Integer getCitmPrintQueue2ItpqId() {
		return citmPrintQueue2ItpqId;
	}

	public void setCitmPrintQueue2ItpqId(Integer citmPrintQueue2ItpqId) {
		this.citmPrintQueue2ItpqId = citmPrintQueue2ItpqId;
	}

	public Integer getCitmPrintQueue3ItpqId() {
		return citmPrintQueue3ItpqId;
	}

	public void setCitmPrintQueue3ItpqId(Integer citmPrintQueue3ItpqId) {
		this.citmPrintQueue3ItpqId = citmPrintQueue3ItpqId;
	}

	public Integer getCitmPrintQueue4ItpqId() {
		return citmPrintQueue4ItpqId;
	}

	public void setCitmPrintQueue4ItpqId(Integer citmPrintQueue4ItpqId) {
		this.citmPrintQueue4ItpqId = citmPrintQueue4ItpqId;
	}

	public Integer getCitmPrintQueue5ItpqId() {
		return citmPrintQueue5ItpqId;
	}

	public void setCitmPrintQueue5ItpqId(Integer citmPrintQueue5ItpqId) {
		this.citmPrintQueue5ItpqId = citmPrintQueue5ItpqId;
	}

	public Integer getCitmPrintQueue6ItpqId() {
		return citmPrintQueue6ItpqId;
	}

	public void setCitmPrintQueue6ItpqId(Integer citmPrintQueue6ItpqId) {
		this.citmPrintQueue6ItpqId = citmPrintQueue6ItpqId;
	}

	public Integer getCitmPrintQueue7ItpqId() {
		return citmPrintQueue7ItpqId;
	}

	public void setCitmPrintQueue7ItpqId(Integer citmPrintQueue7ItpqId) {
		this.citmPrintQueue7ItpqId = citmPrintQueue7ItpqId;
	}

	public Integer getCitmPrintQueue8ItpqId() {
		return citmPrintQueue8ItpqId;
	}

	public void setCitmPrintQueue8ItpqId(Integer citmPrintQueue8ItpqId) {
		this.citmPrintQueue8ItpqId = citmPrintQueue8ItpqId;
	}

	public Integer getCitmPrintQueue9ItpqId() {
		return citmPrintQueue9ItpqId;
	}

	public void setCitmPrintQueue9ItpqId(Integer citmPrintQueue9ItpqId) {
		this.citmPrintQueue9ItpqId = citmPrintQueue9ItpqId;
	}

	public Integer getCitmPrintQueue10ItpqId() {
		return citmPrintQueue10ItpqId;
	}

	public void setCitmPrintQueue10ItpqId(Integer citmPrintQueue10ItpqId) {
		this.citmPrintQueue10ItpqId = citmPrintQueue10ItpqId;
	}

	public String getCitmNoPrint() {
		return citmNoPrint;
	}

	public void setCitmNoPrint(String citmNoPrint) {
		this.citmNoPrint = citmNoPrint == null ? null : citmNoPrint.trim();
	}

	public String getCitmChargeSc1() {
		return citmChargeSc1;
	}

	public void setCitmChargeSc1(String citmChargeSc1) {
		this.citmChargeSc1 = citmChargeSc1 == null ? null : citmChargeSc1.trim();
	}

	public String getCitmChargeSc2() {
		return citmChargeSc2;
	}

	public void setCitmChargeSc2(String citmChargeSc2) {
		this.citmChargeSc2 = citmChargeSc2 == null ? null : citmChargeSc2.trim();
	}

	public String getCitmChargeSc3() {
		return citmChargeSc3;
	}

	public void setCitmChargeSc3(String citmChargeSc3) {
		this.citmChargeSc3 = citmChargeSc3 == null ? null : citmChargeSc3.trim();
	}

	public String getCitmChargeSc4() {
		return citmChargeSc4;
	}

	public void setCitmChargeSc4(String citmChargeSc4) {
		this.citmChargeSc4 = citmChargeSc4 == null ? null : citmChargeSc4.trim();
	}

	public String getCitmChargeSc5() {
		return citmChargeSc5;
	}

	public void setCitmChargeSc5(String citmChargeSc5) {
		this.citmChargeSc5 = citmChargeSc5 == null ? null : citmChargeSc5.trim();
	}

	public String getCitmChargeTax1() {
		return citmChargeTax1;
	}

	public void setCitmChargeTax1(String citmChargeTax1) {
		this.citmChargeTax1 = citmChargeTax1 == null ? null : citmChargeTax1.trim();
	}

	public String getCitmChargeTax2() {
		return citmChargeTax2;
	}

	public void setCitmChargeTax2(String citmChargeTax2) {
		this.citmChargeTax2 = citmChargeTax2 == null ? null : citmChargeTax2.trim();
	}

	public String getCitmChargeTax3() {
		return citmChargeTax3;
	}

	public void setCitmChargeTax3(String citmChargeTax3) {
		this.citmChargeTax3 = citmChargeTax3 == null ? null : citmChargeTax3.trim();
	}

	public String getCitmChargeTax4() {
		return citmChargeTax4;
	}

	public void setCitmChargeTax4(String citmChargeTax4) {
		this.citmChargeTax4 = citmChargeTax4 == null ? null : citmChargeTax4.trim();
	}

	public String getCitmChargeTax5() {
		return citmChargeTax5;
	}

	public void setCitmChargeTax5(String citmChargeTax5) {
		this.citmChargeTax5 = citmChargeTax5 == null ? null : citmChargeTax5.trim();
	}

	public String getCitmChargeTax6() {
		return citmChargeTax6;
	}

	public void setCitmChargeTax6(String citmChargeTax6) {
		this.citmChargeTax6 = citmChargeTax6 == null ? null : citmChargeTax6.trim();
	}

	public String getCitmChargeTax7() {
		return citmChargeTax7;
	}

	public void setCitmChargeTax7(String citmChargeTax7) {
		this.citmChargeTax7 = citmChargeTax7 == null ? null : citmChargeTax7.trim();
	}

	public String getCitmChargeTax8() {
		return citmChargeTax8;
	}

	public void setCitmChargeTax8(String citmChargeTax8) {
		this.citmChargeTax8 = citmChargeTax8 == null ? null : citmChargeTax8.trim();
	}

	public String getCitmChargeTax9() {
		return citmChargeTax9;
	}

	public void setCitmChargeTax9(String citmChargeTax9) {
		this.citmChargeTax9 = citmChargeTax9 == null ? null : citmChargeTax9.trim();
	}

	public String getCitmChargeTax10() {
		return citmChargeTax10;
	}

	public void setCitmChargeTax10(String citmChargeTax10) {
		this.citmChargeTax10 = citmChargeTax10 == null ? null : citmChargeTax10.trim();
	}

	public String getCitmChargeTax11() {
		return citmChargeTax11;
	}

	public void setCitmChargeTax11(String citmChargeTax11) {
		this.citmChargeTax11 = citmChargeTax11 == null ? null : citmChargeTax11.trim();
	}

	public String getCitmChargeTax12() {
		return citmChargeTax12;
	}

	public void setCitmChargeTax12(String citmChargeTax12) {
		this.citmChargeTax12 = citmChargeTax12 == null ? null : citmChargeTax12.trim();
	}

	public String getCitmChargeTax13() {
		return citmChargeTax13;
	}

	public void setCitmChargeTax13(String citmChargeTax13) {
		this.citmChargeTax13 = citmChargeTax13 == null ? null : citmChargeTax13.trim();
	}

	public String getCitmChargeTax14() {
		return citmChargeTax14;
	}

	public void setCitmChargeTax14(String citmChargeTax14) {
		this.citmChargeTax14 = citmChargeTax14 == null ? null : citmChargeTax14.trim();
	}

	public String getCitmChargeTax15() {
		return citmChargeTax15;
	}

	public void setCitmChargeTax15(String citmChargeTax15) {
		this.citmChargeTax15 = citmChargeTax15 == null ? null : citmChargeTax15.trim();
	}

	public String getCitmChargeTax16() {
		return citmChargeTax16;
	}

	public void setCitmChargeTax16(String citmChargeTax16) {
		this.citmChargeTax16 = citmChargeTax16 == null ? null : citmChargeTax16.trim();
	}

	public String getCitmChargeTax17() {
		return citmChargeTax17;
	}

	public void setCitmChargeTax17(String citmChargeTax17) {
		this.citmChargeTax17 = citmChargeTax17 == null ? null : citmChargeTax17.trim();
	}

	public String getCitmChargeTax18() {
		return citmChargeTax18;
	}

	public void setCitmChargeTax18(String citmChargeTax18) {
		this.citmChargeTax18 = citmChargeTax18 == null ? null : citmChargeTax18.trim();
	}

	public String getCitmChargeTax19() {
		return citmChargeTax19;
	}

	public void setCitmChargeTax19(String citmChargeTax19) {
		this.citmChargeTax19 = citmChargeTax19 == null ? null : citmChargeTax19.trim();
	}

	public String getCitmChargeTax20() {
		return citmChargeTax20;
	}

	public void setCitmChargeTax20(String citmChargeTax20) {
		this.citmChargeTax20 = citmChargeTax20 == null ? null : citmChargeTax20.trim();
	}

	public String getCitmChargeTax21() {
		return citmChargeTax21;
	}

	public void setCitmChargeTax21(String citmChargeTax21) {
		this.citmChargeTax21 = citmChargeTax21 == null ? null : citmChargeTax21.trim();
	}

	public String getCitmChargeTax22() {
		return citmChargeTax22;
	}

	public void setCitmChargeTax22(String citmChargeTax22) {
		this.citmChargeTax22 = citmChargeTax22 == null ? null : citmChargeTax22.trim();
	}

	public String getCitmChargeTax23() {
		return citmChargeTax23;
	}

	public void setCitmChargeTax23(String citmChargeTax23) {
		this.citmChargeTax23 = citmChargeTax23 == null ? null : citmChargeTax23.trim();
	}

	public String getCitmChargeTax24() {
		return citmChargeTax24;
	}

	public void setCitmChargeTax24(String citmChargeTax24) {
		this.citmChargeTax24 = citmChargeTax24 == null ? null : citmChargeTax24.trim();
	}

	public String getCitmChargeTax25() {
		return citmChargeTax25;
	}

	public void setCitmChargeTax25(String citmChargeTax25) {
		this.citmChargeTax25 = citmChargeTax25 == null ? null : citmChargeTax25.trim();
	}

	public String getCitmHide() {
		return citmHide;
	}

	public void setCitmHide(String citmHide) {
		this.citmHide = citmHide == null ? null : citmHide.trim();
	}

	public Integer getCitmOriginalOletId() {
		return citmOriginalOletId;
	}

	public void setCitmOriginalOletId(Integer citmOriginalOletId) {
		this.citmOriginalOletId = citmOriginalOletId;
	}

	public Integer getCitmIcatId() {
		return citmIcatId;
	}

	public void setCitmIcatId(Integer citmIcatId) {
		this.citmIcatId = citmIcatId;
	}

	public Integer getCitmIdepId() {
		return citmIdepId;
	}

	public void setCitmIdepId(Integer citmIdepId) {
		this.citmIdepId = citmIdepId;
	}

	public Integer getCitmIcouId() {
		return citmIcouId;
	}

	public void setCitmIcouId(Integer citmIcouId) {
		this.citmIcouId = citmIcouId;
	}

	public Integer getCitmDigpId() {
		return citmDigpId;
	}

	public void setCitmDigpId(Integer citmDigpId) {
		this.citmDigpId = citmDigpId;
	}

	public String getCitmGetRevenue() {
		return citmGetRevenue;
	}

	public void setCitmGetRevenue(String citmGetRevenue) {
		this.citmGetRevenue = citmGetRevenue == null ? null : citmGetRevenue.trim();
	}

	public String getCitmServingStatus() {
		return citmServingStatus;
	}

	public void setCitmServingStatus(String citmServingStatus) {
		this.citmServingStatus = citmServingStatus == null ? null : citmServingStatus.trim();
	}

	public String getCitmPending() {
		return citmPending;
	}

	public void setCitmPending(String citmPending) {
		this.citmPending = citmPending == null ? null : citmPending.trim();
	}

	public String getCitmOrderingType() {
		return citmOrderingType;
	}

	public void setCitmOrderingType(String citmOrderingType) {
		this.citmOrderingType = citmOrderingType == null ? null : citmOrderingType.trim();
	}

	public String getCitmRoundStatus() {
		return citmRoundStatus;
	}

	public void setCitmRoundStatus(String citmRoundStatus) {
		this.citmRoundStatus = citmRoundStatus == null ? null : citmRoundStatus.trim();
	}

	public Date getCitmOrderTime() {
		return citmOrderTime;
	}

	public void setCitmOrderTime(Date citmOrderTime) {
		this.citmOrderTime = citmOrderTime;
	}

	public Date getCitmOrderLoctime() {
		return citmOrderLoctime;
	}

	public void setCitmOrderLoctime(Date citmOrderLoctime) {
		this.citmOrderLoctime = citmOrderLoctime;
	}

	public Integer getCitmOrderUserId() {
		return citmOrderUserId;
	}

	public void setCitmOrderUserId(Integer citmOrderUserId) {
		this.citmOrderUserId = citmOrderUserId;
	}

	public Integer getCitmOrderStatId() {
		return citmOrderStatId;
	}

	public void setCitmOrderStatId(Integer citmOrderStatId) {
		this.citmOrderStatId = citmOrderStatId;
	}

	public Date getCitmRushTime() {
		return citmRushTime;
	}

	public void setCitmRushTime(Date citmRushTime) {
		this.citmRushTime = citmRushTime;
	}

	public Date getCitmRushLoctime() {
		return citmRushLoctime;
	}

	public void setCitmRushLoctime(Date citmRushLoctime) {
		this.citmRushLoctime = citmRushLoctime;
	}

	public Integer getCitmRushUserId() {
		return citmRushUserId;
	}

	public void setCitmRushUserId(Integer citmRushUserId) {
		this.citmRushUserId = citmRushUserId;
	}

	public Integer getCitmRushStatId() {
		return citmRushStatId;
	}

	public void setCitmRushStatId(Integer citmRushStatId) {
		this.citmRushStatId = citmRushStatId;
	}

	public Integer getCitmRushCount() {
		return citmRushCount;
	}

	public void setCitmRushCount(Integer citmRushCount) {
		this.citmRushCount = citmRushCount;
	}

	public Date getCitmDeliveryTime() {
		return citmDeliveryTime;
	}

	public void setCitmDeliveryTime(Date citmDeliveryTime) {
		this.citmDeliveryTime = citmDeliveryTime;
	}

	public Date getCitmVoidTime() {
		return citmVoidTime;
	}

	public void setCitmVoidTime(Date citmVoidTime) {
		this.citmVoidTime = citmVoidTime;
	}

	public Date getCitmVoidLoctime() {
		return citmVoidLoctime;
	}

	public void setCitmVoidLoctime(Date citmVoidLoctime) {
		this.citmVoidLoctime = citmVoidLoctime;
	}

	public Integer getCitmVoidUserId() {
		return citmVoidUserId;
	}

	public void setCitmVoidUserId(Integer citmVoidUserId) {
		this.citmVoidUserId = citmVoidUserId;
	}

	public Integer getCitmVoidStatId() {
		return citmVoidStatId;
	}

	public void setCitmVoidStatId(Integer citmVoidStatId) {
		this.citmVoidStatId = citmVoidStatId;
	}

	public Integer getCitmVoidVdrsId() {
		return citmVoidVdrsId;
	}

	public void setCitmVoidVdrsId(Integer citmVoidVdrsId) {
		this.citmVoidVdrsId = citmVoidVdrsId;
	}

	public String getCitmVoidConsumed() {
		return citmVoidConsumed;
	}

	public void setCitmVoidConsumed(String citmVoidConsumed) {
		this.citmVoidConsumed = citmVoidConsumed == null ? null : citmVoidConsumed.trim();
	}

	public String getCitmStatus() {
		return citmStatus;
	}

	public void setCitmStatus(String citmStatus) {
		this.citmStatus = citmStatus == null ? null : citmStatus.trim();
	}

	public Integer getCitmSlaveId() {
		return citmSlaveId;
	}

	public void setCitmSlaveId(Integer citmSlaveId) {
		this.citmSlaveId = citmSlaveId;
	}

	public Date getCitmSlaveCreated() {
		return citmSlaveCreated;
	}

	public void setCitmSlaveCreated(Date citmSlaveCreated) {
		this.citmSlaveCreated = citmSlaveCreated;
	}

	public Date getCitmSlaveModified() {
		return citmSlaveModified;
	}

	public void setCitmSlaveModified(Date citmSlaveModified) {
		this.citmSlaveModified = citmSlaveModified;
	}

	public Integer getCitmSyncId() {
		return citmSyncId;
	}

	public void setCitmSyncId(Integer citmSyncId) {
		this.citmSyncId = citmSyncId;
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
		sb.append(", citmId=").append(citmId);
		sb.append(", citmBdayId=").append(citmBdayId);
		sb.append(", citmBperId=").append(citmBperId);
		sb.append(", citmShopId=").append(citmShopId);
		sb.append(", citmOletId=").append(citmOletId);
		sb.append(", citmChksId=").append(citmChksId);
		sb.append(", citmCptyId=").append(citmCptyId);
		sb.append(", citmItemId=").append(citmItemId);
		sb.append(", citmCode=").append(citmCode);
		sb.append(", citmNameL1=").append(citmNameL1);
		sb.append(", citmNameL2=").append(citmNameL2);
		sb.append(", citmNameL3=").append(citmNameL3);
		sb.append(", citmNameL4=").append(citmNameL4);
		sb.append(", citmNameL5=").append(citmNameL5);
		sb.append(", citmShortNameL1=").append(citmShortNameL1);
		sb.append(", citmShortNameL2=").append(citmShortNameL2);
		sb.append(", citmShortNameL3=").append(citmShortNameL3);
		sb.append(", citmShortNameL4=").append(citmShortNameL4);
		sb.append(", citmShortNameL5=").append(citmShortNameL5);
		sb.append(", citmParentCitmId=").append(citmParentCitmId);
		sb.append(", citmRole=").append(citmRole);
		sb.append(", citmChildCount=").append(citmChildCount);
		sb.append(", citmModifierCount=").append(citmModifierCount);
		sb.append(", citmSeat=").append(citmSeat);
		sb.append(", citmMixAndMatchCitmId=").append(citmMixAndMatchCitmId);
		sb.append(", citmSeq=").append(citmSeq);
		sb.append(", citmRoundTotal=").append(citmRoundTotal);
		sb.append(", citmTotal=").append(citmTotal);
		sb.append(", citmRoundAmount=").append(citmRoundAmount);
		sb.append(", citmCarryTotal=").append(citmCarryTotal);
		sb.append(", citmQty=").append(citmQty);
		sb.append(", citmBaseQty=").append(citmBaseQty);
		sb.append(", citmPrice=").append(citmPrice);
		sb.append(", citmOriginalPrice=").append(citmOriginalPrice);
		sb.append(", citmBasicPrice=").append(citmBasicPrice);
		sb.append(", citmBasicCalculateMethod=").append(citmBasicCalculateMethod);
		sb.append(", citmSc1=").append(citmSc1);
		sb.append(", citmSc2=").append(citmSc2);
		sb.append(", citmSc3=").append(citmSc3);
		sb.append(", citmSc4=").append(citmSc4);
		sb.append(", citmSc5=").append(citmSc5);
		sb.append(", citmTax1=").append(citmTax1);
		sb.append(", citmTax2=").append(citmTax2);
		sb.append(", citmTax3=").append(citmTax3);
		sb.append(", citmTax4=").append(citmTax4);
		sb.append(", citmTax5=").append(citmTax5);
		sb.append(", citmTax6=").append(citmTax6);
		sb.append(", citmTax7=").append(citmTax7);
		sb.append(", citmTax8=").append(citmTax8);
		sb.append(", citmTax9=").append(citmTax9);
		sb.append(", citmTax10=").append(citmTax10);
		sb.append(", citmTax11=").append(citmTax11);
		sb.append(", citmTax12=").append(citmTax12);
		sb.append(", citmTax13=").append(citmTax13);
		sb.append(", citmTax14=").append(citmTax14);
		sb.append(", citmTax15=").append(citmTax15);
		sb.append(", citmTax16=").append(citmTax16);
		sb.append(", citmTax17=").append(citmTax17);
		sb.append(", citmTax18=").append(citmTax18);
		sb.append(", citmTax19=").append(citmTax19);
		sb.append(", citmTax20=").append(citmTax20);
		sb.append(", citmTax21=").append(citmTax21);
		sb.append(", citmTax22=").append(citmTax22);
		sb.append(", citmTax23=").append(citmTax23);
		sb.append(", citmTax24=").append(citmTax24);
		sb.append(", citmTax25=").append(citmTax25);
		sb.append(", citmInclTaxRef1=").append(citmInclTaxRef1);
		sb.append(", citmInclTaxRef2=").append(citmInclTaxRef2);
		sb.append(", citmInclTaxRef3=").append(citmInclTaxRef3);
		sb.append(", citmInclTaxRef4=").append(citmInclTaxRef4);
		sb.append(", citmPreDisc=").append(citmPreDisc);
		sb.append(", citmMidDisc=").append(citmMidDisc);
		sb.append(", citmPostDisc=").append(citmPostDisc);
		sb.append(", citmOriginalPriceLevel=").append(citmOriginalPriceLevel);
		sb.append(", citmPriceLevel=").append(citmPriceLevel);
		sb.append(", citmRevenue=").append(citmRevenue);
		sb.append(", citmCarryRevenue=").append(citmCarryRevenue);
		sb.append(", citmUnitCost=").append(citmUnitCost);
		sb.append(", citmPrintQueue1ItpqId=").append(citmPrintQueue1ItpqId);
		sb.append(", citmPrintQueue2ItpqId=").append(citmPrintQueue2ItpqId);
		sb.append(", citmPrintQueue3ItpqId=").append(citmPrintQueue3ItpqId);
		sb.append(", citmPrintQueue4ItpqId=").append(citmPrintQueue4ItpqId);
		sb.append(", citmPrintQueue5ItpqId=").append(citmPrintQueue5ItpqId);
		sb.append(", citmPrintQueue6ItpqId=").append(citmPrintQueue6ItpqId);
		sb.append(", citmPrintQueue7ItpqId=").append(citmPrintQueue7ItpqId);
		sb.append(", citmPrintQueue8ItpqId=").append(citmPrintQueue8ItpqId);
		sb.append(", citmPrintQueue9ItpqId=").append(citmPrintQueue9ItpqId);
		sb.append(", citmPrintQueue10ItpqId=").append(citmPrintQueue10ItpqId);
		sb.append(", citmNoPrint=").append(citmNoPrint);
		sb.append(", citmChargeSc1=").append(citmChargeSc1);
		sb.append(", citmChargeSc2=").append(citmChargeSc2);
		sb.append(", citmChargeSc3=").append(citmChargeSc3);
		sb.append(", citmChargeSc4=").append(citmChargeSc4);
		sb.append(", citmChargeSc5=").append(citmChargeSc5);
		sb.append(", citmChargeTax1=").append(citmChargeTax1);
		sb.append(", citmChargeTax2=").append(citmChargeTax2);
		sb.append(", citmChargeTax3=").append(citmChargeTax3);
		sb.append(", citmChargeTax4=").append(citmChargeTax4);
		sb.append(", citmChargeTax5=").append(citmChargeTax5);
		sb.append(", citmChargeTax6=").append(citmChargeTax6);
		sb.append(", citmChargeTax7=").append(citmChargeTax7);
		sb.append(", citmChargeTax8=").append(citmChargeTax8);
		sb.append(", citmChargeTax9=").append(citmChargeTax9);
		sb.append(", citmChargeTax10=").append(citmChargeTax10);
		sb.append(", citmChargeTax11=").append(citmChargeTax11);
		sb.append(", citmChargeTax12=").append(citmChargeTax12);
		sb.append(", citmChargeTax13=").append(citmChargeTax13);
		sb.append(", citmChargeTax14=").append(citmChargeTax14);
		sb.append(", citmChargeTax15=").append(citmChargeTax15);
		sb.append(", citmChargeTax16=").append(citmChargeTax16);
		sb.append(", citmChargeTax17=").append(citmChargeTax17);
		sb.append(", citmChargeTax18=").append(citmChargeTax18);
		sb.append(", citmChargeTax19=").append(citmChargeTax19);
		sb.append(", citmChargeTax20=").append(citmChargeTax20);
		sb.append(", citmChargeTax21=").append(citmChargeTax21);
		sb.append(", citmChargeTax22=").append(citmChargeTax22);
		sb.append(", citmChargeTax23=").append(citmChargeTax23);
		sb.append(", citmChargeTax24=").append(citmChargeTax24);
		sb.append(", citmChargeTax25=").append(citmChargeTax25);
		sb.append(", citmHide=").append(citmHide);
		sb.append(", citmOriginalOletId=").append(citmOriginalOletId);
		sb.append(", citmIcatId=").append(citmIcatId);
		sb.append(", citmIdepId=").append(citmIdepId);
		sb.append(", citmIcouId=").append(citmIcouId);
		sb.append(", citmDigpId=").append(citmDigpId);
		sb.append(", citmGetRevenue=").append(citmGetRevenue);
		sb.append(", citmServingStatus=").append(citmServingStatus);
		sb.append(", citmPending=").append(citmPending);
		sb.append(", citmOrderingType=").append(citmOrderingType);
		sb.append(", citmRoundStatus=").append(citmRoundStatus);
		sb.append(", citmOrderTime=").append(citmOrderTime);
		sb.append(", citmOrderLoctime=").append(citmOrderLoctime);
		sb.append(", citmOrderUserId=").append(citmOrderUserId);
		sb.append(", citmOrderStatId=").append(citmOrderStatId);
		sb.append(", citmRushTime=").append(citmRushTime);
		sb.append(", citmRushLoctime=").append(citmRushLoctime);
		sb.append(", citmRushUserId=").append(citmRushUserId);
		sb.append(", citmRushStatId=").append(citmRushStatId);
		sb.append(", citmRushCount=").append(citmRushCount);
		sb.append(", citmDeliveryTime=").append(citmDeliveryTime);
		sb.append(", citmVoidTime=").append(citmVoidTime);
		sb.append(", citmVoidLoctime=").append(citmVoidLoctime);
		sb.append(", citmVoidUserId=").append(citmVoidUserId);
		sb.append(", citmVoidStatId=").append(citmVoidStatId);
		sb.append(", citmVoidVdrsId=").append(citmVoidVdrsId);
		sb.append(", citmVoidConsumed=").append(citmVoidConsumed);
		sb.append(", citmStatus=").append(citmStatus);
		sb.append(", citmSlaveId=").append(citmSlaveId);
		sb.append(", citmSlaveCreated=").append(citmSlaveCreated);
		sb.append(", citmSlaveModified=").append(citmSlaveModified);
		sb.append(", citmSyncId=").append(citmSyncId);
		sb.append(", created=").append(created);
		sb.append(", modified=").append(modified);
		sb.append(", serialVersionUID=").append(serialVersionUID);
		sb.append("]");
		return sb.toString();
	}
}