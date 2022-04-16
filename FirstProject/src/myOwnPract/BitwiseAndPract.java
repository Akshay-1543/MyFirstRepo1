package myOwnPract;

public class BitwiseAndPract 
{
 public void AJ()
 {
	 int a = 40;
	 int b = 30;
	 int c = 60;
	 System.out.println(a<b & b<c);      //false
	 System.out.println(b<a & c>a);     //true
	 System.out.println(b==a & c!=b);   //false
	 System.out.println(c>b & a>b);     //true
	 }
 public static void main(String[] args)
 {
	 BitwiseAndPract And = new BitwiseAndPract();
	 And.AJ();
	  }
}
