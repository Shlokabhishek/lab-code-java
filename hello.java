package javatest;

class helo{
	public void add(int a, int b) {
		int d;
		d=a+b;
		System.out.println(d);
	}
}
	
public class hello{
	public static void main(String[] args){
	helo he=new helo();
	he.add(12, 13);
	}
	
}	


