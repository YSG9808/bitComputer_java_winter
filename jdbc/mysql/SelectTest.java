package com.javaex.jdbc.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectTest {

	public static void main(String[] args) {
		String dburl = "jdbc:mysql://localhost:3306/hr?useSSL=false&serverTimezone=UTC";
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(dburl, "dev", "dev");
			stmt = conn.createStatement();
			String sql = "SELECT department_id, department_name" +
					" FROM departments";
			
			rs = stmt.executeQuery(sql);
			
			//System.out.println(rs);
			while(rs.next()) {
				String deptId = rs.getString(1);
				String deptName = rs.getString("department_name");
				
				System.out.printf("%s:%s%n", deptId, deptName);
			}
		} catch (ClassNotFoundException e) {
			System.err.println("JDBC 드라이버를 로드하지 못했습니다.");
		} catch (SQLException e) {
			System.err.println("SQLError");
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e) {
				
			}
		}

	}

}
