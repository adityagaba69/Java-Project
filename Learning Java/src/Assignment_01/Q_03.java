/* Q3 - Given an interface in1 which includes a method display which takes
		an integer as input .
		interface In1
		{
		 void display(int p);
		}
		Task is to write a class testClass which implements interface In1 and has
		a method named display which takes an integer as an input p and the
		display method should be able to tell if the number is prime or not?
		- The main method should not be in testClass, create a separate class for
		that.
*/

package Assignment_01;
import java.util.Scanner;

public class Q_03 {

	public static void main(String[] args) {
		TestClass obj = new TestClass();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number::");
		int n=sc.nextInt();
		sc.close();
		obj.display(n);
		

	}

}

class TestClass implements A {
	public void display(int p) {
		int count=0;
		for(int i=1;i<10;i++) {
			if(p%i==0) count++;
		}
		if(count==2) System.out.println("Number is prime");
		else System.out.println("Number is not prime");
	}
}

interface A {
	void display(int p);
}