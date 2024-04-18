import java.util.*;
import java.lang.*;
import java.io.*;


class BirthYearCalcuation
{
	public static void main (String[] args) throws java.lang.Exception
	{
			Scanner scanner = new Scanner(System.in);

        // Read input
        String name = scanner.next();
        int birthYear = scanner.nextInt();

        // Get current year
        int currentYear = 2020;

        // Calculate age
        int age = currentYear - birthYear;

        // Output
        System.out.println("Happy Birthday " + name + "! Your current age is " + age);

        scanner.close();
    }
	
}
