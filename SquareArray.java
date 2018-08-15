package com.july28;

import java.util.Arrays;

public class SquareArray {

	public static void main(String[] args) {
		
		int a[] = {1,2,4,7,8};
		intSq(a);
		System.out.println("square is "+Arrays.toString(a));

	}
	
	public static void intSq(int a[]) {
		for(int i=0; i<a.length; i++) {
			a[i] =a[i]*a[i];
		}
		
	}

}
