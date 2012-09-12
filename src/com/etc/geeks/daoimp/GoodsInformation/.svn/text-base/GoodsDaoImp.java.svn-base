package com.etc.geeks.daoimp.GoodsInformation;

import java.util.List;

import com.etc.geeks.dao.GoodsInformation.GoodsDao;
import com.etc.geeks.entity.GoodsInformation.Goods;
import com.etc.geeks.util.DbOperation;

public class GoodsDaoImp implements GoodsDao {

	public int addGoods(Goods goods) {
		int result = DbOperation.executeUpdate(
				"insert into Users values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)",
				new Object[]{goods.getGoodsId(), goods.getGoodsName(),
						goods.getSupplierId(), goods.getGoodsLargeClassId(),
						goods.getGoodsSmallClassId(), goods.getGoodsCode(),
						goods.getGoodsSize(), goods.getBarCode1(),
						goods.getBarCode2(), goods.getBarCode3(),
						goods.getUnit(), goods.getWholeSalePrice(),
						goods.getRetailPrice(), goods.getMemberprice()});
		return result;
		
	}

	public int deleteById(String goodsId) {
		int result = DbOperation.executeUpdate(
				"delete from Goods where goodsId = ?", new Object[] { goodsId });
		return result;
	}

	public List<Goods> findAllGoods() {
		// TODO Auto-generated method stub
		return null;
	}

	public Goods findById(String goodsId) {
		// TODO Auto-generated method stub
		return null;
	}

	public Goods findByName(String goodsName) {
		// TODO Auto-generated method stub
		return null;
	}

	public int updateGoods(Goods goods) {
		// TODO Auto-generated method stub
		return 0;
	}

}
