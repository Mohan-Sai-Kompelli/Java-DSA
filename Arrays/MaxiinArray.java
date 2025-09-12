package com.Scaler.DSA;

import java.util.Scanner;

public class MaxiinArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int maxi = 0;
		int[] a = new int[x];
		for(int i=0;i<x;i++) {
			a[i] = sc.nextInt();
			if(maxi<a[i]) {
				maxi=a[i];
			}
		}
		System.out.println(maxi);

	}

}
