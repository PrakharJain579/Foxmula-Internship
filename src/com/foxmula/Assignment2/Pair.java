package com.foxmula.Assignment2;
import java.util.*;

public class Pair {
	ArrayList<Integer> al = new ArrayList<Integer>();
	 void push(int data) {
		 al.add(data);
	 }
	 
	 void display() {
		 for (Integer i : al) {
			 System.out.print(i+" ");
		 }
		 //System.out.println(al.get(1)+" ");
	 }
	 
	 void findpair(int k) {
		 for(int i=0; i<al.size()-1; i++) {
			 for(int j=i+1; j<al.size(); j++) {
				 int sum = al.get(i)+al.get(j);
				 if (sum==k) {
					 System.out.println("pair is: "+"("+al.get(i)+","+al.get(j)+")");
				 }
			 }
		 }
	 
	 }	 
	 public static void main(String args[]) {
		 Pair ob = new Pair();
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Press 1 to Enter Data");
		 System.out.println("Press 2 to display all the data");
		 System.out.println("Press 3 to find pair");
		 int op, data;
		 
		 boolean val = true;
		 while(val) {
			 op = sc.nextInt();
			 switch(op) {
			 case 1: System.out.println("Enter your data");
				 	data = sc.nextInt();
			 		ob.push(data);
			 		break;
			 case 2: System.out.println("All elements are");
			 		ob.display();
			 		break;
			 case 3: System.out.println("Enter value for sum");
			 		int k = sc.nextInt();
			 		ob.findpair(k);
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
