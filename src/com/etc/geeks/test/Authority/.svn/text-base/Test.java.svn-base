package com.etc.geeks.test.Authority;

import com.etc.geeks.dao.SystemManagement.AuthorityDao;
import com.etc.geeks.daoimp.SystemManagement.AuthorityDaoImp;
import com.etc.geeks.entity.SystemManagement.Authority;

public class Test {

	static public void main(String []args)
	{
		
		AuthorityDao authDao=new AuthorityDaoImp();
		
		Authority auth=new Authority("002", "name2");
		
		
	authDao.updateAuthority(auth);
		
	System.out.println(authDao.findByAuthorityName("name2"));
		
		
		
		
		
	}
}
