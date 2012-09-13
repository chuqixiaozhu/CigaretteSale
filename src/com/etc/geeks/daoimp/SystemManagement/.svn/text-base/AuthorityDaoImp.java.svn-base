package com.etc.geeks.daoimp.SystemManagement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.etc.geeks.dao.SystemManagement.AuthorityDao;
import com.etc.geeks.entity.SystemManagement.Authority;
import com.etc.geeks.util.DbOperation;

public class AuthorityDaoImp implements AuthorityDao {

	public int addAuthority(Authority authority) {
		int result = DbOperation.executeUpdate(
				"insert into Authority values(?, ?)",
				new Object[] { authority.getAuthorityId(), authority.getAuthorityName()
						});
        return result;
	}

	public int deleteById(String authorityId) {
		int result = DbOperation.executeUpdate(
				"delete from Authority where authorityID = ?", new Object[] { authorityId });
		return result;
	}

	public List<Authority> findAll() {
		Connection conn = DbOperation.getConnection();
		String sql = "select * from Authority";
		List<Authority> list = new ArrayList<Authority>();
		if(conn == null) {
			System.out.println("Error: connection is null.");
			return null;
		}
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				Authority authority = new Authority(rs.getString(1), rs.getString(2));
				list.add(authority);
			}
			DbOperation.closeAll(rs, pstmt, conn);
			return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	public Authority findByAuthorityName(String authorityName) {
		Connection conn = DbOperation.getConnection();
		String sql = "select * from Authority where authorityName = ?";
		Authority authority = null;
		
		if(conn == null) {
			System.out.println("Error: connection is null.");
			return null;
		}
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, authorityName);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				authority = new Authority(rs.getString(1), rs.getString(2));
			}
			DbOperation.closeAll(rs, pstmt, conn);
			return authority;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public Authority findById(String authorityId) {
		Connection conn = DbOperation.getConnection();
		String sql = "select * from Authority where authorityId = ?";
		Authority authority = null;
		
		if(conn == null) {
			System.out.println("Error: connection is null.");
			return null;
		}
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, authorityId);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				authority = new Authority(rs.getString(1), rs.getString(2));
			}
			DbOperation.closeAll(rs, pstmt, conn);
			return authority;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;	}

	public int updateAuthority(Authority authority) {
		String sql="update Authority set   authorityId = ?,authorityName = ? where authorityId=?";
		int result = DbOperation.executeUpdate(sql,
				new Object[]{
				authority.getAuthorityId()
				,authority.getAuthorityName()
				,authority.getAuthorityId()});
		return result;
	}

}
