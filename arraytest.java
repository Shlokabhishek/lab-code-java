package javatest;

import java.util.Scanner;

public class arraytest

{
	public static void main(String[] args) {
		int s,e;
		System.out.println("enter the start range");
		Scanner abc=new Scanner(System.in);
		s=abc.nextInt();
		System.out.println("enetr the end range");
		e=abc.nextInt();
		int [] a=new int[e-s];
		String [] y=new String[e-s];
		int d=0;
		for(int i=s;i<e;i++) {
			int c=0;
			int g=0;
			for(int j=2;j*j<=i;j++) {
				if(i%j==0) {
					c=c+1;
				}
			}
			if(c==0) {
				a[d]=i;
				y[d]="prime";
				d++;
				g++;
			}
			if(c!=0) {
				a[d]=i;
				y[d]="composite";
				d++;
			}
		}
		for(int i=0;i<d;i++) {
			System.out.println(a[i]+" "+y[i]);
		}
	}

}