package com.basic;

public class Car {
	 private String model;
	int i=10;
	 private double speed=20+i;
	 
	 public Car (int speed) {
			this();
			this.speed=speed;
			System.out.println("one arg cons called");
		}
		public Car(int speed,String model)
		{
			this(speed);
			this.speed=speed;
			this.model=model;
			System.out.println("two arg cons call");
		}
		
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	public Car() {
		System.out.println("empty consn call");
	}
	
	public boolean start() {
		return true;
	}
	public void accelerate() {
		speed+=20;
	
	}public void accelerate(int speed) {}
	public void accelerate(double speed) {}
	public void accelerate(int speed,String mod) {}
	public void accelerate(String mod,int speed){}
	public void changeInt(int i) {
		i=i+10;
		
	}
	public static void brake() {
		// TODO Auto-generated method stub
	System.out.println("brake cons call");	
	}
	
	
	public static void main(String[] args) {
		//Car car1=new Car(100);
		Car car2=new Car(100);
		//car1.speed=20;
		car2.speed=50;
		//System.out.println(car1.speed);
		System.out.println(car2.speed);
		int count=100;
		//car1.changeInt(count);
		System.out.println(count);
	
	}
}


	
