package com.shiji.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class PosCheckDiscountsItems implements Serializable {
	private String cditId;

	private Integer cditOletId;

	private String cditCdisId;

	private String cditCitmId;

	private Double cditTotal;

	private BigDecimal cditRoundTotal;

	private String cditStatus;

	private Integer cditSlaveId;

	private Date cditSlaveCreated;

	private Date cditSlaveModified;

	private Integer cditSyncId;

	private Date created;

	private Date modified;

	private static final long serialVersionUID = 1L;

	public String getCditId() {
		return cditId;
	}

	public void setCditId(String cditId) {
		this.cditId = cditId == null ? null : cditId.trim();
	}

	public Integer getCditOletId() {
		return cditOletId;
	}

	public void setCditOletId(Integer cditOletId) {
		this.cditOletId = cditOletId;
	}

	public String getCditCdisId() {
		return cditCdisId;
	}

	public void setCditCdisId(String cditCdisId) {
		this.cditCdisId = cditCdisId == null ? null : cditCdisId.trim();
	}

	public String getCditCitmId() {
		return cditCitmId;
	}

	public void setCditCitmId(String cditCitmId) {
		this.cditCitmId = cditCitmId == null ? null : cditCitmId.trim();
	}

	public Double getCditTotal() {
		return cditTotal;
	}

	public void setCditTotal(Double cditTotal) {
		this.cditTotal = cditTotal;
	}

	public BigDecimal getCditRoundTotal() {
		return cditRoundTotal;
	}

	public void setCditRoundTotal(BigDecimal cditRoundTotal) {
		this.cditRoundTotal = cditRoundTotal;
	}

	public String getCditStatus() {
		return cditStatus;
	}

	public void setCditStatus(String cditStatus) {
		this.cditStatus = cditStatus == null ? null : cditStatus.trim();
	}

	public Integer getCditSlaveId() {
		return cditSlaveId;
	}

	public void setCditSlaveId(Integer cditSlaveId) {
		this.cditSlaveId = cditSlaveId;
	}

	public Date getCditSlaveCreated() {
		return cditSlaveCreated;
	}

	public void setCditSlaveCreated(Date cditSlaveCreated) {
		this.cditSlaveCreated = cditSlaveCreated;
	}

	public Date getCditSlaveModified() {
		return cditSlaveModified;
	}

	public void setCditSlaveModified(Date cditSlaveModified) {
		this.cditSlaveModified = cditSlaveModified;
	}

	public Integer getCditSyncId() {
		return cditSyncId;
	}

	public void setCditSyncId(Integer cditSyncId) {
		this.cditSyncId = cditSyncId;
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
		sb.append(", cditId=").append(cditId);
		sb.append(", cditOletId=").append(cditOletId);
		sb.append(", cditCdisId=").append(cditCdisId);
		sb.append(", cditCitmId=").append(cditCitmId);
		sb.append(", cditTotal=").append(cditTotal);
		sb.append(", cditRoundTotal=").append(cditRoundTotal);
		sb.append(", cditStatus=").append(cditStatus);
		sb.append(", cditSlaveId=").append(cditSlaveId);
		sb.append(", cditSlaveCreated=").append(cditSlaveCreated);
		sb.append(", cditSlaveModified=").append(cditSlaveModified);
		sb.append(", cditSyncId=").append(cditSyncId);
		sb.append(", created=").append(created);
		sb.append(", modified=").append(modified);
		sb.append(", serialVersionUID=").append(serialVersionUID);
		sb.append("]");
		return sb.toString();
	}
}