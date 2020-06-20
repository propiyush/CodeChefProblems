package beginnerProblems;

import java.io.*;
import java.util.*;


public class FirstAndLastDigit {
	
	 public static void main(String[] args) throws IOException{
	        Scanner sc = new Scanner(System.in);
	        try{
	        int t = sc.nextInt();
	        sc.nextLine();
	        while(t>0) {
	        	String str = sc.nextLine();
	        	int l = str.length();
	        	int last = Integer.parseInt(str)%10;
	        	int first = (int) (Integer.parseInt(str)/Math.pow(10, l-1));
	        	System.out.println(first+last);
	        	t--;
	        }
	        sc.close();
	        }catch(Exception e)
	        {
	            return;
	        }
	    }

}
