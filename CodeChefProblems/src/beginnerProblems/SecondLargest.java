package beginnerProblems;
import java.io.*;
import java.util.*;

public class SecondLargest {
	
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0){
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int c = sc.nextInt();
		    if((a>b && a<c) || (a<b && a>c)) System.out.println(a);
		    else if((b>a && b<c) || (b<a && b>c)) System.out.println(b);
		    else if((c>a && c<b) || (c<a && c>b)) System.out.println(c);
		    t--;
		}
	}

}
