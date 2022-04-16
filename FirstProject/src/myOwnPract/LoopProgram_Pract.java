package myOwnPract;

import java.util.Scanner;

public class LoopProgram_Pract 
{
	public void PrimeNo()
	{
		int i = 0;
		int j = 0;
		
	
		for(i =2; i<=100; i++)
		{
			int count = 0;
			for(j=2; j<=i; j++) {
				if(i%j==0)
				{
					count = count+1;
				}
			}
			if(count==1)
			{
				System.out.print(" " +i);
			}

		}

	}
	int sum = 0;
	int remainder;
	
	Scanner sc = new Scanner(System.in);
	int number = sc.nextInt();
	int a = number;
	public void ReverseNo()
	{
		
		while(number>0) 
		{
			remainder = number%10;
			sum = sum*10 + remainder;
			number = number/10;	
		}
		System.out.println(sum);
		if(a==sum)
		{
			System.out.println("This Is Pallindrome");
		}
		else
		{
			System.out.println("This Is Not Pallindrome");
	}
	
	}
	public void ArmstrongNo()
	{
		
		Scanner c = new Scanner(System.in);
		int n = c.nextInt();
		int s = 0;
		int r;
		int a = n;
		while(n>0)
		{
			r = n%10;
			s = s+r*r*r;
			n = n/10;
		}
		if(a==s)
		{
		 System.out.println("armstrong no");	
		}
		else
		{
			System.out.println("Not An Armstrong No");
		}
		c.close();
	}
	public static void main(String[] args) 
	{
		LoopProgram_Pract J = new LoopProgram_Pract();
		System.out.print("prime numbers =");
		J.PrimeNo();
		System.out.println();
		System.out.println("Reverse number is");
		J.ReverseNo();
		System.out.println("Enter Your Number");
		J.ArmstrongNo();
	}
}
