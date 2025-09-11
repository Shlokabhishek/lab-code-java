package javatest;

import java.util.Scanner;

public class sumdigit {
	public static void main(String[] args) {
		Scanner ab=new Scanner (System.in);
		System.out.println("enter the no.");
		int c=ab.nextInt();
		int s=0;
		while(c>0) {
			s=s+c%10;
			c=c/10;
		}
		System.out.println("sum of digits are"+s);
	}

}
