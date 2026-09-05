package oops;
class Animal{
    public void run(){
        System.out.println("Animal do running");
    }
    public void eat(){
        System.out.println("Animal eat food");
    }
    public void jump(){
        System.out.println("animal do jumping");
    }
}

class Tiger extends Animal{
    public void run(){
        System.out.println("Tiger do running");
    }
    public void eat(){
        System.out.println("Tiger eat food");
    }
    public void jump(){
        System.out.println("Tiger  do jumping");
    }
}


class Monkey extends Animal{
    public void run(){
        System.out.println("monkey do running");
    }
    public void eat(){
        System.out.println("Monkey eat food");
    }
    public void jump(){
        System.out.println("monkey jump on the trees");
    }
}

class Forest{
    public void permit(Animal animal){
        animal.eat();
        animal.run();
        animal.jump();
    } 
}

public class PolymorphismEx {
    public static void main(String[] args) {

        Tiger t= new Tiger();

        Monkey m = new Monkey();

        // Animal animal;
        // animal=t;
        // animal.eat();
        // animal.run();
        // System.out.println("************");

        // animal=m;
        // animal.eat();
        // animal.run();
        // ((Monkey) animal).jump();


        Forest f = new Forest();
        f.permit(t);
        f.permit(m);
        
    }
    
}
