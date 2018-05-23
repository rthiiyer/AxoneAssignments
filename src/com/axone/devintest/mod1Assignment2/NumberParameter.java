/**
 * 
 */
package com.axone.devintest.mod1Assignment2;

/**
 * @author Aarthi Iyer
 * Program to write a method that accepts number parameter and 
 * returns true is number is odd or false
 */
public class NumberParameter {

	/**
	 * @param args
	 */
	//instance method 
	public boolean checknumber(int i) {
		if (i%2!=0) {
			return true;
		}else { 
			return false;
			}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//instantiating object 'np' of class NumberParameter
		NumberParameter np= new NumberParameter();
		// access instance method of class using the object class.
		System.out.println(np.checknumber(22));

	}

}
