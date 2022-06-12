/*Enter the number of rows
5
A
BB
CCC
DDDD
EEEEE
*/



package com.cn.pattern;
import java.util.*;


public class Pattern12_character {

	public static void main(String[] args) {

		System.out.println("Enter the number of rows");

		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();

		int i = 1;
		while(i<=n) {
			int j=1;
			while(j<=i) {
				char p = (char)('A'+(i-1));
				System.out.print(p);
				j++;
			}
			System.out.println();
			i++;
		}


	}

}
