package javatest;

import java.util.Scanner;

public class primeeee {
	static boolean chkp(int n) {
		for(int i=2;i*i<=n;i++) {
			if(n%i==0) {
				return false;
				
			}
		}
		return true;
		
	}
	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
		for(int i=2;i<17;i++) {
			System.out.println(i+" "+chkp(i));
		}
		
	}

}
