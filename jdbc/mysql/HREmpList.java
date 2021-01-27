package com.javaex.jdbc.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class HREmpList {

	public static void main(String[] args) {
		String dburl = "jdbc:mysql://localhost:3306/hr?useSSL=false&serverTimezone=UTC";
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		String dbuser = "employees";
		String dbpass = "employees";
		
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			conn = DriverManager.getConnection(dburl, dbuser, dbpass);
			String sql = "SELECT concat(emp.first_name, ' ', emp.last_name) as name,"
					+ " concat(mgr.first_name, ' ', mgr.last_name) "
					+ " FROM employees emp, employees mgr "
					+ " WHERE emp.manager_id = mgr.employee_id"
					+ " ORDER BY name DESC";
			
			System.out.println(sql);
			stmt = conn.prepareStatement(sql);
			
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				String empName = rs.getString("name");
				String mgrName = rs.getString(2);
				
				System.out.printf("Name: %s, Manager: %s%n", empName, mgrName);
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
