package javatpoint;
//import java.io.*;
import java.util.*;


public class stringreverse {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String A=sc.next();
			   
			    String R= new StringBuilder(A).reverse().toString();
			    
			    if(A.equals(R)){
			        System.out.println("Yes");
			    }
			    else
			    {
			        System.out.println("No");
			    }
		}
	        
	}

}
