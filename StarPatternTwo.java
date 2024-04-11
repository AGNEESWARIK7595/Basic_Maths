import java.util.*;
import java.lang.*;
import java.io.*;


class StarPatternTwo
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		if(n>0 && n<=5000){
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
			System.out.print("*");
		}
			System.out.println();
		}
		}	
		}
		
	
	}
