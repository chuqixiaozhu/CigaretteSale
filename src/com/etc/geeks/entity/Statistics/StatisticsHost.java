package com.etc.geeks.entity.Statistics;

import java.util.Calendar;

public class StatisticsHost {
	/**
	 * 属性
	 */
	private String  statisticHostId;					//统计主表ID
	private Calendar	cal;							//统计时间
	private String  userId;								//统计者ID
	
	/**
	 * get & set function
	 * @return
	 */
	public String getStatisticHostId() {
		return statisticHostId;
	}
	public void setStatisticHostId(String statisticHostId) {
		this.statisticHostId = statisticHostId;
	}
	public Calendar getCalendar() {
		return cal;
	}
	public void setCalendar(Calendar cal) {
		this.cal = cal;
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
	public StatisticsHost(String statisticHostId, Calendar cal, String userId) {
		super();
		this.statisticHostId = statisticHostId;
		this.cal = cal;
		this.userId = userId;
	}
	
	/**
	 * generator using super
	 */
	public StatisticsHost() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
