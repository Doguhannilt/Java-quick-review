package Collections.SetsExample;

import java.util.HashSet;
import java.util.Set;

public class SetsExample {
        public static void main(String[] args) {

            // A set is an unordered collection of unique elements

            Set<String> colors = new HashSet<>();

            colors.add("Red");
            colors.add("Green");
            for (String color : colors) {
                System.out.println(color);
            }

            // There is no get() because it's an unordered collection
            // You can't access elements by index
            // sysout(colors.get(0)); ERROR
        }
}
