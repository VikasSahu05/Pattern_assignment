package com.techment.task;

public class Car {

	int model,speed=0;
	String brand,name;
	
	public Car(int model,String brand,String name,int speed) {
		this.model=model;
		this.brand=brand;
		this.name=name;
		this.speed=speed;
	}
	
	public int Break(){
		return(speed=speed-5);
	}
	
	public int Accelerate() {
		return(speed=speed+5);
	}
	
	public int GetSpeed() {
		return(speed);
	}
	
	
}
