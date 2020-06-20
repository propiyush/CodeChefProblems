package beginnerProblems;
import java.io.*;
import java.util.*;

public class TheLeadGame {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		try{
		int t = sc.nextInt();
		int[] p1 = new int[t];
		int[] p2 = new int[t];
		for(int i=0; i<t; i++) {
			p1[i] = sc.nextInt();
			p2[i] = sc.nextInt();
		}
		
		for(int i=0; i<t-1; i++) {
			p1[i+1] = p1[i] + p1[i+1];
			p2[i+1] = p2[i] + p2[i+1];
		}
		
		int lead=0; int winner=0;
		for(int i=0; i<t; i++) {
			if(p1[i] > p2[i] && (p1[i]-p2[i])>lead) {
				lead = p1[i] - p2[i];
				winner = 1;
			}
			if(p2[i] > p1[i] && (p2[i]-p1[i])>lead) {
				lead = p2[i] - p1[i];
				winner = 2;
			}
		}
		System.out.print(winner+" "+lead);
		}catch(Exception e){
		    return;
		}
	}
}
