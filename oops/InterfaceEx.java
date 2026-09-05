package oops;
interface A4{
   int a=30;
   void method();
   default void display(){
        System.out.println("In a interface display method");
   }
   static void display1(){
        System.out.println("in A4 interface static method");
   }
   
}
interface B3 extends A4{
    void method1();
}
class C1{
    public C1(){
        System.out.println("in c1 class constructor");
    }
    public void print(){
        System.out.println("in C1 class print method");
    }
    
}
class A5 extends C1 implements A4,B3{
    public void method(){
        System.out.println("in A5 class method");
    }
    public void  method1(){
        System.out.println("in A5 class method1");
    }
}


public class InterfaceEx {
    public static void main(String[] args) {
        A5 a = new A5();
        System.out.println(A5.a);
        a.method();
        a.method1();
        a.display();
        A4.display1();
        a.print();
     
    }
    
}
