package oops;

final class A11{// final keyword can be applied to the class but we can not inherit the final class
    final int a=20;//final keyword can be applied to variable but we can not    rechange or modify it is constant final variable 
    final public void display(){// final keyword can be applied to the method it participate the inheritance but we can not modify or override the final method.
        System.out.println("final class method");
    }

}

class A2{ //parent class or super class or base class
    int a=10;// we can not access private variable in inheritance
    public A2(){//constructor do not paticipate in inheritance but it will execute bcz of super() call 
        System.out.println("in A2 parent class constructor");
    }

    public void display(){
        System.out.println("in A class display method");
    }
    
}

class B extends A2{//child class or derived class or sub class
    int a=20;
    public B(){
        super();//super method calls the parent class constructor
    }
    public void printParentVariable(){
        System.out.println(a);//it print the class B variable a value 
        System.out.println(super.a);// super keyword it prints the parent class variable value only parent class it print so it print class A a value
    }

    public void display(){
        System.out.println("parent A method is overriden in child B class");
    }
}

class C extends B{
    // class C has by default has super() if you mention or not mention, it  calls the parent class B, it has super() it call parent class A constructor excute the instruction 
    int a=30;
    public void printVariable(){
        System.out.println(a);//it print the class C variable a value 
        System.out.println(super.a);// super keyword it prints the parent class variable value only parent class it print so it print class B a value  
    }
}


public class Inheritance {
    public static void main(String[] args) {
        B b = new B();
        b.display();
        b.printParentVariable();

        C c = new C();
        c.display();
        c.printVariable();
    }    
}
