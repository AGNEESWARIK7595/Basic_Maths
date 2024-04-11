import java.util.*;
import java.lang.*;
import java.io.*;


class MaxinMatrix
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int m=sc.nextInt();
		int n= sc.nextInt();
		int a[][] = new int[m][n];
		int max=0;
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				a[i][j]=sc.nextInt();
				}
		}
		max=a[0][0];
		
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				if(a[i][j]>max){
					max=a[i][j];
					}
	}
			
}
System.out.println(max);
	}
}
		
