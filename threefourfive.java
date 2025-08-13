package javatest;

import java.util.Scanner;

public class threefourfive {
	public static void main(String[] args) {
		int c=0;
		int i,j;
		Scanner ab=new Scanner(System.in);
		i=ab.nextInt();
		int k=i;
		j=ab.nextInt();
		for(;i<j;i++) {
			if(i%3==0) {
				c=c+1;
			}
		}
		System.out.println("by 3 = "+c);
		i=k;
		c=0;
		for(;i<j;i++) {
			if(i%4==0) {
				c=c+1;
			}
		}
		System.out.println("by 4 = "+c);
		i=k;
		c=0;
		for(;i<j;i++) {
			if(i%5==0) {
				c=c+1;
			}
		}
		System.out.println("by 5 = "+c);
	}

}
