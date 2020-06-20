package beginnerProblems;
import java.io.*;
import java.util.*;

public class Lapindromes {

	public static void main(String[] args) throws IOException
	{
			Scanner sc = new Scanner(System.in);
			try{
			int t = sc.nextInt();
			sc.nextLine();
			while(t>0) {
				int[] ar = new int[256];
				boolean flag = true;
				String str = sc.nextLine();
				String left="";
				String right="";
				if(str.length() % 2 ==0) {
					left = str.substring(0,str.length()/2);
					right = str.substring(str.length()/2,str.length());
				}
				else {
					left = str.substring(0,str.length()/2);
					right = str.substring(str.length()/2+1,str.length());
				}
				for(char c : left.toCharArray()) {
					int index = (int)c;
					ar[index]++;
				}
				for(char c : right.toCharArray()) {
					int index = (int)c;
					ar[index]--;
				}
				for(int i=0; i<256; i++) {
					if(ar[i]!=0) {
						flag=false;
						break;
					}
				}
				if(flag) System.out.println("YES");
				else System.out.println("NO");
				t--;
			}
			sc.close();
			}catch(Exception e){
			    return;
			}
			
	}
}
