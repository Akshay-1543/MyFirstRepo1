package myOwnPract;

public class PrimeNo 
{
 public void PrimeNo1()
 {
	 int a = 0;
	 int b = 0;
	 for(a=2; a<=100; a++)
	 {
		 int count = 0;
		 for(b=1; b<=a; b++)
		 {
			 if(a%b==0)
			 {
				count = count+1;
			 }
		 }
		 if(count==2)
		 {
			 System.out.print(" " +a);
		 }
		 
		 }
	 }
 
 public static void main(String[] args) 
 {
	 PrimeNo S = new PrimeNo();
	 System.out.print("Prime No Is =");
	 S.PrimeNo1();
}
}
