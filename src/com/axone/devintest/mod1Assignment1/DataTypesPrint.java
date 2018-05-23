package com.axone.devintest.mod1Assignment1;

/*@Author: Aarthi Iyer
 * Axone Module 1- Excerise 3
 *  Program to print int, double
 */


public class DataTypesPrint {

	int a = 10;
	double b = 20.3;
	double c = 3.14785;
	
	public void printnumbers()
	{
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 DataTypesPrint dp = new DataTypesPrint();
	 dp.printnumbers();
	}

}
