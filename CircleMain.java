package com.first.one;

public class CircleMain 
{
	static double sum1=0;
	static double sum2=0;
	public static void main(String[] args) 
	{
		
		int[] numbers = new int[100];
		int[] numbers1 = new int[100];
		int count=0;
		 
		for (int i = 0; i < numbers.length; i++) 
		{
		    numbers[i] = (int) (Math.random() *10);
		    numbers1[i] = (int) (Math.random() * 10);
		    Circle c =new Circle(numbers[i]);
		    CircleTest c1=new CircleTest(numbers1[i],numbers1[i]);
		    sum1=sum1+c.getArea();
		    sum2=sum2+c1.getArea();
		}
		System.out.println("Sum of Area of circle:"+sum1);
		System.out.println("Sum of Area of oval:"+sum2);
	}
}
