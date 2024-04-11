import java.util.*;
import java.lang.*;
import java.io.*;

class OddOrEven
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int a[] = new int[count];
		for(int i=0;i<count;i++){
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++){
			if(a[i]%2==0){
				System.out.println("EVEN");
				}else{
				System.out.println("ODD");
			}
		}
		sc.close();
	}
}
