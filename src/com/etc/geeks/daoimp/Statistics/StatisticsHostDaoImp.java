package com.etc.geeks.daoimp.Statistics;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import oracle.jdbc.rowset.OracleCachedRowSet;

import com.etc.geeks.dao.Statistics.StatisticsHostDao;
import com.etc.geeks.entity.Statistics.StatisticsGuest;
import com.etc.geeks.entity.Statistics.StatisticsHost;
import com.etc.geeks.util.DbOperation;
import com.sun.org.apache.bcel.internal.generic.NEW;

public class StatisticsHostDaoImp implements StatisticsHostDao {

	Calendar calendar = Calendar.getInstance();
	public int addStatisticsHost(StatisticsHost sh) {
		// TODO Auto-generated method stub
		int result = DbOperation.executeUpdate(
				"insert into StatisticsHost values(?, ?, ?)",
				new Object[]{sh.getStatisticsHostId(),sh.getDate(),sh.getUserId()});
		return result;
	}

	public int deleteById(String statisticsHostId) {
		// TODO Auto-generated method stub
		int result = DbOperation.executeUpdate(
				"delete from StatisticsHost where statisticsHostId = ?", new Object[] { statisticsHostId });
		return result;
	}

	public List<StatisticsHost> findAll() {
		// TODO Auto-generated method stub
		String sql = "select * from StatisticsHost";
		OracleCachedRowSet ocrs = DbOperation.executeQuery(sql, null);
		List<StatisticsHost> list = new ArrayList<StatisticsHost>();
		try {
			while(ocrs.next()) {
				StatisticsHost sh = new StatisticsHost(
						ocrs.getString(1),
						ocrs.getDate(2),
						ocrs.getString(3)
						);
				list.add(sh);
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

	public StatisticsHost findById(String s ){
		// TODO Auto-generated method stub
		String sql = "select * from StatisticsHost where statisticsHostId = ?";
		OracleCachedRowSet ocrs = DbOperation.executeQuery(sql,new Object[]{s});
		StatisticsHost result = null;
		try {
			if(ocrs.next()){
				StatisticsHost sh = new StatisticsHost(ocrs.getString(1),ocrs.getDate(2),ocrs.getString(3));
				result = sh;
				return result;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public int updateStatisticHost(StatisticsHost sh) {
		// TODO Auto-generated method stub
		int result = DbOperation.executeUpdate(
				"update StatisticsHost set statisticsDate = ? userId = ? where statisticsHostId = '"+sh.getStatisticsHostId()+"'",new Object[]{sh.getDate(),sh.getUserId()});
		return result;
	}

}
