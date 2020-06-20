package beginnerProblems;

import java.io.*;
import java.util.Scanner;
import java.math.BigInteger;

public class SmallFactorials{
    public static void main(String[] args) throws IOException{
	        Scanner sc = new Scanner(System.in);
	        try{
	            byte t = sc.nextByte();
	            while(t>0){
	                int n = sc.nextByte();
	                BigInteger f = new BigInteger("1");
	                while(n>0){
	                    f = f.multiply(BigInteger.valueOf(n));
	                    n--;
	                }
	                t--;
	                System.out.println(f);
	            }
	        }catch(Exception e){
	            return;
	        }
	    }
}