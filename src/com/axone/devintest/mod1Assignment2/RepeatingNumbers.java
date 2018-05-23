package com.axone.devintest.mod1Assignment2;

/* Program to find a number repeating in an array
 * Assignment 2- Excersise 11
 * 
 */

public class RepeatingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] number = {1,3,4,5,6,3,2,4,6,7};
		for (int i=0;i<number.length;i++) {
			int repeat=0;
			for (int j=i+1;j<number.length;j++) {
				if (number[i]==number[j]) {
					repeat=repeat+1;
				}
			}
			System.out.println(number[i] + "is repeated " + repeat + "times");
		}
	}

}
