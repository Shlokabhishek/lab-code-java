package javatest;

import java.util.Scanner;

public class recall {
	public int sumcheck() {
		Scanner ab=new Scanner(System.in);
		int a,b,c;
		System.out.println("enter a value");
		a=ab.nextInt();
		b=ab.nextInt();	
		c=a+b;
		return c;
		
	}
	public static void main(String[] args) {
		recall obj= new recall();
		int c;
		c=obj.sumcheck();
		if(c>30) {
			System.out.println(c);
		}
		else {
		 obj.main(args);
		System.out.println(c);
		}
		//System.out.println(c);
		System.out.println("program end");
		
		}

}
