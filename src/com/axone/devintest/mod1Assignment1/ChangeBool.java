
package com.axone.devintest.mod1Assignment1;

/*@Author: Aarthi Iyer
 * Axone Module 1- Excerise 4 and 7
 *  Program to print to change the value of boolean
 */

public class ChangeBool {

	boolean boo = true;
	int i = 90;
	boolean boo1 = false;
	
	public void changebol() {
		//boo= true;
		// System.out.println(boo);
//		if(i >= boo)
//			
//			System.out.println("I can see this message");
		//if (boo == boo1)
		 System.out.println("The values are " + (boo == boo1));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChangeBool b = new ChangeBool();
		b.changebol();	}

}
