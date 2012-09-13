package com.etc.geeks.entity.StorageManagement;


import java.util.Date;

public class CarryOverHost {
	private String userId;//统计者ID
	private Date date;//统计时间
	private String carryOverHostId;//统计主表ID
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getCarryOverHostId() {
		return carryOverHostId;
	}
	public void setCarryOverHostId(String carryOverHostId) {
		this.carryOverHostId = carryOverHostId;
	}
	@Override
	public String toString() {
		return "CarryOverHost [carryOverHostId=" + carryOverHostId + ", date="
				+ date + ", userId=" + userId + "]";
	}
	public CarryOverHost(String userId, Date date, String carryOverHostId) {
		super();
		this.userId = userId;
		this.date = date;
		this.carryOverHostId = carryOverHostId;
	}
	public CarryOverHost() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	
}
