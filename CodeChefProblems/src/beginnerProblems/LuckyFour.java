package beginnerProblems;

import java.io.*;
import java.util.*;

public class LuckyFour {
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		try {
		int t = sc.nextInt();
		
		int[] ar = new int[t];
		for(int i=0; i<t; i++)
		{
			int count = 0;
			ar[i] = sc.nextInt();
			while(ar[i]>0)
			{
				if(ar[i]%10 == 4) count++;
				ar[i] = ar[i]/10;
			}
			System.out.println(count);
		}	
	
	}catch(Exception e) {
		return;
	}
		
	}

}
