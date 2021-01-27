package com.javaex.network.v5;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Server {

	public static void main(String[] args) {
		//	서버 소켓을 생성
		ServerSocket serverSocket = null;
//		List<Socket> clients = new ArrayList<>();
		
		try {
			//	바인드
			serverSocket = new ServerSocket();
			InetSocketAddress local = new InetSocketAddress("127.0.0.1", 10000);
			serverSocket.bind(local);
			
			//	시작 메시지를 출력
			System.out.println("<서버 시작>");
			System.out.println("[연결을 기다립니다.]");
			
			//	연결을 기다려 봅니다: 대기 상태
			while(true) {
				Socket socket = serverSocket.accept();
//				clients.add(socket);
				Thread thread = new ServerThread(socket);
				thread.start();
			}
			
			//	후처리
//			System.out.println("==========");
//			System.out.println("<서버 종료>");
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				serverSocket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
