package com.etc.geeks.daoimp.SystemManagement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.etc.geeks.dao.SystemManagement.ShiftGuestDao;
import com.etc.geeks.entity.SystemManagement.ShiftGuest;
import com.etc.geeks.util.DbOperation;

public class ShiftGuestDaoImp implements ShiftGuestDao{

	public int addShiftGuest(ShiftGuest shiftGuest) {
		int result = DbOperation.executeUpdate(
				"insert into Authority values(?, ?,?)",
				new Object[] { shiftGuest.getShiftHostId(),
						shiftGuest.getShiftGuestId(),
						shiftGuest.getUserId()
						});
        return result;
	}

	public int deleteById(String shiftGuestId) {
		int result = DbOperation.executeUpdate(
				"delete from ShiftGuest where shiftGuestID = ?", new Object[] { shiftGuestId });
		return result;
	}

	public List<ShiftGuest> findAllShiftGuest() {
		Connection conn = DbOperation.getConnection();
		String sql = "select * from ShiftGuest";
		List<ShiftGuest> list = new ArrayList<ShiftGuest>();
		if(conn == null) {
			System.out.println("Error: connection is null.");
			return null;
		}
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				ShiftGuest shiftGuest = new ShiftGuest(rs.getString(1), rs.getString(2),rs.getString(3));
				list.add(shiftGuest);
			}
			DbOperation.closeAll(rs, pstmt, conn);
			return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	public ShiftGuest findByGuestId(String shiftGuestId) {
		Connection conn = DbOperation.getConnection();
		String sql = "select * from ShiftGuest where shiftGuestId = ?";
		ShiftGuest shiftGuest = null;
		
		if(conn == null) {
			System.out.println("Error: connection is null.");
			return null;
		}
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, shiftGuestId);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				shiftGuest = new ShiftGuest(rs.getString(1), rs.getString(2),rs.getString(3));
			}
			DbOperation.closeAll(rs, pstmt, conn);
			return shiftGuest;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public int updateShiftGuest(ShiftGuest shiftGuest) {
		String sql="update Authority set  ShiftHostId = ?, shiftGuestid = ? ,UserId = ? where shiftGuestId=?";
		int result = DbOperation.executeUpdate(sql,
				new Object[]{
				shiftGuest.getShiftHostId()
				,shiftGuest.getShiftGuestId()
				,shiftGuest.getUserId()
				,shiftGuest.getShiftHostId()});
		return result;
	}


	public ShiftGuest findByHostId(String shiftHostId) {
		Connection conn = DbOperation.getConnection();
		String sql = "select * from ShiftGuest where shiftHostId = ?";
		ShiftGuest shiftGuest = null;
		
		if(conn == null) {
			System.out.println("Error: connection is null.");
			return null;
		}
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, shiftHostId);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				shiftGuest = new ShiftGuest(rs.getString(1), rs.getString(2),rs.getString(3));
			}
			DbOperation.closeAll(rs, pstmt, conn);
			return shiftGuest;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public ShiftGuest findByUserId(String userId) {
		Connection conn = DbOperation.getConnection();
		String sql = "select * from ShiftGuest where userId = ?";
		ShiftGuest shifGuest = null;
		
		if(conn == null) {
			System.out.println("Error: connection is null.");
			return null;
		}
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userId);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				shifGuest = new ShiftGuest(rs.getString(1), rs.getString(2),rs.getString(3));
			}
			DbOperation.closeAll(rs, pstmt, conn);
			return shifGuest;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
