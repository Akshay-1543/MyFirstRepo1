package myOwnPract;

import java.util.Scanner;

public class FibonacciPract 
{
	
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	public void Fibonacci()
	{
		int a = 0;
		int b = 1;
		int c;
		System.out.println("enter the number");
		System.out.print("0 1 ");
		for(int i=1; i<n; i++) //1
		{
			c =a+b; // 0+1=1, 1+1=2,1+2=3,2+3=5,3+5=8,5+8=13,8+13=21 .. AND 7!<7 SO LOOP IS TERMINATED // o/p:- 1,1,2,3,5,8,13,21
			a=b; //1,1,2,3,5,8
			b=c; //1,2,3,5,8,13

			System.out.print(c+ " ");
		}
        System.out.println();
		sc.close();
	}
	public void Fibonacci1()
	{
		int i=1;
		int j=1;
		int k=0;
		int n=5;
		System.out.print("1 1 ");
		for(int a=1; a<5; a++)
		{
			k =i+j;
			i=j;
			j=k;
			System.out.print(k+ " ");
		}
		
		System.out.println();

	}
	
	public void fibonacci2()
	{
		int a=0;
		int b=1;
		System.out.print("0 1 ");
		int c;
		for(int i=1; i<7; i++)
		{
			c=a+b;
			System.out.print(c + " ");
			a=b;
			b=c;
		}
		System.out.println();
	}
	public void Fiboonacci3()
	{
		int a = 0;
		int b = 1;
		int c;
		
		System.out.print("0 1 " );
		for(int i=1; i<n; i++)
		{
			c=a+b;
			a=b;
			b=c;
			System.out.print(c+ " ");
		}
		System.out.println();
	}
	public void fibonacci5()
	{
		int a=0;
		int b=1;
		int c;
		System.out.print("1 1 ");
		for(int i=1; i<5; i++)
		{
		c=a+b; //0+1 =1, 1+1 =2, 1+2 = 3,2+3 =5,3+5=8
		a=b;   //1, 1,2,3,5
		b=c;   //1,2,3,5,8
		System.out.print(c+ " ");
		}
		System.out.println();
		}
	
	public static void main(String[] args) 
	{
		FibonacciPract A = new FibonacciPract();
		A.Fibonacci();
		A.Fibonacci1();
		A.fibonacci2();
		A.Fiboonacci3();
		A.fibonacci5();
	}
}
