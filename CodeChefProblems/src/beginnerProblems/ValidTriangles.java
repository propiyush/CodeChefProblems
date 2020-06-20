package beginnerProblems;
import java.io.*;
import java.util.*;

public class ValidTriangles {
	
	public static void main (String[] args) throws IOException
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		try {
		int t = sc.nextInt();
		while(t>0){
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int c = sc.nextInt();
		    if(a+b+c == 180) System.out.println("YES");
		    else System.out.println("NO");
		    t--;
		}
		}catch(Exception e) {
			return;
		}
	}

}
