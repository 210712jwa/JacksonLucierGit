package main;
import java.util.*;

public class Converter {
	
	public void helpMain() {
		System.out.println("Please select conversion type:");
		System.out.println("1. Volume Conversion");
		System.out.println("2. Distance Conversion");
		System.out.println("3. Quit");
		System.out.println("4. Help");
	}
	
	public void helpVolume() {
		
		System.out.println("Chose a Volume Conversion:");
		System.out.println("1. Teaspoons to Tablespoons");
		System.out.println("2. Cups to Teaspoons");
		System.out.println("3. US Gallons to Imperial Gallons");
		System.out.println("4. Back to Conversion Type Menue");
		System.out.println("5. Quit");
		System.out.println("6. Help");
	}
	
	public void helpDistance() {
		
		System.out.println("1. Feet to Meters");
		System.out.println("2. Miles to Kilometers");
		System.out.println("3. Back to Conversion Type Menue");
		System.out.println("4. Quit");
		System.out.println("5. Help");
	}
	
	public double teaspoonsToTablespoons(double num)
	{
		
		//1 teaspoon = 0.333333 tablespoons
		double table = num * 0.333333;
		return table;
	}
	
	public double cupsToTeaspoons(double num)
	{
		//1 cup = 48 teaspoons
		double tea = num * 48;
		return tea;
	}
	
	public double feetToMeters(double num)
	{
		
		//1 foot = 0.3048 meters
		double meter = num * 0.3048;
		return meter;
	}
	
	public double milesToKilometers(double num)
	{
		
		//1 mile = 1.60934 kilometers
		double kilo = num * 1.60934;
		return kilo;
	}
	
	public double usToImperial(double num)
	{
		
		//1 us gallon = 0.832674 imperial gallons
		double gallon = num * 0.832674;
		return gallon;
	}
	
	public boolean goVolume(Scanner input)
	{
		
		helpVolume();
		String choice = input.nextLine().toLowerCase();
		System.out.println(choice);
		if (choice.equals("back") || choice.equals("b") || choice.equals("4"))
		{
			//do nothing, cancel other ifs
		}
		else if (choice.equals("help") || choice.equals("h") || choice.equals("6"))
		{
			
			//help option
			return goVolume(input);
		}
		if (choice.equals("quit") || choice.equals("q") || choice.equals("5"))
		{
			System.out.println("You have quit the program");
			return false;
		}
		else if (choice.equals("teaspoons to tablespoons") || choice.equals("1"))
		{
			System.out.println("How many Teaspoons?");
			double measurement = Double.parseDouble(input.nextLine());
			double table = teaspoonsToTablespoons(measurement);
			System.out.println(measurement + " Teaspoons equals " + table + " Tablespoons");
		}
		else if (choice.equals("cups to teaspoons") || choice.equals("2"))
		{
			System.out.println("How many Cups?");
			double measurement = Double.parseDouble(input.nextLine());
			double tea = cupsToTeaspoons(measurement);
			System.out.println(measurement + " Cups equals " + tea + " Teaspoons");
		}
		else if (choice.equals("us gallons to imperial gallons") || choice.equals("3"))
		{
			System.out.println("How many US Gallons?");
			double measurement = Double.parseDouble(input.nextLine());
			double gallon = usToImperial(measurement);
			System.out.println(measurement + " US Gallons equals " + gallon + " Imperial Gallons");
		}
		return true;
	}
	
	public boolean goDistance(Scanner input)
	{
		
		helpDistance();
		String choice = input.nextLine().toLowerCase();
		System.out.println(choice);
		if (choice.equals("back") || choice.equals("b") || choice.equals("3"))
		{
			//do nothing, cancel other ifs
		}
		else if (choice.equals("help") || choice.equals("h") || choice.equals("5"))
		{
			
			//help option
			return goDistance(input);
		}
		if (choice.equals("quit") || choice.equals("q") || choice.equals("4"))
		{
			System.out.println("You have quit the program");
			return false;
		}
		else if (choice.equals("feet to meters") || choice.equals("1"))
		{
			System.out.println("How many Feet?");
			double measurement = Double.parseDouble(input.nextLine());
			double meter = feetToMeters(measurement);
			System.out.println(measurement + " Feet equals " + meter + " Meters");
		}
		else if (choice.equals("Miles to Kilometers") || choice.equals("2"))
		{
			System.out.println("How many Miles?");
			double measurement = Double.parseDouble(input.nextLine());
			double kilo = milesToKilometers(measurement);
			System.out.println(measurement + " Miles equals " + kilo + " Kilometers");
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		Converter con = new Converter();
		
		
		Scanner input = new Scanner(System.in);
		boolean cont = true;
		while (cont) {
			con.helpMain();
			String choice = input.nextLine().toLowerCase();
			//System.out.println(choice);
			if (choice.equals("quit") || choice.equals("q") || choice.equals("3"))
			{
				System.out.println("You have quit the program");
				break;
			}
			if (choice.equals("help") || choice.equals("h") || choice.equals("4"))
			{
				//call help method
				con.helpMain();
			}
			else if (choice.equals("volume conversion") || choice.equals("v") || choice.equals("1"))
			{
				//enter volume conversion
				cont = con.goVolume(input);
				
			}
			else if (choice.equals("distance conversion") || choice.equals("d") || choice.equals("2"))
			{
				
				//enter distance conversion
				cont = con.goDistance(input);
			}
			
		}
		
		input.close();
	}

}
