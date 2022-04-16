package myOwnPract;   // package creation

public class ArithmeticOperator1   // class creation
{
 public void Akj()    // non-static method  declaration and initialization
 {
	 int a = 100;  //local variables
	 int b = 50;
	 System.out.println(a+b);  // 90  (addition done)
	 System.out.println(a-b);  // 10  (Subtraction done)
	 System.out.println(a*b);  // 2000 (Multiplication done)
	 System.out.println(a/b);  // 1  (Quotient will print in output)
	 System.out.println(a%b);  // 10 (Remainder will print in output)
 }
 public static void main(String[] args)  // usage    main method
 {
	 ArithmeticOperator1  KJ = new ArithmeticOperator1();  //object creation for non-static method 
	 KJ.Akj();
 }
}
