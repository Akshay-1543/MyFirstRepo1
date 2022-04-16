package myOwnPract;

public class ShiftOperatorPract
{ 
 public void Akshay()
 {
	 int a = 30;
	 int b = 40;
	 System.out.println(a << 2);  // 30*2^2 = 120    (std Formula = Variable*2^n)
	 System.out.println(a << 3);  // 30*2^3 = 240    (std Formula = Variable*2^n)
	 System.out.println(b << 2);  // 40*2^2 = 160    (std Formula = Variable*2^n)
	 System.out.println(b << 3);  // 40*2^3 = 320    (std Formula = Variable*2^n)
	 System.out.println(a >> 2);  // 30/2^2 = 7      (std Formula = Variable/2^n)
	 System.out.println(a >> 3);  // 30/2^3 = 3      (std Formula = Variable/2^n)
	 System.out.println(b >> 2);  // 40/2^2 = 10     (std Formula = Variable/2^n)
	 System.out.println(b >> 3);  // 40/2^3 = 5      (std Formula = Variable/2^n)
	 }
 public void Shubham()
 {
	 int m = 60;
	 int n = 50;
	 System.out.println(m << 2);   // 60*2^2 = 240    (std Formula = Variable*2^n)
	 System.out.println(m << 3);   // 60*2^3 = 480    (std Formula = Variable*2^n)
	 System.out.println(m << 4);   // 60*2^4 = 960    (std Formula = Variable*2^n)
	 System.out.println(n << 2);   // 50*2^2 = 200    (std Formula = Variable*2^n)
	 System.out.println(n << 3);   // 50*2^3 = 400    (std Formula = Variable*2^n)
	 System.out.println(n << 4);   // 50*2^4 = 800    (std Formula = Variable*2^n)
	 System.out.println(m >> 2);   // 60/2^2 = 15      (std Formula = Variable/2^n)
	 System.out.println(m >> 3);   // 60/2^3 = 7      (std Formula = Variable/2^n)
	 System.out.println(m >> 4);   // 60/2^4 = 3      (std Formula = Variable/2^n)
	 System.out.println(n >> 2);   // 50/2^2 = 12      (std Formula = Variable/2^n)
	 System.out.println(n >> 3);   // 50/2^3 = 6      (std Formula = Variable/2^n)
	 System.out.println(n >> 4);   // 50/2^4 = 3      (std Formula = Variable/2^n)
	 }
 public static void main(String[] args)
 {
	 ShiftOperatorPract A = new ShiftOperatorPract();
	 A.Akshay();
	 A.Shubham();
 }
}
