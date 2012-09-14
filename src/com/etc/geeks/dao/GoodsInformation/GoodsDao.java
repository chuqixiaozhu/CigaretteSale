package com.etc.geeks.dao.GoodsInformation;

import java.util.List;

import com.etc.geeks.entity.GoodsInformation.Goods;
import com.etc.geeks.util.PageBean;


public interface GoodsDao {
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
	public abstract int addGoods(Goods goods);
	/**
	 * 删除某条特定ID对应的记录
	 * @param userId
	 * @return
	 */
	public abstract int deleteById(String goodsId);
	/**
	 * 更新某条记录，ID不能修改
	 * @param user
	 * @return
	 */
	public abstract int updateGoods(Goods goods);
	/**
	 * 返回由名称找到的对象
	 * @param userName
	 * @return
	 */
	public abstract Goods findByName(String goodsName);
	/**
	 * 返回由ID找到的对象
	 * @param userId
	 * @return
	 */
	public abstract Goods findById(String goodsId);
	/**
	 * 返回所有对象
	 * @return
	 */
	public abstract List<Goods> findAllGoods();
	
	/**
	 * 分页查找
	 * @param pageBean
	 * @return
	 */
	public List<Goods> findByPage(PageBean pageBean);

}
