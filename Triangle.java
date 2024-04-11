import java.util.*;
import java.lang.*;
import java.io.*;


class Triangle
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++){
			int a= sc.nextInt();
			int b= sc.nextInt();
			int c= sc.nextInt();
			int c1 =a+b;
			int c2 =b+c;
			int c3 =a+c;
			if(c1>=c && c2>=a && c3>=b ){
				int output = a+b+c;
				System.out.println(output);
			}else{
				System.out.println("-1");
			}
		}
	}
}
