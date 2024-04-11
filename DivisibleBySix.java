import java.util.*;
import java.lang.*;
import java.io.*;


class DivisibleBySix
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc  = new Scanner(System.in);
		int n= sc.nextInt();
		for(int i =1;i<=n;i++){
			int a = sc.nextInt();
			if(a%6==0){
				System.out.println("True");
					
				}else{
					System.out.println("False");
				}
			}
		}
	}
