package com.etc.geeks.entity.GoodsInformation;

public class Supplier {
	private String supplierId;//	供应商ID
	private String supplierName;//	供应商名字
	private String location;//	厂址
	private String call	;//电话
	private String contactPersonName;//	联系人姓名

	public Supplier(String supplierId, String supplierName, String location,
			String call, String contactPersonName) {
		super();
		this.supplierId = supplierId;
		this.supplierName = supplierName;
		this.location = location;
		this.call = call;
		this.contactPersonName = contactPersonName;
	}
	public Supplier() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getSupplierId() {
		return supplierId;
	}
	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}
	public String getSupplierName() {
		return supplierName;
	}
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getCall() {
		return call;
	}
	public void setCall(String call) {
		this.call = call;
	}
	public String getContactPersonName() {
		return contactPersonName;
	}
	public void setContactPersonName(String contactPersonName) {
		this.contactPersonName = contactPersonName;
	}
	@Override
	public String toString() {
		return "GoodsLargeClass [call=" + call + ", contactPersonName="
				+ contactPersonName + ", location=" + location
				+ ", supplierId=" + supplierId + ", supplierName="
				+ supplierName + "]";
	}



}
