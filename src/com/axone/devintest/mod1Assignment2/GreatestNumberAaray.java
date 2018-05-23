/**
 * 
 */
package com.axone.devintest.mod1Assignment2;

/**
 * @author Aarthi Iyer
 * Excersise 9
 * Program to find the greatest number in an array
 */
public class GreatestNumberAaray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// T¦`bopbb;l,b;,,b.vvmODO Auto-generated method stub
		int[] number = {2,490,77,80};
		int greater=0;
		for (int i=0; i<number.length;i++) {
				if (number[i]>greater) {
					greater = number[i];
				}
			}
		System.out.println(greater);
	}

}
