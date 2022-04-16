package myOwnPract;

public class BikeInfoSwitchStatement 
{
 String name;    // declaration
 int price;
 String model;     //global variables
 int avg_kmpl;
 String engine;
 public BikeInfoSwitchStatement(String name, int price, String model, int avg_kmpl, String engine )   
 {
	 this.name = name;
	 this.price = price;
	 this.model = model;            // Local variables
	 this.avg_kmpl = avg_kmpl;
	 this.engine = engine;
 }
 public void Bikeinfo()
 { 
	 int Bikeinfo = 1;
	 
	 switch (Bikeinfo) {
	
	 case 1:
		 System.out.println("Bike company name =" + name + "\n" + "Price of bike =" + price + "\n" + "Name of model =" + model + "\n" + "Avg of bike =" + avg_kmpl + "\n" + "Engine capacity =" + engine);
	 case 2:
		 System.out.println("Price of bike =" + price);
	 case 3:
		 System.out.println("Name of model =" + model);
	 case 4:
		 System.out.println("Avg of bike =" + avg_kmpl); 
	 case 5:
		 System.out.println("Engine capacity =" + engine);
	 }
 }
	 public static void main(String[] args)
	 {
		 BikeInfoSwitchStatement AJ = new BikeInfoSwitchStatement("Yamaha", 121000, "FZ-S", 55, "149cc");
		 AJ.Bikeinfo();
		 BikeInfoSwitchStatement AM = new BikeInfoSwitchStatement("Honda", 126000, "Unicorn", 60, "150cc");
		 AM.Bikeinfo();
		 BikeInfoSwitchStatement A = new BikeInfoSwitchStatement("TVS", 115000, "Apache", 48, "159cc");
		 A.Bikeinfo();
		 
	 }
	 
 }

