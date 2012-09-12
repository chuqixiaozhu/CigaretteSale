package com.etc.geeks.entity.StorageManagement;

import java.util.Calendar;

public class InStoreHost {
	private String checkerId;
	private String checkFlag;
	private String supplierId;
	private String inStoreHostId;
	
	private Calendar inStoreDate;
	private Calendar checkDate;
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
	public Calendar getInStoreDate() {
		return inStoreDate;
	}
	public void setInStoreDate(Calendar inStoreDate) {
		this.inStoreDate = inStoreDate;
	}
	public Calendar getCheckDate() {
		return checkDate;
	}
	public void setCheckDate(Calendar checkDate) {
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
			String inStoreHostId, Calendar inStoreDate, Calendar checkDate) {
		super();
		this.checkerId = checkerId;
		this.checkFlag = checkFlag;
		this.supplierId = supplierId;
		this.inStoreHostId = inStoreHostId;
		this.inStoreDate = inStoreDate;
		this.checkDate = checkDate;
	}

	
}
