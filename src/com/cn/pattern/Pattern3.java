/*Enter the number of rows: 
4
1234
1234
1234
1234
*/





package com.cn.pattern;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		System.out.println("Enter the number of rows: ");

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int i=1;

		while(i<=n) {
			int j=1; 
			while(j<=n) {

				System.out.print(j);
				j++;
			}
			System.out.println();
			i++;

		}


	}

}
