import java.util.*;
import java.lang.*;
import java.io.*;

// Please make sure not to delete the WorkAtTech class
// You can create additional non-public classes as well
// But the main method should be in the WorkAtTech class
class ReverseArray
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int a =sc.nextInt();
		int b[] = new int[a];
		int c[] = new int[a];
		for (int i=0;i<a;i++){
			b[i]=sc.nextInt();
		}
		for(int j=a-1;j>=0;j--){
			c[j]=b[j];
			System.out.print(" " +c[j]);
		}
		
		
	}
}
