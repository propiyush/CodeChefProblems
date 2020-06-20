package beginnerProblems;

import java.io.*;
import java.util.*;

public class FindRemainder{
    public static void main(String[] args) throws IOException{
        
        Scanner sc = new Scanner(System.in);
        try{
            int t = sc.nextInt();
            while(t>0){
                int a = sc.nextInt();
                int b = sc.nextInt();
                System.out.println(a%b);
                t--;
            }
        }catch(Exception e){
            return;
        }
    }
}