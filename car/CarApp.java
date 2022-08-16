package com.techment.task;

public class CarApp {

	public static void main(String[] args) {
		
		Car car=new Car(5241,"Toyota","Inova",30);
		
		System.out.println("Name:"+car.name+" , Model : "+car.model+" ,Brand :"+car.brand);
		
//		Accelerate
		System.out.println("Accelerate ----");
		for(int i=0;i<5;i++) {
			System.out.println(car.Accelerate());			
		}
		
//		break
		System.out.println("Break ----");
		for(int i=0;i<3;i++) {
			if(car.speed !=0) {
				System.out.println(car.Break());
			}else {
				break;
			}
		}
		System.out.println("current speed:"+car.GetSpeed());
		
		System.out.println("Break ----");
		
		///////////////////
		if(car.speed !=0) {
			System.out.println(car.Break());
			System.out.println("current speed:"+car.GetSpeed());
		}else {
			System.out.println("current speed:"+car.GetSpeed());
		}
		
		
	}

}
