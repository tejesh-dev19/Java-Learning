package oops;

class A2{ //parent class or super class or base class
    void display(){
        System.out.println("in A class display method");
    }
}

class B extends A2{//child class or derived class or sub class

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
