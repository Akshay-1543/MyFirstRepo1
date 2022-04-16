package myOwnPract;

public class MyPrctUnary 
{
 public void Mayur()
 {
	 int a =50;
	 int b= 25; 
	 int c = 499;
	 System.out.println(a);
	 System.out.println(a++);
	 System.out.println(a);
	 System.out.println(a++);
	 System.out.println(b);
	 System.out.println(c);
	 System.out.println(a);
	 System.out.println(~b);
	 System.out.println(~c);
	 System.out.println(+a);
	 System.out.println(+b);
	 System.out.println(+c);
	 System.out.println(b--);
	 System.out.println(b--);
	 System.out.println(c);
	 System.out.println(--c);
	 System.out.println(--c);
	 System.out.println(++c);
	 }
 public static void main(String[] args)
 {
	 MyPrctUnary S = new MyPrctUnary();
	 S.Mayur();
 }
}
