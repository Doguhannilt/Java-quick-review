package Basics;
import java.util.Set;
import java.util.HashSet;

public class Sets {
    public static void main(String[] args) {
        // Hash elemets is unique
        Set<Integer> t = new HashSet<Integer>();
        t.add(1);
        t.add(2);
        t.add(3);
        t.add(4);
        t.add(1);
        System.out.println(t);
        System.out.println(t.size());
    }
}