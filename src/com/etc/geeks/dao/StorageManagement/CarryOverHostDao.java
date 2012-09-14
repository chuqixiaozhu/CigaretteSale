package com.etc.geeks.dao.StorageManagement;

import java.util.Date;
import java.util.List;

import com.etc.geeks.entity.StorageManagement.CarryOverHost;

/**
 * 9.14 11:00
 * @author Administrator
 *
 */

public interface CarryOverHostDao {
	/**
	 * 增加一个结转主表表单
	 * @param carryOverHost
	 * @return
	 */
	public  int addCarryOverHost(CarryOverHost carryOverHost);
	/**
	 * 根据表单号删除一个结转主表表单信息
	 * @param carryOverHostId
	 * @return
	 */
	public  int deleteByCarryOverHostId(String carryOverHostId);
	
	/**
	 * 更新一个结转主表表单信息
	 * @param carryOverHost
	 * @return
	 */
	public  int updateCarryOverHost(CarryOverHost carryOverHost);
	
	/**
	 * 根据表单ID查找一个结转主表表单信息
	 * @param carryOverHostId
	 * @return 返回相应的CarryOverHost对象，查找失败或者查找为空返回null
	 */
	public  CarryOverHost findByCarryOverHostIdId(String carryOverHostId);
	
	/**
	 * 根据统计者ID查找相应的结转主表表单信息
	 * @param userId
	 * @return 返回相应的CarryOverHost对象集合，查找失败或者查找为空返回null
	 */
	public  List<CarryOverHost> findByUserId(String userId);
	/**
	 * 根据一段时间,查找该时间段内的结转主表的所有记录
	 * @param startDate  开始时间
	 * @param endDate 结束时间
	 * @return 返回相应的CarryOverHostDate对象集合,查找失败返回null(startDate晚于endDate返回null)
	 */
	public List<CarryOverHost> findByCarryOverHostDate(Date startDate,Date endDate);
	/**
	 * 查找所有结转主表表单信息
	 * @return 返回相应的CarryOverHost对象集合，查找失败或者查找为空返回null
	 */

	public  List<CarryOverHost> findAll();
}



