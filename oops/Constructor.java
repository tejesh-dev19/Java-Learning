package oops;
class A{
    private int a;
    private int b;
    private int c;

    //parameterless constructor
    public A() {
        System.out.println("this is 0 parameterized or parameterless constructor");
    }

    //parameterize constructor
    public A(int a, int b){
        this(40,50,10); //this method call the constructor with same type of parameter. this method also called constructor chaning.
        this.a=a;
        this.b=b;
        System.out.println("this 2 parameter constructor");
        System.out.println("addition of two numbers: "+ (this.a+this.b));
    }

    public A(int a,int b, int c){
        this();
        this.a=a;
        this.b=b;
        this.c=c;
        System.out.println("addition of three numbers: "+(this.a+this.b+this.c));
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
