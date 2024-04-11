import java.util.*;
import java.lang.*;
import java.io.*;

class Factorial
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		
		for(int i=0;i<count;i++){
			int num = sc.nextInt();
			if(num>=0 && num<=20){
			long a=1;
			for(int j=1;j<=num;j++){
				a *= j;
				
			}
				System.out.println(a);
			}
		}
	}
}
