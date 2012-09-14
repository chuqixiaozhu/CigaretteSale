package com.etc.geeks.entity.GoodsSale;

import java.util.Date;

public class SalesHost {

	Date salesHostDate=null;   //销售日期
	String salesHostId=null;   //销售信息主表ID
	String userId=null;        //销售员ID
	public SalesHost() { 
		super();
		// TODO Auto-generated constructor stub
	}
	public SalesHost(Date salesHostDate, String salesHostId, String userId) {
		super();
		this.salesHostDate = salesHostDate;
		this.salesHostId = salesHostId;
		this.userId = userId;
	}
	public Date getSalesHostDate() {
		return salesHostDate;
	}
	public void setSalesHostDate(Date salesHostDate) {
		this.salesHostDate = salesHostDate;
	}
	public String getSalesHostId() {
		return salesHostId;
	}
	public void setSalesHostId(String salesHostId) {
		this.salesHostId = salesHostId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	@Override
	public String toString() {
		return "SalesHost [salesHostDate=" + salesHostDate + ", salesHostId="
				+ salesHostId + ", userId=" + userId + "]";
	}

	
	
	
}
