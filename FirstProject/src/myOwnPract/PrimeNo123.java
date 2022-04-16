package myOwnPract;

public class PrimeNo123 
{
public void AKJ()
{
	int i;
	int j;
	for(i=2;i<=100;i++) //2(3) 5(6) 
	{
		int count = 0;
		for(j=2;j<i;j++) //2(3) 3(4) 4(5)
		{
			if(i%j==0) //0 //1  //0,1 0 1 0
			{
				count = count+1; //1 
			}
		}
		if(count==0)
		{
			System.out.print(" " +i);
		}
	}
}
public static void main(String[] args)
{
	PrimeNo123 a = new PrimeNo123();
	a.AKJ();
			
}
}
