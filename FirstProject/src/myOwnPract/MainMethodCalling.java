package myOwnPract;  

public class MainMethodCalling 
{
 public static void main(String[] args)
 {
 Mcwsc A = new Mcwsc();
 A.m1();                            // In this program we have executed all the methods in main method 
 Mcwsc.m2();             // if we have multiple packages with same package name and diff. class names then we can execute all the class in one main method.
 Mcfoc b = new Mcfoc();
 b.m3();
 Mcfoc.m4();
 MethodCallingWSCWithArgs C = new MethodCallingWSCWithArgs ();
 C.Akshay();
 C.Akshay("Duke");
 C.Akshay("Kushaq", 2);
 }
}