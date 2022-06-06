import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		System.out.println("Enter a number:");

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int div = 2;
		boolean isPrime = true;

		while(div<=(n-1))
		{
			if(n%div == 0)
			{

				isPrime = false;

			}
			div++;
		}
		if(isPrime) {
			System.out.println(n + " is a Prime number");
		}else
		{
			System.out.println(n + " is not Prime number");
		}

	}
}
