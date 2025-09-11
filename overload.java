package javatest;
class over{
	public int add(int a, int b) {
		return a+b;
	}
	public int add(int a, int b,int c) {
		return a+b+c;
	}
	public void add(int a) {
		System.out.println(a);
	}
}

public class overload {
	public static void main(String[] args) {
		over o =new over();
		System.out.println(o.add(7,8));
		System.out.println(o.add(8, 7, 5));
		o.add(9);
	}

}
 