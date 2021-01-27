package com.javaex.network.v5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class Client {
	public static void main(String[] args) {
		Socket socket = null;
		
		try {
			//	소켓 생성
			socket = new Socket();
			
			//	시작 메시지
			System.out.println("<클라이언트 시작>");
			System.out.println("[연결을 요청합니다.]");
			
			//	Connect를 시도
			InetSocketAddress remote = 
					new InetSocketAddress("127.0.0.1", 10000);
			socket.connect(remote);
			System.out.println("[서버에 연결되었습니다.]");
			
			//	서버로 메시지를 전송
			OutputStream os = socket.getOutputStream();
			Writer osw = new OutputStreamWriter(os, "UTF-8");
			BufferedWriter bw = new BufferedWriter(osw);
			
			InputStream is = socket.getInputStream();
			Reader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			
			//	키보드에서 입력을 받아 봅시다.
			BufferedReader keyReader = new BufferedReader(
					new InputStreamReader(System.in));
			
			while(true) {
				String msg = keyReader.readLine();
				
				if (msg.equals("/q")) {
					System.out.println("접속을 종료합니다.");
					break;
				}
				bw.write(msg);
				bw.newLine();
				bw.flush();
				System.out.println("전송 메시지:" + msg);
				
				String rcvMsg = br.readLine();
				System.out.println("수신 메시지:" + rcvMsg);
				
			}
			/*
			String msg = "테스트 메시지";
			bw.write(msg);
			bw.newLine();
			bw.flush();
			System.out.println("전송 메시지:" + msg);
			*/
			
			//	Echo Back된 메시지를 받아서 출력
			
			keyReader.close();
			br.close();
			bw.close();
			//	종료
			System.out.println("<클라이언트 종료>");
		} catch (ConnectException e) {
			System.out.println("[접속이 거부되었습니다.]");
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
