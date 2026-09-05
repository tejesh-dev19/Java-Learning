package oops;

class Student {
    private int id;
    private String name;
    private String branch;

    //setters
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    //getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getBranch() {
        return branch;
    }

}


public class EncapsulationEx {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setId(12);
        s1.setName("James");
        s1.setBranch("cse");
        System.out.println(s1.getId());
        System.out.println(s1.getName());
        System.out.println(s1.getBranch());

    }
}

