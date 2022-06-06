/*Given three values - Start Fahrenheit Value (S), End Fahrenheit value (E) and Step Size (W),
you need to convert all Fahrenheit values from Start to End at the gap of W, 
into their corresponding Celsius values and print the table.*/

/*Sample Input 1:
0 
100 
20*/

/*Sample Output 1:
0   -17
20  -6
40  4
60  15
80  26
100 37*/


import java.util.Scanner;

public class TemperatureConversion {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int S = sc.nextInt();
		int E = sc.nextInt();
		int W = sc.nextInt();
		
		while(S<=E){
			System.out.print(S + " ");
			int C = 0;
			C = ((S-32)*5)/9;
			System.out.print(C);
			System.out.print("\n");
			S= S + W;
		}
	}

}
