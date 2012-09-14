package com.etc.geeks.util;

import java.util.List;

import com.etc.geeks.dao.GoodsInformation.GoodsDao;
import com.etc.geeks.daoimp.GoodsInformation.GoodsDaoImp;
import com.etc.geeks.entity.GoodsInformation.Goods;

public class TestForGoodsInformation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		GoodsDao goodsDao = new GoodsDaoImp();
		/*List<Goods> list = null;
		list = goodsDao.findAllGoods();
		for(Goods t : list) {
			System.out.println(t);
		}*/
		
		
/*findById
		 * Goods goods = goodsDao.findById("002");
		if(goods != null) {
			System.out.println(goods.toString());
		} else {
			System.out.println("can't find.");
		}*/
		
/*增加*/
		
		Goods newGoods = new Goods("极品芙蓉王",
				"01", "01",
				"03", "001",
				"100mm", "0925113012",
				null, null,
				"条", 120,
				150, 120
		);
		goodsDao.addGoods(newGoods);

		List<Goods> list = null;
		list = goodsDao.findAllGoods();
		for(Goods t : list) {
			System.out.println(t);
		}
		/**/
		
/*更新
		Goods change = new Goods("003", "芙蓉王",
				"01", "01",
				"03", "001",
				"100mm", "0925113012",
				null, null,
				"箱", 120,
				150, 120);
		goodsDao.updateGoods(change);
		list = goodsDao.findAllGoods();
		for(Goods t : list) {
			System.out.println(t);
		}*/
		/*goodsDao.deleteById("003");*/
		
		
		
/*findByName
		Goods goods = goodsDao.findByName("中华");
		if(goods != null) {
			System.out.println(goods.toString());
		} else {
			System.out.println("can't find.");
		}*/
		/*List<Goods> list = null;
		list = goodsDao.findAllGoods();
		for(Goods t : list) {
			System.out.println(t);
		}*/
		
		
		/*SheetId.setPre("Gedt");
		for(int i = 0; i < 10; ++i) {
			System.out.println(SheetId.getSheetId());
		}
		System.out.println("* " + SheetId.getSheetId());*/
		
	}

}
