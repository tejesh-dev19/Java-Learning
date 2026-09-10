package collectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student implements Comparable <Student>{
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
    @Override
    public int compareTo(Student that){
        if (this.age> that.age)
            return 1;
        else
            return -1;
    }

    @Override
    public String toString() {
        return "Student [ age: "+ age + " name: "+ name +" ]";
    }


}

public class ComparableComparatorEx {
    public static void main(String[] args) {

        Comparator<Student> com = new Comparator<Student>() {
            public int compare(Student i, Student j) {
                if (i.age>j.age && i.name.length()>j.name.length())
                    return 1;
                else
                    return -1;
            }
        };

        ArrayList <Student> al = new ArrayList<>();
        al.add(new Student(50, "vijay"));
        al.add(new Student(43, "allurjun"));
        al.add(new Student(20, "sangeth shoban"));
        al.add(new Student(26, "surya"));

        Collections.sort(al,com);
        for (Student s:al){
            System.out.println(s);
        }
        //System.out.println(al);


    }
}
