/*Enter the number of rows
5
E
DE
CDE
BCDE
ABCDE
*/





package com.cn.pattern;
import java.util.*;


public class Pattern17_character {

	public static void main(String[] args) {

		System.out.println("Enter the number of rows");

		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();

		int i = n;
		
		while(i>=1) {
			int j=i;
			
			while(j<=n) {
				char p = (char)('A'+ (j-1));
				System.out.print(p);
				j++;
			}
			System.out.println();
			i--;
		}


	}

}
