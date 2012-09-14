package com.etc.geeks.daoimp.StorageManagement;

import java.util.ArrayList;
import java.util.List;

import oracle.jdbc.rowset.OracleCachedRowSet;

import com.etc.geeks.dao.StorageManagement.InStoreGuestDao;
import com.etc.geeks.entity.StorageManagement.InStoreGuest;
import com.etc.geeks.util.DbOperation;
/**
 * 9.14 11:00
 * @author Administrator
 *
 */
public class InStoreGuestDaoImp implements InStoreGuestDao {

	public int addInStoreGuest(InStoreGuest inStoreGuest) {
		String sql="insert into InStoreGuest(inStoreGuestId,inStoreHostId,goodsId,inStoreGuestNumber,price,unit,amount) values(?,?,?,?,?,?,?)";
		Object []objects=new Object[]{
				inStoreGuest.getInStoreGuestId()
				,inStoreGuest.getInStoreHostId()
				,inStoreGuest.getGoodsId()
				,inStoreGuest.getInStoreGuestNumber()
				,inStoreGuest.getPrice()
				,inStoreGuest.getUnit()
				,inStoreGuest.getAmount()
				};
		return DbOperation.executeUpdate(sql, objects);
	}

	public int deleteByInStoreGuestId(String inStoreGuestId) {
		String sql="delete from InStoreGuest where inStoreGuestId=?";
		Object []objects=new Object[]{inStoreGuestId};
		return DbOperation.executeUpdate(sql, objects);
	}	
	
	public int updateInStoreGuest(InStoreGuest inStoreGuest) {

		String sql="update InStoreGuest set inStoreGuestId=?,inStoreHostId=?,goodsId=?,inStoreGuestNumber=?,price=?,unit=?,amount=? where inStoreGuestId=?";
		Object[]objects=new Object[]{
				inStoreGuest.getInStoreGuestId()
				,inStoreGuest.getInStoreHostId()
				,inStoreGuest.getGoodsId()
				,inStoreGuest.getInStoreGuestNumber()
				,inStoreGuest.getPrice()
				,inStoreGuest.getUnit()
				,inStoreGuest.getAmount()
				,inStoreGuest.getInStoreGuestId()
				};
		return DbOperation.executeUpdate(sql, objects);

	}
	public InStoreGuest findByInStoreGuestId(String inStoreGuestId) {

		String sql="select * from InStoreGuest  where inStoreGuestId=?";
		Object []objects=new Object[]{inStoreGuestId};
		OracleCachedRowSet ocrs=DbOperation.executeQuery(sql, objects);
		try 
		{
			if(ocrs.next())
			{

				return new InStoreGuest(
						ocrs.getString("inStoreGuestId")
						,ocrs.getString("inStoreHostId") 
						, ocrs.getString("goodsId")
						, ocrs.getString("unit")
						,ocrs.getDouble("inStoreGuestNumber") 
						, ocrs.getDouble("price")
						, ocrs.getDouble("amount")
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
	public List<InStoreGuest> findByInStoreHostId(String inStoreHostId) {
		String sql="select * from InStoreGuest  where inStoreHostId=?";
		Object []objects=new Object[]{inStoreHostId};
		OracleCachedRowSet ocrs=DbOperation.executeQuery(sql, objects);
		List<InStoreGuest> _List=new ArrayList<InStoreGuest>();
		try {
			while(ocrs.next())
			{
		
				_List.add(new InStoreGuest(
						ocrs.getString("inStoreGuestId")
						,ocrs.getString("inStoreHostId") 
						, ocrs.getString("goodsId")
						, ocrs.getString("unit")
						,ocrs.getDouble("inStoreGuestNumber") 
						, ocrs.getDouble("price")
						, ocrs.getDouble("amount")
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

	public List<InStoreGuest> findByGoodsId(String goodsId) {
		String sql="select * from InStoreGuest  where goodsId=?";
		Object []objects=new Object[]{goodsId};
		OracleCachedRowSet ocrs=DbOperation.executeQuery(sql, objects);
		List<InStoreGuest> _List=new ArrayList<InStoreGuest>();
		try {
			while(ocrs.next())
			{

				_List.add(new InStoreGuest(
						ocrs.getString("inStoreGuestId")
						,ocrs.getString("inStoreHostId") 
						, ocrs.getString("goodsId")
						, ocrs.getString("unit")
						,ocrs.getDouble("inStoreGuestNumber") 
						, ocrs.getDouble("price")
						, ocrs.getDouble("amount")
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

	public List<InStoreGuest> findAll() {
		String sql="select * from InStoreGuest";
		Object []objects=new Object[]{};
		OracleCachedRowSet ocrs=DbOperation.executeQuery(sql, objects);
		List<InStoreGuest> _List=new ArrayList<InStoreGuest>();
		try {
			while(ocrs.next())
			{
		
				_List.add(new InStoreGuest(
						ocrs.getString("inStoreGuestId")
						,ocrs.getString("inStoreHostId") 
						, ocrs.getString("goodsId")
						, ocrs.getString("unit")
						,ocrs.getDouble("inStoreGuestNumber") 
						, ocrs.getDouble("price")
						, ocrs.getDouble("amount")
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
