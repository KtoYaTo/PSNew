package testOther;

import java.util.Set;
import java.util.TreeSet;


class Person implements Comparable<Person> {
    int age;

    public Person(int age) {
        this.age = age;
    }
    //add compareTo  for sort
    @Override
    public int compareTo(Person o) {
        return this.age-o.age;
    }
    // for output println
    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                '}';
    }
}

public class SetSort{
    public static void main(String[] args) {
        Set<Person> set = new TreeSet();
        set.add(new Person(14));
        set.add(new Person(10));
        set.add(new Person(20));
        set.add(new Person(60));

        for (Object o: set){
            //Print to display sort Person{age=?}
            System.out.println(o);
        }
    }

}