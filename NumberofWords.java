import java.util.*;
import java.lang.*;
import java.io.*;


class NumberofWords
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		String sentence = sc.nextLine();
		char a[] = new char[sentence.length()];
		a= sentence.toCharArray();
		int count=0;
		for(int i=0;i<sentence.length()-1;i++){
			if(a[i+1]==' '||a[i+1]=='.'){
				count++;
			}
		}
		System.out.println(count);
	}
}
