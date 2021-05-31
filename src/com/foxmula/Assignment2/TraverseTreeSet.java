package com.foxmula.Assignment2;

import java.util.Iterator;
import java.util.Scanner;
import java.util.*;

public class TraverseTreeSet {
	TreeSet<Integer> ts = new TreeSet<Integer>();
	 void push(int data) {
		 ts.add(data);
	 }
	 
	 void display() {
		 Iterator<Integer> it = ts.iterator();
		 while(it.hasNext()){
			System.out.print(it.next()+" "); 
		 }
	 }
	 
	 public static void main(String args[]) {
		 TraverseTreeSet ob = new TraverseTreeSet();
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
