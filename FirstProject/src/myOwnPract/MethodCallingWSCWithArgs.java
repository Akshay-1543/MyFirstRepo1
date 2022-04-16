package myOwnPract;    //Package creation

public class MethodCallingWSCWithArgs   // class creation
{
 public void Akshay()  //Initialization of non-static method
 {
  System.out.println("I have A Dream And I will Definately Complete My Dream");
 }
 public void Akshay(String Bike)     // we used a McwscWithArgs method
 {
  System.out.println("Akshay's Dream bike =" +Bike);
 }
 public void Akshay(String Car, int a)
 {
  System.out.println("I Want To Buy A Car =" + Car + "\n" + "How Many No Of Cars I Will Buy =" + a);
  }
 public static void main(String[] args)
 {
  MethodCallingWSCWithArgs A = new MethodCallingWSCWithArgs();
  A.Akshay();
  A.Akshay("Unicorn");                            // object creation of non-static method
  A.Akshay("Verna", 2);
 }
}