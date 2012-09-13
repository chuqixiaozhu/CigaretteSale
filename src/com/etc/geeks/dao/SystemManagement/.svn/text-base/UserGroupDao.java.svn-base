package com.etc.geeks.dao.SystemManagement;

import java.util.List;

import com.etc.geeks.entity.SystemManagement.UserGroup;

public interface UserGroupDao {
	/**
	 * 以ID判断是否存在
	 * @param userGroupId
	 * @return
	 */
	//public abstract boolean isExistById(String userGroupId);
	/**
	 * 添加一条记录
	 * @param userGroup
	 * @return
	 */
	public abstract int addUserGroup(UserGroup userGroup);
	/**
	 * 删除某条特定ID对应的记录
	 * @param userGroupId
	 * @return
	 */
	public abstract int deleteById(String userGroupId);
	/**
	 * 更新某条记录，ID不能修改
	 * @param user
	 * @return
	 */
	public abstract int updateUserGroup(UserGroup userGroup);
	/**
	 * 返回由名称找到的对象
	 * @param userGroupName
	 * @return
	 */
	public abstract UserGroup findByGroupName(String userGroupName);
	/**
	 * 返回由ID找到的对象
	 * @param userGroupId
	 * @return
	 */
	public abstract UserGroup findById(String userGroupId);
	/**
	 * 返回由权限ID找到的对象
	 * @param authorityId
	 * @return
	 */
	public abstract UserGroup findByAuthorityId(String authorityId);
	/**
	 * 返回所有对象
	 * @return
	 */
	public abstract List<UserGroup> findAllUsers();
}
