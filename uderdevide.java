package javatest;
import java.util.Scanner;
class trycheck{
	public trycheck(int k){
		int c=0;
		for(int i=0;i<100;i++) {
			if(i%k==0){
				c=c+1;
			}
		}
		
		System.out.println(c);
		
	}
	
}



public class uderdevide {
	public static void main(String[] args) {
		Scanner abc=new Scanner(System.in);
		int y=1;
		while(y!=0) {
			System.out.println("enter the no.");
			int h=abc.nextInt();
			new trycheck(h);
			System.out.println("for more press2 else press 0");
			y=abc.nextInt();
		}
	}

}
