package com.etc.geeks.daoimp.GoodsInformation;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import oracle.jdbc.rowset.OracleCachedRowSet;

import com.etc.geeks.dao.GoodsInformation.GoodsDao;
import com.etc.geeks.entity.GoodsInformation.Goods;
import com.etc.geeks.util.DbOperation;
import com.etc.geeks.util.PageBean;

public class GoodsDaoImp implements GoodsDao {

	public int addGoods(Goods goods) {
		String sql = "insert into Goods values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		Object[] objects = new Object[]{
				goods.getGoodsId(), goods.getGoodsName(),
				goods.getSupplierId(), goods.getGoodsLargeClassId(),
				goods.getGoodsSmallClassId(), goods.getGoodsCode(),
				goods.getGoodsSize(), goods.getBarCode1(),
				goods.getBarCode2(), goods.getBarCode3(),
				goods.getUnit(), goods.getWholeSalePrice(),
				goods.getRetailPrice(), goods.getMemberprice()
				};
		int result = DbOperation.executeUpdate(sql, objects);
		return result;
		
	}

	public int deleteById(String goodsId) {
		int result = DbOperation.executeUpdate(
				"delete from Goods where goodsId = ?", new Object[] { goodsId });
		return result;
	}

	public List<Goods> findAllGoods() {
		String sql = "select * from Goods";
		OracleCachedRowSet ocrs = DbOperation.executeQuery(sql, null);
		List<Goods> list = new ArrayList<Goods>();
		try {
			while(ocrs.next()) {
				Goods goods = new Goods(
						ocrs.getString(1), ocrs.getString(2),
						ocrs.getString(3), ocrs.getString(4),
						ocrs.getString(5), ocrs.getString(6),
						ocrs.getString(7), ocrs.getString(8),
						ocrs.getString(9), ocrs.getString(10),
						ocrs.getString(11), ocrs.getDouble(12),
						ocrs.getDouble(13), ocrs.getDouble(14)
						);
				list.add(goods);
			}
			if(!list.isEmpty()) {
				return list;
			} else {
				return null;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				ocrs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
	}

	public Goods findById(String goodsId) {
		String sql = "select * from Goods where goodsId = ?";
		Object[] objects = new Object[]{goodsId};
		OracleCachedRowSet ocrs = DbOperation.executeQuery(sql, objects);
		Goods goods = null;
		try {
			if(ocrs.next()) {
				goods = new Goods(
						ocrs.getString(1), ocrs.getString(2),
						ocrs.getString(3), ocrs.getString(4),
						ocrs.getString(5), ocrs.getString(6),
						ocrs.getString(7), ocrs.getString(8),
						ocrs.getString(9), ocrs.getString(10),
						ocrs.getString(11), ocrs.getDouble(12),
						ocrs.getDouble(13), ocrs.getDouble(14)
						);
			}
			return goods;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				ocrs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
	}

	public Goods findByName(String goodsName) {
		String sql = "select * from Goods where goodsName = ?";
		Object[] objects = new Object[]{goodsName};
		OracleCachedRowSet ocrs = DbOperation.executeQuery(sql, objects);
		Goods goods = null;
		try {
			if(ocrs.next()) {
				goods = new Goods(
						ocrs.getString(1), ocrs.getString(2),
						ocrs.getString(3), ocrs.getString(4),
						ocrs.getString(5), ocrs.getString(6),
						ocrs.getString(7), ocrs.getString(8),
						ocrs.getString(9), ocrs.getString(10),
						ocrs.getString(11), ocrs.getDouble(12),
						ocrs.getDouble(13), ocrs.getDouble(14)
						);
			}
			return goods;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				ocrs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
	}

	public int updateGoods(Goods goods) {
		String sql = "update Goods set goodsName = ?, supplierId = ?," +
				"goodsLargeClassId = ?, goodsSmallClassId = ?," +
				"goodsCode = ?, goodsSize = ?," +
				"barCode1 = ?, barCode2 = ?," +
				"barCode3 = ?, unit = ?," +
				"wholeSalePrice = ?, retailPrice = ?," +
				"memberPrice = ? where goodsId = '" +
				goods.getGoodsId() + "'";
		Object[] objects = new Object[]{
				goods.getGoodsName(), goods.getSupplierId(),
				goods.getGoodsLargeClassId(), goods.getGoodsSmallClassId(), 
				goods.getGoodsCode(), goods.getGoodsSize(),
				goods.getBarCode1(), goods.getBarCode2(),
				goods.getBarCode3(), goods.getUnit(),
				goods.getWholeSalePrice(), goods.getRetailPrice(),
				goods.getMemberprice()
				};
		int result = DbOperation.executeUpdate(sql, objects);
		return result;
	}
	
	public List<Goods> findByPage(PageBean pageBean){
		String sql = "select * from (select gods.* ,rownum rn from (select * from Goods order by goodsId asc )gods where rownum <=?) where rn>=?";
		List<Goods> list = new ArrayList<Goods>();
		Object[] objects = new Object[]{PageBean.pageSize * pageBean.getCurrentPage(),
				PageBean.pageSize * (pageBean.getCurrentPage() - 1) + 1};
		OracleCachedRowSet ocrs = DbOperation.executeQuery(sql, objects);
		try {
			while(ocrs.next()) {
				Goods goods = new Goods(
						ocrs.getString(1), ocrs.getString(2),
						ocrs.getString(3), ocrs.getString(4),
						ocrs.getString(5), ocrs.getString(6),
						ocrs.getString(7), ocrs.getString(8),
						ocrs.getString(9), ocrs.getString(10),
						ocrs.getString(11), ocrs.getDouble(12),
						ocrs.getDouble(13), ocrs.getDouble(14)
						);
				list.add(goods);
			}
			if(!list.isEmpty()) {
				return list;
			} else {
				return null;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				ocrs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
	}
}
