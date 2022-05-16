package javatpoint;

import java.util.Scanner;

/*import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;*/

public class substringheckerrank {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
			Scanner in = new Scanner(System.in)) {
				String S = in.next();
				int start = in.nextInt();
				int end = in.nextInt();
				
				System.out.println(S.substring(start,end));
			}
	   }
}
