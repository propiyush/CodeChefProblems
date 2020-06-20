package beginnerProblems;
import java.io.*;
import java.util.*;

public class SmallerNumberOfNotes {
	
	public static void main (String[] args) throws IOException
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		try {
		int t = sc.nextInt();
		while(t>0){
		    int n = sc.nextInt();
		    int note = 0;
		    if(n>=100) {
		    	note = note + n/100;
		    	n = n%100;
		    }
		    if(n>=50) {
		    	note = note + n/50;
		    	n = n%50;
		    }
		    if(n>=10) {
		    	note = note + n/10;
		    	n = n%10;
		    }
		    if(n>=5) {
		    	note = note + n/5;
		    	n = n%5;
		    }
		    if(n>=2) {
		    	note = note + n/2;
		    	n = n%2;
		    }
		    if(n>=1) {
		    	note = note + n/1;
		    	n = n%1;
		    }
		    System.out.println(note);
		    t--;
		}
		}catch(Exception e) {
			return;
		}
	}

}
