package com.car;

public class Car 
{
 private int yearModel;
 private String make;
 private int speed=0;
	
	public Car(int yearModel, String make) 
	{
		super();
		this.yearModel = yearModel;
		this.make = make;
	}
	public int getYearModel() 
	{
		return yearModel;
	}
	public void setYearModel(int yearModel) 
	{
		this.yearModel = yearModel;
	}
	public String getMake() 
	{
		return make;
	}
	public void setMake(String make) 
	{
		this.make = make;
	}
	public int getSpeed() 
	{
		return speed;
	}
	public void setSpeed(int speed) 
	{
		this.speed = speed;
	}
	public void accelerate()
	{
		speed +=5;
	}

	public void brake()
	{
		speed -=5;
	}

	public static void main(String[] args) 
	{
		
		Car car = new Car(1965,"Bat Mobile");
		car.accelerate();
		car.accelerate();
		car.accelerate();
		car.accelerate();
		car.accelerate();
		System.out.println(car.getSpeed());
		car.brake();
		car.brake();
		car.brake();
		car.brake();
		car.brake();
		System.out.println(car.getSpeed());
	}

}
