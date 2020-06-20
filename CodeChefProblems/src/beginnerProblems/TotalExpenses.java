package beginnerProblems;

import java.io.IOException;
import java.util.Scanner;

public class TotalExpenses {	//Change class name to Main while submitting it in CodeChef

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		try {
		int t = sc.nextInt();
		while(t>0) {
			int quantity = sc.nextInt();
			double price = sc.nextFloat();
			double totalPrice;
			if(quantity>1000) {
				totalPrice = quantity*price - 0.1*quantity*price;
			}
			else {
				totalPrice = quantity*price;
			}
			System.out.println(totalPrice);
			t--;
		}
		}catch(Exception e) {
			return;
		}
	}

}
