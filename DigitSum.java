import java.util.*;
import java.lang.*;
import java.io.*;

class DigitSum
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int total = sc.nextInt();
		for(int i=0;i<total;i++){
			int num = sc.nextInt();
			int c=0,temp=0;
			while(num!=0){
				c=num%10;
				temp+=(c);
				num=num/10;
			}
		System.out.println(temp);
				
		}
	}
}
