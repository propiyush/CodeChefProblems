package beginnerProblems;
import java.io.*;
import java.util.*;

public class IdAndShip {
	
	public static void main(String[] args) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		try {
		int t = sc.nextInt();
		while(t>0) {
			char c = sc.next().charAt(0);
			if(c == 'B' || c=='b')System.out.println("BattleShip");
			else if (c == 'C' || c == 'c')System.out.println("Cruiser");
			else if (c == 'D' || c == 'd')System.out.println("Destroyer");
			else if (c == 'F' || c =='f')System.out.println("Frigate");
			t--;
		}
		sc.close();
		}catch(Exception e) {
			return;
		}
	}

}
