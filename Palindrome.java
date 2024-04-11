import java.util.*;
import java.lang.*;
import java.io.*;


class Palindrome
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		Palindrome obj =new Palindrome();
		int num = sc.nextInt();
		String[] input = new String[num];
		sc.nextLine();
		if(sc.hasNext()){
			for(int i=0;i<num;i++){
				input[i] = sc.nextLine();
				obj.checkPalindrome(input[i]);
				
			}
		}
	}
	
	void checkPalindrome(String value){
		char[] b= new char[value.length()];
		b=value.toCharArray();
		if(value.length()>0){
		for(int i=0,j=value.length()-1;i<j;i++,j--){
			char temp =b[i];
			b[i]=b[j];
			b[j]=temp;
			}
		String reverse = new String(b);
		if(value.equals(reverse)){
			System.out.println("True");
		}else{
			System.out.println("False");
		}
		}
	}
}
