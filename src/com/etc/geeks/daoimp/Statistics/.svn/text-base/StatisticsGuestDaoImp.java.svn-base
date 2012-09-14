package com.etc.geeks.daoimp.Statistics;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import oracle.jdbc.rowset.OracleCachedRowSet;

import com.etc.geeks.dao.Statistics.StatisticsGuestDao;
import com.etc.geeks.entity.Statistics.StatisticsGuest;
import com.etc.geeks.util.DbOperation;

public class StatisticsGuestDaoImp implements StatisticsGuestDao {

	public int addStatisticGuest(StatisticsGuest sg) {
		// TODO Auto-generated method stub
		int result = DbOperation.executeUpdate(
				"insert into StatisticsGuest values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,?,?,?)",
				new Object[]{sg.getStatisticsGuestId(),sg.getStatisticsHostId(),
						sg.getGoodsId(),sg.getLastNumber(),sg.getLastPrice(),sg.getLastAmount(),
						sg.getNowInStoreNumber(),sg.getNowInStoreCost(),sg.getNowInStoreAmount(),
						sg.getNowSalesNumber(),sg.getNowSalesPrice(),sg.getNowSalesAmount(),
						sg.getSalesCost(),sg.getNowStorageNumber(),sg.getNowStoragePrice(),
						sg.getNowStorageAmount(),sg.getProfit()});
		return result;
	}

	public int deleteById(String statisticsGuestId) {
		// TODO Auto-generated method stub
		int result = DbOperation.executeUpdate(
				"delete from StatisticsGuest where statisticsGuestId = ?", new Object[] { statisticsGuestId });
		return result;
	}

	public List<StatisticsGuest> findAll() {
		// TODO Auto-generated method stub
		String sql = "select * from StatisticGuest";
		OracleCachedRowSet ocrs = DbOperation.executeQuery(sql, null);
		List<StatisticsGuest> list = new ArrayList<StatisticsGuest>();
		try {
			while(ocrs.next()) {
				StatisticsGuest sg = new StatisticsGuest(
						ocrs.getString(1), ocrs.getString(2),
						ocrs.getString(3), ocrs.getInt(4),
						ocrs.getInt(5), ocrs.getInt(6),
						ocrs.getInt(7), ocrs.getInt(8),
						ocrs.getInt(9), ocrs.getInt(10),
						ocrs.getInt(11), ocrs.getInt(12),
						ocrs.getInt(13), ocrs.getInt(14),
						ocrs.getInt(15), ocrs.getInt(16),ocrs.getInt(17)
						);
				list.add(sg);
			}
			return list;
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

	public StatisticsGuest findById(String sid) {
		// TODO Auto-generated method stub
		String sqlString = "select * from StatisticsGuest where statisticsGuestId = ?";
		OracleCachedRowSet ocrs = DbOperation.executeQuery(sqlString, null);
		StatisticsGuest sg = null;
		try {
			if(ocrs.next()){
				sg = new StatisticsGuest(
						ocrs.getString(1), ocrs.getString(2),
						ocrs.getString(3), ocrs.getInt(4),
						ocrs.getInt(5), ocrs.getInt(6),
						ocrs.getInt(7), ocrs.getInt(8),
						ocrs.getInt(9), ocrs.getInt(10),
						ocrs.getInt(11), ocrs.getInt(12),
						ocrs.getInt(13), ocrs.getInt(14),
						ocrs.getInt(15), ocrs.getInt(16),ocrs.getInt(17)
						);
			}
			return sg;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public int updateStatisticsGuest(StatisticsGuest sg) {
		// TODO Auto-generated method stub
		int result = DbOperation.executeUpdate(
				"update StatisticsGuest set statisticsHostId = ? goodsId = ?" +
				"lastNumber = ? lastPrice = ? lastAmount = ?" +
				"nowInStoreNumber = ? nowInStoreCost = ? nowInStoreAmount = ?" +
				"nowSalesNumber = ? nowSalesPrice = ? nowSalesAmount = ?" +
				"SalesCost = ?" +
				"nowStorageNumber = ? nowStoragePrice = ? nowStorageAmount = ?" +
				"profit = ?" +
				"where statisticsHostId = '"+sg.getStatisticsGuestId()+"'",new Object[]{sg.getStatisticsHostId(),
					sg.getGoodsId(),sg.getLastNumber(),sg.getLastPrice(),sg.getLastAmount(),sg.getNowInStoreNumber(),sg.getNowInStoreCost(),sg.getNowInStoreAmount(),sg.getNowSalesNumber(),
					sg.getNowSalesPrice(),sg.getNowSalesAmount(),sg.getSalesCost(),sg.getNowStorageNumber(),
					sg.getNowStoragePrice(),sg.getNowStorageAmount(),sg.getProfit()});
		return result;
		
	}

}
