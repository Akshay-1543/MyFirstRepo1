package myOwnPract;

public class Pract1 
{
	//36,96,126,336,11,199,211,444,777
	public Pract1(int a, int b, int c, int d, int e, int f, int g, int h, int i)

	{
		int j = a+b+c+d+e+f+g+h+i;
		int k = j/9;
		System.out.println(k);

	}
	//another method to calculate average
	int sum =0;
	public void akj()
	{
		int v[] = {36,96,126,336,11,199,211,444,777};
		System.out.println("Length is =" +v.length);
		for(int i =0; i<v.length;i++)
		{
			sum = sum+v[i];
		}
		System.out.println(sum/v.length);

	}
	// To Calculate the Average For numbers
	int sum1 =0;
	public void avg()
	{
		int g[] = {19,78,898,75,987,98,87,98,453};
		for(int f =0; f<g.length;f++)
		{
			sum1=sum1+g[f];
		}
		System.out.println(sum1/g.length);
	}
	public void Pallindrome()
	{
		int n =171;
		int s =0;
		int r;
		int b = n;
		while(n>0)
		{
			r = n%10;
			s = s*10+r;
			n = n/10;
			
		}
		if(b==s)
		{
		System.out.println("No is Pallindrome");	
		}
		else
		{
			System.out.println("No is Not Pallindrome");
		}
	}
	public void ReverseNo()
	{
		int n=1223;
		int s=0;
		int r;
		while(n>0)
		{
			r = n%10;
			s = s*10+r;
			n = n/10;
		
		}
		System.out.println(s);
	}
	public static void main(String[] args)
	{
		Pract1 x = new Pract1(36,96,126,336,11,199,211,444,777);
        x.akj();
        x.Pallindrome();
        x.ReverseNo();
        x.avg();
	}
}
