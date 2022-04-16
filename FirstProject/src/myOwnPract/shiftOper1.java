package myOwnPract;

public class shiftOper1 
{
	
	 public void RightLeftShift()
		{
		 int a = 10;
		 int b = 20;
		 System.out.println(a<<2);
		 System.out.println(a<<3);
		 System.out.println(a<<4);
		 System.out.println(b>>2);
		 System.out.println(b>>3);
		 System.out.println(b>>4);
		}
		public static void main(String[] args)
		{
			shiftOper1  K = new shiftOper1 ();
		 K.RightLeftShift();
		 
		 }
		}


