package com.etc.geeks.dao.SystemManagement;

import java.util.List;

import com.etc.geeks.entity.SystemManagement.ShiftHost;

public interface ShiftHostDao {
	/**
	 * 以ID判断是否存在
	 * @param shiftId
	 * @return
	 */
	//public abstract boolean isExistById(String shiftId);
	/**
	 * 添加一条记录
	 * @param shift
	 * @return
	 */
	public abstract int addShiftHost(ShiftHost shiftHost);
	/**
	 * 删除某条特定ID对应的记录
	 * @param shiftId
	 * @return
	 */
	public abstract int deleteById(String shiftHostId);
	/**
	 * 更新某条记录，ID不能修改
	 * @param shift
	 * @return
	 */
	public abstract int updateShiftHost(ShiftHost shiftHost);
	/**
	 * 返回由ID找到的对象
	 * @param shiftId
	 * @return
	 */
	public abstract ShiftHost findById(String shiftHostId);
	/**
	 * 返回所有对象
	 * @return
	 */
	public abstract List<ShiftHost> findAllShiftHost();
}
