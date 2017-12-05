package com.hlj.arithmetic;

public class Array {
	public static void main(String[] args) {
		int i, j, n = 5, m = 0;
		int a[][] = new int[5][5];
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				a[i][j] = m;
				m++;
				System.out.println(a[i][j]);
			}
		}
	}
}
