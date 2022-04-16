package myOwnPract;

public class Practice2 
{
	
	public static void main(String[] args)
	{
		int num=151;
		int sum =0;
		int rem;
		int a = num;  //a =151;
		while(num>0)
		{
		rem = num%10; // 151%10 = 1,  15%10=5, 1%10=1
		sum= sum*10+rem; //0*10+1=1, 1*10+5=15,15*10+1=151=sum
		num = num/10; //151/10=15, 15/10=1,1/10=0
		
		}
		if(a==sum)  //151==151
		{
			System.out.println("number is pallindrome");
		}
		else
		{
			System.out.println("number is not pallindrome");
		}
		
			
	}

	
	
	
}

