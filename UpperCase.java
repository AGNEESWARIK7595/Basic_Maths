import java.util.*;
import java.lang.*;
import java.io.*;


class UpperCase
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		sc.nextLine();
		for(int i=0;i<count;i++){
			String a = sc.nextLine();
			System.out.println(a.toUpperCase());
		}
	}
}
