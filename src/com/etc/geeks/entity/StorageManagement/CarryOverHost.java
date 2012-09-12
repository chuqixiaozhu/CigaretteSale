package com.etc.geeks.entity.StorageManagement;

import java.util.Calendar;

public class CarryOverHost {
	private String userId;
	private Calendar date;
	private String carryOverHostId;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public Calendar getDate() {
		return date;
	}
	public void setDate(Calendar date) {
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
	public CarryOverHost(String userId, Calendar date, String carryOverHostId) {
		super();
		this.userId = userId;
		this.date = date;
		this.carryOverHostId = carryOverHostId;
	}

	
}
