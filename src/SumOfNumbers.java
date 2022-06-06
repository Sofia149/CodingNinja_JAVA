import java.util.Scanner;

public class SumOfNumbers {

	public static void main(String[] args) {
		
		System.out.println("Enter the number:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int i = 1;
		int sum = 0;
		
		while(i<=n) {
			sum = sum + i;
			i++;
		}
		System.out.println("The sum is  " + sum);
	}

}
