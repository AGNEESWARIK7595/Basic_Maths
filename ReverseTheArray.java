import java.util.*;
import java.lang.*;
import java.io.*;

class ReverseTheArray
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
		int b[] = new int[a];
		for(int i=0;i<a;i++){
			b[i]=sc.nextInt();
		}
		for(int j = a-1;j>=0;j--){
			System.out.print(b[j]+" ");
		}
	}
}
