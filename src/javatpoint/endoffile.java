package javatpoint;

import java.util.Scanner;

/*import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;*/


public class endoffile 
{

		    public static void main(String[] args) 
		    {
		        try (/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
				Scanner sc = new Scanner(System.in)) {
					int n=1;
					while(sc.hasNext())
					{
					    System.out.println(n++ +" "+sc.nextLine());
					}
				} 
		    }
}

	


