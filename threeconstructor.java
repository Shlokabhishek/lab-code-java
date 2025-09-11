package javatest;
class Student {
	String name="sharda";
	int age=20;	
    public Student() {
        System.out.println("Default constructor called       "+name+" "+age);
    }

   public Student(String name, int age) {
	   this.name=name;
	   this.age=age;
        System.out.println("Parameter constructor called     "+name+" "+age);
    }

    public Student(Student other) {
    	this.name=other.name;
 	   this.age=other.age;
        System.out.println("Copy constructor called          "+name+" "+age);
    }
} 
public class threeconstructor {
    public static void main(String[] args) {
        new Student();
        Student s=new Student("ashira ", 222);
        Student s1=new Student(s);        
    }

}



