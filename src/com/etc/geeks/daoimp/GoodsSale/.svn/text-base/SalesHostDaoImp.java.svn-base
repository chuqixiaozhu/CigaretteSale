package com.etc.geeks.daoimp.GoodsSale;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import oracle.jdbc.rowset.OracleCachedRowSet;

import com.etc.geeks.dao.GoodsSale.SalesHostDao;
import com.etc.geeks.entity.GoodsSale.SalesHost;
import com.etc.geeks.util.DbOperation;

public class SalesHostDaoImp implements SalesHostDao {

	public int addSalesHost(SalesHost salesHost) {
		// TODO Auto-generated method stub
		String sql="insert into SalesHost(salesHostId,date,userId) values(?,?,?)";
		Object []objects=new Object[]{salesHost.getSaleHostId(),salesHost.getDate(),salesHost.getUserId()};
		return DbOperation.executeUpdate(sql, objects);
	}

	public int deleteBySalesHostId(String salesHostId) {
		// TODO Auto-generated method stub
		String sql="delete from SalesHost where salesHostId=?";
		Object []objects=new Object[]{salesHostId};
		return DbOperation.executeUpdate(sql, objects);
	}


	public int updateSalesHost(SalesHost salesHost) {
		// TODO Auto-generated method stub
		String sql="update SalesHost set salesHostId=? ,date=?, userId=?";
		Object[]objects=new Object[]{salesHost.getSaleHostId(),salesHost.getDate(),salesHost.getUserId()};
		return DbOperation.executeUpdate(sql, objects);
	}

	public SalesHost findBySalesHostId(String salesHostId) {
		// TODO Auto-generated method stub
		String sql="select * from SalesHost where salesHostId=?";
		Object []objects=new Object[]{salesHostId};
		OracleCachedRowSet ocrs=DbOperation.executeQuery(sql, objects);
		try {
			if(ocrs.next())
			{
				return new SalesHost(
						new java.util.Date(ocrs.getTimestamp("date").getTime())
						, ocrs.getString("saleHostId")
						,ocrs.getString("userId")
						);
			}
			else 
				return null;
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public List<SalesHost> findByUserId(String userId) {
		// TODO Auto-generated method stub
		String sql="select * from SalesHost where userId=?";
		Object []objects=new Object[]{userId};
		OracleCachedRowSet ocrs=DbOperation.executeQuery(sql, objects);
		List<SalesHost> shList=new ArrayList<SalesHost>();
		try {
			while(ocrs.next())
			{
				shList.add(new SalesHost(
						new java.util.Date(ocrs.getTimestamp("date").getTime())
						, ocrs.getString("saleHostId")
						,ocrs.getString("userId")
						));
			}
			if(!shList.isEmpty())
				return shList;
			else
				return null;
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}


	public List<SalesHost> findByDate(Date startDate, Date endDate) {
		// TODO Auto-generated method stub
		List<SalesHost> allSalesHost=findAll();
		List<SalesHost> shList=new ArrayList<SalesHost>();
		for(SalesHost sh:allSalesHost)
		{
			if(sh.getDate().after(startDate)&&sh.getDate().before(endDate))
			{
				shList.add(sh);
				
			}
			
		}
		if(!shList.isEmpty())
			return shList;
		else	
			return null;
	}

	public List<SalesHost> findAll() {
		// TODO Auto-generated method stub
		String sql="select * from SalesHost ";
		Object []objects=new Object[]{};
		OracleCachedRowSet ocrs=DbOperation.executeQuery(sql, objects);
		List<SalesHost> shList=new ArrayList<SalesHost>();
		try {
			while(ocrs.next())
			{
				shList.add(new SalesHost(
						new java.util.Date(ocrs.getTimestamp("date").getTime())
						, ocrs.getString("saleHostId")
						,ocrs.getString("userId")
						));
			}
			if(!shList.isEmpty())
				return shList;
			else
				return null;
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	
}
