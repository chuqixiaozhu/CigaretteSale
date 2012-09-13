package com.etc.geeks.entity.SystemManagement;

public class ShiftHost {

	private String shiftHostId;//班次ID
	private String startTime;//上班时间
	private String endTime;//下班时间
	public String getShiftHostId() {
		return shiftHostId;
	}
	public void setShiftHostId(String shiftHostId) {
		this.shiftHostId = shiftHostId;
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
		return "Shift [endTime=" + endTime + ", shiftHostId=" + shiftHostId
				+ ", startTime=" + startTime + "]";
	}
	public ShiftHost(String shiftHostId, String startTime, String endTime) {
		super();
		this.shiftHostId = shiftHostId;
		this.startTime = startTime;
		this.endTime = endTime;
	}
	public ShiftHost() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
