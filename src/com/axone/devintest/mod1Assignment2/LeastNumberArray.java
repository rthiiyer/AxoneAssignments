/**
 * 
 */
package com.axone.devintest.mod1Assignment2;

/**
 * @author Aarthi Iyer
 * Program to identify the least number in an array 
 */
public class LeastNumberArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] number = {2,-1,4,0};
		int lesser=0;
		for (int i=0;i<number.length; i++) {
			if (number[i]<lesser) {
				lesser=number[i];
			}
		}
			System.out.println(lesser);
	}

}
