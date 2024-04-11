import java.util.*;
import java.lang.*;
import java.io.*;

class SimpleInterest
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		double p = sc.nextDouble();
		double r = sc.nextDouble();
		double t= sc.nextDouble();
		double simpleInterest = 0;
	
		if(p<=100000 && r<=20 && t<=20){
			simpleInterest = p*r*t/100;
			
		}
		System.out.format("%.6f",simpleInterest);
	}
}
