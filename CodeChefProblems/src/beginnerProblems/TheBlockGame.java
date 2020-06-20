package beginnerProblems;
import java.io.*;
import java.util.*;


public class TheBlockGame {

	public static void main (String[] args) throws IOException
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		try {
		int t = sc.nextInt();
		while(t>0) {
			int n = sc.nextInt();
			int temp=n;
			int rev = 0;
			while(n>0) {
				rev = rev*10 + n%10;
				n = n/10;
			}
			System.out.println(rev==temp?"wins":"losses");
			t--;
		}
		}catch(Exception e) {
			return;
		}
	}
}
