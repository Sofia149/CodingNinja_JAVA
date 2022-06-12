/*Enter the number of rows: 
5
5
45
345
2345
12345
*/




package com.cn.pattern;

import java.util.Scanner;

public class Pattern16Triangle {

	public static void main(String[] args) {
		System.out.println("Enter the number of rows: ");

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int i=n;

		while(i>=1) {
			int j=i; 
			while(j<=n) {
				System.out.print(j);
				j++;
				
			}
			System.out.println();
			i--;

		}


	}

}
