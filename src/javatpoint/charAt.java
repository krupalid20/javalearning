package javatpoint;

public class charAt {

	public static void main(String[] args) {
	 
		        String str = "Shivani Javiya";  
		        int count = 0;  
		        for (int i=0; i<=str.length()-1; i++) {  
		            if(str.charAt(i) == 'y') {  
		                count++;  
		            }  
		        }  
		        System.out.println("Frequency of y is: "+count);  
		    }  
		}  

