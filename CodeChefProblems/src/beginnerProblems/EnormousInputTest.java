package beginnerProblems;

import java.io.*;
import java.util.*;


public class EnormousInputTest {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		 int count=0;
		 Scanner sc = new Scanner(System.in);
		 try{
	        int t = sc.nextInt();
	        long k = sc.nextLong();
	        
	        while(t>0)
	        {
	            long a = sc.nextLong();
	                if(a%k == 0)
	                count++;
	            t--;
	        }
		 }
		 catch(Exception e)
		 {
		     return;
		 }
	        System.out.println(count);
	        sc.close();
	}

}