package javatest;

import java.util.Scanner;

public class trycheck2 {
	public static void main(String[] args) {
		for(int i=70;i>65;i--) {
			for(int j=65;j<i;j++) {
				System.out.print(" ");
			}
			int t=65;
			for(int j=70;j>=i;j--) {
				System.out.print((char)t);
				t++;
			}
			System.out.println();
		}
	}
	
}
