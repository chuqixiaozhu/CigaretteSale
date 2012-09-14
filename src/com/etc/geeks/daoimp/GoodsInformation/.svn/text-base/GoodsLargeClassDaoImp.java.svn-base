package com.etc.geeks.daoimp.GoodsInformation;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import oracle.jdbc.rowset.OracleCachedRowSet;

import com.etc.geeks.dao.GoodsInformation.GoodsLargeClassDao;
import com.etc.geeks.entity.GoodsInformation.GoodsLargeClass;
import com.etc.geeks.util.DbOperation;

public class GoodsLargeClassDaoImp implements GoodsLargeClassDao {

	public int addGoLargeCl(GoodsLargeClass goLargeCl) {
		String sql = "insert into GoodsLargeClass values(?, ?)";
		Object[] objects = new Object[]{
				goLargeCl.getGoodsLargeClassId(), goLargeCl.getGoodsLargeClassName()
				};
		int result = DbOperation.executeUpdate(sql, objects);
		return result;
	}

	public int deleteById(String goLargeClId) {
		int result = DbOperation.executeUpdate(
				"delete from GoodsLargeClass where goodsLargeClassId = ?", new Object[] { goLargeClId });
		return result;
	}

	public int updateGoLargeCl(GoodsLargeClass goLargeCl) {
		String sql = "update GoodsLargeClass set goodsLargeClassName = ? " +
				"where goodsLargeClassId = '" + goLargeCl.getGoodsLargeClassId() + "'";
		Object[] objects = new Object[]{
				goLargeCl.getGoodsLargeClassName()
		};
		int result = DbOperation.executeUpdate(sql, objects);
		return result;
	}

	public GoodsLargeClass findByName(String goLargeClName) {
		String sql = "select * from GoodsLargeClass where goodsLargeClassName = ?";
		Object[] objects = new Object[]{goLargeClName};
		OracleCachedRowSet ocrs = DbOperation.executeQuery(sql, objects);
		GoodsLargeClass goLargeCl = null;
		try {
			if(ocrs.next()) {
				goLargeCl = new GoodsLargeClass(
						ocrs.getString(1), ocrs.getString(2)
						);
			}
			return goLargeCl;
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

	public GoodsLargeClass findById(String goLargeClId) {
		String sql = "select * from GoodsLargeClass where goodsLargeClassId = ?";
		Object[] objects = new Object[]{goLargeClId};
		OracleCachedRowSet ocrs = DbOperation.executeQuery(sql, objects);
		GoodsLargeClass goLargeCl = null;
		try {
			if(ocrs.next()) {
				goLargeCl = new GoodsLargeClass(
						ocrs.getString(1), ocrs.getString(2)
						);
			}
			return goLargeCl;
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

	public List<GoodsLargeClass> findAllGoLargeCl() {
		String sql = "select * from GoodsLargeClass";
		OracleCachedRowSet ocrs = DbOperation.executeQuery(sql, null);
		List<GoodsLargeClass> list = new ArrayList<GoodsLargeClass>();
		try {
			while(ocrs.next()) {
				GoodsLargeClass goLargeCl = new GoodsLargeClass(
						ocrs.getString(1), ocrs.getString(2)
						);
				list.add(goLargeCl);
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
