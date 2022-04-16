package myOwnPract;

public class CompileTime_Polymorphism 
{
  public void Akshay()
  {
	  System.out.println("I want to Complete My Dream");
  }
  public void Akshay(String Bike)
  {
	System.out.println("I want to buy a bike =" +Bike);  
  }
  public void Akshay(String Car, int Seater)
  {
	  System.out.println("I want to buy a car =" + Car + Seater);
  }
  public static void main(String[] args) 
  {
	  CompileTime_Polymorphism K = new CompileTime_Polymorphism();
	  K.Akshay();
	  K.Akshay("Honda Unicorn");
	  K.Akshay("Creta", 5);
			  
}
}
