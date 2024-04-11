import java.util.*;
import java.lang.*;
import java.io.*;


class SumProductNumber
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int total = sc.nextInt();
		for(int i=0;i<total;i++){
			int num = sc.nextInt();
			int c=0,temp=0,temp1=1;
			int d=0,n=num;
			while(num!=0){
				c=num%10;
				temp+=(c);
				temp1*=c;
				num=num/10;
			}
			d =temp*temp1;
			if(d==n){
				System.out.println("Yes");
			}else{
				System.out.println("No");
			}
		
				
		}
	}
}
