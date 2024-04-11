import java.util.*;
import java.lang.*;
import java.io.*;


class NotDivisible
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		for(int i=0;i<count;i++){
			int num = sc.nextInt();
			for(int j=1;j<=num;j++){
				if(j%3!=0){
					System.out.print(j+" ");
					
				}
			}
			System.out.println();
		}
	}
}
