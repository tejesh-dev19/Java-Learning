package oops;
class A1{
    static int a,b;
    static{
        a=10;
        b=20;
        System.out.println("static block outside main class");
    }

    static void display(){
        System.out.println("in static method");
    }


    {
        System.out.println("in java block ");
    }

    public A1(){
        System.out.println("in A1 constructor");
    }
}
public class StaticKeywordEx {

    static int a,b;
    static{
       System.out.println("static block before main");
    }
    /*
     * If anything wants to excute before main give the statements to static block because it will execute in classloading itself
     */

    public static void main(String[] args) {
        A1 a= new A1();
        //static method can be call with classname and aslo with object reference 
        //a.display();  
        A1.display();

    }
    
}
