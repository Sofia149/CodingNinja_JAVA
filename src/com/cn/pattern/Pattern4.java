/*Enter the number of rows: 
4
4444
4444
4444
4444*/





package com.cn.pattern;

import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		System.out.println("Enter the number of rows: ");

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int i=1;

		while(i<=n) {
			int j=1;
			int k = n;
			while(j<=n) {
				System.out.print(k);
				j++;
			}
			System.out.println();
			i++;

		}



	}

}
