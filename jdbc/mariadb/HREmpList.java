package com.javaex.jdbc.mariadb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class HREmpList {

	public static void main(String[] args) {
		String dburl = "jdbc:mariadb://localhost:13306/employees?autoReconnect=true&verifyServerCertificate=false&useSSL=false";
		String dbuser = "employees";
		String dbpass = "employees";
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			conn = DriverManager.getConnection(dburl, dbuser, dbuser);
//			String sql = "SELECT concat(emp.first_name, ' ', emp.last_name) as name,"
//					+ " concat(mgr.first_name, ' ', mgr.last_name) "
//					+ " FROM employees emp, employees mgr "
//					+ " WHERE emp.manager_id = mgr.employee_id"
//					+ " ORDER BY name DESC";
			
			String sql = "SELECT concat(first_name, ' ', last_name) as full_name, " +
					"birth_date, gender FROM employees";
			
			stmt = conn.prepareStatement(sql);
			
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				String fullName = rs.getString("full_name");
				Date birthDate = rs.getDate(2);
				String gender = rs.getString(3);
				
//				System.out.printf("Name: %s, Manager: %s%n", empName, mgrName);
				SimpleDateFormat sdf = new SimpleDateFormat("YYYY-mm-dd");
				System.out.printf("Name:%s, Birthday: %s, Gender: %s%n", fullName, sdf.format(birthDate), gender);
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
