/* Q4. Create a multi-level inheritance hierarchy from ClassOne, ClassTwo,
	ClassThree classes.
	ClassOne contains one, single parameterized constructor
	ClassTwo contains only a default constructor
	ClassThree contains one, single parameterized constructor and a default
	constructor.
	Create an object of top child class and make sure the constructor
	execution will take place according to respective multi-level inheritance
	hierarchy.
	ClassThree obj = new ClassThree(1);
	ClassThree obj = new ClassThree();
*/

package Assignment_01;

public class Q_04 {

	public static void main(String[] args) {
		ClassThree obj = new ClassThree(1);
		ClassThree obj2 = new ClassThree();
//		ClassThree obj3 = new ClassThree(1,2);
	}
}

class ClassTwo {
	ClassTwo() {
		System.out.println("Class one default constructor");
	}
}

class ClassOne extends ClassTwo {
	ClassOne(int p) {System.out.println("Class Two single parameterized constructor");}
}

class ClassThree extends ClassOne {
	
	ClassThree(){
		super(1);
		System.out.println("Class Three default constructor");
		}
	
	ClassThree(int p) {
		super(2);
		System.out.println("Class Three single parameterized constructor");
	}
	
	ClassThree(int p,int q) {
		super(3);
		System.out.println("Class Three double parameterized constructor");
		}
}