package com.etc.geeks.dao.StorageManagement;

import java.util.Date;
import java.util.List;

import com.etc.geeks.entity.StorageManagement.InStoreHost;
/**
 * 9.14 11:00
 * @author Administrator
 *
 */
public interface InStoreHostDao {
	/**
	 * 增加一个入库信息主表表单
	 * @param inStoreHost
	 * @return
	 */
	public  int addInStoreHost(InStoreHost inStoreHost);
	/**
	 * 根据入库信息表ID删除一个入库信息主表表单信息
	 * @param inStoreHostId
	 * @return
	 */
	public  int deleteByInStoreHostId(String inStoreHostId);
	
	/**
	 * 更新一个入库信息主表表单信息
	 * @param inStoreHost
	 * @return
	 */
	public  int updateInStoreHost(InStoreHost inStoreHost);
	
	/**
	 * 根据入库信息表ID查找一个入库信息主表表单信息
	 * @param inStoreHostId
	 * @return
	 */
	public  InStoreHost findByInStoreHostId(String inStoreHostId);
	
	/**
	 * 根据供应商ID查找对应的入库信息主表表单信息
	 * @param supplierId
	 * @return
	 */
	public  List<InStoreHost> findBySupplierId(String supplierId);
	
	/**
	 * 根据审核人ID查找对应的入库信息主表表单信息
	 * @param checkerId
	 * @return
	 */
	public  List<InStoreHost> findByCheckerId(String checkerId);
	/**
	 * 根据一段时间,查找该时间段内入库的销售信息主表的所有记录
	 * @param startDate  开始时间
	 * @param endDate 结束时间
	 * @return 返回相应的InStoreHost对象集合,查找失败返回null(startDate晚于endDate返回null)
	 */
	public List<InStoreHost> findByInStoreDate(Date startDate,Date endDate);
	
	/**
	 * 根据一段时间,查找该时间段内审核的销售信息主表的所有记录
	 * @param startDate  开始时间
	 * @param endDate 结束时间
	 * @return 返回相应的InStoreHost对象集合,查找失败返回null(startDate晚于endDate返回null)
	 */
	public List<InStoreHost> findByCheckDate(Date startDate,Date endDate);
	
	/**
	 * 查找所有入库信息主表表单信息
	 * @return
	 */
	public  List<InStoreHost> findAll();

}
