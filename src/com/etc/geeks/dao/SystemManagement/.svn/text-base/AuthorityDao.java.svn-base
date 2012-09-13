package com.etc.geeks.dao.SystemManagement;

import java.util.List;

import com.etc.geeks.entity.SystemManagement.Authority;

public interface AuthorityDao {
	/**
	 * 以ID判断是否存在
	 * @param authorityId
	 * @return
	 */
	//public abstract boolean isExistById(Authority authorityId);
	/**
	 * 添加一条记录
	 * @param authority
	 * @return
	 */
	public abstract int addAuthority(Authority authority);
	/**
	 * 删除某条特定ID对应的记录
	 * @param authorityId
	 * @return
	 */
	public abstract int deleteById(String authorityId);
	/**
	 * 更新某条记录，ID不能修改
	 * @param authority
	 * @return
	 */
	public abstract int updateAuthority(Authority authority);
	/**
	 * 返回由名称找到的对象
	 * @param authorityame
	 * @return
	 */
	public abstract Authority findByAuthorityName(String authorityName);
	/**
	 * 返回由ID找到的对象
	 * @param authorityId
	 * @return
	 */
	public abstract Authority findById(String authorityId);
	/**
	 * 返回所有对象
	 * @return
	 */
	public abstract List<Authority> findAll();
}
