package myOwnPract;

import java.util.Scanner;

public class pallindromeNo 
{
	
 int number;
 int sum = 0;
 int remainder;
 int a =number;
 public void Pallindrome()
 {
	 System.out.println("Enter A No");
	 Scanner sc = new Scanner(System.in);
	 int number = sc.nextInt();
	 
	 
	 while(number>0)
	 {
		remainder = number%10;
		sum = sum*10 + remainder;
		number = number/10;
	 }
	 sc.close();
	 if(a==sum)
	 {
		 System.out.println("number is pallindrome");
	 }
	 else
	 {
		 System.out.println("number is not pallindrome");
	 }
 }
 public static void main(String[] args) 
 {
	 pallindromeNo T = new pallindromeNo();
	 T.Pallindrome();
}
}
