package oops;
class A{
    private int a;
    private int b;

    //parameterless constructor
    public A() {
        System.out.println("this is 0 parameterized or parameterless constructor");
    }

    //parameterize constructor
    public A(int a, int b){
        this.a=a;
        this.b=b;
        System.out.println("this 2 parameter constructor");
        System.out.println("addition of two numbers: "+ (this.a+this.b));
    }
}

public class Constructor {
    public static void main(String[] args) {
        //object 1 created calling 0 parameterized or parameterless constructor.
        A a1 = new A();

        //object 2 created call constructor with 2 paramters
        A a2 = new A(20, 30);

    }
    
}
