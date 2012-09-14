package com.etc.geeks.daoimp.StorageManagement;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import oracle.jdbc.rowset.OracleCachedRowSet;

import com.etc.geeks.dao.StorageManagement.InStoreHostDao;
import com.etc.geeks.entity.StorageManagement.InStoreHost;
import com.etc.geeks.util.DbOperation;
/**
 * 9.14 11:00
 * @author Administrator
 *
 */
public class InStoreHostDaoImp implements InStoreHostDao {

	public int addInStoreHost(InStoreHost inStoreHost) {
		String sql="insert into InStoreHost(inStoreHostId,inStoreDate,checkerId,checkFlag,checkDate,supplierId) values(?,?,?,?,?,?)";
		Object []objects=new Object[]{
				inStoreHost.getInStoreHostId()
				,inStoreHost.getInStoreDate()
				,inStoreHost.getCheckerId()
				,inStoreHost.getCheckFlag()
				,inStoreHost.getCheckDate()
				,inStoreHost.getSupplierId()};
		return DbOperation.executeUpdate(sql, objects);
	}

	public int deleteByInStoreHostId(String inStoreHostId) {
		String sql="delete from InStoreHost where inStoreHostId=?";
		Object []objects=new Object[]{inStoreHostId};
		return DbOperation.executeUpdate(sql, objects);
	}
	public int updateInStoreHost(InStoreHost inStoreHost) {
		String sql="update InStoreHost set inStoreHostId=? ,inStoreDate=?,checkerId=?,checkFlag=?,checkDate=?,supplierId=? where inStoreHostId=?";
		Object []objects=new Object[]{
				inStoreHost.getInStoreHostId()
				,inStoreHost.getInStoreDate()
				,inStoreHost.getCheckerId()
				,inStoreHost.getCheckFlag()
				,inStoreHost.getCheckDate()
				,inStoreHost.getSupplierId()
				,inStoreHost.getInStoreHostId()
				};
		return DbOperation.executeUpdate(sql, objects);
	}
	public List<InStoreHost> findAll() {
		String sql="select * from InStoreHost";
		Object []objects=new Object[]{};
		OracleCachedRowSet ocrs=DbOperation.executeQuery(sql, objects);
		List<InStoreHost> _List=new ArrayList<InStoreHost>();
		try {
			while(ocrs.next())
			{
				_List.add(new InStoreHost(
						ocrs.getString("checkerId")
						, ocrs.getString("checkFlag")
						, ocrs.getString("supplierId")
						, ocrs.getString("inStoreHostId")
						, ocrs.getDate("inStoreDate")
						, ocrs.getDate("checkDate")
						));

			}
			if(!_List.isEmpty())
				return _List;
			else
				return null;
					
					
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
	}

	public List<InStoreHost> findByCheckDate(Date startDate, Date endDate) {
		if(startDate.after(endDate))
			return null;
		List<InStoreHost> all_List=findAll();
		List<InStoreHost> _List=new ArrayList<InStoreHost>();
		for(InStoreHost ish:all_List)
		{
			if(startDate.before(ish.getCheckDate())&&endDate.after(ish.getCheckDate()))
			{
				_List.add(ish);
			}
			
		}
		if(!_List.isEmpty())
			return _List;
		else	
			return null;
	}

	public List<InStoreHost> findByCheckerId(String checkerId) {
		String sql="select * from InStoreHost  where checkerId=?";
		Object []objects=new Object[]{checkerId};
		OracleCachedRowSet ocrs=DbOperation.executeQuery(sql, objects);
		List<InStoreHost> _List=new ArrayList<InStoreHost>();
		try {
			while(ocrs.next())
			{
				
				_List.add(new InStoreHost(
						ocrs.getString("checkerId")
						, ocrs.getString("checkFlag")
						, ocrs.getString("supplierId")
						, ocrs.getString("inStoreHostId")
						, ocrs.getDate("inStoreDate")
						, ocrs.getDate("checkDate")
						));
			}
			if(!_List.isEmpty())
				return _List;
			else
				return null;
					
					
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
	}

	public List<InStoreHost> findByInStoreDate(Date startDate, Date endDate) {
		if(startDate.after(endDate))
			return null;
		List<InStoreHost> all_List=findAll();
		List<InStoreHost> _List=new ArrayList<InStoreHost>();
		for(InStoreHost ish:all_List)
		{
			
			if(startDate.before(ish.getInStoreDate())&&endDate.after(ish.getInStoreDate()))
			{
				_List.add(ish);
			}
			
			
		}
		if(!_List.isEmpty())
			return _List;
		else	
			return null;
	}

	public InStoreHost findByInStoreHostId(String inStoreHostId) {
		String sql="select * from InStoreHost  where inStoreHostId=?";
		Object []objects=new Object[]{inStoreHostId};
		OracleCachedRowSet ocrs=DbOperation.executeQuery(sql, objects);
		try 
		{
			if(ocrs.next())
			{
				return new InStoreHost(
						ocrs.getString("checkerId")
						, ocrs.getString("checkFlag")
						, ocrs.getString("supplierId")
						, ocrs.getString("inStoreHostId")
						, ocrs.getDate("inStoreDate")
						, ocrs.getDate("checkDate")
						);
			}
			else 
				return null;
					
					
		} 
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			return null;
	}

	public List<InStoreHost> findBySupplierId(String supplierId) {
		String sql="select * from InStoreHost  where supplierId=?";
		Object []objects=new Object[]{supplierId};
		OracleCachedRowSet ocrs=DbOperation.executeQuery(sql, objects);
		List<InStoreHost> _List=new ArrayList<InStoreHost>();
		try {
			while(ocrs.next())
			{
				_List.add(new InStoreHost(
						ocrs.getString("checkerId")
						, ocrs.getString("checkFlag")
						, ocrs.getString("supplierId")
						, ocrs.getString("inStoreHostId")
						, ocrs.getDate("inStoreDate")
						, ocrs.getDate("checkDate")
						));
			}
			if(!_List.isEmpty())
				return _List;
			else
				return null;
					
					
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
	}



}
