package javatest;

import java.util.Scanner;

public class abs {
	public static void main(String[] args) {
		Scanner abc=new Scanner(System.in);
		String a=abc.next();
		int s=a.length();
		System.out.println();
		char[] h=new char[10];
		h[0]=a.charAt(s-1);
		for(int i=1;i<s-1;i++) {
			h[i]=a.charAt(i);
		}
		h[s-1]=a.charAt(0);
		for(int i=0;i<s;i++) {
			System.out.print(h[i]);
		}
	}

}
