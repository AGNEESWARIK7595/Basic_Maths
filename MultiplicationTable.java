import java.util.*;
import java.lang.*;
import java.io.*;


class MultiplicationTable
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		Scanner sc = new Scanner(System.in);
		MultiplicationTable obj =new MultiplicationTable();
		int num = sc.nextInt();
		int[] input = new int[num];
		
			for(int i=0;i<num;i++){
				input[i] = sc.nextInt();
				obj.getMultiplication(input[i]);
				System.out.println();
			}
		
	}
	
	void getMultiplication(int value){
		int[] output = new int[10];
		if(value>0){
		for(int i=0,j=1;j<=10;i++,j++){
			output[i]=j*value;
			System.out.print(output[i]+" ");
			}
			
	}
	}
}
