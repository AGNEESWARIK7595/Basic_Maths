import java.util.*;
import java.lang.*;
import java.io.*;


class FibonacciSeries
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc= new Scanner(System.in);
		int total = sc.nextInt();
		
		for(int i=0;i<total;i++){
			
			int num =sc.nextInt();
			int sum=0;
			int a= 0, b=1;
			if(num<=40){
			for(int j=0;j<num;j++){
				System.out.print(a + " ");
				sum = a+b;
				a=b;
				b=sum;
				
			}
				System.out.println();
			}
			
		}
		
	}
}
