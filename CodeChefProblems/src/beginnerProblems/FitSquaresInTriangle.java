package beginnerProblems;
import java.io.*;
import java.util.*;

public class FitSquaresInTriangle {

	public static void main(String[] args) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		try {
		int t = sc.nextInt();
		while(t>0) {
			int b = sc.nextInt();
			int count =0;
			while(b-2>=2) {
				count = count+(b-2)/2;
				b-=2;
			}
			System.out.println(count);
			t--;
		}
		sc.close();
		}catch(Exception e) {
			return;
		}
	}
}
