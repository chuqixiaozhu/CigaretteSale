package com.etc.geeks.daoimp.GoodsInformation;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import oracle.jdbc.rowset.OracleCachedRowSet;

import com.etc.geeks.dao.GoodsInformation.GoodsSmallClassDao;
import com.etc.geeks.entity.GoodsInformation.GoodsSmallClass;
import com.etc.geeks.util.DbOperation;

public class GoodsSmallClassDaoImp implements GoodsSmallClassDao {

	public int addGoSmallCl(GoodsSmallClass goSmallCl) {
		String sql = "insert into GoodsLargeClass values(?, ?, ?)";
		Object[] objects = new Object[]{
				goSmallCl.getGoodsSmallClassId(), goSmallCl.getGoodsLargeClassId(), 
				goSmallCl.getGoodsSmallClassName()
				};
		int result = DbOperation.executeUpdate(sql, objects);
		return result;
	}

	public int deleteById(String goSmallClId) {
		int result = DbOperation.executeUpdate(
				"delete from GoodsSmallClass where goodsSmallClassId = ?", new Object[] { goSmallClId });
		return result;
	}

	public int updateGoSmallCl(GoodsSmallClass goSmallCl) {
		String sql = "update GoodsSmallClass set goodsLargeClassId = ?, goodsSmallClassName = ? " +
				"where goodsSmallClassId = '" + goSmallCl.getGoodsLargeClassId() + "'";
		Object[] objects = new Object[]{
				goSmallCl.getGoodsLargeClassId(), goSmallCl.getGoodsSmallClassName()
		};
		int result = DbOperation.executeUpdate(sql, objects);
		return result;
	}

	public GoodsSmallClass findByName(String goSmallClName) {
		String sql = "select * from GoodsSmallClass where goodsSmallClassName = ?";
		Object[] objects = new Object[]{goSmallClName};
		OracleCachedRowSet ocrs = DbOperation.executeQuery(sql, objects);
		GoodsSmallClass goSmallCl = null;
		try {
			if(ocrs.next()) {
				goSmallCl = new GoodsSmallClass(
						ocrs.getString(1), ocrs.getString(2),
						ocrs.getString(3)
						);
			}
			return goSmallCl;
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

	public GoodsSmallClass findById(String goSmallClId) {
		String sql = "select * from GoodsSmallClass where goodsSmallClassId = ?";
		Object[] objects = new Object[]{goSmallClId};
		OracleCachedRowSet ocrs = DbOperation.executeQuery(sql, objects);
		GoodsSmallClass goSmallCl = null;
		try {
			if(ocrs.next()) {
				goSmallCl = new GoodsSmallClass(
						ocrs.getString(1), ocrs.getString(2),
						ocrs.getString(3)
						);
			}
			return goSmallCl;
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

	public List<GoodsSmallClass> findAllGoSmallCl() {
		String sql = "select * from GoodsSmallClass";
		OracleCachedRowSet ocrs = DbOperation.executeQuery(sql, null);
		List<GoodsSmallClass> list = new ArrayList<GoodsSmallClass>();
		try {
			while(ocrs.next()) {
				GoodsSmallClass goSmallCl = new GoodsSmallClass(
						ocrs.getString(1), ocrs.getString(2),
						ocrs.getString(3)
						);
				list.add(goSmallCl);
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
