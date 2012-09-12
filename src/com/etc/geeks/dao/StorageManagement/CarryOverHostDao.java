package com.etc.geeks.dao.StorageManagement;

import java.util.List;

import com.etc.geeks.entity.StorageManagement.CarryOverHost;



public interface CarryOverHostDao {
	/**
	 * 增加一个结转主表表单
	 * @param ch
	 * @return
	 */
	public abstract int addCarryOverHost(CarryOverHost ch);
	/**
	 * 根据表单号删除一个结转主表表单信息
	 * @param carryOverHostId
	 * @return
	 */
	public abstract int deleteById(String carryOverHostId);
	
	/**
	 * 更新一个结转主表表单信息
	 * @param ch
	 * @return
	 */
	public abstract int updateCarryOverHost(CarryOverHost ch);
	
	/**
	 * 根据表单ID查找一个结转主表表单信息
	 * @param carryOverHostId
	 * @return
	 */
	public abstract CarryOverHost findById(String carryOverHostId);
	
	/**
	 * 查找所有结转主表表单信息
	 * @return
	 */
	public abstract List<CarryOverHost> findAll();
}



