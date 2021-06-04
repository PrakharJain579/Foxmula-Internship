package com.foxmula.Assignment3;

import java.util.*;

public class Frequency {
	
	ArrayList<Integer> arr = new ArrayList<Integer>();
	
	void push(int n) {
		arr.add(n);
	}
	
	void calc(int len) {
		HashSet<Integer> set = new HashSet<Integer>();
		
		for (int i : arr) {
			set.add(Collections.frequency(arr,i));
		}
		
		ArrayList<Integer> arr2 = new ArrayList<Integer>(set);
		Collections.sort(arr2, Collections.reverseOrder());
		HashSet<Integer> set2 = new HashSet<Integer>(arr);
		
		System.out.println("Frequencies are: "+arr2);
		System.out.println("Numbers according to their frequency are: ");
		
		for (int j : arr2) {
			for (int k : set2) {
				if (Collections.frequency(arr, k)==j) {
					for (int i =0; i<j; i++) {
						System.out.print(k+" ");
					}
					
				}
			}
		}
	}
	
	public static void main(String args[]) {
		Frequency ob = new Frequency();
		System.out.print("Enter length of numbers you want to enter: ");
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		
		for (int i=0; i<len; i++) {
			System.out.print("Enter the Number: ");
			int num = sc.nextInt();
			ob.push(num);
		}
		 ob.calc(len);
		 sc.close();
	}
}
