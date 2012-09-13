 package com.etc.geeks.dao.GoodsSale;

import java.util.List;

import com.etc.geeks.entity.GoodsSale.SalesGuest;


public interface SalesGuestDao {
 
	/**
	 * 向销售信息从表内添加一条记录
	 * @param salesGuest
	 * @return 返回操作所影响的记录条数,返回0表示操作失败
	 */
	public int addSalesGuset(SalesGuest salesGuest);
	/**
	 * 根据销售信息从表ID,删除销售信息从表内的记录
	 * @param salesGuestId
	 * @return 返回操作所影响的记录条数,返回0表示操作失败
	 */
	public int deleteBySalesGuestId(String salesGuestId);
	/**
	 * 根据saleGuest对象,更新销售信息从表记录
	 * @param salesGuest
	 * @return 返回操作所影响的记录条数,返回0表示操作失败
	 */
	public int updateSalesGuest(SalesGuest salesGuest);
	/**
	 * 根据销售信息从表Id,查找销售信息从表内的记录
	 * @param salesGuestId
	 * @return 返回相应的SalesGuest对象,查找失败返回null
	 */
	public SalesGuest findBySalesGuestId(String salesGuestId);
	/**
	 * 根据销售信息主表Id,查找销售信息从表内的记录
	 * @param salesHostId
	 * @return 返回相应的SalesGuest对象集合,查找失败返回null
	 */
	public List<SalesGuest> findBySalesHostId(String salesHostId);
	/**
	 * 根据商品Id,查找销售信息从表内的记录
	 * @param goodsId
	 * @return 返回相应的SalesGuest对象集合,查找失败返回null
	 */
	public List<SalesGuest> findByGoodsId(String goodsId);
	/**
	 * 查找销售信息从表内的所有记录
	 * @return 返回SalesGuest对象集合
	 */
	public List<SalesGuest> findAll();
}
