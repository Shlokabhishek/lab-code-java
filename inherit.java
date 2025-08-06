package javatest;
class Animal {
 void show() {
     System.out.println("This animal eats food.");
 }
}
class Dog extends Animal {
 void show() {
     System.out.println("The dog barks.");
 }
}
public class inherit {
 public static void main(String[] args) {
     Dog d = new Dog();
     d.show(); 
 }
}
