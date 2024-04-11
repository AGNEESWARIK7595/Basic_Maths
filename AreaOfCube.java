import java.util.*;
import java.lang.*;
import java.io.*;

class AreaOfCube
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner getInput = new Scanner(System.in);
		int a = getInput.nextInt();
		int surfaceArea = 6*(a*a);
		int volume = (a*a*a);
		System.out.print(surfaceArea);
		System.out.print(" "+volume);
	}
}
