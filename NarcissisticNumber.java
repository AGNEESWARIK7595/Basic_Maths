import java.util.*;
import java.lang.*;
import java.io.*;


class NarcissisticNumber
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int total = sc.nextInt();
		for(int i=0;i<total;i++){
			int num = sc.nextInt();
			int c=0,temp=0;
			
			int k=num;
			int digits=String.valueOf(num).length();
			while(num!=0){
				c=num%10;
				temp+=Math.pow(c,digits);
				num=num/10;
				
			}
			if(k==temp){
			System.out.println("Yes");
			
		}else{
			System.out.println("No");
		}
				
		}
	}
}
