package com.javaex.oop.shape.v2;

public class ShapeApp {

	public static void main(String[] args) {
//		Shape s = new Shape();	//	안되요
		
		Rectangle r = new Rectangle(10, 20, 100, 50);
		r.draw();
		
		Circle c = new Circle(10, 10, 30);
		c.draw();
		
		Point p = new Point(100, 100);
		p.draw();
		
		Drawable obj = r;
//		Drawable objs[] = new Drawable[3] {
//			r, c, p
//		};
		
		if (obj instanceof Drawable) {
			obj.draw();
		}
		
		obj = c;
		
		if (obj instanceof Drawable) {
			obj.draw();
		}
		
		printObject(obj);
		
		
	}
	
	public static void printObject(Drawable obj) {
		obj.draw();
	}

}
