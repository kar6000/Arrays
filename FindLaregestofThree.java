package com.july28;

public class FindLaregestofThree {

	public static void main(String[] args) {
		
		int a [] = {17,1,2,3,4,5,6};
		max(a);
		
		int b[] = {1,2,3,400,50,6,7,8,9};
		max(b);
		
		int c[] = {-20,30,900,60,4};
		max(c);

	}
	
	public static void max(int a[]) {
		int len =a.length;
		int max =0;
		
		int first = a[0];
		int middle = a[len/2];
		int last =a[len-1];
		
		if(first>middle && first>last) {
			 max = first;
			
		}else if(middle>first && middle>last) {
			max = middle;
		}else {
			max = last;
		}
		System.out.println("max is "+max);
	}
	

}
