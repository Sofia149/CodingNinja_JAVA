/*Enter the number of rows: 
4
1111
2222
3333
4444
*/








package com.cn.pattern;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		System.out.println("Enter the number of rows: ");

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int i=1;

		while(i<=n) {
			int j=1; 
			while(j<=n) {

				System.out.print(i);
				j++;
			}
			System.out.println();
			i++;

		}



	}

}
