package javatest;
abstract class abs1{
	abstract void show1();
}
abstract class abs2 extends abs1{
	abstract void show2();
}
class displayabstract extends abs2{
	void show1() {
		System.out.println("from abs1");
	}
	void show2() {
		System.out.println("from abs2");
	}
}

public class absmain {
	public static void main(String[] args) {
		displayabstract d=new displayabstract();
		d.show1();
		d.show2();
	}
}
