/**
 * 
 */
package com.axone.devintest.mod1Assignment2;

/**
 * @author Aarthi Iyer
 *Axone Module 1- Excerise 4
 *Program to print numbers 1 to 100 but if divisble 
 *by 5 , it prints "divisible by 5 followed by that number"
 */
public class Divisbleby5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=1;i<=100;i++) {
			if ( i % 5 ==0)
			{
				System.out.println (i + "- is divisble by 5");
			}
			else
				System.out.println(i);
		}
		
		
	}

}
