import java.util.*;
import java.lang.*;
import java.io.*;


class Weather
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		for(int i=0;i<num;i++){
			int temp=sc.nextInt();
			int humidity =sc.nextInt();
			if(temp>=30 && humidity>=90){
				System.out.println("Hot and Humid");
			}else if(temp>=30 && humidity<90){
				System.out.println("Hot");
			}else if(temp<30 && humidity>=90){
				System.out.println("Cool and Humid");
			}else{
				System.out.println("Cool");
			}
		}
	}
}
