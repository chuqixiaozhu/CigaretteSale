package com.etc.geeks.entity.StorageManagement;


import java.util.Date;
/**
 * 9.14 11:00 
 * @author Administrator
 *
 */
public class CarryOverHost {
	private String carryOverHostId;//统计主表ID
	private String userId;//统计者ID
	private Date carryOverHostDate;//统计时间
	public CarryOverHost() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CarryOverHost(String carryOverHostId, String userId,
			Date carryOverHostDate) {
		super();
		this.carryOverHostId = carryOverHostId;
		this.userId = userId;
		this.carryOverHostDate = carryOverHostDate;
	}
	public String getCarryOverHostId() {
		return carryOverHostId;
	}
	public void setCarryOverHostId(String carryOverHostId) {
		this.carryOverHostId = carryOverHostId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public Date getCarryOverHostDate() {
		return carryOverHostDate;
	}
	public void setCarryOverHostDate(Date carryOverHostDate) {
		this.carryOverHostDate = carryOverHostDate;
	}
	@Override
	public String toString() {
		return "CarryOverHost [carryOverHostDate=" + carryOverHostDate
				+ ", carryOverHostId=" + carryOverHostId + ", userId=" + userId
				+ "]";
	}
	


	
}
