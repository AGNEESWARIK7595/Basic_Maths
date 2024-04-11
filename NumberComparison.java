import java.util.*;
import java.lang.*;
import java.io.*;


class NumberComparison
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		for(int i=0;i<n;i++){
			int a = sc.nextInt();
			if(a>7){
				System.out.println("UP");
			}else if(a<7){
				System.out.println("DOWN");
			}else{
				System.out.println("EQUAL");
			}
		}
	}
}
