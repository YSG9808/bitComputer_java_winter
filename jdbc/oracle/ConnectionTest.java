package com.javaex.jdbc.oracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//	JDBC 접속 테스트
public class ConnectionTest {
	
	public static void main(String[] args) {
		String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
		String dbuser = "hr";
		String dbpass = "hr";
		
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(dburl, dbuser, dbpass);
			System.out.println(conn);
			System.out.println("연결 성공!");
		} catch (ClassNotFoundException e) {
			System.err.println("JDBC 드라이버를 찾지 못했습니다.");
			e.printStackTrace();
		} catch (SQLException e) {
			System.err.println("SQLError!");
		} finally {
			try {
				conn.close();
			} catch (Exception e) {
				
			}
		}
	}

}
