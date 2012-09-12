package com.etc.geeks.dao.GoodsSale;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import com.etc.geeks.entity.GoodsSale.SalesGuest;
import com.etc.geeks.entity.GoodsSale.SalesHost;

public interface SalesHostDao {
	
	/**
	 * 向销售信息主表内添加记录
	 * @param salesHost 
	 * @return 返回操作所影响的记录条数,返回0表示操作失败
	 */
	public int addSalesHost(SalesHost salesHost);
	/**
	 * 根据销售信息主表ID,删除销售信息主表内的记录
	 * @param salesHostId
	 * @return 返回操作所影响的记录条数,返回0表示操作失败
	 */
	public int deleteBySalesHostId(String salesHostId);
	/**
	 * 根据saleHost对象,更新销售信息主表记录
	 * @param salesHost
	 * @return 返回操作所影响的记录条数,返回0表示操作失败
	 */
	public int updateSalesHost(SalesHost salesHost);
	/**
	 * 根据销售信息主表Id,查找销售信息主表内的记录
	 * @param saleHostId
	 * @return 返回相应的SalesHost对象,查找失败返回null
	 */
	public SalesHost findBySalesHostId(String salesHostId);
	/**
	 * 根据销售员Id,查找该销售员在销售信息主表内的所有记录
	 * @param userId
	 * @return 返回相应的SalesHost对象集合,查找失败返回null
	 */
	public List<SalesHost> findByUserId(String userId);
	/**
	 * 根据一段时间,查找该时间段内销售信息主表的所有记录
	 * @param startDate  开始时间
	 * @param endDate 结束时间
	 * @return 返回相应的SalesHost对象集合,查找失败返回null(startDate晚于endDate返回null)
	 */
	public List<SalesHost> findByDate(Date startDate,Date endDate);
	/**
	 * 查找销售信息主表内的所有记录
	 * @return 返回SalesHost对象集合
	 */
	public List<SalesHost> findAll();
	
}
