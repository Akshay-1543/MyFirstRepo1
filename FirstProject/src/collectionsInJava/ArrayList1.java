package collectionsInJava;

import java.util.ArrayList;

public class ArrayList1 
{
	public static void main(String[] args)
	{
		ArrayList l = new ArrayList();
		l.add(10);
		l.add(200);
		l.add("Akshay");
		l.add('A');
		l.add(null);
		l.add(20.50);
		l.add(null);
		System.out.println(l);
		//below statement is used to get total size
		System.out.println(l.size());

		// to print perticular value in console box using index
		System.out.println(l.get(2));

		//to check the values in index
		System.out.println(l.contains("Akshay")); // print as true

		// below statement is used to remove perticular value from index
		l.remove(4);
		System.out.println(l);
		
		// to check if it is empty or not
		System.out.println(l.isEmpty());//print as false cz it is having information in index
		
		//to delete all records from index
		l.clear();
		System.out.println(l);


	}
}
