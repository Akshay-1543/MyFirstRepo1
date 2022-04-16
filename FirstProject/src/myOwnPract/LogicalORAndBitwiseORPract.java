package myOwnPract;

public class LogicalORAndBitwiseORPract 
{
  public void AK()
  {
	  int v = 25;
	  int w = 35;
	  int x = 45;
	  System.out.println(v<w || w<v); //true (1st cond^n is true so it doesnt check 2nd one)
	  System.out.println(w>x || x>w); //true 1st conditn is false so it checks 2nd condn & print 2nd condn as o/p.
	  System.out.println(w<x || x<w); //true (1st cond^n is true so it doesnt check 2nd one)
	  System.out.println(w==x || v==w); // false both condns are false.
  }
  public void RS()
  {
	  int a = 20;
	  int b = 200;
	  int c = 50;
	  System.out.println(a<b | c>b);  //true because 1st condtn is true.
	  System.out.println(b>a | c<b);  //true because both the condtns are true.
	  System.out.println(a>b | c>b);  // false because both condtns are false.
	  System.out.println(a!=b | b==c); //true because 1st condtn is true.
  }
  public static void main(String[] args)
  {
	  LogicalORAndBitwiseORPract M = new LogicalORAndBitwiseORPract ();
	  M.AK();
	  M.RS();
  }
  }

