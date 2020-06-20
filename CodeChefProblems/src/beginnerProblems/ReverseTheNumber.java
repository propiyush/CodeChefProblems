package beginnerProblems;
import java.io.*;
import java.util.*;


public class ReverseTheNumber {
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		try {
		int t = sc.nextInt();
		
		while(t>0) {
			int i = sc.nextInt();
			int rev=0; int rem = 0;
			while(i>0) {
				rem = i%10;
				rev = rev*10 + rem;
				i = i/10;	
			}
			System.out.println(rev);
			t--;
		}
		sc.close();
	
	}catch(Exception e) {
		return;
	}
		
	}

}
