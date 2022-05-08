/* Q6.  As given there are two sample methods: First one returns the sum of
		two numbers a and b and second one returns the subtraction of a and b. if
		a-b is negative then return value would be 0. Use ternary operator to call
		these two methods. If a>b then ternary should call sum(a,b) but if a<b
		then ternary operator should call sub(a,b). Eventually print the result of
		the ternary operation on variable a and b.
		Note: Ternary operator can call a method even for true and false values
*/
package Assignment_01;
import java.util.Scanner;

public class Q_06 {
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

class SampleClass2 {
	
	int sum(int a,int b) {
		return a+b;
	}
	
	int sub(int a,int b) {
		return ((a-b)>0)?(a-b):0;
	}
}