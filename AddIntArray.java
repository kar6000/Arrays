package com.july30;

import java.util.Arrays;

public class AddIntArray {

	public static void main(String[] args) {
		int a []= {1,2,3,4,5,6};
		int b[] = {7,8,9,10,11,12};
		sum(a,b);

	}
	
	
	public static int sum(int a[], int b[]) {
		
		if(a.length!= b.length) {
			return -1;
		}
		
		for(int i=0; i<a.length;i++) {			
			a[i] =a[i]+b[i];
		}
		System.out.println("new array is "+Arrays.toString(a));
		return 0;
	}

}
