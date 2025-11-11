package javatest;
import java.util.Scanner;
import static java.lang.IO.*;

public class parse {
public static void main(String[] args) {
	Scanner ab=new Scanner(System.in);
	String s1=ab.next();
	String s2=ab.next();
	String y1="";
	String y2="";
	println("rr");
	int t=s1.length();
	int y=s2.length();
	for(int i =0;i<t;i++) {
		char c=s1.charAt(i);
		if(c == '0' || c == '1' || c == '2' || c == '3' || c == '4' || c == '5' || c == '6' || c == '7' || c == '8' || c == '9') {
			y1=y1+c;
		}
	}
	for(int i =0;i<y;i++) {
		char c=s2.charAt(i);
		if(c == '0' || c == '1' || c == '2' || c == '3' || c == '4' || c == '5' || c == '6' || c == '7' || c == '8' || c == '9') {
			y2=y2+c;
		}
	}
	int u=Integer.parseInt(y1);
	int v=Integer.parseInt(y2);
	System.out.println(u+v);
}
}
