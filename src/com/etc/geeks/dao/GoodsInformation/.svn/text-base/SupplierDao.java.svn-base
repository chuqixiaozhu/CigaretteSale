package com.etc.geeks.dao.GoodsInformation;

import java.util.List;

import com.etc.geeks.entity.GoodsInformation.Supplier;

public interface SupplierDao {
	/**
	 * 添加一条记录
	 * @param user
	 * @return
	 */
	public abstract int addSupplier(Supplier supplier);
	/**
	 * 删除某条特定ID对应的记录
	 * @param userId
	 * @return
	 */
	public abstract int deleteById(String supplierId);
	/**
	 * 更新某条记录，ID不能修改
	 * @param user
	 * @return
	 */
	public abstract int updateSupplier(Supplier supplier);
	/**
	 * 返回由名称找到的对象
	 * @param userName
	 * @return
	 */
	public abstract Supplier findByName(String supplierName);
	/**
	 * 返回由ID找到的对象
	 * @param userId
	 * @return
	 */
	public abstract Supplier findById(String supplierId);
	/**
	 * 返回所有对象
	 * @return
	 */
	public abstract List<Supplier> findAllSupplier();

}
