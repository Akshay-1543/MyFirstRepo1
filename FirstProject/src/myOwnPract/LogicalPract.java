package myOwnPract;

public class LogicalPract 
{
	public void Logic1()
	{


		int a=0;
		int b=1;
		int c;
		System.out.print("0 1  ");
		for(int i=1; i<5; i++)
		{
			c = a+b; //0+1 =1 1+1 =2 , 1+2 = 3,2+3 =5, 3+5 =8,
			a=b; //1,1,2,3
			b=c;//1,2,3,5
			System.out.print(c+ "  ");
		}
	}
	public static void main(String[] args) 
	{
		LogicalPract f = new LogicalPract();
		f.Logic1();
	}
}
