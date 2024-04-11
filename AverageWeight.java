import java.util.*;
import java.lang.*;
import java.io.*;

class AverageWeight
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		double a[]=new double[10];
		double b=0;
		double finalOutput=0;
		for(int i=0;i<10;i++){
			a[i]=sc.nextDouble();
		}
		for(int i=0;i<a.length;i++){
			b=b+a[i];
		}
		finalOutput = b/10;
		Math.round(finalOutput);
		System.out.format("%.6f",finalOutput);
	}
}
