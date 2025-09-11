package javatest;

public class arraycontr {
	public arraycontr(int a[]) {
		for(int i=0;i<5;i++) {
			a[i]=i*5;
		}
		for(int i=0;i<5;i++) {
			System.out.println(a[i]);
		}
	}
		public static int[] arraycon(int a[]){
			for(int i=0;i<5;i++) {
				a[i]=i*5;
			}
			return a;
	}
	public static void main(String[] args) {
		int x[]=new int[5];
		new arraycontr(x);
		int s[]=arraycontr.arraycon(x);
		for(int i=0;i<5;i++) {
			System.out.print(s[i]+" ");
		}
	}

}
