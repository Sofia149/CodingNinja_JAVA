/*Enter the number of rows
5
A
BC
CDE
DEFG
EFGHI
*/




package com.cn.pattern;
import java.util.*;


public class Pattern13_character {

	public static void main(String[] args) {

		System.out.println("Enter the number of rows");

		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();

		int i = 1;
		while(i<=n) {
			int j=1;
			char p = (char)('A'+(i-1));
			while(j<=i) {
				System.out.print(p);
				p++;
				j++;
			}
			System.out.println();
			i++;
		}


	}

}
