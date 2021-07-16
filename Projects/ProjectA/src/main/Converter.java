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
		System.out.println("4. Liter to US Fluid Ounce");
		System.out.println("5. Imperial Pint to Milliliter");
		System.out.println("6. Back to Conversion Type Menue");
		System.out.println("7. Quit");
		System.out.println("8. Help");
	}
	
	public void helpDistance() {
		
		System.out.println("1. Feet to Meters");
		System.out.println("2. Miles to Kilometers");
		System.out.println("3.Centimeters to Inches");
		System.out.println("4. Inches to Meters");
		System.out.println("5. Kilometers to Yards");
		System.out.println("6. Back to Conversion Type Menue");
		System.out.println("7. Quit");
		System.out.println("8. Help");
	}
	
	
	//Volume Conversions
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
	
	public double usToImperial(double num)
	{
		
		//1 us gallon = 0.832674 imperial gallons
		double gallon = num * 0.832674;
		return gallon;
	}
	
	public double litersToOunces(double num)
	{
		
		//1 liter = 33.814 US Fluid Ounce
		double ounce = num * 33.814;
		return ounce;
	}
	
	public double pintsToMilliliters(double num)
	{
		
		//1 Imperial Pint = 568.2608686967 Milliliter
		double mil = num * 568.2608686967;
		return mil;
	}
	
	//Distance Conversions
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
	
	public double centimetersToInches(double num)
	{
		
		//1 centimeter = 0.393701 inches
		double inch = num * 0.393701;
		return inch;
	}
	
	public double inchesToMeters(double num)
	{
		
		//1 inch = 0.025400013716 meters
		double meter = num * 0.025400013716;
		return meter;
	}
	
	public double kilometersToYards(double num)
	{
		
		//1 kilometer = 1093.613888889 yards
		double yard = num * 1093.613888889;
		return yard;
	}
	
	public boolean goVolume(Scanner input)
	{
		
		helpVolume();
		String choice = input.nextLine().toLowerCase();
		System.out.println(choice);
		if (choice.equals("back") || choice.equals("b") || choice.equals("6"))
		{
			//do nothing, cancel other ifs
		}
		else if (choice.equals("help") || choice.equals("h") || choice.equals("8"))
		{
			
			//help option
			return goVolume(input);
		}
		if (choice.equals("quit") || choice.equals("q") || choice.equals("7"))
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
		else if (choice.equals("liter to us fluid ounce") || choice.equals("4"))
		{
			System.out.println("How many Liters?");
			double measurement = Double.parseDouble(input.nextLine());
			double ounce = litersToOunces(measurement);
			System.out.println(measurement + " Liters equals " + ounce + " US Fluid Ounces");
		}
		else if (choice.equals("imperial pint to milliliter") || choice.equals("5"))
		{
			System.out.println("How many Imperial Pints?");
			double measurement = Double.parseDouble(input.nextLine());
			double mil = pintsToMilliliters(measurement);
			System.out.println(measurement + " Imperial Pints equals " + mil + " Milliliters");
		}
		return true;
	}
	
	public boolean goDistance(Scanner input)
	{
		
		helpDistance();
		String choice = input.nextLine().toLowerCase();
		System.out.println(choice);
		if (choice.equals("back") || choice.equals("b") || choice.equals("6"))
		{
			//do nothing, cancel other ifs
		}
		else if (choice.equals("help") || choice.equals("h") || choice.equals("8"))
		{
			
			//help option
			return goDistance(input);
		}
		if (choice.equals("quit") || choice.equals("q") || choice.equals("7"))
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
		else if (choice.equals("miles to kilometers") || choice.equals("2"))
		{
			System.out.println("How many Miles?");
			double measurement = Double.parseDouble(input.nextLine());
			double kilo = milesToKilometers(measurement);
			System.out.println(measurement + " Miles equals " + kilo + " Kilometers");
		}
		else if (choice.equals("centimeters to inches") || choice.equals("3"))
		{
			System.out.println("How many Centimeters?");
			double measurement = Double.parseDouble(input.nextLine());
			double inch = centimetersToInches(measurement);
			System.out.println(measurement + " Centimeters equals " + inch + " Inches");
		}
		else if (choice.equals("inches to meters") || choice.equals("4"))
		{
			System.out.println("How many Inches?");
			double measurement = Double.parseDouble(input.nextLine());
			double meter = inchesToMeters(measurement);
			System.out.println(measurement + " Inches equals " + meter + " Meters");
		}
		else if (choice.equals("kilometers to yards") || choice.equals("5"))
		{
			System.out.println("How many Kilometers?");
			double measurement = Double.parseDouble(input.nextLine());
			double yard = kilometersToYards(measurement);
			System.out.println(measurement + " Kilmeters equals " + yard + " Yards");
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
