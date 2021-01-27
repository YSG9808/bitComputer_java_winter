package com.javaex.jdbc.mariadb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//	JDBC 접속 테스트
public class ConnectionTest {
	
	public static void main(String[] args) {
		//jdbc:mysql://localhost:3306/mydb?useUnicode=true&characterEncoding=utf8
		String dburl = "jdbc:mariadb://localhost:13306/test?autoReconnect=true&verifyServerCertificate=false&useSSL=false";
		String dbuser = "employees";
		String dbpass = "employees";
		
		Connection conn = null;
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			conn = DriverManager.getConnection(dburl, dbuser, dbpass);
			System.out.println(conn);
			System.out.println("연결 성공!");
		} catch (ClassNotFoundException e) {
			System.err.println("JDBC 드라이버를 찾지 못했습니다.");
			e.printStackTrace();
		} catch (SQLException e) {
			System.err.println("SQLError!");
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (Exception e) {
				
			}
		}
	}

}
