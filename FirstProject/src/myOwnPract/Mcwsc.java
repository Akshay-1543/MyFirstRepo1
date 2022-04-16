package myOwnPract;   //package creation

public class Mcwsc   //class creation
{
 public void m1()    //initialization
 {
  System.out.println("m1 is non static method running in Mswsc");   // printing statement
  }
 public static void m2()
 { 
  System.out.println("m2 is static method running in Mcwsc");
  }
 public static void main(String[] args)   // usage      // main method
 {
  Mcwsc A = new Mcwsc();
  A.m1();
  m2();
 }
}

