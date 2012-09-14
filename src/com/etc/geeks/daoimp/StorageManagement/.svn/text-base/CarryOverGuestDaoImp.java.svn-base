package com.etc.geeks.daoimp.StorageManagement;

import java.util.ArrayList;
import java.util.List;

import oracle.jdbc.rowset.OracleCachedRowSet;

import com.etc.geeks.dao.StorageManagement.CarryOverGuestDao;
import com.etc.geeks.entity.StorageManagement.CarryOverGuest;
import com.etc.geeks.util.DbOperation;
/**
 * 9.14 11:00
 * @author Administrator
 *
 */
public class CarryOverGuestDaoImp implements CarryOverGuestDao {

	public int addCarryOverGuest(CarryOverGuest carryOverGuest) {
		String sql="insert into CarryOverGuest(carryOverGuestId,carryOverHostId,goodsId,unit,carryOverGuestNumber,price,amount) values(?,?,?,?,?,?,?)";
		Object []objects=new Object[]{
				carryOverGuest.getCarryOverGuestId()
				,carryOverGuest.getCarryOverHostId()
				,carryOverGuest.getGoodsId()
				,carryOverGuest.getUnit()
				,carryOverGuest.getCarryOverGuestNumber()
				,carryOverGuest.getPrice()
				,carryOverGuest.getAmount()	
				};
		return DbOperation.executeUpdate(sql, objects);
	}

	public int deleteByCarryOverGuestId(String carryOverGuestId) {
		String sql="delete from CarryOverGuest where carryOverGuestId=?";
		Object []objects=new Object[]{carryOverGuestId};
		return DbOperation.executeUpdate(sql, objects);
	}

	public int updateCarryOverGuest(CarryOverGuest carryOverGuest) {
		String sql="update CarryOverGuest set carryOverGuestId=?,carryOverHostId=? ,goodsId=?,unit=?,carryOverGuestNumber=?,price=?,amount=? where carryOverGuestId=?";
		Object[]objects=new Object[]{
				carryOverGuest.getCarryOverGuestId()
				,carryOverGuest.getCarryOverHostId()
				,carryOverGuest.getGoodsId()
				,carryOverGuest.getUnit()
				,carryOverGuest.getCarryOverGuestNumber()
				,carryOverGuest.getPrice()
				,carryOverGuest.getAmount()	
				,carryOverGuest.getCarryOverGuestId()
				};
		return DbOperation.executeUpdate(sql, objects);
	}


	public CarryOverGuest findByCarryOverGuestId(String carryOverGuestId) {

		String sql="select * from CarryOverGuest  where carryOverGuestId=?";
		Object []objects=new Object[]{carryOverGuestId};
		OracleCachedRowSet ocrs=DbOperation.executeQuery(sql, objects);
		try 
		{
			if(ocrs.next())
			{

				return new CarryOverGuest(
						ocrs.getString("carryOverHostId")
						, ocrs.getString("carryOverGuestId")
						, ocrs.getString("goodsId")
						, ocrs.getString("unit")
						, ocrs.getDouble("carryOverGuestNumber")
						, ocrs.getDouble("price")
						, ocrs.getDouble("amount"));
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

	public List<CarryOverGuest> findByCarryOverHostId(String carryOverHostId) {
		String sql="select * from CarryOverGuest  where carryOverHostId=?";
		Object []objects=new Object[]{carryOverHostId};
		OracleCachedRowSet ocrs=DbOperation.executeQuery(sql, objects);
		List<CarryOverGuest> _List=new ArrayList<CarryOverGuest>();
		try {
			while(ocrs.next())
			{

				_List.add(new CarryOverGuest(
						ocrs.getString("carryOverHostId")
						, ocrs.getString("carryOverGuestId")
						, ocrs.getString("goodsId")
						, ocrs.getString("unit")
						, ocrs.getDouble("carryOverGuestNumber")
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

	public List<CarryOverGuest> findByGoodsId(String goodsId) {
		String sql="select * from CarryOverGuest  where goodsId=?";
		Object []objects=new Object[]{goodsId};
		OracleCachedRowSet ocrs=DbOperation.executeQuery(sql, objects);
		List<CarryOverGuest> _List=new ArrayList<CarryOverGuest>();
		try {
			while(ocrs.next())
			{
	
				_List.add(new CarryOverGuest(
						ocrs.getString("carryOverHostId")
						, ocrs.getString("carryOverGuestId")
						, ocrs.getString("goodsId")
						, ocrs.getString("unit")
						, ocrs.getDouble("carryOverGuestNumber")
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

	public List<CarryOverGuest> findAll() {
		String sql="select * from CarryOverGuest  ";
		Object []objects=new Object[]{};
		OracleCachedRowSet ocrs=DbOperation.executeQuery(sql, objects);
		List<CarryOverGuest> _List=new ArrayList<CarryOverGuest>();
		try {
			while(ocrs.next())
			{
	
				_List.add(new CarryOverGuest(
						ocrs.getString("carryOverHostId")
						, ocrs.getString("carryOverGuestId")
						, ocrs.getString("goodsId")
						, ocrs.getString("unit")
						, ocrs.getDouble("carryOverGuestNumber")
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
