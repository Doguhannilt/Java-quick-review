package Collections.MapExample;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        /*
        * [MAP] - A collection of key-value pairs (Key cannot be duplicated)
        * [HASHTABLE] - Null Not Allowed, Synchronized
        * [HASHMAP] - Null Allowed, Not Synchronized - Fast
        * [TREEMAP] - Null Keys Not Allowed, Synchronized - Sorted
        */

        // Create a HashMap instance
        Map person = new HashMap<Integer, String>();

        // Add some key-value pairs
        person.put(1, "Alice");
        person.put(2, "Bob");
        person.put(3, "Charlie");

        // Retrieve and print values
        System.out.println("Person with ID 1: " + person.get(1));
        System.out.println("Person with ID 2: " + person.get(2));
        System.out.println("Person with ID 3: " + person.get(3));

        // Iterate over the map entries
        for (Map.Entry<Integer, String> entry : person.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}
