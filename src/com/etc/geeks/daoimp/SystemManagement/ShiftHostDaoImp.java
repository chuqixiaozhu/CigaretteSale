package com.etc.geeks.daoimp.SystemManagement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.etc.geeks.dao.SystemManagement.ShiftHostDao;
import com.etc.geeks.entity.SystemManagement.ShiftHost;
import com.etc.geeks.util.DbOperation;

public  class ShiftHostDaoImp implements ShiftHostDao {

	public int addShiftHost(ShiftHost shiftHost) {
		int result = DbOperation.executeUpdate(
				"insert into Authority values(?, ?,?)",
				new Object[] { shiftHost.getShiftHostId(),shiftHost.getStartTime(),shiftHost.getEndTime()
						});
        return result;
	}

	public int deleteById(String shiftHostId) {
		int result = DbOperation.executeUpdate(
				"delete from ShiftHost where shiftHostID = ?", new Object[] { shiftHostId });
		return result;
	}

	public List<ShiftHost> findAllShiftHost() {
		Connection conn = DbOperation.getConnection();
		String sql = "select * from ShiftHost";
		List<ShiftHost> list = new ArrayList<ShiftHost>();
		if(conn == null) {
			System.out.println("Error: connection is null.");
			return null;
		}
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				ShiftHost shiftHost = new ShiftHost(rs.getString(1), rs.getString(2),rs.getString(3));
				list.add(shiftHost);
			}
			DbOperation.closeAll(rs, pstmt, conn);
			return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	public ShiftHost findById(String shiftHostId) {
		Connection conn = DbOperation.getConnection();
		String sql = "select * from ShiftHost where shiftHostId = ?";
		ShiftHost shiftHost = null;
		
		if(conn == null) {
			System.out.println("Error: connection is null.");
			return null;
		}
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, shiftHostId);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				shiftHost = new ShiftHost(rs.getString(1), rs.getString(2),rs.getString(3));
			}
			DbOperation.closeAll(rs, pstmt, conn);
			return shiftHost;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public int updateShiftHost(ShiftHost shiftHost) {
		String sql="update Authority set   shiftHostId = ?,startTime = ? ,endTime = ? where shiftHostId=?";
		int result = DbOperation.executeUpdate(sql,
				new Object[]{
				shiftHost.getShiftHostId()
				,shiftHost.getStartTime()
				,shiftHost.getEndTime()
				,shiftHost.getShiftHostId()});
		return result;
	}

}
