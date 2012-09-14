package com.etc.geeks.dao.GoodsInformation;

import java.util.List;
import com.etc.geeks.entity.GoodsInformation.Unit;

public interface UnitDao {
	/**
	 * 添加一条记录
	 * @param user
	 * @return
	 */
	public abstract int addUnit(Unit unit);
	/**
	 * 删除某条特定ID对应的记录
	 * @param userId
	 * @return
	 */
	public abstract int deleteByUnit(String unit);
	/**
	 * 更新某条记录，ID不能修改
	 * @param user
	 * @return
	 */
	public abstract int updateUnit(Unit unit);
	/**
	 * 返回由名称找到的对象
	 * @param userName
	 * @return
	 */
	public abstract Unit findByUnit(String unit);
	/**
	 * 返回所有对象
	 * @return
	 */
	public abstract List<Unit> findAllUnit();
}
