package com.javaex.jdbc.mariadb;

import java.util.List;
import java.util.Scanner;

public class GuestbookApp {

	public static void main(String[] args) {
//		testGuestbookList();
//		testGuestbookInsert();
		testGuestbookDelete();
	}
	
	private static void testGuestbookList() {
		GuestbookDao dao = new GuestbookDaoImpl();
		List<GuestbookVo> list = dao.selectAll();
		
		System.out.println("[방명록]");
		System.out.println("==========");
		for (GuestbookVo vo: list) {
			System.out.println(vo);
		}
		System.out.println("==========");
	}
	
	private static void testGuestbookInsert() {
		testGuestbookList();
		GuestbookDao dao = new GuestbookDaoImpl();
	
		Scanner scanner = new Scanner(System.in);
		System.out.print("이름:");
		String name = scanner.next();
		System.out.print("비밀번호:");
		String password = scanner.next();
		System.out.print("메시지:");
		String message = scanner.next();
		
		GuestbookVo vo = new GuestbookVo(null, name, password, message, null);
		int insertedCount = dao.insert(vo);
		
		System.out.printf("%d개의 방명록이 작성되었습니다.%n", insertedCount);
		
		testGuestbookList();
		scanner.close();
	}

	private static void testGuestbookDelete() {
		testGuestbookList();
		GuestbookDao dao = new GuestbookDaoImpl();
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("삭제할 방명록의 번호:");
		Long no = scanner.nextLong();
		System.out.print("비밀번호:");
		String password = scanner.next();
		
		int deletedCount = dao.delete(no, password);
		
		System.out.println("Delete Count:" + deletedCount);
		
		testGuestbookList();
		scanner.close();
	}
}
