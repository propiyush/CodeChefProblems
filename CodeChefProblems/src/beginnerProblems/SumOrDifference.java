package beginnerProblems;
import java.io.*;
import java.util.*;

public class SumOrDifference {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		try {
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = a>b?a-b:a+b;
		System.out.println(c);
		}catch(Exception e) {
			return;
		}
	}
}
