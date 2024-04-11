import java.util.*;
import java.lang.*;
import java.io.*;

class Vowels
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		Vowels obj =new Vowels();
		int num = sc.nextInt();
		String[] input = new String[num];
		sc.nextLine();
		if(sc.hasNext()){
			for(int i=0;i<num;i++){
				input[i] = sc.nextLine();
				obj.getVowels(input[i]);
				
			}
		}
	}
	
	void getVowels(String value){
		int count=0;
		String vowel = "aeiou";
		String vowelCaps = "AEIOU";
		char a[] = new char[value.length()];
		a=value.toCharArray();
		for(int i=0;i<value.length();i++){
		if(vowel.contains(String.valueOf(a[i])) ||vowelCaps.contains(String.valueOf(a[i])) ){
			count++;
			
		}
		
	}
		System.out.println(count);
		
		
		}
	
}
