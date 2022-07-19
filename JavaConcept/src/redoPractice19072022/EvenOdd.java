package redoPractice19072022;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number");
		int n = scan.nextInt();
		if(n%2==0) {
			System.out.println(n +": "+ "even no");
		}
		else {
		System.out.println(n +": "+ "odd no");
		}
	}

}
