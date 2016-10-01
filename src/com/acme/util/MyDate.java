package com.acme.util;

public class MyDate {
	//Member/instance variables
	public int day;
	public int month;
	public int year;
	
	//Constructors
	//Same name of the class
	//No return type
	
	//No-args constructor
	public MyDate(){
		day = 1;
		month = 1;
		year = 2000;
			
		
	}
	

	
	//Constructor that takes 3 arguments
	public MyDate(int m, int d, int y){
		setDate(m, d, y);
	}
	
	public String toString(){
		return month +"/"+day+"/"+year;
	}
	
	public void setDate(int m, int d, int y){
		day = d;
		year = y;
		month = m;
		
	}
	
	public static void leapYears(){
		for(int i=1752; i<=2020; i = i+4){
			if((i%100 !=0) || (i%400 ==0))
				System.out.println("The year "+i+" is a leap year!");
		}
	}
	

}
