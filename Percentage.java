import java.util.*;
import java.lang.*;
import java.io.*;

class Percentage
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		double total=0;
		double output=0;
		double[] a = new double[count];
		for(int i =0;i<count;i++){
			a[i]= sc.nextDouble();
		}
		for(int i=0;i< count;i++){
			total =total + a[i];
		}
		output =total/count;
		output = (output/80)*100;
		System.out.format("%.2f%%",output);
		
		
	}
}
