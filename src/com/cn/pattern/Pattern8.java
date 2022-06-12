/*Enter the number of rows: 
4
1
23
345
4567*/





package com.cn.pattern;

import java.util.Scanner;

public class Pattern8 {

	public static void main(String[] args) {
		System.out.println("Enter the number of rows: ");

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int i=1;
		
		while(i<=n) {
			int k=i;
			int j=1;
			
			while(j<=i) {

				System.out.print(k);
				k++;
				j++;
			}
			System.out.println();
			i++;
		}


	}

}
