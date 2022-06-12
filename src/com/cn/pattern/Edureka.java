package com.cn.pattern;

import java.util.*;

public class Edureka
{            
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of rows: ");

		int rows = sc.nextInt();         
		for (int i = 1; i <= rows; i++) 
		{
			if (i%2 == 0)
			{	
				for (int j = 1; j <= i; j++)
				{
					if(j%2 == 0)
					{
						System.out.print(1);
					}
					else
					{
						System.out.print(0);
					}
				}

				System.out.println();
			}else 
			{
			for (int j = 1; j <= i; j++)
			{
				if(j%2 == 0)
				{
					System.out.print(0);
				}
				else
				{
					System.out.print(1);
				}
			}

			System.out.println();
		}

	}
}
}
