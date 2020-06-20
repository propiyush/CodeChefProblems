package beginnerProblems;
import java.io.*;
import java.util.*;

public class ChefAndOperators {
	
	public static void main (String[] args) throws IOException
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		try {
		int t = sc.nextInt();
		while(t>0){
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    if(a>b) System.out.println(">");
		    else if (a<b) System.out.println("<");
		    else if (a==b) System.out.println("=");
		    t--;
		}
		}catch(Exception e) {
			return;
		}

}
}