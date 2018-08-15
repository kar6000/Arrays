package com.july25;

public class MaxMinSumAvgDemo {

	public static void main(String[] args) {
		
		int a[] = { 1, 2, 3, 4, 5, -1, 0 };
		
		max(a);
		min(a);
		sum(a);
	}

	public static void max(int n[]) {

		int max = n[0];
		for (int i = 0; i < n.length; i++) {
			if (n[i] > max) {
				max = n[i];
			}
		}
		System.out.println("max is " + max);
	}

	public static void min(int n[]) {

		int min = n[0];
		for (int i = 0; i < n.length; i++) {
			if (n[i] < min) {
				min = n[i];
			}
		}
		System.out.println("min is " + min);
	}
	
	public static void sum(int n[]) {
		int sum =0;
		int avg =0;
		for(int i=0; i<n.length;i++) {
			sum =sum+i;
			;
		}
		System.out.println("sum is "+sum);	
		
	}
	

}
