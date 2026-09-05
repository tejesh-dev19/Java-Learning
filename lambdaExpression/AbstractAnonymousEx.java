package lambdaExpression;
abstract class A3{
    abstract public void show();
    abstract public void display();
}
/*
 *  In abstract can have one or two methods can be implement in  anonymous inner class
 * 
 */
public class AbstractAnonymousEx {
    public static void main(String[] args) {
        A3 a = new A3() {
            public void show(){
                System.out.println("in A show");
            }
            public void display(){
                System.out.println("in A display");
            }
        };
        a.show();
        a.display();
    }
}
