package beginnerProblems;
import java.io.*;
import java.util.*;

public class SmallFactorial {

	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0){
		    int n = sc.nextInt();
		    long fact=1;
		    while(n>0)
		    {
		    	fact=fact*n;
		    	n=n-1;
		    }
		    System.out.println(fact);
		    t--;
		}
	}
}
