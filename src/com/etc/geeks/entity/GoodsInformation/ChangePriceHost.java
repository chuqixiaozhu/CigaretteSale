package com.etc.geeks.entity.GoodsInformation;


import java.util.Date;


public class ChangePriceHost {
	private String changePriceHostId;//	调价信息主表ID
	private Date validDate;//	生效日期(通过审核的日期)
	private Date startDate;//	调价开始日期
	private Date endDate;//	调价结束日期
	public ChangePriceHost() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ChangePriceHost(String changePriceHostId, Date validDate,
			Date startDate, Date endDate) {
		super();
		this.changePriceHostId = changePriceHostId;
		this.validDate = validDate;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	public String getChangePriceHostId() {
		return changePriceHostId;
	}
	public void setChangePriceHostId(String changePriceHostId) {
		this.changePriceHostId = changePriceHostId;
	}
	public Date getValidDate() {
		return validDate;
	}
	public void setValidDate(Date validDate) {
		this.validDate = validDate;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	@Override
	public String toString() {
		return "ChangePriceHost [changePriceHostId=" + changePriceHostId
				+ ", endDate=" + endDate + ", startDate=" + startDate
				+ ", validDate=" + validDate + "]";
	}

}
