import java.util.Scanner;

public class AverageMarks {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char name = str.charAt(0);
		
		int m1 = sc.nextInt();
		int m2 = sc.nextInt();
		int m3 = sc.nextInt();
		
		int avg = (m1+m2+m3)/3;
		
		System.out.println(name);
		System.out.println(avg);
		
	}

}

