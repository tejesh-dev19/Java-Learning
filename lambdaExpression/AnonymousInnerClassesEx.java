package lambdaExpression;

class A1{
    public void display(){
        System.out.println("in A1 class");
    }
}

public class AnonymousInnerClassesEx {
    public static void main(String[] args) {
        A1 a = new A1(){
            public void display(){
                System.out.println("new Anonymous inner class");
            }
        };
        a.display();
    }
    
}