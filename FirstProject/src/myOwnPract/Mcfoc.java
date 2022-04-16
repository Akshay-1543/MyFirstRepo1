package myOwnPract;   //package creation

public class Mcfoc      // class creation
{
 public void m3()       // Initialization // Non-static method
 {
  System.out.println("this is nonstatic method running from msfoc class");    // printing statement
 }
 public static void m4()        //static method
 {
  System.out.println("this is static method rung from mcfoc class");
 }
 public static void main(String[] args)   // main method
 {
  Mcfoc AJ = new Mcfoc();     // We have called non-static method and static method from Mcfoc class
  AJ.m3();
  m4(); 
  Mcwsc A = new Mcwsc();
  A.m1();                      //we have call a method from Mcwsc class which is from outside class
  Mcwsc.m2();
 }
}
