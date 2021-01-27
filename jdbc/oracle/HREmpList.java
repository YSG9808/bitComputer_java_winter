package com.javaex.jdbc.oracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class HREmpList {

	public static void main(String[] args) {
		String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(dburl, "hr", "hr");
			String sql = "SELECT emp.first_name || ' ' || emp.last_name as name,"
					+ " mgr.first_name || ' ' || mgr.last_name "
					+ " FROM employees emp, employees mgr "
					+ " WHERE emp.manager_id = mgr.employee_id"
					+ " ORDER BY name DESC";
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
