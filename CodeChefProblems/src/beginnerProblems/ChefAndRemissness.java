package beginnerProblems;
import java.io.*;
import java.util.*;

public class ChefAndRemissness {
	
	public static void main (String[] args) throws IOException
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		try{
		int t = sc.nextInt();
		while(t>0){
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int min = a>b?a:b;
		    int max = a+b;
		    System.out.println(min+" "+max);
		    t--;
		}
		}catch(Exception e){
		    return;
		}
	}

}
