package com.etc.geeks.entity.SystemManagement;

public class ShiftGuest {

	private String shiftHostId;//班次主表ID
	private String shiftGuestId;//班次从表ID
	private String userId;//用户ID
	public String getShiftHostId() {
		return shiftHostId;
	}
	public void setShiftHostId(String shiftHostId) {
		this.shiftHostId = shiftHostId;
	}
	public String getShiftGuestId() {
		return shiftGuestId;
	}
	public void setShiftGuestId(String shiftGuestId) {
		this.shiftGuestId = shiftGuestId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	@Override
	public String toString() {
		return "ShiftGuest [shiftGuestId=" + shiftGuestId + ", shiftHostId="
				+ shiftHostId + ", userId=" + userId + "]";
	}
	public ShiftGuest(String shiftHostId, String shiftGuestId, String userId) {
		super();
		this.shiftHostId = shiftHostId;
		this.shiftGuestId = shiftGuestId;
		this.userId = userId;
	}
	public ShiftGuest() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
