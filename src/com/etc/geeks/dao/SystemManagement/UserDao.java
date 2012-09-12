package com.etc.geeks.dao.SystemManagement;

import java.util.List;

import com.etc.geeks.entity.SystemManagement.User;

public interface UserDao {
	/**
	 * 以ID判断是否存在
	 * @param userId
	 * @return
	 */
	//public abstract boolean isExistById(String userId);
	/**
	 * 添加一条记录
	 * @param user
	 * @return
	 */
	public abstract int addUser(User user);
	/**
	 * 删除某条特定ID对应的记录
	 * @param userId
	 * @return
	 */
	public abstract int deleteById(String userId);
	/**
	 * 更新某条记录，ID不能修改
	 * @param user
	 * @return
	 */
	public abstract int updateUser(User user);
	/**
	 * 返回由名称找到的对象
	 * @param userName
	 * @return
	 */
	public abstract User findByName(String userName);
	/**
	 * 返回由ID找到的对象
	 * @param userId
	 * @return
	 */
	public abstract User findById(String userId);
	/**
	 * 返回所有对象
	 * @return
	 */
	public abstract List<User> findAllUsers();
}
