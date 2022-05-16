package javatpoint;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class javalist 
{
		public static void main(String[] args) 
		{
		        try (Scanner scn = new Scanner(System.in)) {
					ArrayList<Integer> al = new ArrayList<>();
					for(int i=0;i<=5;i++)
					{
					    int ele = scn.nextInt();
					    al.add(ele);
					}
					for (int i=0;i<5;i++)
					{
					    String query = scn.next();
					    if(query.equals("Insert"))
					    {
					        int x = scn.nextInt();
					        int y = scn.nextInt();
					        al.add(x,y);
					    }
					    else
					    {
					        int x = scn.nextInt();
					        al.remove(x);
					    }
					    Iterator<Integer> itr = al.iterator();
					    while(itr.hasNext()){
					        System.out.println(itr.next()+" ");
					    }   
					}
				}
		    }
		}

	


