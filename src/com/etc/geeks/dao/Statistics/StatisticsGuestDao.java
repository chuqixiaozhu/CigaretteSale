package com.etc.geeks.dao.Statistics;

import java.util.List;

import com.etc.geeks.entity.Statistics.StatisticsGuest;

public interface StatisticsGuestDao {
	/**
	 * 增加一个统计表单
	 * @param sg
	 * @return
	 */
	public abstract int addStatisticGuest(StatisticsGuest sg);
	
	/**
	 * 根据表单ID删除表单
	 * @param statisticGuestId
	 * @return
	 */
	public abstract int deleteById(String statisticGuestId);
	
	/**
	 * 更新表单
	 * @param sg
	 * @return
	 */
	public abstract int updateStatisticGuest(StatisticsGuest sg);
	
	/**
	 * 根据ID查找表单
	 * @param statisticGuestId
	 * @return
	 */
	public abstract StatisticsGuest findById(String statisticGuestId);
	
	/**
	 * 查找所有表单信息
	 * @return
	 */
	public abstract List<StatisticsGuest> findAll();

}
