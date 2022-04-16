package myOwnPract;    // create a package

public class Keyword2  // create a class
{
	// Declaration
 int age;
 String name;     // these are instance or global variables
 String address;
 double aadhar;
 long mob;
         // Initialization
public Keyword2(int age, String name, String address, double aadhar, long mob)
{ 
 this.age = age;
 this.name = name;
 this.address = address;    // Local Variables
 this.aadhar = aadhar;
 this.mob = mob;
 }
  // Usage
public void info() // non static method used
{
 System.out.println("Your age =" + age + "\n" + "name =" + name + "\n" + "address =" + address + "\n" + "aadhar =" + aadhar + "\n" + "mob =" + mob);
 }
public static void main(String[] args)    // main method
{
 Keyword2 AP = new Keyword2(24, "Akshay Jagtap", "Baramati", 12345678910d, 9579614263l); // created a object
 AP.info();
 Keyword2 AM = new Keyword2(21, "Rohit Kanade", "Pune", 2134567891d, 7768973465l);
 AM.info();
 }
}