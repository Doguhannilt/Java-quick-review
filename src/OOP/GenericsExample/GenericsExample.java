package OOP.GenericsExample;

import java.util.ArrayList;

public class GenericsExample {
    public static void main(String[] args) {
        ArrayList<Boolean> a = new ArrayList<>();

        a.add(true);
        a.add(false);
        // Can't add anything other than boolean
        // a.add(10); ERROR

        // Now you can use Boolean in the for loop but if you don't assign a generic,
        // then you should use Object

        // Advantages:
        // 1. Type Safety: Using generics ensures type safety in collections and other classes. This helps prevent type errors at runtime.
        // 2. Type Safety: Generics allow the compiler to catch type errors, making the code more reliable and understandable.
        // 3. Code Reusability: Generics prevent the need to write duplicate code for different types, making the code cleaner and easier to maintain.
        // 4. Improved Performance: Using generics can enhance performance by
        // eliminating the need for type casting.

        // Disadvantages:
        // 1. Complexity: The use of generics can increase code complexity and make it
        // harder to understand in some cases.
        // 2. Backward Compatibility: New generics usage might require updating existing
        // code to maintain compatibility with older codebases.
        // 3. Runtime Type Erasure: In Java, type information is erased at runtime (type
        // erasure). This can make it challenging to retrieve type information and may
        // lead to certain limitations.
        // 4. Performance Issues: In some cases, type casting and operations related to
        // generic types might lead to performance concerns, although these are
        // generally minor.

        for (Boolean b : a) {
            System.out.println(b);
        }
    }
}
