package myOwnPract;

public class PalliPract1 
{
 public void Akshay()
 {
	 int n = 101;
	 int s = 0;
	 int rem;
	 int t = n;
	while(n>0) //121>0
	{
		rem = n%10; //121%10=1,2,1
		s = s*10+rem; //1,12,121
		n = n/10; //121/10 = 12,1,0
	}
	if(t==s)
	{
		System.out.println("The number Is Pallindrome = " +s);
	}
	else
	{
		System.out.println("The No Is Not Pallindrome");
	}
 }
 public static void main(String[] args) 
 {
	 PalliPract1 a = new PalliPract1();
	 a.Akshay();
}
}
