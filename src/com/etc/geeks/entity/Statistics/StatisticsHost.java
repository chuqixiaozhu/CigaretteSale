package com.etc.geeks.entity.Statistics;

import java.util.Date;

public class StatisticsHost {
	/**
	 * 属性
	 */
	private String  statisticsHostId;					//统计主表ID
	private Date	statisticsDate;							//统计时间
	private String  userId;								//统计者ID
	
	/**
	 * get & set function
	 * @return
	 */
	public String getStatisticsHostId() {
		return statisticsHostId;
	}
	public void setStatisticsHostId(String statisticsHostId) {
		this.statisticsHostId = statisticsHostId;
	}
	public Date getDate() {
		return statisticsDate;
	}
	public void setDate(Date statisticsDate) {
		this.statisticsDate = statisticsDate;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	/**
	 * generator using properties
	 * @param statisticHostId
	 * @param date
	 * @param userId
	 */
	public StatisticsHost(String statisticsHostId, Date statisticsDate, String userId) {
		super();
		this.statisticsHostId = statisticsHostId;
		this.statisticsDate = statisticsDate;
		this.userId = userId;
		
		
	}
	
	/**
	 * generator using super
	 */
	public StatisticsHost() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "StatisticsHost [statisticHostId=" + statisticsHostId
				+ ", statisticsDate=" + statisticsDate + ", userId=" + userId
				+ "]";
	}
	
	
	
	
}
