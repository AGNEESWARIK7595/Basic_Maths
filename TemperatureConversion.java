import java.util.*;
import java.lang.*;
import java.io.*;


class TemparatureConversion
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++){
			float a= sc.nextFloat();
			float output = (9*a/5)+32;
			System.out.format("%.2f\n",output );
			
		}
	}
}
