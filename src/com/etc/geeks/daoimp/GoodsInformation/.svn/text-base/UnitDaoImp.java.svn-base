package com.etc.geeks.daoimp.GoodsInformation;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import oracle.jdbc.rowset.OracleCachedRowSet;

import com.etc.geeks.dao.GoodsInformation.UnitDao;
import com.etc.geeks.entity.GoodsInformation.Unit;
import com.etc.geeks.util.DbOperation;

public class UnitDaoImp implements UnitDao{

	public int addUnit(Unit unit) {
		String sql = "insert into Goods values(?, ?)";
		Object[] objects = new Object[]{
				unit.getUnit(), unit.getUnitValue()
				};
		int result = DbOperation.executeUpdate(sql, objects);
		return result;
	}

	public int deleteByUnit(String unit) {
		int result = DbOperation.executeUpdate(
				"delete from Unit where unitId = ?", new Object[] { unit });
		return result;
	}

	public int updateUnit(Unit unit) {
		String sql = "update Unit set unitValue = ? where goodsId = '" +
				unit.getUnit() + "'";
		Object[] objects = new Object[]{
				unit.getUnitValue()
				};
		int result = DbOperation.executeUpdate(sql, objects);
		return result;
	}

	public Unit findByUnit(String unitId) {
		String sql = "select * from Unit where unit = ?";
		Object[] objects = new Object[]{unitId};
		OracleCachedRowSet ocrs = DbOperation.executeQuery(sql, objects);
		Unit unit = null;
		try {
			if(ocrs.next()) {
				unit = new Unit(
						ocrs.getString(1), ocrs.getDouble(2)
						);
			}
			return unit;
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

	public List<Unit> findAllUnit() {
		String sql = "select * from Unit";
		OracleCachedRowSet ocrs = DbOperation.executeQuery(sql, null);
		List<Unit> list = new ArrayList<Unit>();
		try {
			while(ocrs.next()) {
				Unit unit = new Unit(
						ocrs.getString(1), ocrs.getDouble(2)
						);
				list.add(unit);
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
