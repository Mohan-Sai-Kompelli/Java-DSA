package com.Scaler.DSA;

import java.util.Scanner;

public class Subarray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
//		for(int j=0;j<n;j++) {
//			
//			for(int k=j;k<n;k++) {
//				System.out.print(a[k]+" ");
//			}
//			System.out.println(a[j]);
//		}
		
		for(int j=0;j<n;j++) {
			
			for(int k=j;k<n;k++) {
				for(int z = j;z<=k;z++) {
					System.out.print(a[z]+" ");
				}
				System.out.println();
			}
			
		}

	}

}
