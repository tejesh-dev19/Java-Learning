package multiThreading;

class A implements Runnable{
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Hi"); 
            try{Thread.sleep(1000);} catch(Exception e){};
        }
    }
}

class B implements Runnable{
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello"); 
            try{Thread.sleep(1000);} catch(Exception e){};
        }
    }
}

public class LaunchMulex1 {
    public static void main(String[] args) throws Exception {
        // using lambda expression
        Runnable obj1 = () ->{
              for (int i = 0; i < 5; i++) {
                 System.out.println("Hi"); 
                 try{Thread.sleep(1000);} catch(Exception e){};
                 
                
        }  
    };
        
        //Runnable obj1 = new A();
        Runnable obj2 = new B();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        

        t1.setName("hello this is thread 1");
        t2.setName("hello this is thread 2");
        System.out.println(t1.getName());
        System.out.println(t2.getName());
        t1.start();
        try{Thread.sleep(10);} catch(Exception e){};
        t2.start();
         
        t1.join();
        t2.join();
        System.out.println(t1.isAlive());

        System.out.println("bye");


        // System.out.println(Thread.activeCount());
        // System.out.println(Thread.currentThread().getId());
        // System.out.println(Thread.currentThread().getName().getClass());
        // System.out.println(Thread.currentThread().isAlive());
       
    }
    
}