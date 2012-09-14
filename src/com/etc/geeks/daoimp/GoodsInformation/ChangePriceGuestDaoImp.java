package com.etc.geeks.daoimp.GoodsInformation;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import oracle.jdbc.rowset.OracleCachedRowSet;

import com.etc.geeks.dao.GoodsInformation.ChangePriceGuestDao;
import com.etc.geeks.entity.GoodsInformation.ChangePriceGuest;
import com.etc.geeks.util.DbOperation;

public class ChangePriceGuestDaoImp implements ChangePriceGuestDao {

	public int addChPrGuest(ChangePriceGuest chPrGuest) {
		String sql = "insert into ChangePriceGuest values(?, ?, ?, ?, ?)";
		Object[] objects = new Object[]{
				chPrGuest.getChangePriceGuestId(), chPrGuest.getChangePriceHostId(),
				chPrGuest.getGoodsId(), chPrGuest.getPrice(),
				chPrGuest.getPrice()
				};
		int result = DbOperation.executeUpdate(sql, objects);
		return result;
	}

	public int deleteById(String chprGuestId) {
		int result = DbOperation.executeUpdate(
				"delete from ChangePriceGuest where changePriceGuestId = ?", new Object[] { chprGuestId });
		return result;
	}

	public int updateChPrGuest(ChangePriceGuest chPriGuest) {
		String sql = "update ChangePriceGuest set changePriceHostId = ?, goodsId = ?," +
					"priceType = ?, price = ?" +
					"where changePriceGuestId = '" + chPriGuest.getChangePriceGuestId() + "'";
		Object[] objects = new Object[]{
				chPriGuest.getChangePriceHostId(), chPriGuest.getGoodsId(),
				chPriGuest.getPriceType(), chPriGuest.getPrice()
		};
		int result = DbOperation.executeUpdate(sql, objects);
		return result;
	}

	public ChangePriceGuest findById(String chPriGuestId) {
		String sql = "select * from ChangePriceGuest where changePriceGuestId = ?";
		Object[] objects = new Object[]{chPriGuestId};
		OracleCachedRowSet ocrs = DbOperation.executeQuery(sql, objects);
		ChangePriceGuest chPrGuest = null;
		try {
			if(ocrs.next()) {
				chPrGuest = new ChangePriceGuest(
						ocrs.getString(1), ocrs.getString(2),
						ocrs.getString(3), ocrs.getString(4),
						ocrs.getDouble(5)
						);
			}
			return chPrGuest;
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

	public List<ChangePriceGuest> findAllChPrGuest() {
		String sql = "select * from ChangePriceGuest";
		OracleCachedRowSet ocrs = DbOperation.executeQuery(sql, null);
		List<ChangePriceGuest> list = new ArrayList<ChangePriceGuest>();
		try {
			while(ocrs.next()) {
				ChangePriceGuest chPrGuest = new ChangePriceGuest(
						ocrs.getString(1), ocrs.getString(2),
						ocrs.getString(3), ocrs.getString(4),
						ocrs.getDouble(5)
						);
				list.add(chPrGuest);
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

	
	public ChangePriceGuest findByGoodsId(String goodsId) {
		String sql = "select * from ChangePriceGuest where goodsId = ?";
		Object[] objects = new Object[]{goodsId};
		OracleCachedRowSet ocrs = DbOperation.executeQuery(sql, objects);
		ChangePriceGuest chPrGuest = null;
		try {
			if(ocrs.next()) {
				chPrGuest = new ChangePriceGuest(
						ocrs.getString(1), ocrs.getString(2),
						ocrs.getString(3), ocrs.getString(4),
						ocrs.getDouble(5)
						);
			}
			return chPrGuest;
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
