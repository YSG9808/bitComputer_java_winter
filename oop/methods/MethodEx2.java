package com.javaex.oop.methods;

public class MethodEx2 {

	public static void main(String[] args) {
		System.out.println(getSum(new double[] {
				1, 2, 3, 4, 5, 6, 7, 8, 9, 0
		}));
		System.out.println(getSumVar(
				1, 2, 3, 4, 5, 6, 7, 8, 9, 0
				));
		printTotal("합계", 
				1, 2, 3, 4, 5, 6, 7, 8, 9, 0
				);

	}
	//	고정 매개변수와 가변 인수를 함께 쓸 수 있다
	public static void printTotal(String message,
			double ... values
			) {
		System.out.println(message + " " 
			+ getSumVar(values));
	}
	
	//	가변 인수를 이용한 다수의 인수 전달
	public static double getSumVar(double ... values) {
//		double total = 0;
//		
//		for (double value:values) {
//			total += value;
//		}
//		
//		return total;
		return getSum(values);
	}
	
//	배열을 이용한 가변 인수 전달
	public static double getSum(double[] values) {
		double total = 0;
		
		for (double value:values) {
			total += value;
		}
		
		return total;
	}
	

}
