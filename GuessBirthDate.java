import java.util.*;
import java.lang.*;
import java.io.*;


class GuessBirthDate
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int count =sc.nextInt();
		int num=0;
		
			while(num!=count){
			int date=sc.nextInt();
			if(date==count){
				System.out.println("Correct Guess");
				num=count;
			}else{
				System.out.println("Incorrect Guess");
			}
			
		}
	}
}
