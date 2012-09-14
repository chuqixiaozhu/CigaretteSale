package com.etc.geeks.dao.StorageManagement;

import java.util.List;

import com.etc.geeks.entity.StorageManagement.CarryOverGuest;
/**
 * 9.14 11:00
 * @author Administrator
 *
 */
public interface CarryOverGuestDao {
	/**
	 * 增加一个结转从表单
	 * @param carryOverGuest
	 * @return
	 */
	public  int addCarryOverGuest(CarryOverGuest carryOverGuest);
	
	/**
	 * 根据表单ID删除表单
	 * @param carryOverGuestId
	 * @return
	 */
	public  int deleteByCarryOverGuestId(String carryOverGuestId);
	
	/**
	 * 更新表单
	 * @param carryOverGuest
	 * @return
	 */
	public  int updateCarryOverGuest(CarryOverGuest carryOverGuest);
	
	/**
	 * 根据结转信息从表ID,查找结转信息从表内的相应信息
	 * 
	 * @param carryOverGuestId
	 * @return 返回对应的CarryOverGuest对象 ，查找失败或者查找为空返回null
	 */
	public CarryOverGuest findByCarryOverGuestId(String carryOverGuestId);
	/**
	 * 根据结转信息主表ID,查找结转信息从表内的相应信息
	 * 
	 * @param carryOverHostId
	 * @return 返回对应的CarryOverGuest集合 ，查找失败或者查找为空返回null
	 */
	public List<CarryOverGuest> findByCarryOverHostId(String carryOverHostId);
	/**
	 * 根据商品ID,查找结转信息从表内的相应信息
	 * 
	 * @param goodsId
	 * @return 返回对应的CarryOverGuest集合 ，查找失败或者查找为空返回null
	 */
	public List<CarryOverGuest> findByGoodsId(String goodsId);

	/**
	 * 查找结转信息从表内的所有信息
	 * 
	 * @return 返回对应的CarryOverGuest集合 ，查找失败或者查找为空返回null
	 */
	public  List<CarryOverGuest> findAll();

}

	

