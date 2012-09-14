package com.etc.geeks.test.GoodsSale;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.etc.geeks.dao.StorageManagement.InStoreGuestDao;
import com.etc.geeks.dao.StorageManagement.InStoreHostDao;
import com.etc.geeks.daoimp.StorageManagement.InStoreGuestDaoImp;
import com.etc.geeks.daoimp.StorageManagement.InStoreHostDaoImp;
import com.etc.geeks.entity.StorageManagement.InStoreGuest;
import com.etc.geeks.entity.StorageManagement.InStoreHost;

public class Test_InStoreDao {
	static public void main(String args[]){
		SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date dt=null;
		Date dx=null;
		Date dc=null;
		try {
			 
			dt = format.parse("1999-01-11 00:00:00");
			dx = format.parse("1997-01-01 00:00:00");
			dc = format.parse("1999-02-21 00:00:00");
			InStoreHostDao inhd=new InStoreHostDaoImp();
			InStoreHost inh=new InStoreHost("001", "合格", "01", "004", dc, dc);
			//InStoreHost inn=new InStoreHost(checkerId, checkFlag, supplierId, inStoreHostId, inStoreDate, checkDate);
		    InStoreGuestDao ingd=new InStoreGuestDaoImp();
		    InStoreGuest ing=new InStoreGuest("003", "003", "002", "包", 100, 12, 1200);
		   // InStoreGuest ing=new InStoreGuest(inStoreGuestId, inStoreHostId, goodsId, unit, inStoreGuestNumber, price, amount);
		    /**************增加*OK**********************/
		   // inhd.addInStoreHost(inh);
		    //ingd.addInStoreGuest(ing);
		    /******************删除******************/
		    inhd.deleteByInStoreHostId("004");
		   // ingd.deleteByInStoreGuestId("001");
		    /**********************修改**OK***********/
		   // inhd.updateInStoreHost(inh);
		   // ingd.updateInStoreGuest(ing);
		    
		    /**************************查询**********/
		    
		    //System.out.println(inhd.findAll());
		    
		    System.out.println(inhd.findByCheckDate( dc,dx));
		   //  System.out.println(inhd.findByCheckerId("001"));
		  System.out.println(inhd.findByInStoreDate( dx,dc));
		    //  System.out.println(inhd.findByInStoreHostId("001"));
		   // System.out.println(inhd.findBySupplierId("01"));
		   // System.out.println(ingd.findByGoodsId("001"));
		   // System.out.println(ingd.findByInStoreGuestId("001"));
		    //System.out.println(ingd.findByInStoreHostId("001"));
		  // System.out.println(ingd.findAll());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
