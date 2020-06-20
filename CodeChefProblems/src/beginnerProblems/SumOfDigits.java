package beginnerProblems;

import java.io.*;
import java.util.*;

public class SumOfDigits{
    public static void main(String[] args) throws IOException{
        
        Scanner sc = new Scanner(System.in);
        try{
        int t = sc.nextInt();
        while(t>0){
            int sum = 0;
            int n = sc.nextInt();
            while(n>0){
                sum=sum+(n%10);
                n=n/10;
            }
            t--;
            System.out.println(sum);
        }
        }catch(Exception e){
            return;
        }
    }
}