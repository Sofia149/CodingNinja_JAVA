/*Enter the number of rows: 
5
1
21
321
4321
54321
*/




package com.cn.pattern;

import java.util.Scanner;

public class Pattern10Triangle {

	public static void main(String[] args) {
		System.out.println("Enter the number of rows: ");

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int i=1;

		while(i<=n) {
			int j=1; 
			int p=i;
			while(j<=i) {

				System.out.print(p);
				p--;
				j++;
			}
			System.out.println();
			i++;

		}


	}

}
