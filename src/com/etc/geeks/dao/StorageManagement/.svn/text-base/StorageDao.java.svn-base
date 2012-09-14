package com.etc.geeks.dao.StorageManagement;

import java.util.List;

import com.etc.geeks.entity.StorageManagement.Storage;
/**
 * 9.14 11:00
 * @author Administrator
 *
 */
public interface StorageDao {
	/**
	 * 向库存信息表增加一条库存信息
	 * 
	 * @param storage
	 * @return 返回操作所影响的记录条数,返回0表示操作失败
	 */
	public int addStorage(Storage storage);

	/**
	 * 根据表单号删除一条库存信息表单信息
	 * 
	 * @param goodsId
	 * @return 返回操作所影响的记录条数,返回0表示操作失败
	 */
	public int deleteByGoodsId(String goodsId);

	/**
	 * 更新一个库存信息表单信息
	 * 
	 * @param storage
	 * @return 返回操作所影响的记录条数,返回0表示操作失败
	 */
	public int updateStorage(Storage storage);

	/**
	 * 根据表单ID查找一个库存信息表单信息
	 * 
	 * @param goodsId
	 * @return 返回相应的Storage对象,查找失败返回null
	 */
	public Storage findByGoodsId(String goodsId);

	/**
	 * 查找所有库存信息表单信息
	 * 
	 * @return 返回相应的Storage对象集合,查找失败返回null
	 */
	public List<Storage> findAll();

}
