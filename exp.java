package javatest;
import java.util.Scanner;
public class exp{
	static Scanner sc = new Scanner(System.in);
    static int a=10;
    static int b= sc.nextInt();
    public static void main(String[] args) {     
    	exp.maths();
    	exp.match();
    }

  
    public static void maths(){
        try {
            int c = a/b;

        } catch (java.util.InputMismatchException e) {
            System.out.println("Input Error: Please enter valid integers.");
            
        }
    }


    public static void match(){
        try {
            int c = a+b;

        } catch (java.util.InputMismatchException e) {
            System.out.println("Input Error: Please enter valid integers.");
            
        }
    }
}

