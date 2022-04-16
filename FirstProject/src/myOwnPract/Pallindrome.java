package myOwnPract;

public class Pallindrome {
	public void aa() {
		int n=131;
		int s=0;
		int t=n;
		int r;
		while(n>0) {
			r = n%10;//131%10=1,3,1
			s = s*10 + r;//1,10+3=13,13*10+1=131
			n = n/10;//13,1		
		}
		if(t == s) {
			System.out.println("It is a Pallindrome number");
		}else {
			System.out.println("It is not a Pallindrome Number");
		}
	}
	
		public void PallindromeNo(int a)  // here we Declared a Variable as an argument 
		{
			
			 
			int s = 0;
			int c = a;
			int k;
			while(a>0)
			{
				k = a%10;
				s = s*10+k;
				a = a/10;
			}
			if(c == s)
			{
				System.out.println(" Number is Pallindrome ");
		}
			else
			{
				System.out.println("Number Is Not Pallindrome");
			}
		}
		public void ReverseNo() {
			int b = 1234;
			int c = 0;
			int d;
			System.out.println("Reverse Number Is ");
			while(b>0)
			{
			 d = b%10;
			 c = c*10+d;
			 b = b/10;
			}
			System.out.println(c);
			}
			
	public static void main(String[] args) {
		Pallindrome x = new Pallindrome();
		x.aa();
		x.PallindromeNo(151); // passed an argument as value and it shows in output as it is pallindrome number or not
		x.ReverseNo();
	}

}
