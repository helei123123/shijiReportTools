package com.shiji.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class PosCheckDiscounts implements Serializable {
	private String cdisId;

	private String cdisBdayId;

	private String cdisBperId;

	private Integer cdisShopId;

	private Integer cdisOletId;

	private String cdisChksId;

	private String cdisCptyId;

	private String cdisCitmId;

	private Integer cdisDtypId;

	private String cdisNameL1;

	private String cdisNameL2;

	private String cdisNameL3;

	private String cdisNameL4;

	private String cdisNameL5;

	private String cdisShortNameL1;

	private String cdisShortNameL2;

	private String cdisShortNameL3;

	private String cdisShortNameL4;

	private String cdisShortNameL5;

	private Integer cdisDgrpId;

	private Integer cdisSeq;

	private BigDecimal cdisRoundTotal;

	private Double cdisTotal;

	private Double cdisRoundAmount;

	private String cdisMethod;

	private String cdisType;

	private String cdisUsedFor;

	private String cdisClassKey;

	private Float cdisRate;

	private BigDecimal cdisFixAmount;

	private String cdisIncludeTaxScMask;

	private String cdisIncludePreDisc;

	private String cdisIncludeMidDisc;

	private Date cdisApplyTime;

	private Date cdisApplyLoctime;

	private Integer cdisApplyUserId;

	private Integer cdisApplyStatId;

	private Date cdisVoidTime;

	private Date cdisVoidLoctime;

	private Integer cdisVoidUserId;

	private Integer cdisVoidStatId;

	private Integer cdisVoidVdrsId;

	private String cdisStatus;

	private Integer cdisSlaveId;

	private Date cdisSlaveCreated;

	private Date cdisSlaveModified;

	private Integer cdisSyncId;

	private Date created;

	private Date modified;

	private static final long serialVersionUID = 1L;

	public String getCdisId() {
		return cdisId;
	}

	public void setCdisId(String cdisId) {
		this.cdisId = cdisId == null ? null : cdisId.trim();
	}

	public String getCdisBdayId() {
		return cdisBdayId;
	}

	public void setCdisBdayId(String cdisBdayId) {
		this.cdisBdayId = cdisBdayId == null ? null : cdisBdayId.trim();
	}

	public String getCdisBperId() {
		return cdisBperId;
	}

	public void setCdisBperId(String cdisBperId) {
		this.cdisBperId = cdisBperId == null ? null : cdisBperId.trim();
	}

	public Integer getCdisShopId() {
		return cdisShopId;
	}

	public void setCdisShopId(Integer cdisShopId) {
		this.cdisShopId = cdisShopId;
	}

	public Integer getCdisOletId() {
		return cdisOletId;
	}

	public void setCdisOletId(Integer cdisOletId) {
		this.cdisOletId = cdisOletId;
	}

	public String getCdisChksId() {
		return cdisChksId;
	}

	public void setCdisChksId(String cdisChksId) {
		this.cdisChksId = cdisChksId == null ? null : cdisChksId.trim();
	}

	public String getCdisCptyId() {
		return cdisCptyId;
	}

	public void setCdisCptyId(String cdisCptyId) {
		this.cdisCptyId = cdisCptyId == null ? null : cdisCptyId.trim();
	}

	public String getCdisCitmId() {
		return cdisCitmId;
	}

	public void setCdisCitmId(String cdisCitmId) {
		this.cdisCitmId = cdisCitmId == null ? null : cdisCitmId.trim();
	}

	public Integer getCdisDtypId() {
		return cdisDtypId;
	}

	public void setCdisDtypId(Integer cdisDtypId) {
		this.cdisDtypId = cdisDtypId;
	}

	public String getCdisNameL1() {
		return cdisNameL1;
	}

	public void setCdisNameL1(String cdisNameL1) {
		this.cdisNameL1 = cdisNameL1 == null ? null : cdisNameL1.trim();
	}

	public String getCdisNameL2() {
		return cdisNameL2;
	}

	public void setCdisNameL2(String cdisNameL2) {
		this.cdisNameL2 = cdisNameL2 == null ? null : cdisNameL2.trim();
	}

	public String getCdisNameL3() {
		return cdisNameL3;
	}

	public void setCdisNameL3(String cdisNameL3) {
		this.cdisNameL3 = cdisNameL3 == null ? null : cdisNameL3.trim();
	}

	public String getCdisNameL4() {
		return cdisNameL4;
	}

	public void setCdisNameL4(String cdisNameL4) {
		this.cdisNameL4 = cdisNameL4 == null ? null : cdisNameL4.trim();
	}

	public String getCdisNameL5() {
		return cdisNameL5;
	}

	public void setCdisNameL5(String cdisNameL5) {
		this.cdisNameL5 = cdisNameL5 == null ? null : cdisNameL5.trim();
	}

	public String getCdisShortNameL1() {
		return cdisShortNameL1;
	}

	public void setCdisShortNameL1(String cdisShortNameL1) {
		this.cdisShortNameL1 = cdisShortNameL1 == null ? null : cdisShortNameL1.trim();
	}

	public String getCdisShortNameL2() {
		return cdisShortNameL2;
	}

	public void setCdisShortNameL2(String cdisShortNameL2) {
		this.cdisShortNameL2 = cdisShortNameL2 == null ? null : cdisShortNameL2.trim();
	}

	public String getCdisShortNameL3() {
		return cdisShortNameL3;
	}

	public void setCdisShortNameL3(String cdisShortNameL3) {
		this.cdisShortNameL3 = cdisShortNameL3 == null ? null : cdisShortNameL3.trim();
	}

	public String getCdisShortNameL4() {
		return cdisShortNameL4;
	}

	public void setCdisShortNameL4(String cdisShortNameL4) {
		this.cdisShortNameL4 = cdisShortNameL4 == null ? null : cdisShortNameL4.trim();
	}

	public String getCdisShortNameL5() {
		return cdisShortNameL5;
	}

	public void setCdisShortNameL5(String cdisShortNameL5) {
		this.cdisShortNameL5 = cdisShortNameL5 == null ? null : cdisShortNameL5.trim();
	}

	public Integer getCdisDgrpId() {
		return cdisDgrpId;
	}

	public void setCdisDgrpId(Integer cdisDgrpId) {
		this.cdisDgrpId = cdisDgrpId;
	}

	public Integer getCdisSeq() {
		return cdisSeq;
	}

	public void setCdisSeq(Integer cdisSeq) {
		this.cdisSeq = cdisSeq;
	}

	public BigDecimal getCdisRoundTotal() {
		return cdisRoundTotal;
	}

	public void setCdisRoundTotal(BigDecimal cdisRoundTotal) {
		this.cdisRoundTotal = cdisRoundTotal;
	}

	public Double getCdisTotal() {
		return cdisTotal;
	}

	public void setCdisTotal(Double cdisTotal) {
		this.cdisTotal = cdisTotal;
	}

	public Double getCdisRoundAmount() {
		return cdisRoundAmount;
	}

	public void setCdisRoundAmount(Double cdisRoundAmount) {
		this.cdisRoundAmount = cdisRoundAmount;
	}

	public String getCdisMethod() {
		return cdisMethod;
	}

	public void setCdisMethod(String cdisMethod) {
		this.cdisMethod = cdisMethod == null ? null : cdisMethod.trim();
	}

	public String getCdisType() {
		return cdisType;
	}

	public void setCdisType(String cdisType) {
		this.cdisType = cdisType == null ? null : cdisType.trim();
	}

	public String getCdisUsedFor() {
		return cdisUsedFor;
	}

	public void setCdisUsedFor(String cdisUsedFor) {
		this.cdisUsedFor = cdisUsedFor == null ? null : cdisUsedFor.trim();
	}

	public String getCdisClassKey() {
		return cdisClassKey;
	}

	public void setCdisClassKey(String cdisClassKey) {
		this.cdisClassKey = cdisClassKey == null ? null : cdisClassKey.trim();
	}

	public Float getCdisRate() {
		return cdisRate;
	}

	public void setCdisRate(Float cdisRate) {
		this.cdisRate = cdisRate;
	}

	public BigDecimal getCdisFixAmount() {
		return cdisFixAmount;
	}

	public void setCdisFixAmount(BigDecimal cdisFixAmount) {
		this.cdisFixAmount = cdisFixAmount;
	}

	public String getCdisIncludeTaxScMask() {
		return cdisIncludeTaxScMask;
	}

	public void setCdisIncludeTaxScMask(String cdisIncludeTaxScMask) {
		this.cdisIncludeTaxScMask = cdisIncludeTaxScMask == null ? null : cdisIncludeTaxScMask.trim();
	}

	public String getCdisIncludePreDisc() {
		return cdisIncludePreDisc;
	}

	public void setCdisIncludePreDisc(String cdisIncludePreDisc) {
		this.cdisIncludePreDisc = cdisIncludePreDisc == null ? null : cdisIncludePreDisc.trim();
	}

	public String getCdisIncludeMidDisc() {
		return cdisIncludeMidDisc;
	}

	public void setCdisIncludeMidDisc(String cdisIncludeMidDisc) {
		this.cdisIncludeMidDisc = cdisIncludeMidDisc == null ? null : cdisIncludeMidDisc.trim();
	}

	public Date getCdisApplyTime() {
		return cdisApplyTime;
	}

	public void setCdisApplyTime(Date cdisApplyTime) {
		this.cdisApplyTime = cdisApplyTime;
	}

	public Date getCdisApplyLoctime() {
		return cdisApplyLoctime;
	}

	public void setCdisApplyLoctime(Date cdisApplyLoctime) {
		this.cdisApplyLoctime = cdisApplyLoctime;
	}

	public Integer getCdisApplyUserId() {
		return cdisApplyUserId;
	}

	public void setCdisApplyUserId(Integer cdisApplyUserId) {
		this.cdisApplyUserId = cdisApplyUserId;
	}

	public Integer getCdisApplyStatId() {
		return cdisApplyStatId;
	}

	public void setCdisApplyStatId(Integer cdisApplyStatId) {
		this.cdisApplyStatId = cdisApplyStatId;
	}

	public Date getCdisVoidTime() {
		return cdisVoidTime;
	}

	public void setCdisVoidTime(Date cdisVoidTime) {
		this.cdisVoidTime = cdisVoidTime;
	}

	public Date getCdisVoidLoctime() {
		return cdisVoidLoctime;
	}

	public void setCdisVoidLoctime(Date cdisVoidLoctime) {
		this.cdisVoidLoctime = cdisVoidLoctime;
	}

	public Integer getCdisVoidUserId() {
		return cdisVoidUserId;
	}

	public void setCdisVoidUserId(Integer cdisVoidUserId) {
		this.cdisVoidUserId = cdisVoidUserId;
	}

	public Integer getCdisVoidStatId() {
		return cdisVoidStatId;
	}

	public void setCdisVoidStatId(Integer cdisVoidStatId) {
		this.cdisVoidStatId = cdisVoidStatId;
	}

	public Integer getCdisVoidVdrsId() {
		return cdisVoidVdrsId;
	}

	public void setCdisVoidVdrsId(Integer cdisVoidVdrsId) {
		this.cdisVoidVdrsId = cdisVoidVdrsId;
	}

	public String getCdisStatus() {
		return cdisStatus;
	}

	public void setCdisStatus(String cdisStatus) {
		this.cdisStatus = cdisStatus == null ? null : cdisStatus.trim();
	}

	public Integer getCdisSlaveId() {
		return cdisSlaveId;
	}

	public void setCdisSlaveId(Integer cdisSlaveId) {
		this.cdisSlaveId = cdisSlaveId;
	}

	public Date getCdisSlaveCreated() {
		return cdisSlaveCreated;
	}

	public void setCdisSlaveCreated(Date cdisSlaveCreated) {
		this.cdisSlaveCreated = cdisSlaveCreated;
	}

	public Date getCdisSlaveModified() {
		return cdisSlaveModified;
	}

	public void setCdisSlaveModified(Date cdisSlaveModified) {
		this.cdisSlaveModified = cdisSlaveModified;
	}

	public Integer getCdisSyncId() {
		return cdisSyncId;
	}

	public void setCdisSyncId(Integer cdisSyncId) {
		this.cdisSyncId = cdisSyncId;
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
		sb.append(", cdisId=").append(cdisId);
		sb.append(", cdisBdayId=").append(cdisBdayId);
		sb.append(", cdisBperId=").append(cdisBperId);
		sb.append(", cdisShopId=").append(cdisShopId);
		sb.append(", cdisOletId=").append(cdisOletId);
		sb.append(", cdisChksId=").append(cdisChksId);
		sb.append(", cdisCptyId=").append(cdisCptyId);
		sb.append(", cdisCitmId=").append(cdisCitmId);
		sb.append(", cdisDtypId=").append(cdisDtypId);
		sb.append(", cdisNameL1=").append(cdisNameL1);
		sb.append(", cdisNameL2=").append(cdisNameL2);
		sb.append(", cdisNameL3=").append(cdisNameL3);
		sb.append(", cdisNameL4=").append(cdisNameL4);
		sb.append(", cdisNameL5=").append(cdisNameL5);
		sb.append(", cdisShortNameL1=").append(cdisShortNameL1);
		sb.append(", cdisShortNameL2=").append(cdisShortNameL2);
		sb.append(", cdisShortNameL3=").append(cdisShortNameL3);
		sb.append(", cdisShortNameL4=").append(cdisShortNameL4);
		sb.append(", cdisShortNameL5=").append(cdisShortNameL5);
		sb.append(", cdisDgrpId=").append(cdisDgrpId);
		sb.append(", cdisSeq=").append(cdisSeq);
		sb.append(", cdisRoundTotal=").append(cdisRoundTotal);
		sb.append(", cdisTotal=").append(cdisTotal);
		sb.append(", cdisRoundAmount=").append(cdisRoundAmount);
		sb.append(", cdisMethod=").append(cdisMethod);
		sb.append(", cdisType=").append(cdisType);
		sb.append(", cdisUsedFor=").append(cdisUsedFor);
		sb.append(", cdisClassKey=").append(cdisClassKey);
		sb.append(", cdisRate=").append(cdisRate);
		sb.append(", cdisFixAmount=").append(cdisFixAmount);
		sb.append(", cdisIncludeTaxScMask=").append(cdisIncludeTaxScMask);
		sb.append(", cdisIncludePreDisc=").append(cdisIncludePreDisc);
		sb.append(", cdisIncludeMidDisc=").append(cdisIncludeMidDisc);
		sb.append(", cdisApplyTime=").append(cdisApplyTime);
		sb.append(", cdisApplyLoctime=").append(cdisApplyLoctime);
		sb.append(", cdisApplyUserId=").append(cdisApplyUserId);
		sb.append(", cdisApplyStatId=").append(cdisApplyStatId);
		sb.append(", cdisVoidTime=").append(cdisVoidTime);
		sb.append(", cdisVoidLoctime=").append(cdisVoidLoctime);
		sb.append(", cdisVoidUserId=").append(cdisVoidUserId);
		sb.append(", cdisVoidStatId=").append(cdisVoidStatId);
		sb.append(", cdisVoidVdrsId=").append(cdisVoidVdrsId);
		sb.append(", cdisStatus=").append(cdisStatus);
		sb.append(", cdisSlaveId=").append(cdisSlaveId);
		sb.append(", cdisSlaveCreated=").append(cdisSlaveCreated);
		sb.append(", cdisSlaveModified=").append(cdisSlaveModified);
		sb.append(", cdisSyncId=").append(cdisSyncId);
		sb.append(", created=").append(created);
		sb.append(", modified=").append(modified);
		sb.append(", serialVersionUID=").append(serialVersionUID);
		sb.append("]");
		return sb.toString();
	}
}