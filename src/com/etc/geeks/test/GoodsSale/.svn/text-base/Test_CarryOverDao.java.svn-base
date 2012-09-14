package com.etc.geeks.test.GoodsSale;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.etc.geeks.dao.StorageManagement.CarryOverGuestDao;
import com.etc.geeks.dao.StorageManagement.CarryOverHostDao;
import com.etc.geeks.daoimp.StorageManagement.CarryOverGuestDaoImp;
import com.etc.geeks.daoimp.StorageManagement.CarryOverHostDaoImp;
import com.etc.geeks.entity.StorageManagement.CarryOverGuest;
import com.etc.geeks.entity.StorageManagement.CarryOverHost;

public class Test_CarryOverDao {

	static public void main(String args[]){
		SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date dt=null;
		Date dx=null;
		Date dc=null;

		try {
			dt = format.parse("1999-01-11 00:00:00");
			dx = format.parse("1998-01-01 00:00:00");
			dc = format.parse("2000-02-01 00:00:00");
			CarryOverHostDao carryh=new CarryOverHostDaoImp();
			CarryOverHost cah=new CarryOverHost("002","002",dt);
			
			CarryOverGuestDao carryg=new CarryOverGuestDaoImp();
			CarryOverGuest ca=new CarryOverGuest("002", "002", "002", "包", 66.0, 12.0, 12.0);
			System.out.println(carryh.findAll());
			System.out.println(carryg.findAll());			
			/**********添加ok**********************/
			//System.out.println(cah);
			//carryh.addCarryOverHost(cah);
			//System.out.println(ca);
			//carryg.addCarryOverGuest(ca);
			/************删除ok***************/
			//carryg.deleteByCarryOverGuestId("001");
			//carryh.deleteByCarryOverHostId("001");

			/************修改ok*************************/
			//carryh.updateCarryOverHost(cah);
			//carryg.updateCarryOverGuest(ca);
			
			/**************按ID查找ok**********************/
			//ok System.out.println(carryh.findByCarryOverHostDate(format.parse("1000-01-01 00:00:00"), format.parse("2000-01-01 00:00:00")));
			//ok  System.out.println(carryh.findByCarryOverHostIdId("001"));
			//ok  System.out.println(carryh.findByUserId("001"));
			//System.out.println(carryg.findByCarryOverGuestId("001"));
			//System.out.println(carryg.findByCarryOverHostId("001"));
			//System.out.println(carryg.findByGoodsId("001"));
			/**************查询全部ok***********************/
			System.out.println(carryh.findAll());
			System.out.println(carryg.findAll());	
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
}
