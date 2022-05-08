/*Q2 WAP to count the total number of calls for a member function from
	 more than one objects. [Lets say, from 3 such Objects] 
*/
package Assignment_01;

public class Q_02 {

	public static void main(String[] args) {
		sampleClass obj1 = new sampleClass();
		sampleClass obj2 = new sampleClass();
		sampleClass obj3 = new sampleClass();
		obj1.display();
		obj2.display();
		obj3.display();
		System.out.println(sampleClass.count);
		
	}
}

class sampleClass {
	static int count=0;
	void display(){
		count++;
	}
}