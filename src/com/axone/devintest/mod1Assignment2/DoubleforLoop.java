/**
 * 
 */
package com.axone.devintest.mod1Assignment2;

/**
 * @author Aarthi Iyer
 * Program to display 1, 12, 123, 1234 etc 
 * Module 1 Assignment 2 - Excersise 6
 */
public class DoubleforLoop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i =0; i<=7; i++) {
			for (int j =1 ; j<=i;j++) {
				System.out.print(j);
			}
			System.out.println("");
		}
	}

}
