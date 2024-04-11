import java.util.*;
import java.lang.*;
import java.io.*;

class NumberReversal
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc= new Scanner(System.in);
		int num= sc.nextInt();
		String a = String.valueOf(num);
		String cb="";
		for(int i =a.length()-1;i>=0;i--){
			cb=cb+a.charAt(i);
		}
		System.out.println(Integer.parseInt(cb));
	}
}
