package com.etc.geeks.dao.GoodsInformation;

import java.util.List;

import com.etc.geeks.entity.GoodsInformation.GoodsLargeClass;

public interface GoodsLargeClassDao {
	/**
	 * 添加一条记录
	 * @param user
	 * @return
	 */
	public abstract int addGoLargeCl(GoodsLargeClass goLargeCl);
	/**
	 * 删除某条特定ID对应的记录
	 * @param userId
	 * @return
	 */
	public abstract int deleteById(String goLargeClId);
	/**
	 * 更新某条记录，ID不能修改
	 * @param user
	 * @return
	 */
	public abstract int updateGoLargeCl(GoodsLargeClass goLargeCl);
	/**
	 * 返回由名称找到的对象
	 * @param userName
	 * @return
	 */
	public abstract GoodsLargeClass findByName(String goLargeClName);
	/**
	 * 返回由ID找到的对象
	 * @param userId
	 * @return
	 */
	public abstract GoodsLargeClass findById(String goLargeClId);
	/**
	 * 返回所有对象
	 * @return
	 */
	public abstract List<GoodsLargeClass> findAllGoLargeCl();
}
