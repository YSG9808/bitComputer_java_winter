package com.javaex.oop.goods.v2;

//	v2 app
public class GoodsApp {

	public static void main(String[] args) {
		Goods notebook = new Goods();
//		notebook.name = "Dell XPS";
//		notebook.price = 2000000;
		notebook.setName("Dell XPS");
		notebook.setPrice(2000000);
		
		Goods camera = new Goods();
//		camera.name = "Nikon";
//		camera.price = 700000;
		camera.setName("Nikon");
		camera.setPrice(700000);
		
//		System.out.printf("%s, %d원%n", 
//				notebook.name,
//				notebook.price);
//		
		System.out.printf("%s, %d원%n", 
				notebook.getName(),
				notebook.getPrice());
		
		notebook.showInfo();
		
//		System.out.printf("%s, %d원%n", 
//				camera.name,
//				camera.price);
		System.out.printf("%s, %d원%n", 
				camera.getName(),
				camera.getPrice());
		camera.showInfo();
		
	}

}
