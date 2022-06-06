/*
 Write a program to input an integer N and print the sum of
 all its even digits and sum of all its odd digits separately.
Digits mean numbers, not the places! That is, if the given 
integer is "13245", even digits are 2 & 4 and 
odd digits are 1, 3 & 5.
Input format :
 Integer N
Output format :
Sum_of_Even_Digits Sum_of_Odd_Digits
(Print first even sum and then odd sum separated by space)
Constraints
0 <= N <= 10^8
Sample Input 1:
1234
Sample Output 1:
6 4
 */





import java.util.*;

public class SumOfEvenAndOdd {

	public static void main(String[] args) {
		
		int evenSum=0;
		int oddSum=0;
		int n;
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		while (num>0) {
			
			n = num%10;
			if(n%2 == 0) {
				evenSum += n;
			}
			if (n%2==1) {
				oddSum += n;
			}
			num = num/10;
		}
		
		System.out.print(evenSum + " " + oddSum );
		
	}

}
