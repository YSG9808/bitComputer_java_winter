package com.javaex.jdbc.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class HRSearchEmployeesPstmt {

	public static void main(String[] args) {
		String dburl = "jdbc:mysql://localhost:3306/hr?useSSL=false&serverTimezone=UTC";
		Connection conn = null;
		//Statement stmt = null;
		PreparedStatement pstmt = null;
		
		ResultSet rs = null;
		Scanner scanner = new Scanner(System.in);
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(dburl, "dev", "dev");
		
			System.out.print("이름을 입력하세요:");
			String keyword = scanner.next();
			
			/*
			String sql = "SELECT first_name, last_name, "
					+ "email, phone_number, hire_date "
					+ "FROM employees " 
					+ "WHERE lower(first_name) LIKE '%" + keyword.toLowerCase() + "%'"
					+ " OR lower(last_name) LIKE '%" + keyword.toLowerCase() + "%'";
			System.out.println("QUERY:" + sql);
			
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			*/
			String sql = "SELECT first_name, last_name, "
					+ "email, phone_number, hire_date "
					+ "FROM employees "
					+ "WHERE lower(first_name) LIKE ? "
					+ " OR lower(last_name) LIKE ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "%" + keyword.toLowerCase() + "%");
			pstmt.setString(2, "%" + keyword.toLowerCase() + "%");
			
			rs = pstmt.executeQuery();
			
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
				//stmt.close();
				pstmt.close();
				conn.close();
			} catch (Exception e) {
				
			}
		}
		scanner.close();
	}

}
