package com.july28;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		// Sort arrays
		
		String s []= {"java", "python", "apple", "orange"};		
		int i[] = {1,2,0,8,7,9,-2};
		char c[] = {'a','j','u','m','o','g','f'};	
		
		Arrays.sort(s);
		System.out.println(Arrays.toString(s));
		
		Arrays.sort(i);
		System.out.println(Arrays.toString(i));
		
		Arrays.sort(c);
		System.out.println(Arrays.toString(c));

	}

}
