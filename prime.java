package javatest;

import java.util.Scanner;

public class prime {
	public static void main(String[] args) {
		int s,e;
		System.out.println("enter the start range");
		Scanner abc=new Scanner(System.in);
		s=abc.nextInt();
		System.out.println("enetr the end range");
		e=abc.nextInt();
		for(int i=s;i<e;i++) {
			int c=0;
			for(int j=2;j*j<i;j++) {
				if(i%j==0) {
					c=c+1;
				}
			}
			if(c==0) {
				System.out.println(i);
			}
		}
	}

}
