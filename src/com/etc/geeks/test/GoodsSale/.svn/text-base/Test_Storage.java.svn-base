package com.etc.geeks.test.GoodsSale;

import com.etc.geeks.dao.StorageManagement.StorageDao;
import com.etc.geeks.daoimp.StorageManagement.StorageDaoImp;
import com.etc.geeks.entity.StorageManagement.Storage;

public class Test_Storage {

	static public void main(String args[]){
		StorageDao sto=new StorageDaoImp();
		Storage stoo=new Storage("003", 300);
		/****************增加***OK**********************/
		//sto.addStorage(stoo);
		/********************删除**OK*******************/
		sto.deleteByGoodsId("003");
		/************************修改*OK****************/
		//sto.updateStorage(stoo);
		/****************************查询****OK*********/
		//System.out.println(sto.findAll());
		//System.out.println(sto.findByGoodsId("001"));		
	}
}
