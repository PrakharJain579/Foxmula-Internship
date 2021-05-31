package com.foxmula.Assignment2;
import java.util.*;

public class Arraylist {
	
	ArrayList<Integer> al = new ArrayList<Integer>();
	 void push(int data) {
		 al.add(data);
	 }
	 
	 void pop(int data) {
		 al.remove(data);
	 }
	 
	 void find(int data) {
		 boolean ans = al.contains(data);
		 if(ans) {
			 System.out.println(data+"Exists in ArrayList");
		 }
		 else {
			 System.out.println(data+" Does not exists in ArrayList");
		 }
	 }
	 
	 public static void main(String args[]) {
		 Arraylist ob = new Arraylist();
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Press 1 to Enter Data");
		 System.out.println("Press 2 to Remove Data");
		 System.out.println("Press 3 to check whether data exists or not");
		 int op, data;
		 boolean val = true;
		 while(val) {
			 op = sc.nextInt();
			 switch(op) {
			 case 1: System.out.println("Enter your data");
				 	data = sc.nextInt();
			 		ob.push(data);
			 		break;
			 case 2: System.out.println("Enter data to remove from list");
			 		data = sc.nextInt();
			 		ob.pop(data);
			 		break;
			 case 3: System.out.println("Checking the existence of data");
			 		data = sc.nextInt();
			 		ob.find(data);
			 default: System.out.println("Exit");
			 }
			 if (op>3) {
				 val = false;
			 }
		 }
	 }
}
