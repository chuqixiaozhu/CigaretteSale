package com.etc.geeks.dao.GoodsInformation;

import java.util.Date;
import java.util.List;

import com.etc.geeks.entity.GoodsInformation.ChangePriceHost;



public interface ChangePriceHostDao {
	/**
	 * 添加一条记录
	 * @param user
	 * @return
	 */
	public abstract int addChPrHost(ChangePriceHost chPrHost);
	/**
	 * 删除某条特定ID对应的记录
	 * @param userId
	 * @return
	 */
	public abstract int deleteById(String chprHostId);
	/**
	 * 更新某条记录，ID不能修改
	 * @param user
	 * @return
	 */
	public abstract int updateChPrHost(ChangePriceHost chPriHost);
	
	/**
	 * 返回由ID找到的对象
	 * @param userId
	 * @return
	 */
	public abstract ChangePriceHost findById(String goodsId);
	/**
	 * 返回所有对象
	 * @return
	 */
	public abstract List<ChangePriceHost> findAllChPrHost();
	
	/**
	 * 
	 * @param startDate
	 * @param endDate
	 * @return
	 */
	public abstract List<ChangePriceHost> findByDate(Date startDate, Date endDate);
}
