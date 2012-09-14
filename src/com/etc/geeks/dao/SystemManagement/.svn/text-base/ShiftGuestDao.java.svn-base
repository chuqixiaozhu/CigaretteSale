package com.etc.geeks.dao.SystemManagement;

import java.util.List;

import com.etc.geeks.entity.SystemManagement.ShiftGuest;

public interface ShiftGuestDao {
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
	public abstract int addShiftGuest(ShiftGuest shiftGuest);
	/**
	 * 删除某条特定ID对应的记录
	 * @param shiftId
	 * @return
	 */
	public abstract int deleteById(String shiftGuestId);
	/**
	 * 更新某条记录，ID不能修改
	 * @param shift
	 * @return
	 */
	public abstract int updateShiftGuest(ShiftGuest shiftGuest);
	/**
	 * 返回由ID找到的对象
	 * @param shiftId
	 * @return
	 */
	public abstract ShiftGuest findByGuestId(String shiftGuestId);
	/**
	 * 返回由ID找到的对象
	 * @param shiftId
	 * @return
	 */
	public abstract ShiftGuest findByHostId(String shiftHostId);
	/**
	 * 返回由ID找到的对象
	 * @param shiftId
	 * @return
	 */
	public abstract ShiftGuest findByUserId(String userId);
	/**
	 * 返回所有对象
	 * @return
	 */
	public abstract List<ShiftGuest> findAllShiftGuest();
}
