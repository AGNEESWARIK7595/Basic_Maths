import java.util.*;
import java.lang.*;
import java.io.*;

class ToggleCase
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		sc.nextLine();
		for(int i=0;i<count;i++){
			String a = sc.nextLine();
			char b[] = new char[a.length()];
			b= a.toCharArray();
			for(int k = 0;k < a.length();k++){
				if(Character.isLowerCase(b[k])){
					b[k]=Character.toUpperCase(b[k]);
					
				}else{
					b[k]=Character.toLowerCase(b[k]);
					
				}
			}
			System.out.println(b);
		}
	}
}
