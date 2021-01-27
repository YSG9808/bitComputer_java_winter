package com.javaex.io.bytestream;

import java.io.File;
import java.io.IOException;

public class FileClassEx {
	static String rootPath = System.getProperty("user.dir") + "\\files\\";
	
	public static void main(String[] args) {
		//	파일 객체 
		File root = new File(rootPath);
		//	파일이 실제 존재하는지 확인
		System.out.println(rootPath + ":" + root.exists());
		//	파일의 정보를 출력
		printInfo(root);
		
		if (!root.exists()) {
			//	디렉터리 만들기
			root.mkdirs();
		}
		
		//	디렉터리 안쪽에 파일을 만들어 봅시다
		File file = new File(rootPath + "myfile.txt");
		if (!file.exists()) {	//	파일이 없으면 생성
			try {
				file.createNewFile();
			} catch (IOException e) {
				System.out.println("파일을 만들지 못했어요.");
			}
		}
		
		printInfo(root);
		
		//	파일 지우기
		file.delete();
		printInfo(root);
	}
	
	static void printInfo(File f) {
		System.out.println("----------");
		
		//	이 파일 객체가 디렉토리인지 확인 해 봅시다
		if (f.isDirectory()) {
			System.out.println("Directory: " + f.getName());
			File[] files = f.listFiles();
			//	파일 리스트 출력
			for (File file:files) {
				System.out.print(file.isDirectory() ? "d ": "f ");
				System.out.println(file.getName());
			}
		} else {	//	디렉터리 아닙니다
			System.out.println("File: " + f.getName());
		}
		System.out.println("----------");
	}

}
