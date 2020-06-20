package beginnerProblems;
import java.io.*;
import java.util.*;

public class PackagingCupcakes {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		try {
		int t = sc.nextInt();
		while(t>0){
		    int n = sc.nextInt();
		    int temp = n/2;
		    temp = temp+1;
		    System.out.println(temp);
		    t--;
		}
		}catch(Exception e) {
			return;
		}
	}
}
