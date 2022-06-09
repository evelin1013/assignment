package com.first.one;

public class Circle extends Shape
{
	double radius;
	
	double area;
	static double pi=3.14;
	
	public Circle() 
	{
		radius=5;
		
	}
	public Circle(double radius)
	{
		this .radius=radius;
		
	}
	public double getArea()
	{
		area=pi*(radius*radius);
		return area;
	}
	public void printInfo()
	{
		System.out.println("Area of circle:"+area);
	}
}
