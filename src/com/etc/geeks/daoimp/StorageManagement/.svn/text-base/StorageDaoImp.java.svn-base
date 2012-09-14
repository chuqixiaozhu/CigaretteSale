package com.etc.geeks.daoimp.StorageManagement;

import java.util.ArrayList;
import java.util.List;

import oracle.jdbc.rowset.OracleCachedRowSet;

import com.etc.geeks.dao.StorageManagement.StorageDao;
import com.etc.geeks.entity.StorageManagement.Storage;
import com.etc.geeks.util.DbOperation;
/**
 * 9.14 11:00
 * @author Administrator
 *
 */
public class StorageDaoImp implements StorageDao {

	public int addStorage(Storage storage) {
		String sql="insert into Storage(goodsId,storageNumber) values(?,?)";
		Object []objects=new Object[]{
				storage.getGoodsId()
				,storage.getStorageNumber()
				};
		return DbOperation.executeUpdate(sql, objects);
	}

	public int deleteByGoodsId(String goodsId) {
		String sql="delete from Storage where goodsId=?";
		Object []objects=new Object[]{goodsId};
		return DbOperation.executeUpdate(sql, objects);
	}
	public int updateStorage(Storage storage) {
		String sql="update Storage set goodsId=? ,storageNumber=? where goodsId=?";
		Object[]objects=new Object[]{
				storage.getGoodsId()
				,storage.getStorageNumber()
				,storage.getGoodsId()};
		return DbOperation.executeUpdate(sql, objects);
	}
	public Storage findByGoodsId(String goodsId) {
		String sql="select * from  Storage where goodsId=?";
		Object []objects=new Object[]{goodsId};
		OracleCachedRowSet ocrs=DbOperation.executeQuery(sql, objects);
		try 
		{
			if(ocrs.next())
			{
				return new Storage(
					ocrs.getString("goodsId")
					, ocrs.getDouble("storageNumber")
					);
			}
			else 
				return null;
					
					
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
			return null;
	}
	public List<Storage> findAll() {
		String sql="select * from Storage";
		Object []objects=new Object[]{};
		OracleCachedRowSet ocrs=DbOperation.executeQuery(sql, objects);
		List<Storage> _List=new ArrayList<Storage>();
		try {
			while(ocrs.next())
			{
				_List.add(new Storage(
						ocrs.getString("goodsId")
						, ocrs.getDouble("storageNumber")
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
