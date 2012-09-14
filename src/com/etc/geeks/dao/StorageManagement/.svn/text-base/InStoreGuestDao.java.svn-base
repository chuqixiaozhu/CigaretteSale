package com.etc.geeks.dao.StorageManagement;

import java.util.List;

import com.etc.geeks.entity.StorageManagement.InStoreGuest;
/**
 * 9.14 11:00
 * @author Administrator
 *
 */
public interface InStoreGuestDao {
	/**
	 * 增加一个入库信息从表单
	 * 
	 * @param ig
	 * @return
	 */
	public int addInStoreGuest(InStoreGuest inStoreGuest);

	/**
	 * 根据表单ID删除表单
	 * 
	 * @param inStoreGuestId
	 * @return
	 */
	public int deleteByInStoreGuestId(String inStoreGuestId);

	/**
	 * 更新表单
	 * 
	 * @param inStoreGuest
	 * @return
	 */
	public int updateInStoreGuest(InStoreGuest inStoreGuest);

	/**
	 * 根据入库信息从表ID,查找入库信息从表内的相应信息
	 * 
	 * @param inStoreGuestId
	 * @return 返回对应的InStoreGuest对象 ，查找失败或者查找为空返回null
	 */
	public InStoreGuest findByInStoreGuestId(String inStoreGuestId);
	/**
	 * 根据入库信息主表ID,查找入库信息从表内的相应信息
	 * 
	 * @param inStoreHostId
	 * @return 返回对应的InStoreGuest集合 ，查找失败或者查找为空返回null
	 */
	public List<InStoreGuest> findByInStoreHostId(String inStoreHostId);

	/**
	 * 根据商品ID,查找入库信息从表内的相应信息
	 * 
	 * @param goodsId
	 * @return 返回对应的InStoreGuest集合 ，查找失败或者查找为空返回null
	 */
	public List<InStoreGuest> findByGoodsId(String goodsId);

	/**
	 * 查找所有表单信息
	 * 
	 * @return 返回对应的InStoreGuest集合 ，查找失败或者查找为空返回null
	 */
	public List<InStoreGuest> findAll();

}
