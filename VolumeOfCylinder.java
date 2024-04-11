import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

class VolumeOfCylinder
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scanner = new Scanner(System.in);
		int radius = scanner.nextInt();
		int height = scanner.nextInt();
		double piValue =3.14;
		double volume =0;
		double amount =0;
		if(radius<=1000 && height<=1000){
			volume =  3.14*(radius*radius)*height;
			amount = (volume * 40)/1000;
			System.out.format("%.2f",amount);
		}
	}
}
