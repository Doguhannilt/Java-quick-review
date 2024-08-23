An abstract class in Java is a class that cannot be instantiated on its own and is meant to be subclassed by other classes. Abstract classes serve as a blueprint for other classes, allowing you to define methods that must be implemented by any non-abstract subclasses. They can contain both abstract methods (methods without a body) and concrete methods (methods with a body).

### Key Features of Abstract Classes:

1. **Cannot Be Instantiated:**
   - You cannot create an object of an abstract class directly. For example, if you have an abstract class `Animal`, you cannot do `Animal a = new Animal();`. However, you can create objects of classes that extend the abstract class.

2. **Can Contain Abstract Methods:**
   - An abstract method is a method that is declared without an implementation (no method body). Subclasses of the abstract class are required to provide implementations for these abstract methods. For example:
   
   ```java
   abstract class Animal {
       abstract void makeSound();
   }
   ```

   Any subclass of `Animal` would need to provide its own implementation of the `makeSound()` method.

3. **Can Contain Concrete Methods:**
   - Abstract classes can also contain concrete methods, which are methods with a body. These methods can be used as-is by subclasses or overridden if needed.

   ```java
   abstract class Animal {
       abstract void makeSound();

       void sleep() {
           System.out.println("The animal is sleeping");
       }
   }
   ```

4. **Can Have Fields and Constructors:**
   - Abstract classes can have fields (attributes) and constructors. These can be used to initialize state and provide common behavior to subclasses. However, the constructor of an abstract class can only be called from its subclasses.

   ```java
   abstract class Animal {
       String name;

       Animal(String name) {
           this.name = name;
       }

       abstract void makeSound();
   }
   ```

5. **Supports Inheritance:**
   - Abstract classes are designed to be extended. A subclass can inherit fields and methods from the abstract class and must implement all abstract methods unless the subclass is also abstract.

6. **Can Implement Interfaces:**
   - An abstract class can implement interfaces and provide concrete methods for the interface's abstract methods. If the abstract class does not implement all interface methods, it remains abstract.

### Example of an Abstract Class:

```java
abstract class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    abstract void makeSound();

    void sleep() {
        System.out.println(name + " is sleeping");
    }
}

class Dog extends Animal {
    Dog(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println(name + " says: Woof Woof");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog("Buddy");
        myDog.makeSound(); // Output: Buddy says: Woof Woof
        myDog.sleep();     // Output: Buddy is sleeping
    }
}
```

### When to Use Abstract Classes:

- **Common Base Class:** When you want to create a common base class that other classes can extend, but you do not want to allow direct instantiation of the base class.
- **Shared Code:** When you have shared code that should be inherited by multiple related classes, you can place that code in an abstract class.
- **Partial Implementation:** When you want to provide some default implementation that can be shared among subclasses, while allowing subclasses to override or complete the implementation.

### Summary:
Abstract classes are a fundamental part of Java’s inheritance model, providing a mechanism to define a common interface for related classes while sharing code among them. They help enforce a contract for what methods a subclass must implement and allow code reuse for common functionality.