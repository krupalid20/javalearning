package javatpoint;

import java.math.BigInteger;
import java.util.Scanner;

/*import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;*/

public class biginteger {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in)) {
			BigInteger a = new BigInteger((scan.next()));
			BigInteger b = new BigInteger(scan.next());
			System.out.println(a.add(b));
			System.out.println(a.multiply(b));
		}
	}

}
