package com.foxmula.Assignment2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;


public class TraverseHashSet {
	HashSet<Integer> hs = new HashSet<Integer>();
	 void push(int data) {
		 hs.add(data);
	 }
	 
	 void display() {
		 Iterator<Integer> it = hs.iterator();
		 while(it.hasNext()){
			System.out.print(it.next()+" "); 
		 }
	 }
	 
	 public static void main(String args[]) {
		 TraverseHashSet ob = new TraverseHashSet();
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Press 1 to Enter Data");
		 System.out.println("Press 2 to display all items in HashSet");
		 int op, data;
		 boolean val = true;
		 while(val) {
			 op = sc.nextInt();
			 switch(op) {
			 case 1: System.out.println("Enter your data");
				 	data = sc.nextInt();
			 		ob.push(data);
			 		break;
			 case 2: System.out.println("Displaying the Items");
			 		ob.display();
			 		break;
			 default: System.out.println("Exit");
			 }
			 if (op>2) {
				 val = false;
			 }
		 }
		 sc.close();
	 }

}
