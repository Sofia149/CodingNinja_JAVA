import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int div = 2;

		while(div<=(n-1))
		{
			if(n%div == 0)
			{

				System.out.print(div + " ");
			}
			div++;
		}
	}
}
