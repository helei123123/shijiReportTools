package com.shiji.entity;

import java.io.Serializable;
import java.util.Date;

public class PosActionLogs implements Serializable {
	private String alogId;

	private String alogKey;

	private Integer alogUserId;

	private Date alogActionTime;

	private Date alogActionLoctime;

	private String alogActionResult;

	private String alogTable;

	private Integer alogRecordId;

	private Integer alogShopId;

	private Integer alogOletId;

	private String alogBdayId;

	private String alogBperId;

	private Integer alogStatId;

	private String alogChksId;

	private String alogCptyId;

	private String alogCitmId;

	private String alogCdisId;

	private String alogCpayId;

	private Integer alogSlaveId;

	private Date alogSlaveCreated;

	private Date alogSlaveModified;

	private Integer alogSyncId;

	private Date created;

	private Date modified;

	private String alogRemark;

	private static final long serialVersionUID = 1L;

	public String getAlogId() {
		return alogId;
	}

	public void setAlogId(String alogId) {
		this.alogId = alogId == null ? null : alogId.trim();
	}

	public String getAlogKey() {
		return alogKey;
	}

	public void setAlogKey(String alogKey) {
		this.alogKey = alogKey == null ? null : alogKey.trim();
	}

	public Integer getAlogUserId() {
		return alogUserId;
	}

	public void setAlogUserId(Integer alogUserId) {
		this.alogUserId = alogUserId;
	}

	public Date getAlogActionTime() {
		return alogActionTime;
	}

	public void setAlogActionTime(Date alogActionTime) {
		this.alogActionTime = alogActionTime;
	}

	public Date getAlogActionLoctime() {
		return alogActionLoctime;
	}

	public void setAlogActionLoctime(Date alogActionLoctime) {
		this.alogActionLoctime = alogActionLoctime;
	}

	public String getAlogActionResult() {
		return alogActionResult;
	}

	public void setAlogActionResult(String alogActionResult) {
		this.alogActionResult = alogActionResult == null ? null : alogActionResult.trim();
	}

	public String getAlogTable() {
		return alogTable;
	}

	public void setAlogTable(String alogTable) {
		this.alogTable = alogTable == null ? null : alogTable.trim();
	}

	public Integer getAlogRecordId() {
		return alogRecordId;
	}

	public void setAlogRecordId(Integer alogRecordId) {
		this.alogRecordId = alogRecordId;
	}

	public Integer getAlogShopId() {
		return alogShopId;
	}

	public void setAlogShopId(Integer alogShopId) {
		this.alogShopId = alogShopId;
	}

	public Integer getAlogOletId() {
		return alogOletId;
	}

	public void setAlogOletId(Integer alogOletId) {
		this.alogOletId = alogOletId;
	}

	public String getAlogBdayId() {
		return alogBdayId;
	}

	public void setAlogBdayId(String alogBdayId) {
		this.alogBdayId = alogBdayId == null ? null : alogBdayId.trim();
	}

	public String getAlogBperId() {
		return alogBperId;
	}

	public void setAlogBperId(String alogBperId) {
		this.alogBperId = alogBperId == null ? null : alogBperId.trim();
	}

	public Integer getAlogStatId() {
		return alogStatId;
	}

	public void setAlogStatId(Integer alogStatId) {
		this.alogStatId = alogStatId;
	}

	public String getAlogChksId() {
		return alogChksId;
	}

	public void setAlogChksId(String alogChksId) {
		this.alogChksId = alogChksId == null ? null : alogChksId.trim();
	}

	public String getAlogCptyId() {
		return alogCptyId;
	}

	public void setAlogCptyId(String alogCptyId) {
		this.alogCptyId = alogCptyId == null ? null : alogCptyId.trim();
	}

	public String getAlogCitmId() {
		return alogCitmId;
	}

	public void setAlogCitmId(String alogCitmId) {
		this.alogCitmId = alogCitmId == null ? null : alogCitmId.trim();
	}

	public String getAlogCdisId() {
		return alogCdisId;
	}

	public void setAlogCdisId(String alogCdisId) {
		this.alogCdisId = alogCdisId == null ? null : alogCdisId.trim();
	}

	public String getAlogCpayId() {
		return alogCpayId;
	}

	public void setAlogCpayId(String alogCpayId) {
		this.alogCpayId = alogCpayId == null ? null : alogCpayId.trim();
	}

	public Integer getAlogSlaveId() {
		return alogSlaveId;
	}

	public void setAlogSlaveId(Integer alogSlaveId) {
		this.alogSlaveId = alogSlaveId;
	}

	public Date getAlogSlaveCreated() {
		return alogSlaveCreated;
	}

	public void setAlogSlaveCreated(Date alogSlaveCreated) {
		this.alogSlaveCreated = alogSlaveCreated;
	}

	public Date getAlogSlaveModified() {
		return alogSlaveModified;
	}

	public void setAlogSlaveModified(Date alogSlaveModified) {
		this.alogSlaveModified = alogSlaveModified;
	}

	public Integer getAlogSyncId() {
		return alogSyncId;
	}

	public void setAlogSyncId(Integer alogSyncId) {
		this.alogSyncId = alogSyncId;
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

	public String getAlogRemark() {
		return alogRemark;
	}

	public void setAlogRemark(String alogRemark) {
		this.alogRemark = alogRemark == null ? null : alogRemark.trim();
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", alogId=").append(alogId);
		sb.append(", alogKey=").append(alogKey);
		sb.append(", alogUserId=").append(alogUserId);
		sb.append(", alogActionTime=").append(alogActionTime);
		sb.append(", alogActionLoctime=").append(alogActionLoctime);
		sb.append(", alogActionResult=").append(alogActionResult);
		sb.append(", alogTable=").append(alogTable);
		sb.append(", alogRecordId=").append(alogRecordId);
		sb.append(", alogShopId=").append(alogShopId);
		sb.append(", alogOletId=").append(alogOletId);
		sb.append(", alogBdayId=").append(alogBdayId);
		sb.append(", alogBperId=").append(alogBperId);
		sb.append(", alogStatId=").append(alogStatId);
		sb.append(", alogChksId=").append(alogChksId);
		sb.append(", alogCptyId=").append(alogCptyId);
		sb.append(", alogCitmId=").append(alogCitmId);
		sb.append(", alogCdisId=").append(alogCdisId);
		sb.append(", alogCpayId=").append(alogCpayId);
		sb.append(", alogSlaveId=").append(alogSlaveId);
		sb.append(", alogSlaveCreated=").append(alogSlaveCreated);
		sb.append(", alogSlaveModified=").append(alogSlaveModified);
		sb.append(", alogSyncId=").append(alogSyncId);
		sb.append(", created=").append(created);
		sb.append(", modified=").append(modified);
		sb.append(", alogRemark=").append(alogRemark);
		sb.append(", serialVersionUID=").append(serialVersionUID);
		sb.append("]");
		return sb.toString();
	}
}