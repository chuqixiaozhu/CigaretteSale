package com.etc.geeks.entity.GoodsSale;

import java.util.Calendar;
import java.util.Date;

public class SalesHost {

	Date date=null;
	String saleHostId=null;
	String userId=null;
	public SalesHost() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SalesHost(Date date, String saleHostId, String userId) {
		super();
		this.date = date;
		this.saleHostId = saleHostId;
		this.userId = userId;
	}

	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getSaleHostId() {
		return saleHostId;
	}
	public void setSaleHostId(String saleHostId) {
		this.saleHostId = saleHostId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	
	
}
