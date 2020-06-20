package beginnerProblems;

import java.io.IOException;
import java.util.Scanner;

public class PuppyandSum {
	
	public static int Sum(int d, int n) {
		int sum=0;
		for(int i=1; i<=n; i++) {
			sum = sum + i;
		}
		return sum;
	}
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		try {
		int t = sc.nextInt();
		
		while(t>0) {
			int x=0;
			int d = sc.nextInt();
			int n = sc.nextInt();
			while(d>0) {
				x = Sum(d,n);
				n = x;
				d--;
			}
			System.out.println(x);
			t--;
		}
		}catch(Exception e) {
			return;
		}
	}
}
