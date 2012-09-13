package com.etc.geeks.entity.StorageManagement;


import java.util.Date;

public class InStoreHost {
	private String checkerId;//审核人ID
	private String checkFlag;//审核标志
	private String supplierId;//供应商ID
	private String inStoreHostId;//入库信息主表ID
	
	private Date inStoreDate;//入库日期
	private Date checkDate;//审核日期
	public String getCheckerId() {
		return checkerId;
	}
	public void setCheckerId(String checkerId) {
		this.checkerId = checkerId;
	}
	public String getCheckFlag() {
		return checkFlag;
	}
	public void setCheckFlag(String checkFlag) {
		this.checkFlag = checkFlag;
	}
	public String getSupplierId() {
		return supplierId;
	}
	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}
	public String getInStoreHostId() {
		return inStoreHostId;
	}
	public void setInStoreHostId(String inStoreHostId) {
		this.inStoreHostId = inStoreHostId;
	}
	public Date getInStoreDate() {
		return inStoreDate;
	}
	public void setInStoreDate(Date inStoreDate) {
		this.inStoreDate = inStoreDate;
	}
	public Date getCheckDate() {
		return checkDate;
	}
	public void setCheckDate(Date checkDate) {
		this.checkDate = checkDate;
	}
	@Override
	public String toString() {
		return "InStoreHost [checkDate=" + checkDate + ", checkFlag="
				+ checkFlag + ", checkerId=" + checkerId + ", inStoreDate="
				+ inStoreDate + ", inStoreHostId=" + inStoreHostId
				+ ", supplierId=" + supplierId + "]";
	}
	public InStoreHost(String checkerId, String checkFlag, String supplierId,
			String inStoreHostId, Date inStoreDate, Date checkDate) {
		super();
		this.checkerId = checkerId;
		this.checkFlag = checkFlag;
		this.supplierId = supplierId;
		this.inStoreHostId = inStoreHostId;
		this.inStoreDate = inStoreDate;
		this.checkDate = checkDate;
	}
	public InStoreHost() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	
}
