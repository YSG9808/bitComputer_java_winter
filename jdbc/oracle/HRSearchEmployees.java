package com.javaex.jdbc.oracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class HRSearchEmployees {

	public static void main(String[] args) {
		String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		Scanner scanner = new Scanner(System.in);
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(dburl, "hr", "hr");
		
			System.out.print("이름을 입력하세요:");
			String keyword = scanner.next();
			
			String sql = "SELECT first_name, last_name, "
					+ "email, phone_number, hire_date "
					+ "FROM employees " 
					+ "WHERE lower(first_name) LIKE '%" + keyword.toLowerCase() + "%'"
					+ " OR lower(last_name) LIKE '%" + keyword.toLowerCase() + "%'";
			System.out.println("QUERY:" + sql);
			
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				System.out.printf("%s %s: %s, %s, %s%n", 
						rs.getString(1),
						rs.getString(2),
						rs.getString(3),
						rs.getString(4),
						rs.getString(5));
			}
		} catch (ClassNotFoundException e) {
			System.err.println("JDBC 드라이버를 로드하지 못했습니다.");
		} catch (SQLException e) {
			System.err.println("SQLError:" + e.getMessage());
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e) {
				
			}
		}
		scanner.close();
	}

}
