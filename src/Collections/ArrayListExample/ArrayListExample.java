package Collections.ArrayListExample;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {

        // An ordered collection aka sequence
        // Allow duplicates
        // Not 'fixed' in size like Arrays
        // Fast for data retrieval
        // Various Implementations: ArrayList, Stack, Vector

        List things = new ArrayList();
        things.add("Blue");
        things.add("Purple");
        things.add(1);
        things.add(new Object());

        for (int i = 0; i < things.size(); i++) {
            System.out.println(things.get(i));
        }

        for (Object thing : things) {
            System.out.println(thing);
        }

        // List is an interface, so you can't instantiate it
        List<String> colors = new ArrayList<>();
        colors.add("Blue");
        colors.add("Purple");
        colors.add("Green");
        // You can duplicate elements in the list unlike Arrays
        colors.add("Green");
        colors.add("Red");

        System.out.println(colors);

        // Get the size
        System.out.println(colors.size());
        // Check if it contains
        System.out.println(colors.contains("Green"));
    }
}