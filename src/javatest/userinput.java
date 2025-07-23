package javatest;

import java.util.Scanner;

public class userinput {
	public static void main(String[] args) {
		int a,b,c;
		float r=90.8f;
		char t;
		Scanner abc=new Scanner(System.in);
		a=abc.nextInt();
		b=abc.nextInt();
		t=abc.next().charAt(0);
		c=b/a;
		System.out.println(c/r);		
		System.out.println(t);
	}
	

}
