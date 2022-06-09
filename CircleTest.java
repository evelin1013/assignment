package com.first.one;

public class CircleTest extends Circle
{
	double radius1;
	double radius2;
	public CircleTest(double radius1,double radius2)
	{
		this.radius1=radius1;
		this.radius2=radius2;
	}
	public double ovalCircle()
	{
		super.getArea();
		return area;
	}
	public void ovalDisplay()
	{
		super.printInfo();
	}
}
