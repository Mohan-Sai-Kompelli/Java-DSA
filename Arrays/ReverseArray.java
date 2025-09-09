package com.Scaler.DSA;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int i=0;
		int j = n-1;
		
		for(int k=0;k<n;k++) {
			a[k] = sc.nextInt();
		}
		while(i<j) {
			
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			i++;
			j--;
		}
		for(int k =0;k<n;k++) {
			System.out.println(a[k]);
		}
		
		

	}

}
