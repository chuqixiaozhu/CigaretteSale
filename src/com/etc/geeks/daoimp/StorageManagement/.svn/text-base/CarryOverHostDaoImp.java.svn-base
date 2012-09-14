package com.etc.geeks.daoimp.StorageManagement;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import oracle.jdbc.rowset.OracleCachedRowSet;

import com.etc.geeks.dao.StorageManagement.CarryOverHostDao;
import com.etc.geeks.entity.StorageManagement.CarryOverHost;
import com.etc.geeks.util.DbOperation;
/**
 * 9.14 11:00
 * @author Administrator
 *
 */
public class CarryOverHostDaoImp implements CarryOverHostDao {

	public int addCarryOverHost(CarryOverHost carryOverHost) {
		String sql="insert into CarryOverHost(carryOverHostId,userId,carryOverHostDate) values(?,?,?)";
		Object []objects=new Object[]{
				carryOverHost.getCarryOverHostId()
				,carryOverHost.getUserId()
				,carryOverHost.getCarryOverHostDate()
				};
		return DbOperation.executeUpdate(sql, objects);
	}

	public int deleteByCarryOverHostId(String carryOverHostId) {
		String sql="delete from CarryOverHost where carryOverHostId=?";
		Object []objects=new Object[]{carryOverHostId};
		return DbOperation.executeUpdate(sql, objects);
	}

	public int updateCarryOverHost(CarryOverHost carryOverHost) {
		String sql="update CarryOverHost set carryOverHostId=? ,userId=?,carryOverHostDate=? where carryOverHostId=?";
		Object[]objects=new Object[]{
				carryOverHost.getCarryOverHostId()
				,carryOverHost.getUserId()
				,carryOverHost.getCarryOverHostDate()
				,carryOverHost.getCarryOverHostId()
				};
		return DbOperation.executeUpdate(sql, objects);

	}
	// carryOverHostId userId carryOverHostDate
	public CarryOverHost findByCarryOverHostIdId(String carryOverHostId) {
		String sql="select * from CarryOverHost  where carryOverHostId=?";
		Object []objects=new Object[]{carryOverHostId};
		OracleCachedRowSet ocrs=DbOperation.executeQuery(sql, objects);
		try 
		{
			if(ocrs.next())
			{

				return new CarryOverHost(
						ocrs.getString("carryOverHostId")
						, ocrs.getString("userId")
						,ocrs.getDate("carryOverHostDate") 
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
	public List<CarryOverHost> findByUserId(String userId) {
		String sql="select * from CarryOverHost  where userId=?";
		Object []objects=new Object[]{userId};
		OracleCachedRowSet ocrs=DbOperation.executeQuery(sql, objects);
		List<CarryOverHost> _List=new ArrayList<CarryOverHost>();
		try {
			while(ocrs.next())
			{
		
				_List.add(new CarryOverHost(
						ocrs.getString("carryOverHostId")
						, ocrs.getString("userId")
						,ocrs.getDate("carryOverHostDate") 
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

	public List<CarryOverHost> findByCarryOverHostDate(Date startDate,
			Date endDate) {
		if(startDate.compareTo(endDate)>0)
		{
			System.out.println("开始时间应早于结束时间");
			return null;
		}
//		if(startDate.after(endDate))
//			return null;
		List<CarryOverHost> all_List=findAll();
		List<CarryOverHost> _List=new ArrayList<CarryOverHost>();
		for(CarryOverHost coh:all_List)
		{
			
//			if(startDate.before(coh.getCarryOverHostDate())&&endDate.after(coh.getCarryOverHostDate()))
//			{
//				_List.add(coh);
//			}
			if(startDate.compareTo(coh.getCarryOverHostDate())<=0&&endDate.compareTo(coh.getCarryOverHostDate())>=0)
			{
				_List.add(coh);
			}
			
		}
		if(!_List.isEmpty())
			return _List;
		else	
			return null;
	}

	public List<CarryOverHost> findAll() {
		String sql="select * from CarryOverHost ";
		Object []objects=new Object[]{};
		OracleCachedRowSet ocrs=DbOperation.executeQuery(sql, objects);
		List<CarryOverHost> _List=new ArrayList<CarryOverHost>();
		try {
			while(ocrs.next())
			{
		
				_List.add(new CarryOverHost(
						ocrs.getString("carryOverHostId")
						, ocrs.getString("userId")
						,ocrs.getDate("carryOverHostDate") 
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
