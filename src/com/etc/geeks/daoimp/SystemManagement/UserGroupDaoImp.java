package com.etc.geeks.daoimp.SystemManagement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.etc.geeks.dao.SystemManagement.UserGroupDao;
import com.etc.geeks.entity.SystemManagement.UserGroup;
import com.etc.geeks.util.DbOperation;

public class UserGroupDaoImp implements UserGroupDao {

	public int addUserGroup(UserGroup userGroup) {
		int result = DbOperation.executeUpdate(
				"insert into UserGroup values(?, ?)",
				new Object[] { userGroup.getAuthorityId(),
						userGroup.getSuserGroupId(),
						userGroup.getUserGroupName()
						});
        return result;
	}

	public int deleteById(String userGroupId) {
		int result = DbOperation.executeUpdate(
				"delete from UserGroup where auserGroupID = ?", new Object[] { userGroupId });
		return result;
	}

	public List<UserGroup> findAllUsers() {
		Connection conn = DbOperation.getConnection();
		String sql = "select * from UserGroup";
		List<UserGroup> list = new ArrayList<UserGroup>();
		if(conn == null) {
			System.out.println("Error: connection is null.");
			return null;
		}
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				UserGroup userGroup = new UserGroup(rs.getString(1), rs.getString(2),rs.getString(3));
				list.add(userGroup);
			}
			DbOperation.closeAll(rs, pstmt, conn);
			return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
	
		return null;
	}

	public UserGroup findByGroupName(String userGroupName) {
		Connection conn = DbOperation.getConnection();
		String sql = "select * from UserGroup where userGroupName = ?";
		UserGroup userGroup = null;
		
		if(conn == null) {
			System.out.println("Error: connection is null.");
			return null;
		}
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userGroupName);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				userGroup = new UserGroup(rs.getString(1), rs.getString(2),rs.getString(3));
			}
			DbOperation.closeAll(rs, pstmt, conn);
			return userGroup;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public UserGroup findById(String userGroupId) {
		Connection conn = DbOperation.getConnection();
		String sql = "select * from UserGroup where userGroupId = ?";
		UserGroup userGroup = null;
		
		if(conn == null) {
			System.out.println("Error: connection is null.");
			return null;
		}
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userGroupId);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				userGroup = new UserGroup(rs.getString(1), rs.getString(2),rs.getString(3));
			}
			DbOperation.closeAll(rs, pstmt, conn);
			return userGroup;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public int updateUserGroup(UserGroup userGroup) {
		String sql="update UserGroup set   userGroupId = ?,userGroupName = ?,AuthorityId = ? where userGroupId=?";
		int result = DbOperation.executeUpdate(sql,
				new Object[]{
				userGroup.getSuserGroupId()
				,userGroup.getUserGroupName()
				,userGroup.getAuthorityId()
				,userGroup.getSuserGroupId()});
		return result;
	}

	public UserGroup findByAuthorityId(String authorityId) {
		Connection conn = DbOperation.getConnection();
		String sql = "select * from UserGroup where authorityId = ?";
		UserGroup userGroup = null;
		
		if(conn == null) {
			System.out.println("Error: connection is null.");
			return null;
		}
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, authorityId);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				userGroup = new UserGroup(rs.getString(1), rs.getString(2),rs.getString(3));
			}
			DbOperation.closeAll(rs, pstmt, conn);
			return userGroup;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
