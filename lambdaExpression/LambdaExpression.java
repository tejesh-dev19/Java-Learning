package lambdaExpression;
@FunctionalInterface 
interface A5{
    void show();
    
}
interface A6{
    void displayResult(int b, int c);
}

interface A7{
    int displayReturn(int d, int e);
}
/**
 * 
 *  LambdaExpression will only excute functional interface(one abstract method) and it is used to reduce the size of the code.
 */
public class LambdaExpression {
    public static void main(String[] args) {
        A5 a = () -> System.out.println("in A show");
        a.show();

        //lambda expression with two parameters
        A6 a1 = (b ,c)-> System.out.println(b+c);
        a1.displayResult(20, 30);

        //lambda expression with return
        A7 a2 = (d,  e)-> d+e;
        System.out.println(a2.displayReturn(20, 30));


    }
    
}
