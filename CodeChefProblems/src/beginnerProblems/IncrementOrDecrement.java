package beginnerProblems;
import java.io.*;
import java.util.*;

public class IncrementOrDecrement {
	
	public static void main(String[] args) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		try {
		int n = sc.nextInt();
		if(n%4==0) System.out.println(++n);
		else System.out.println(--n);
		sc.close();
		}catch(Exception e) {
			return;
		}
	}

}
