package Assignment_01;

import java.util.Scanner;
import Assignment_01.Q_06;
public class Q_11 {

	public static void main(String[] args) {
		SampleClass2 obj = new SampleClass2();
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.nextLine();
		int b=sc.nextInt();
		sc.close();
		int result=(a>b)?obj.sum(a,b):obj.sub(a,b);
		System.out.println(result);
	}
}