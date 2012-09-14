package com.etc.geeks.dao.GoodsInformation;

import java.util.List;

import com.etc.geeks.entity.GoodsInformation.ChangePriceGuest;

public interface ChangePriceGuestDao {
	/**
	 * 添加一条记录
	 * @param user
	 * @return
	 */
	public abstract int addChPrGuest(ChangePriceGuest chPrGuest);
	/**
	 * 删除某条特定ID对应的记录
	 * @param userId
	 * @return
	 */
	public abstract int deleteById(String chprGuestId);
	/**
	 * 更新某条记录，ID不能修改
	 * @param user
	 * @return
	 */
	public abstract int updateChPrGuest(ChangePriceGuest chPriGuest);
	
	/**
	 * 返回由ID找到的对象
	 * @param userId
	 * @return
	 */
	public abstract ChangePriceGuest findById(String chPriGuestId);
	/**
	 * 返回所有对象
	 * @return
	 */
	public abstract List<ChangePriceGuest> findAllChPrGuest();
	
	
	/**
	 * 返回商品ID为goodsId的调价记录
	 * @param goodsId
	 * @return
	 */
	public abstract ChangePriceGuest findByGoodsId(String goodsId);
}
