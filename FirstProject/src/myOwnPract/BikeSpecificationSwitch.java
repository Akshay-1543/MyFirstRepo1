package myOwnPract;

import java.util.Scanner;

public class BikeSpecificationSwitch
{

	public void BikeInfo()
	{
		System.out.println("--------Welcome In Our Showroom Sir/Madam----------");
		System.out.println("Enter Bike Pricerange");
		Scanner Sc = new Scanner(System.in);
		int pricerange = Sc.nextInt();
		System.out.println("Pricerange =" + pricerange);

		if(pricerange<120000 && pricerange>80000) {
			System.out.println("1. Unicron" + "\n" + "2. Hornet" + "\n" +  "3. CBR1000" + "\n" + "4.R15");
		}
		else if(pricerange<80000 && pricerange>70000) {
			System.out.println("5. Shine" + "\n" + "6. DreamYuga" + "\n" + "7. PassionPro" + "\n" + "8. Delux");
		}
		else if(pricerange<70000 && pricerange>60000) {
			System.out.println("9. Splendor" + "\n" + "10. Platina" + "\n" +  "11. Discover");
		}
		else
		{
			System.out.println("You Can Buy Another Bikes");
			System.out.println("12. FZ-s = price-125000, Avg- 45kmpl, Engine- 150cc" +"\n" +  "13. CT100 = price-55000 avg- 75kmpl, Engine-110cc");
		}
		System.out.println("Enter Your Model No ");
		Scanner S = new Scanner(System.in);
		int modelNo = S.nextInt();
		System.out.println("modelno =" + modelNo);

		switch(modelNo) {
		case 1: System.out.println("Bike Name =  Unicorn" + "\n" + "price = 110000" + "\n" + "Average = 55 kmpl" + "\n" + "Engine Capacity = 150 cc" + "\n" + "Colour = Black, Grey, REd");break;
		case 2: System.out.println("Bike Name = Hornet" + "\n" + "price = 105000" + "\n" + "Average = 50 kmpl" + "\n" + "Engine Capacity = 159 cc" + "\n" + "Colour = Black, Orange, REd, Green");break;
		case 3:	System.out.println("Bike Name = CBR1000" + "\n" + "price = 119000" + "\n" + "Average = 45 kmpl" + "\n" + "Engine Capacity = 200 cc" + "\n" + "Colour = Black, White, REd");break;
		case 4: System.out.println("Bike Name = R15" + "\n" + "price = 118000" + "\n" + "Average = 42 kmpl" + "\n" + "Engine Capacity = 200 cc" + "\n" + "Colour = Black, White, Blue, REd");break;

		case 5: System.out.println("Bike Name = Shine" + "\n" + "price = 79000" + "\n" + "Average = 60 kmpl" + "\n" + "Engine Capacity = 125 cc" + "\n" + "Colour = Black, Grey, REd");break;
		case 6: System.out.println("Bike Name = DreamYuga" + "\n" + "price = 71000" + "\n" + "Average = 62 kmpl" + "\n" + "Engine Capacity = 110 cc" + "\n" + "Colour = Black, Grey, REd");break;
		case 7: System.out.println("Bike Name = PassionPro" + "\n" + "price = 76000" + "\n" + "Average = 65 kmpl" + "\n" + "Engine Capacity = 125 cc" + "\n" + "Colour = Black, Grey, Blue, REd");break;
		case 8: System.out.println("Bike Name = Delux" + "\n" + "price = 74000" + "\n" + "Average = 70 kmpl" + "\n" + "Engine Capacity = 110 cc" + "\n" + "Colour = Black, Grey, REd");break;

		case 9: System.out.println("Bike Name = Splendor" + "\n" + "price = 68000" + "\n" + "Average = 75 kmpl" + "\n" + "Engine Capacity = 100 cc" + "\n" + "Colour = Black, Grey, REd");break;
		case 10:System.out.println("Bike Name = Platina" + "\n" + "price = 62000" + "\n" + "Average = 76 kmpl" + "\n" + "Engine Capacity = 100 cc" + "\n" + "Colour = Black, Grey, REd");break;
		case 11:System.out.println("Bike Name = Discover" + "\n" + "price = 65000" + "\n" + "Average = 72 kmpl" + "\n" + "Engine Capacity = 110 cc" + "\n" + "Colour = Black, Blue, REd");break;
		case 12:System.out.println("Bike Name = FZ-s = price-125000, Avg- 45kmpl, Engine- 150cc");break;
		case 13:System.out.println("Bike Name = CT100 = price-55000 avg- 75kmpl, Engine-110cc");break;
		}
		Sc.close();
		S.close();	
	}  
	public static void B()
	{
		System.out.println("------------Thank You So Much--------------");
	}

	public static void main(String[] args)
	{
		BikeSpecificationSwitch AJ = new BikeSpecificationSwitch();
		AJ.BikeInfo();
		B();
	}
}


