package com.javaex.oop.summary;

abstract class Animal {
	protected String name;
	protected int age;
	
	public Animal(String name) {
		this.name = name;
	}
	
	public Animal(String name, int age) {
		this(name);
		this.age = age;
	}
	
	public abstract void say();	//	Must override

	public void eat() {
		System.out.printf("%s is eating...%n", name);
	}
}

class Panda extends Animal {
	public Panda(String name, int age) {
		super(name, age);
	}
	
	public void say() {
		System.out.println("zzz...");
	}
}

class Human extends Animal {
	public Human(String name, int age) {
		super(name, age);
	}
	
	public void say() {
		System.out.printf("안녕, 내 이름은 %s야%n", name);
	}
}

interface Kungfu {
	public void kungfu();
}

interface Flyable {
	public void fly();
}

class TheOne extends Human implements Kungfu, Flyable {
	public TheOne(String name, int age) {
		super(name, age);
	}

	@Override
	public void fly() {
		System.out.println(name + ": I believe I can fly!");
	}

	@Override
	public void kungfu() {
		System.out.println(name + ": I know Kungfu!");
	}
}

class KungfuPanda extends Panda implements Kungfu {
	public KungfuPanda(String name, int age) {
		super(name, age);
	}

	@Override
	public void kungfu() {
		System.out.println(name + ": 아뵤~!");
	}
}

public class SummaryApp {
	static Kungfu[] dojang;
	
	
	public static void main(String[] args) {
		Human h1 = new Human("남승균", 48);
		Human h2 = new TheOne("네오", 50);
		Panda p1 = new Panda("핑", 30);
		Panda p2 = new KungfuPanda("포", 15);
	
		fight(h1);
		fight(h2);
		fight(p1);
		fight(p2);
		
		//	쿵후 명인 목록에 등록해 봅시다.
		dojang = new Kungfu[] {
//				(Kungfu)h1, 
				(Kungfu)h2, 
//				(Kungfu)p1, 
				(Kungfu)p2
		};
		
		for (Kungfu master:dojang) {
			master.kungfu();
		}
	}
	
	public static void fight(Animal actor) {
		if (actor instanceof Kungfu) {
			((Kungfu) actor).kungfu();
		} else {
			System.out.println(actor.name + ":쿵후 못해요");
		}
	}
}
