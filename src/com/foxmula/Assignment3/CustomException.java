package com.foxmula.Assignment3;

import java.util.Scanner;

class UserDefinedException extends Exception{
	
	UserDefinedException(String s){
		System.out.println(s);
	}
}

public class CustomException{
	
	void check(int i) throws UserDefinedException{
		int count=0;
		for (int j = 1; j<i; j++) {
			if (i%j==0) {
				count=1;
			}
		}
		
		if (count==1 && i%2 != 0) {
			throw new UserDefinedException("Invalid Number");
		}
		else {
			System.out.println("Number is valid");
		}
	}
	
	public static void main(String args[]) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter Number");
		int num = sc.nextInt();
		
		CustomException ob = new CustomException();
		try {
			ob.check(num);
		}
		catch (UserDefinedException x) {
			System.out.println("Exception Occured");
		}
		sc.close();
	}
}