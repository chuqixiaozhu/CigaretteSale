package com.etc.geeks.entity.SystemManagement;

public class Shift {

	private String shiftId;//班次ID
	private String startTime;//上班时间
	private String endTime;//下班时间
	public String getShiftId() {
		return shiftId;
	}
	public void setShiftId(String shiftId) {
		this.shiftId = shiftId;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	@Override
	public String toString() {
		return "Shift [endTime=" + endTime + ", shiftId=" + shiftId
				+ ", startTime=" + startTime + "]";
	}
	public Shift(String shiftId, String startTime, String endTime) {
		super();
		this.shiftId = shiftId;
		this.startTime = startTime;
		this.endTime = endTime;
	}
	public Shift() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
