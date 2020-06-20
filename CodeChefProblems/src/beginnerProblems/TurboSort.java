package beginnerProblems;

import java.io.*;
import java.util.Scanner;

public class TurboSort{
   public static void main(String[] args) throws IOException{
	        Scanner sc = new Scanner(System.in);
	        try {
	        int n = sc.nextInt();
	        int[] ar = new int[n];
	        for(int i=0; i<n; i++)
	        {
	        	ar[i]=sc.nextInt();
	        }
	        java.util.Arrays.sort(ar);
	        for(int i=0; i<n; i++)
	        {
	        	System.out.println(ar[i]);
	        }
	        
	        sc.close();
	        }catch(Exception e) {
	        	return;
	        }
	    }
    }
