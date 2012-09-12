package com.etc.geeks.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import oracle.jdbc.rowset.OracleCachedRowSet;


public class DbOperation {
	/**
	 * 获得数据库连接
	 * @return Connection
	 */
	public static Connection getConnection(){
		Connection connection = null;
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String username = "system";
		String userpass = "admin";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection = DriverManager.getConnection(url, username, userpass);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
		return connection;
	}
	/**
	 * 关闭结ResultSet，Statement，Connection。若不存在，则传null
	 * @param rs
	 * @param statement
	 * @param connection
	 */
	public static void closeAll(ResultSet rs,
			Statement statement, Connection connection){
		try {
			if(rs != null) {
				rs.close();
			}
			if(statement != null) {
				statement.close();
			}
			if(connection != null) {
				connection.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * 执行SQL增删改语句
	 * @param sql
	 * @param objects
	 * @return 改变的行数
	 */
	public static int executeUpdate(String sql, Object[] objects){
		Connection connection = getConnection();
		PreparedStatement preparedStatement = null;
		if(connection == null) {
			System.out.println("Error: connection is null.");
			return 0;
		}
		int result = 0;
		try {
			preparedStatement = connection.prepareStatement(sql);
			for(int i = 0; i < objects.length; ++i){
				preparedStatement.setObject(i + 1, objects[i]);
			}
			result = preparedStatement.executeUpdate();
			closeAll(null, preparedStatement, connection);
			return result;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			closeAll(null, preparedStatement, connection);
		}
		return 0;
	}
	/**
	 * 执行SQL查询语句
	 * @param sql
	 * @param objects
	 * @return
	 */
	public static OracleCachedRowSet executeQuery(String sql, Object[] objects) {
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		if(conn == null) {
			System.out.println("Error: connection is null.");
			return null;
		}
		try {
			pstmt = conn.prepareStatement(sql);
			for(int i = 0; i < objects.length; ++i) {
				pstmt.setObject(i + 1, objects[i]);
			}
			rs = pstmt.executeQuery();
			OracleCachedRowSet ocrs = new OracleCachedRowSet();
			ocrs.populate(rs);
			return ocrs;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			closeAll(rs, pstmt, conn);
		}
		return null;
	}
}
