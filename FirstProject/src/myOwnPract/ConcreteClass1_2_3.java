package myOwnPract;

public class ConcreteClass1_2_3 extends Abstraction3
{
public void Tatacar() 
{
	System.out.println("Tata cars are most popular cars in india");
}
public void Mahindracar() 
{
	System.out.println("mahindra xuv700");	
}
public void Hyundaicar() 
{
	System.out.println("creta");
}
public void Maruticar() 
{
	System.out.println("brezza");
}
public void ty()
{
	System.out.println("Thank you sir");
}
public static void main(String[] args) 
{
	ConcreteClass1_2_3 K = new ConcreteClass1_2_3();
	K.welcome();
	K.akj();
	K.welcome1();
	K.Tatacar();
	K.Hyundaicar();
	K.Mahindracar();
	K.Maruticar();
	K.ty();
}
}
