package beginnerProblems;
import java.io.*;
import java.util.*;

public class HelpingChef {
	
	public static void main (String[] args) throws IOException
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		try {
		int t = sc.nextInt();
		while(t>0){
		    int a = sc.nextInt();
		    if(a<10) System.out.println("What an obedient servant you are!");
		    else
		    System.out.println(-1);
		    t--;
		}
		}catch(Exception e) {
			return;
		}
	}

}
