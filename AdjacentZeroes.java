import java.util.*;
import java.lang.*;
import java.io.*;


class AdjacentZeroes
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		sc.nextLine();
		for(int i=1;i<=count;i++){
			if(sc.hasNext()){
				String value = sc.nextLine();
				if(value.matches("[01]+")){
				char a[] = new char[value.length()];
			a=value.toCharArray();
			boolean flag = false;
			for(int j=0;j<value.length()-1;j++){
			if(a[j]=='0' && a[j+1]=='0'){
				flag = true;
			}
			}
			if(flag == true){
			System.out.println("Yes");
			}else{
			System.out.println("No");
			}
			}
		}
		}
	}
	
	
}
