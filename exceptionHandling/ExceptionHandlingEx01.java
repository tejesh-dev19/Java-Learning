package exceptionHandling;

import java.util.Scanner;

//custom exception user defined own exception
class InvalidException extends Exception{
    public InvalidException(String msg){
        super(msg);
    }
}

class Sample{
    public void display()throws ArithmeticException{
        int a=10;
        Scanner sc = new Scanner(System.in);
        int b=sc.nextInt();
        int result=a/b;
        System.out.println(result);
    }
}

public class ExceptionHandlingEx01 {
    public static void main(String[] args) {
        System.out.println("connection established");
        // int a=10;
        // int b=0;
        // int result=0;
        // try{
        //     result=a/b;
        // }
        // catch(ArithmeticException e){
            
        // }
        // catch(Exception e){
        //     System.out.println("some problem");
        //     e.printStackTrace();
        //     System.out.println(e.getClass());
        //     System.out.println(e.getMessage());
        // }
        // System.out.println(result);

        Sample s = new Sample();
        try{
        try{
            s.display();
        }
        catch(ArithmeticException e){
            System.out.println("enter non zero");
            s.display();
        }
    }
    catch(Exception e){
        System.out.println("some problem");
        s.display();
    }

        // int a=10;
        // int b=20;
        // int result;
        // try{
        //     result=a/b;
        //     throw new InvalidException("enter correct number");
        // }
        // catch(InvalidException e){
        //     System.out.println(e);
        //     System.out.println(e.getMessage());
        //     System.out.println(e.getClass());
        // }
        System.out.println("connection terminated");
    }
}
