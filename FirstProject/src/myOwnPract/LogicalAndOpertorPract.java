package myOwnPract;

public class LogicalAndOpertorPract 
{
 public void Pract()
 {
	 int b = 250;
	 int c = 200;
	 int d = 350;
	 System.out.println(c<b && d>c);     //true (it checks 2nd condn becauze 2nd condtn is true.)
	 System.out.println(c==b && c!=d);   // false (1st condn is false so doesnt check 2nd condn)
	 System.out.println(b>c && c<d);     // true  (1st condn is false so doesnt check 2nd condn)
	 System.out.println(b<d && c<d);     // false (1st condn is false so doesnt check 2nd condn)
 }
 public static void main(String[] args)
 {
	 LogicalAndOpertorPract hk = new LogicalAndOpertorPract();
	 hk.Pract();
 }
}
