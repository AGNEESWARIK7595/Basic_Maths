import java.util.*;
import java.lang.*;
import java.io.*;


class WinOrLose
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scanner = new Scanner(System.in);
		
		int maxValue =0;
		int count = scanner.nextInt();
		int a[] = new int[count];
		if(count>0 && count <=100000){
		for(int i=0;i<count;i++){
			a[i] = scanner.nextInt();
		}
		}
		if(a.length<=100000 && a.length>0){
		maxValue = a[0];
		for(int i=0;i<a.length;i++){
			if(a[i]>maxValue){
				maxValue = a[i];
			}
		}
		if(maxValue%2==0){
			System.out.println("WON");
		}else{
			System.out.println("LOST");
		}
		}
	}
}
