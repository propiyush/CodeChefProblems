package beginnerProblems;
import java.io.*;
import java.util.*;

public class FindingSquareRoots {
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		try {
		int t = sc.nextInt();
		while(t>0) {
			int n = sc.nextInt();
			System.out.println((int)Math.sqrt(n));
			t--;
		}
		}catch(Exception e) {
			return;
		}
	}

}
