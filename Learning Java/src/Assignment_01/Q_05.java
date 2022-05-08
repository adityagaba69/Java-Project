/* 5Q.  WAP in Java which would contain 8 objects of a Class Employee.
		Employee contains name, age, department, salary. Your program would
		be able to calculate the total salary to be paid in each department. Use
		constructors to create these 8 objects and Scanner to take inputs.
		Restrictions:
		1- Minimum 8 objects [can be created manually with parameterized
		constructors with Scanner input]
		2- Departments are, A, B, C, D: minimum 4 departments [String Type]
		3- If the Salary exceeds more than 30,000, then the default salary
		would be 25000 of any of the employee
		4- Use array of objects, instead of using multiple 8 objects separately
		Use:
		Employee arr[] = new Employee[8];
		And
		arr[i].department.equals("A");
*/

package Assignment_01;
import java.util.Scanner;

public class Q_05 {

	public static void main(String[] args) {
		String name;
		int age;
		char department;
		float salary;
		Scanner sc = new Scanner(System.in);
		Employee arr[] = new Employee[8];
		for(int i=0;i<8;i++) {
			System.out.println("Enter name::");
			name=sc.next();
			System.out.println("Enter age::");
			age=sc.nextInt();
			System.out.println("Enter department::");
			department=sc.next().charAt(0);
			System.out.println("Enter salary::");
			salary=sc.nextFloat();
			arr[i] = new Employee(name,age,department,salary);
		}
		sc.close();
		Employee obj = new Employee();
		obj.def_salary(arr);
	}

}
class Employee {
	String name;
	int age;
	char department;
	float salary;
    float def_salary;
	Employee(String name,int age,char department,float salary) {
		this.name=name;
		this.department=department;
		this.age=age;
		this.salary=salary;
		this.def_salary=salary;
	}
	Employee(){}
	void def_salary(Employee arr[]) {
		for(int i=0;i<8;i++)
		if(arr[i].salary>30000) {
			arr[i].def_salary=25000;
		}
	}
}



