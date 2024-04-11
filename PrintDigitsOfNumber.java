import java.util.*;
import java.lang.*;
import java.io.*;

// Please make sure not to delete the WorkAtTech class
// You can create additional non-public classes as well
// But the main method should be in the WorkAtTech class
class PrintDigitsOfNumber
{
	public static void main (String[] args) throws java.lang.Exception
	{
		PrintDigitsOfNumber obj = new PrintDigitsOfNumber();
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++){
			a[i] =sc.nextInt();
			obj.printDigits(a[i]);
		}
		
	}
	
	void printDigits(int num){
		int c=0;
		int d=0;
		c=num%10;
		d=num/10;
		System.out.println(d+" "+c);
	}
}
