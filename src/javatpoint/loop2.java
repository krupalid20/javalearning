package javatpoint;

import java.util.Scanner;

public class loop2 {

				public static void main(String[] args){
		        int sum=0;
		        Scanner s = new Scanner(System.in);
		        int q = s.nextInt();
		        for(int i=0;i<q;i++){
		            int a = s.nextInt();
		            int b = s.nextInt();
		            int n = s.nextInt();
		            
		            sum=a;
		            for(int j=0;j<n;j++)
		            {
		             
		             sum = (int) (sum + (Math.pow(2,j)*b));
		                System.out.print(sum+" ");   
		            }
		            System.out.println();
		        }
		        
		    }
		}
