/*Enter the number of rows
5
E
EE
EEE
EEEE
EEEEE
*/





package com.cn.pattern;
import java.util.*;


public class Pattern15_character {

	public static void main(String[] args) {

		System.out.println("Enter the number of rows");

		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();

		int i = 1;
		while(i<=n) {
			int j=1;
			char p = (char)('A'+ (n -1));
			while(j<=i) {
				System.out.print(p);
				j++;
			}
			System.out.println();
			i++;
		}


	}

}
