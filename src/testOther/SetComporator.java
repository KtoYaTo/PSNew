package testOther;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class SetComporator {
    public static void main(String[] args) {
        // Comparator use in new TreeSet(here!)
        ComparatorPersonal comparatorPersonal = new ComparatorPersonal();
        Set<Personal> set = new TreeSet(comparatorPersonal);
        set.add(new Personal(88));
        set.add(new Personal(12));
        set.add(new Personal(41));
        set.add(new Personal(21));
        for (Object o: set) {
            System.out.println(o);
        }
    }
}
//if do not can change class Personal and not can implaments Comporable
class Personal{
    int age;

    Personal(int age){
        this.age = age;
    }

    @Override
    public String toString() {
        return "Personal{" +
                "age=" + age +
                '}';
    }
}


//if we not can implaments Comparable<Personal> in class Personal, then use Comparator<Personal>  in new class
class ComparatorPersonal implements Comparator<Personal>{

    @Override
    public int compare(Personal o1, Personal o2) {
        return o1.age-o2.age;
    }
}