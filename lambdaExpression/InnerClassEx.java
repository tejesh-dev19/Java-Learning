package lambdaExpression;
class A{
    private static  int a;
    /**
     * InnerInnerClassesEx
     */
    // public void display(){
    //     class B {
    //     void display2(){
    //         a=20;
    //         System.out.println("inner class a "+a);
    //     }
    // }
    // B b = new B();
    // b.display2();
   
    static class B {
        void display2(){
            a=20;
            System.out.println("inner class a "+a);
        }
    }
    
}

public class InnerClassEx {
    public static void main(String[] args) {
        A a = new A();
      //  A.B b =a.new B();
        //b.display();
       // a.display();

       //for static inner class
       A.B b = new A.B();
       b.display2();
    }
    
}
