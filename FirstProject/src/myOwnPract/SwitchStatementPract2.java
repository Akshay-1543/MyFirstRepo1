package myOwnPract;

public class SwitchStatementPract2 
{
  public void Day()
  {
	  int day =1;
			  switch (day ) {
			  case 1: 
				  System.out.println("Today Is Monday");
			  case 2: 
				  System.out.println("Today is tuesday");
			  case 3:
				  System.out.println("Today is wednesday");break;
			  }
  }
  public static void main(String[] args)
  {
	  SwitchStatementPract2 D = new SwitchStatementPract2();
	  D.Day();
	  
  }
}
