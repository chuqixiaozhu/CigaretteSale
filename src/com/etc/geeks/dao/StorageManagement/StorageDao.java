package com.etc.geeks.dao.StorageManagement;

import java.util.List;

import com.etc.geeks.entity.StorageManagement.Storage;

public interface StorageDao {
	/**
	 * 增加一个库存信息表单
	 * @param se
	 * @return
	 */
	public abstract int addStorage(Storage se);
	/**
	 * 根据表单号删除一个库存信息表单信息
	 * @param goodsId
	 * @return
	 */
	public abstract int deleteById(String goodsId);
	
	/**
	 * 更新一个库存信息表单信息
	 * @param se
	 * @return
	 */
	public abstract int updateStorage(Storage se);
	
	/**
	 * 根据表单ID查找一个库存信息表单信息
	 * @param goodsId
	 * @return
	 */
	public abstract Storage findById(String goodsId);
	
	/**
	 * 查找所有库存信息表单信息
	 * @return
	 */
	public abstract List<Storage> findAll();


}
