/* WAP in java, which would demonstrate access protection over a
   class and a variable of that class.
*/

package Assignment_01;

public class Q_09 {

	public static void main(String[] args) {
		protection obj = new protection();
		System.out.println(obj.a);
//		System.out.println(obj.b);  //private cannot access outside the class
		System.out.println(obj.c);

	}
}
class protection{
	public int a=10;
	private int b=20;
	protected int c=30;
	public void run1() {
		System.out.println("public run1");
	}
	
	private void run2() {
		System.out.println("private run2");
	}
	
	protected void run3() {
		System.out.println("private run3");
	}
	
}