package oops;
abstract class A3{
    public A3(){
        System.out.println("abstract constrcutor ");
    }
    abstract public void display();
    public void display2(){
        System.out.println("In a class display 2 method");
    }
}

class B2 extends A3{
    public void display(){
        System.out.println("in B2 display method");
    }
} 
public class AbstractEx {
    public static void main(String[] args) {
        B2 b = new B2();
        b.display2();
    }
    
}
