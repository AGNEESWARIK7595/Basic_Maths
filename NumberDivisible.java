import java.util.*;
import java.lang.*;
import java.io.*;


class NumberDivisible
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc =  new Scanner(System.in);
		int candies=sc.nextInt();
		int cousins=sc.nextInt();
		if(candies<=100000 && candies <=100000){
			int output = candies%cousins;
			if(output==0){
				System.out.println("YES");
				}else{
				System.out.println("NO");
			}
		}
	}
}
