package com.etc.geeks.daoimp.GoodsSale;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import oracle.jdbc.rowset.OracleCachedRowSet;

import com.etc.geeks.dao.GoodsSale.SalesGuestDao;
import com.etc.geeks.entity.GoodsSale.SalesGuest;
import com.etc.geeks.util.DbOperation;

public class SalesGuestDaoImp implements SalesGuestDao {

	public int addSalesGuset(SalesGuest salesGuest) {
		// TODO Auto-generated method stub
		String sql="insert into SalesGuest(salesGuestId,salesHostId,goodsId,priceType,price,salesGuestNumber,amount,unit) values(?,?,?,?,?,?,?,?)";
		Object []objects=new Object[]{
				 salesGuest.getSalesGuestId()
				,salesGuest.getSalesHostId()
				,salesGuest.getGoodsId()
				,salesGuest.getPriceType()
				,salesGuest.getPrice()
				,salesGuest.getsalesGuestNumber()
				,salesGuest.getAmount()
				,salesGuest.getUnit()
				};
		return DbOperation.executeUpdate(sql, objects);
	}

	public int deleteBySalesGuestId(String salesGuestId) {
		// TODO Auto-generated method stub
		String sql="delete from SalesGuest where salesGuestId=?";
		Object []objects=new Object[]{salesGuestId};
		return DbOperation.executeUpdate(sql, objects);
	}

	public int updateSalesGuest(SalesGuest salesGuest) {
		// TODO Auto-generated method stub
		String sql="update SalesGuest set salesGuestId=?,salesHostId=?,goodsId=?,priceType=?,price=?,salesGuestNumber=?,amount=?,unit=? where salesGuestId=?";
		Object []objects=new Object[]{
				salesGuest.getSalesGuestId(),
				salesGuest.getSalesHostId(),
				salesGuest.getGoodsId(),
				salesGuest.getPriceType(),
				salesGuest.getPrice(),
				salesGuest.getsalesGuestNumber(),
				salesGuest.getAmount(),
				salesGuest.getUnit(),
				salesGuest.getSalesGuestId()
		};
		return DbOperation.executeUpdate(sql, objects);
	}
	public SalesGuest findBySalesGuestId(String salesGuestId) {
		// TODO Auto-generated method stub
		String sql="select * from SalesGuest where salesGuestId=?";
		Object []objects=new Object[]{salesGuestId};
		
		OracleCachedRowSet ocrs=DbOperation.executeQuery(sql, objects);
		
		try {
			if(ocrs.next())
			{
				return new SalesGuest(
						ocrs.getString("salesHostId")
						, ocrs.getString("salesGuestId")
						, ocrs.getString("unit")
						, ocrs.getString("goodsId")
						, ocrs.getDouble("salesGuestNumber")
						, ocrs.getDouble("price")
						, ocrs.getString("priceType")
						, ocrs.getDouble("amount")
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


	public List<SalesGuest> findByGoodsId(String goodsId) {
		// TODO Auto-generated method stub
		String sql="select * from SalesGuest where goodsId=?";
		Object []objects=new Object[]{goodsId};
		OracleCachedRowSet ocrs=DbOperation.executeQuery(sql, objects);
		List<SalesGuest> sgList=new ArrayList<SalesGuest>();
		try {
			while(ocrs.next())
			{
				sgList.add(new SalesGuest(
						ocrs.getString("salesHostId")
						, ocrs.getString("salesGuestId")
						, ocrs.getString("unit")
						, ocrs.getString("goodsId")
						, ocrs.getDouble("salesGuestNumber")
						, ocrs.getDouble("price")
						, ocrs.getString("priceType")
						, ocrs.getDouble("amount")
						));
				
			}
			if(!sgList.isEmpty())
				return sgList;
			else
				return null;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}


	public List<SalesGuest> findBySalesHostId(String salesHostId) {
		// TODO Auto-generated method stub
		String sql="select * from SalesGuest where salesHostId=?";
		Object []objects=new Object[]{salesHostId};
		OracleCachedRowSet ocrs=DbOperation.executeQuery(sql, objects);
		List<SalesGuest> sgList=new ArrayList<SalesGuest>();
		try {
			while(ocrs.next())
			{
				sgList.add(new SalesGuest(
						ocrs.getString("salesHostId")
						, ocrs.getString("salesGuestId")
						, ocrs.getString("unit")
						, ocrs.getString("goodsId")
						, ocrs.getDouble("salesGuestNumber")
						, ocrs.getDouble("price")
						, ocrs.getString("priceType")
						, ocrs.getDouble("amount")
						));
				
			}
			if(!sgList.isEmpty())
				return sgList;
			else
				return null;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	public List<SalesGuest> findAll() {
		// TODO Auto-generated method stub
		String sql="select * from SalesGuest ";
		Object []objects=new Object[]{};
		OracleCachedRowSet ocrs=DbOperation.executeQuery(sql, objects);
		List<SalesGuest> sgList=new ArrayList<SalesGuest>();
		try {
			while(ocrs.next())
			{
				sgList.add(new SalesGuest(
						ocrs.getString("salesHostId")
						, ocrs.getString("salesGuestId")
						, ocrs.getString("unit")
						, ocrs.getString("goodsId")
						, ocrs.getDouble("salesGuestNumber")
						, ocrs.getDouble("price")
						, ocrs.getString("priceType")
						, ocrs.getDouble("amount")
						));
				
			}
			if(!sgList.isEmpty())
				return sgList;
			else
				return null;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
}
