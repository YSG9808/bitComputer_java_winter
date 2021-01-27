package com.javaex.basic.loop;

public class Gugudan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//	단수를 돌립시다
		for (int dan = 2; dan <= 9; dan++) {
			//	중첩 Loop
			
			for (int num = 1; num <= 9; num++) {
				System.out.println(dan + "*" + num + "=" 
								+ dan * num);
			}
		}
	}

}
