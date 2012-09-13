package com.etc.geeks.daoimp.GoodsSale;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import oracle.jdbc.rowset.OracleCachedRowSet;
import oracle.sql.TIMESTAMP;

import com.etc.geeks.dao.GoodsSale.SalesHostDao;
import com.etc.geeks.entity.GoodsSale.SalesHost;
import com.etc.geeks.util.DbOperation;

public class SalesHostDaoImp implements SalesHostDao {

	SimpleDateFormat sdFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	public int addSalesHost(SalesHost salesHost) {
		// TODO Auto-generated method stub
		String sql="insert into SalesHost(salesHostId,salesHostDate,userId) values(?,?,?)";
		Object []objects=new Object[]{salesHost.getSalesHostId(),salesHost.getSalesHostDate(),salesHost.getUserId()};
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
		String sql="update SalesHost set salesHostId=? ,salesHostDate=?, userId=? where salesHostId=?";
		Object[]objects=new Object[]{salesHost.getSalesHostId(),salesHost.getSalesHostDate(),salesHost.getUserId(),salesHost.getSalesHostId()};
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
						sdFormat.parse(((TIMESTAMP)ocrs.getObject("salesHostDate")).timestampValue().toString())
						, ocrs.getString("salesHostId")
						,ocrs.getString("userId")
						);
			}
			else 
				return null;
			
			
		} catch (Exception e) {
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
						sdFormat.parse(((TIMESTAMP)ocrs.getObject("salesHostDate")).timestampValue().toString())
						, ocrs.getString("salesHostId")
						,ocrs.getString("userId")
						));
			}
			if(!shList.isEmpty())
				return shList;
			else
				return null;
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}


	public List<SalesHost> findByDate(Date startDate, Date endDate) {
		// TODO Auto-generated method stub
		if(startDate.after(endDate))
			return null;
		List<SalesHost> allSalesHost=findAll();
		List<SalesHost> shList=new ArrayList<SalesHost>();
		for(SalesHost sh:allSalesHost)
		{
			if(sh.getSalesHostDate().after(startDate)&&sh.getSalesHostDate().before(endDate))
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
						sdFormat.parse(((TIMESTAMP)ocrs.getObject("salesHostDate")).timestampValue().toString())
						, ocrs.getString("salesHostId")
						,ocrs.getString("userId")
						));
			}
			if(!shList.isEmpty())
				return shList;
			else
				return null;
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	
}
