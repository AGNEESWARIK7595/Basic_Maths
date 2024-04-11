import java.util.*;
import java.lang.*;
import java.io.*;

class GrossSalary
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		double hra= sc.nextDouble();
		double da= sc.nextDouble();
		double bonus = sc.nextDouble();
		double output=0;
		for(int i=0;i<count;i++){
			double ba = sc.nextDouble();
			output = (ba) + (ba * hra/100) +
				(ba * da/100) + (ba*bonus/100);
			System.out.println(String.format("%.2f",output));
		}
	}
}
