import java.util.*;
import java.lang.*;
import java.io.*;


class Pastries
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int count =sc.nextInt();
		int customer = sc.nextInt();
		int[] pastries = new int[customer];
		for(int i=0;i<customer;i++){
			pastries[i]=sc.nextInt();
		}
		for(int i=0;i<customer;i++){
			if(count >0){
				System.out.println("Enjoy your dessert!");
			}else{
				System.out.println("Sorry, we are all out!");
			}
			count -=Math.min(pastries[i],count);
			
			
			
		}
	}
}
