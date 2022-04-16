package myOwnPract;

public class InstanceVariablePract
{
  int a = 55;
 public static void main(String[] args)
{
	 InstanceVariablePract GH = new InstanceVariablePract();
	 GH.AJ();
	 GH.AB();
	 GH.AJ();
	 GH.AB();
}
 public void AJ()
 {
	 System.out.println(a);
  }
  public void AB()
  {
	  System.out.println(a);
  }
}