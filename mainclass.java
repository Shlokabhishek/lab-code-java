package javatest;

import java.util.Scanner;

public class mainclass {
	public static void main(String arg[]) {
		int a,b;
		Scanner ab=new Scanner(System.in);
		abc obj=new abc();
		a=ab.nextInt();
		b=ab.nextInt();
		obj.add(a, b);

	}
}
