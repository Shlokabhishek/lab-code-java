package javatest;
// method with same anme as class but no return type
class hill {
	public hill(int q) {
		System.out.println("the parameter is "+q);
		
	}
	public int pool(int a) {
		return a*10;
	}
}
public class constructorcheck {
	public static void main(String[] args) {
		new hill(8);
		hill abc=new hill(9);
		int h=abc.pool(10);
		System.out.println(h);
	}

}
