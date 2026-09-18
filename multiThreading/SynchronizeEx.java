package multiThreading;

class Counter{
    int count;

    public synchronized void increment(){
        count++;
    }
}

public class SynchronizeEx {
    public static void main(String[] args) throws Exception {
        
        Counter c = new Counter();

        Thread t1 = new Thread(new Runnable() {
            public void run(){
                for (int i = 0; i < 1000; i++) {
                    c.increment();
                }
                
            }
        });
        
        Thread t2 = new Thread(()->{
                for (int i = 0; i < 1000; i++) {
                    c.increment();
                } });

        Thread t3 = new Thread(()->{
                for (int i = 0; i < 1000; i++) {
                    c.increment();
                } }); 
                
                
        Thread t4 = new Thread(()->{
                for (int i = 0; i < 1000; i++) {
                    c.increment();
                } });  
        
        Thread t5 = new Thread(()->{
                for (int i = 0; i < 1000; i++) {
                    c.increment();
                } }); 

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        t1.join(); 
        t2.join();     
        t3.join(); 
        t4.join();  
        t5.join();       

        System.out.println("count "+ c.count);
    }
}