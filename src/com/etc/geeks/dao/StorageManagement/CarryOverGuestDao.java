package com.etc.geeks.dao.StorageManagement;

import java.util.List;

import com.etc.geeks.entity.StorageManagement.CarryOverGuest;

public interface CarryOverGuestDao {
	/**
	 * 增加一个结转从表单
	 * @param cg
	 * @return
	 */
	public abstract int addCarryOverGuest(CarryOverGuest cg);
	
	/**
	 * 根据表单ID删除表单
	 * @param carryOverGuestId
	 * @return
	 */
	public abstract int deleteById(String carryOverGuestId);
	
	/**
	 * 更新表单
	 * @param sg
	 * @return
	 */
	public abstract int updateCarryOverGuest(CarryOverGuest cg);
	
	/**
	 * 根据ID查找表单
	 * @param carryOverGuestId
	 * @return
	 */
	public abstract CarryOverGuest findById(String carryOverGuestId);
	
	/**
	 * 查找所有表单信息
	 * @return
	 */
	public abstract List<CarryOverGuest> findAll();

}

	

