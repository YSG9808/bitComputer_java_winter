package com.javaex.network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressEx {

	public static void main(String[] args) {
		printServerIp("www.google.com");
		printServerIp("www.naver.com");
		
	}
	
	private static void printServerIp(String hostName) {
		try {
			//	내 IP 주소 확인
			InetAddress local = InetAddress.getLocalHost();
			System.out.println("IP Address:" + local.getHostAddress());
			
			//	www.google.com 의 서버 IP를 받아와 봅시다
			//String hostName = "www.naver.com";
			
			InetAddress[] adrs = InetAddress.getAllByName(hostName);
			for (InetAddress remote:adrs) {
				System.out.println(hostName + " IP Address:" +
									remote.getHostAddress());
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
}
