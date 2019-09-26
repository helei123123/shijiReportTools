package com.shiji.entity;

import java.io.Serializable;
import java.util.Date;

public class PosCheckTables implements Serializable {
	private String ctblId;

	private Integer ctblOletId;

	private String ctblChksId;

	private Integer ctblTable;

	private String ctblTableExt;

	private Integer ctblTableSize;

	private String ctblAdditional;

	private Integer ctblPtblId;

	private String ctblStatus;

	private Integer ctblSlaveId;

	private Date ctblSlaveCreated;

	private Date ctblSlaveModified;

	private Integer ctblSyncId;

	private Date created;

	private Date modified;

	private static final long serialVersionUID = 1L;

	public String getCtblId() {
		return ctblId;
	}

	public void setCtblId(String ctblId) {
		this.ctblId = ctblId == null ? null : ctblId.trim();
	}

	public Integer getCtblOletId() {
		return ctblOletId;
	}

	public void setCtblOletId(Integer ctblOletId) {
		this.ctblOletId = ctblOletId;
	}

	public String getCtblChksId() {
		return ctblChksId;
	}

	public void setCtblChksId(String ctblChksId) {
		this.ctblChksId = ctblChksId == null ? null : ctblChksId.trim();
	}

	public Integer getCtblTable() {
		return ctblTable;
	}

	public void setCtblTable(Integer ctblTable) {
		this.ctblTable = ctblTable;
	}

	public String getCtblTableExt() {
		return ctblTableExt;
	}

	public void setCtblTableExt(String ctblTableExt) {
		this.ctblTableExt = ctblTableExt == null ? null : ctblTableExt.trim();
	}

	public Integer getCtblTableSize() {
		return ctblTableSize;
	}

	public void setCtblTableSize(Integer ctblTableSize) {
		this.ctblTableSize = ctblTableSize;
	}

	public String getCtblAdditional() {
		return ctblAdditional;
	}

	public void setCtblAdditional(String ctblAdditional) {
		this.ctblAdditional = ctblAdditional == null ? null : ctblAdditional.trim();
	}

	public Integer getCtblPtblId() {
		return ctblPtblId;
	}

	public void setCtblPtblId(Integer ctblPtblId) {
		this.ctblPtblId = ctblPtblId;
	}

	public String getCtblStatus() {
		return ctblStatus;
	}

	public void setCtblStatus(String ctblStatus) {
		this.ctblStatus = ctblStatus == null ? null : ctblStatus.trim();
	}

	public Integer getCtblSlaveId() {
		return ctblSlaveId;
	}

	public void setCtblSlaveId(Integer ctblSlaveId) {
		this.ctblSlaveId = ctblSlaveId;
	}

	public Date getCtblSlaveCreated() {
		return ctblSlaveCreated;
	}

	public void setCtblSlaveCreated(Date ctblSlaveCreated) {
		this.ctblSlaveCreated = ctblSlaveCreated;
	}

	public Date getCtblSlaveModified() {
		return ctblSlaveModified;
	}

	public void setCtblSlaveModified(Date ctblSlaveModified) {
		this.ctblSlaveModified = ctblSlaveModified;
	}

	public Integer getCtblSyncId() {
		return ctblSyncId;
	}

	public void setCtblSyncId(Integer ctblSyncId) {
		this.ctblSyncId = ctblSyncId;
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
		sb.append(", ctblId=").append(ctblId);
		sb.append(", ctblOletId=").append(ctblOletId);
		sb.append(", ctblChksId=").append(ctblChksId);
		sb.append(", ctblTable=").append(ctblTable);
		sb.append(", ctblTableExt=").append(ctblTableExt);
		sb.append(", ctblTableSize=").append(ctblTableSize);
		sb.append(", ctblAdditional=").append(ctblAdditional);
		sb.append(", ctblPtblId=").append(ctblPtblId);
		sb.append(", ctblStatus=").append(ctblStatus);
		sb.append(", ctblSlaveId=").append(ctblSlaveId);
		sb.append(", ctblSlaveCreated=").append(ctblSlaveCreated);
		sb.append(", ctblSlaveModified=").append(ctblSlaveModified);
		sb.append(", ctblSyncId=").append(ctblSyncId);
		sb.append(", created=").append(created);
		sb.append(", modified=").append(modified);
		sb.append(", serialVersionUID=").append(serialVersionUID);
		sb.append("]");
		return sb.toString();
	}
}