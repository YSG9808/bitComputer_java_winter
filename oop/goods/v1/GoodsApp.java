package com.javaex.oop.goods.v1;

//	v1
class Goods {
	//	필드 선언
	String name;
	int price;
}

public class GoodsApp {

	public static void main(String[] args) {
		Goods notebook = new Goods();
		notebook.name = "Dell XPS";
		notebook.price = 2000000;
		
		Goods camera = new Goods();
		camera.name = "Nikon";
		camera.price = 700000;
		
		System.out.printf("%s, %d원%n", 
				notebook.name,
				notebook.price);
		
		System.out.printf("%s, %d원%n", 
				camera.name,
				camera.price);
	}

}