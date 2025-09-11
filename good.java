package javatest;
public class good{
    public static void main (String[] args) {
        ovverload o=new ovverload();
        ovverride ob= new ovverride();
        encap e =new encap();
        e.setNumber(999);
        System.out.println("encap value "+e.getNumber());
        o.num(8);
        o.num(8,9);
        ob.num(8);
        
    }
}
class encap{// alt + shift +s for getter and setter or go to source for getter and setter
	private int number;
    public void setNumber(int a) {
        number = a;
    }
    public int getNumber() {
        return number;
    }

}

class ovverload{
    public void num(int a){
        System.out.println("overloading "+a);
    }
    public void num(int a, int b){
        System.out.println("overloading "+a*b);
    }
}
class ovverride extends ovverload{
    public void num(int a){
        System.out.println("overriding  "+a*10);
    }
}
