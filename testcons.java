package javatest;

import java.util.Scanner;

class tstcon{
	public tstcon() {
		System.out.println("hello from constructor");
	}
	public void evenodd(int a) {
		if(a%2==0) {
			System.out.println("even");
		}
		else {
			System.out.println("odd");
		}
	}
}

public class testcons {
	public static void main(String[] args) {
		tstcon ab=new tstcon();
		Scanner abc=new Scanner(System.in);
		System.out.println("enetr the no.");
		int i=abc.nextInt();
		ab.evenodd(i);
	}

}
