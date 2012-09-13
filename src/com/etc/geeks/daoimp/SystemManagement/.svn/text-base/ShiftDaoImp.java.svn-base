package com.etc.geeks.daoimp.SystemManagement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.etc.geeks.dao.SystemManagement.ShiftDao;
import com.etc.geeks.entity.SystemManagement.Shift;
import com.etc.geeks.util.DbOperation;

public  class ShiftDaoImp implements ShiftDao {

	public int addShift(Shift shift) {
		int result = DbOperation.executeUpdate(
				"insert into Authority values(?, ?)",
				new Object[] { shift.getShiftId(),shift.getStartTime(),shift.getEndTime()
						});
        return result;
	}

	public int deleteById(String shiftId) {
		int result = DbOperation.executeUpdate(
				"delete from Shift where shiftID = ?", new Object[] { shiftId });
		return result;
	}

	public List<Shift> findAllUsers() {
		Connection conn = DbOperation.getConnection();
		String sql = "select * from Shift";
		List<Shift> list = new ArrayList<Shift>();
		if(conn == null) {
			System.out.println("Error: connection is null.");
			return null;
		}
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				Shift shift = new Shift(rs.getString(1), rs.getString(2),rs.getString(3));
				list.add(shift);
			}
			DbOperation.closeAll(rs, pstmt, conn);
			return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	public Shift findById(String shiftId) {
		Connection conn = DbOperation.getConnection();
		String sql = "select * from Shift where shiftId = ?";
		Shift shift = null;
		
		if(conn == null) {
			System.out.println("Error: connection is null.");
			return null;
		}
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, shiftId);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				shift = new Shift(rs.getString(1), rs.getString(2),rs.getString(3));
			}
			DbOperation.closeAll(rs, pstmt, conn);
			return shift;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public int updateShift(Shift shift) {
		String sql="update Authority set   shiftId = ?,startTime = ? ,endTime = ? where shiftId=?";
		int result = DbOperation.executeUpdate(sql,
				new Object[]{
				shift.getShiftId()
				,shift.getStartTime()
				,shift.getEndTime()
				,shift.getShiftId()});
		return result;
	}


	


}
