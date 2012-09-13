package com.etc.geeks.daoimp.SystemManagement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.etc.geeks.dao.SystemManagement.UserDao;
import com.etc.geeks.entity.SystemManagement.User;
import com.etc.geeks.util.DbOperation;

public class UserDaoImp implements UserDao {

	public int addUser(User user) {
		int result = DbOperation.executeUpdate(
						"insert into Users values(?, ?, ?, ?, ?, ?, ?)",
						new Object[] { user.getUserId(), user.getUserName(),
								user.getPassword(), user.getGender(),
								user.getAuthorityId(), user.getUserGroupId(),
								user.getShiftId()});
		return result;
	}

	public int deleteById(String userId) {
		int result = DbOperation.executeUpdate(
				"delete from Users where userId = ?", new Object[] { userId });
		return result;
	}

	public List<User> findAllUsers() {
		Connection conn = DbOperation.getConnection();
		String sql = "select * from User";
		List<User> list = new ArrayList<User>();
		if(conn == null) {
			System.out.println("Error: connection is null.");
			return null;
		}
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				User user = new User(rs.getString(1), rs.getString(2),
						rs.getString(3), rs.getString(4),
						rs.getString(5), rs.getString(6),
						rs.getString(7));
				list.add(user);
			}
			DbOperation.closeAll(rs, pstmt, conn);
			return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	public User findByAuthorityId(String authorityId) {
		Connection conn = DbOperation.getConnection();
		String sql = "select * from User where authorityId = ?";
		User user = null;
		
		if(conn == null) {
			System.out.println("Error: connection is null.");
			return null;
		}
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, authorityId);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				user = new User(rs.getString(1), rs.getString(2),
						rs.getString(3), rs.getString(4),
						rs.getString(5), rs.getString(6),
						rs.getString(7));
			}
			DbOperation.closeAll(rs, pstmt, conn);
			return user;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	public User findByUserGroupId(String userGroupId) {
		Connection conn = DbOperation.getConnection();
		String sql = "select * from User where userGroupId = ?";
		User user = null;
		
		if(conn == null) {
			System.out.println("Error: connection is null.");
			return null;
		}
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userGroupId);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				user = new User(rs.getString(1), rs.getString(2),
						rs.getString(3), rs.getString(4),
						rs.getString(5), rs.getString(6),
						rs.getString(7));
			}
			DbOperation.closeAll(rs, pstmt, conn);
			return user;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public User findByName(String userName) {
		Connection conn = DbOperation.getConnection();
		String sql = "select * from User where userName = ?";
		User user = null;
		
		if(conn == null) {
			System.out.println("Error: connection is null.");
			return null;
		}
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userName);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				user = new User(rs.getString(1), rs.getString(2),
						rs.getString(3), rs.getString(4),
						rs.getString(5), rs.getString(6),
						rs.getString(7));
			}
			DbOperation.closeAll(rs, pstmt, conn);
			return user;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public int updateUser(User user) {
		int result = DbOperation.executeUpdate(
				"update Users set userName = ?, password = ?," +
				"gender = ?, authorityId = ?, userGroupId = ?," +
				"shiftId = ? where userId = '" + user.getUserId() + "'",
				new Object[]{user.getUserName(), user.getPassword(),
					user.getGender(), user.getAuthorityId(),
					user.getUserGroupId(), user.getShiftId()});
		return result;
	}

	public User findById(String userId) {
		Connection conn = DbOperation.getConnection();
		String sql = "select * from User where userId = ?";
		User user = null;
		
		if(conn == null) {
			System.out.println("Error: connection is null.");
			return null;
		}
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userId);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				user = new User(rs.getString(1), rs.getString(2),
						rs.getString(3), rs.getString(4),
						rs.getString(5), rs.getString(6),
						rs.getString(7));
			}
			DbOperation.closeAll(rs, pstmt, conn);
			return user;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	/*
	 * public boolean isExistById(String userId) { // TODO Auto-generated method
	 * stub return false; }
	 */

}
