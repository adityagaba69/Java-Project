/*Q1 WAP which would contain 6 objects, of a class
	 Student. Student [Name, Age, section, percentage]. They all belong to
	 Section-A. Your program would be able to find the average percentage of
	 students in this section. Use constructors to create these 6 objects and
	 input from Scanner class.
*/

package Assignment_01;
import java.util.*;

public class Q_01 {

	public static void main(String[] args) {
		String name;
		int age;
		char section;
		float percentage;
		Scanner sc = new Scanner(System.in);
		Student obj = new Student();
		List<Student> list = new ArrayList<>();
		for(int i = 0;i < 6;i++) {
			System.out.println("Enter name::");
			name=sc.next();
			System.out.println("Enter age::");
			age=sc.nextInt();
			System.out.println("Enter section::");
			section=sc.next().charAt(0);
			System.out.println("Enter percentage::");
			percentage=sc.nextFloat();
			
		    list.add(new Student(name,age,section,percentage));
		}
		sc.close();
		obj.display(list);
	}
}

class Student {
	String name;
	int age;
	char section;
	float percentage;
	Student(String name,int age,char section,float percentage) {
		this.name=name;
		this.age=age;
		this.section=section;
		this.percentage=percentage;
	}
	Student() {
		// TODO Auto-generated constructor stub
	}
	void display(List<Student> list) {
		int sum_percentage=0;
		for(int i=0;i<6;i++) sum_percentage+=list.get(i).percentage;
		System.out.println(sum_percentage/6);
	}
}