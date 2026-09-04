package oops;

class A2{ //parent class or super class or base class
    public A2(){
        System.out.println("in A2 parent class constructor");
    }

    void display(){
        System.out.println("in A class display method");
    }
    
}

class B extends A2{//child class or derived class or sub class
    public B(){
        super();//super method calls the parent class constructor
    }
}

class C extends B{
   
}


public class Inheritance {
    public static void main(String[] args) {
        B b = new B();
        b.display();

        C c = new C();
        c.display();
    }    
}
