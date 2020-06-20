package beginnerProblems;
import java.io.*;
import java.util.*;

public class PrimalityTest {

	public static void main (String[] args) throws IOException
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		try {
		int t = sc.nextInt();
		while(t>0) {
			int n = sc.nextInt();
			int flag=1;
			for(int i=2;i<(int)Math.sqrt(n); i++) {
				if(n%i==0) {
					flag=0;
					break;
				}
			}
			if(flag==1)System.out.println("yes");
			else System.out.println("no");
			t--;
		}
		}catch(Exception e) {
			return;
		}
	}
}
