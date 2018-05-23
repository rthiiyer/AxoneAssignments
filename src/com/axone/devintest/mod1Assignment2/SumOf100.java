/**
 * 
 */
package com.axone.devintest.mod1Assignment2;

/**
 * @author Aarthi Iyer
 * Excersise 5
 * Program a for loop to find the sum of first 100 numbers (1 to 100)
 */
public class SumOf100 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum =0;
		for (int i=1; i<=100; i++)
		{
			sum = sum + i;
		}
		System.out.println(sum);
	}

}
