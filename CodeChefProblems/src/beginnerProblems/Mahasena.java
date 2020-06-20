package beginnerProblems;
import java.io.*;
import java.util.*;

public class Mahasena {
	
	public static void main (String[] args) throws IOException
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		try {
		int t = sc.nextInt();
		int[] ar = new int[t];
		int even=0;
		int odd=0;
		for(int i=0; i<t; i++) {
			ar[i] = sc.nextInt();
			if(ar[i]%2==0) even++;
			else odd++;
		}
		System.out.println(even>odd?"READY FOR BATTLE":"NOT READY");
		}catch(Exception e) {
			return;
		}
	}

}
