package myOwnPract;

import java.util.Scanner;

public class Factorialpract 
{
	int n; 
	int fact = 1;

	public void factorial()
	{
		System.out.println("enter any number");
		Scanner sc = new Scanner(System.in);   // scanner input is used
		int n = sc.nextInt();
		for(int i=1;i<=n;i++)  //i = 1,2,3,4,5
		{
			fact = fact*i;  // 1*1 = 1, 1*2 = 2, 2*3 =6, 6*4 = 24, 5*24 =120  
		}
		System.out.println("Factorial is " +fact);
		sc.close();
	}
	public static void main(String[] args) 
	{
		Factorialpract H = new Factorialpract();
		H.factorial();
	}
}