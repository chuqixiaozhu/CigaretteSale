package com.etc.geeks.daoimp.GoodsInformation;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import oracle.jdbc.rowset.OracleCachedRowSet;

import com.etc.geeks.dao.GoodsInformation.ChangePriceHostDao;
import com.etc.geeks.entity.GoodsInformation.ChangePriceHost;
import com.etc.geeks.util.DbOperation;

public class ChangePriceHostDaoImp implements ChangePriceHostDao {

	public int addChPrHost(ChangePriceHost chPrHost) {
		String sql = "insert into ChangePriceHost values(?, ?, ?, ?)";
		Object[] objects = new Object[]{
				chPrHost.getChangePriceHostId(), chPrHost.getValidDate(),
				chPrHost.getStartDate(), chPrHost.getEndDate()
				};
		int result = DbOperation.executeUpdate(sql, objects);
		return result;
	}

	public int deleteById(String chprHostId) {
		int result = DbOperation.executeUpdate(
				"delete from ChangePriceHost where changePriceHostId = ?", new Object[] { chprHostId });
		return result;
	}

	public List<ChangePriceHost> findAllChPrHost() {
		String sql = "select * from ChangePriceHost";
		OracleCachedRowSet ocrs = DbOperation.executeQuery(sql, null);
		List<ChangePriceHost> list = new ArrayList<ChangePriceHost>();
		try {
			while(ocrs.next()) {
				ChangePriceHost chPrHost = new ChangePriceHost(
						ocrs.getString(1), ocrs.getDate(2),
						ocrs.getDate(3), ocrs.getDate(4)
						);
				list.add(chPrHost);
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

	public List<ChangePriceHost> findByDate(Date startDate, Date endDate) {
		List<ChangePriceHost> allList = this.findAllChPrHost();
		List<ChangePriceHost> result = new ArrayList<ChangePriceHost>();
		for(ChangePriceHost t : allList) {
			if(startDate.before(t.getEndDate()) && endDate.after(t.getEndDate())) {
				result.add(t);
			}
		}
		if(!result.isEmpty()) {
			return result;
		} else {
			return null;
		}
	}

	public ChangePriceHost findById(String chPrHostId) {
		String sql = "select * from ChangePriceHost where changePriceHostId = ?";
		Object[] objects = new Object[]{chPrHostId};
		OracleCachedRowSet ocrs = DbOperation.executeQuery(sql, objects);
		ChangePriceHost chPrHost = null;
		try {
			if(ocrs.next()) {
				chPrHost = new ChangePriceHost(
						ocrs.getString(1), ocrs.getDate(2),
						ocrs.getDate(3), ocrs.getDate(4)
						);
			}
			return chPrHost;
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

	public int updateChPrHost(ChangePriceHost chPriHost) {
		String sql = "update ChangePriceHost set validDate = ?, startDate = ?," +
					"endDate = ? where goodsId = '" + chPriHost.getChangePriceHostId() + "'";
		Object[] objects = new Object[]{
				chPriHost.getValidDate(), chPriHost.getStartDate(),
				chPriHost.getEndDate()
				};
		int result = DbOperation.executeUpdate(sql, objects);
		return result;
	}

}
