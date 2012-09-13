package com.etc.geeks.test.GoodsSale;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.etc.geeks.dao.GoodsSale.SalesHostDao;
import com.etc.geeks.daoimp.GoodsSale.SalesHostDaoImp;
import com.etc.geeks.entity.GoodsSale.SalesHost;

public class Test {
	
	
	static public void main(String args[])
	{
		
		SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date dt = null;
		try {
			dt = format.parse("1999-01-01 00:00:00");
	        SalesHostDao shDao=new SalesHostDaoImp();	
/* 添加Ok 
			SalesHost sh=new SalesHost(dt,"002", "001");	
			System.out.println(sh);	
			shDao.addSalesHost(sh);	
*/
/* 修改Ok   
	        
			SalesHost salesHost=new SalesHost(dt,"001", "001");	
			System.out.println(salesHost);	
			shDao.updateSalesHost(salesHost);
*/
      

/* 删除Ok    
	        shDao.deleteBySalesHostId("001");
*/
	        System.out.println(shDao.findBySalesHostId("001"));
	        System.out.println(shDao.findByUserId("001"));
	        System.out.println(shDao.findByDate(format.parse("1000-01-01 00:00:00"), format.parse("2000-01-01 00:00:00")));
	        System.out.println(shDao.findAll());
			
			
//			SalesGuestDao sgDao=new SalesGuestDaoImp();
/*			Test添加OK
			SalesGuest salesGuest=new SalesGuest("001", "002", "包", "001",1.0, 55,"会员价", 1);
			sgDao.addSalesGuset(salesGuest);
*/		
/*			Test修改Ok	
			SalesGuest salesGuest=new SalesGuest("001", "001", "包", "001",1.0, 100,"零售价", 1);
			sgDao.updateSalesGuest(salesGuest);
*/	
/*			Test删除Ok
			sgDao.deleteBySalesGuestId("001");
	
		
			/*			Test修改Ok
			System.out.println(sgDao.findByGoodsId("001"));
			System.out.println(sgDao.findBySalesHostId("002"));
			System.out.println(sgDao.findBySalesGuestId("003"));
	*/			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
		
		
	}


	
}
