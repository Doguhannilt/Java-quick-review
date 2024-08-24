package Collections.MapExample;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class UserService {
    private Map<Integer, String> userMap = new HashMap<>();
    private AtomicInteger idGenerator = new AtomicInteger(1); // AtomicInteger to generate unique IDs

    // Add a new user and generate a unique ID
    public void addUser(String name) {
        int id = idGenerator.getAndIncrement(); // Get a unique ID and increment the counter
        userMap.put(id, name);
        System.out.println("Added user: ID=" + id + ", Name=" + name);
    }

    // Get a user by ID
    public String getUserById(int id) {
        return userMap.get(id);
    }

    // Remove a user by ID
    public void removeUserById(int id) {
        if (userMap.remove(id) != null) {
            System.out.println("Removed user with ID=" + id);
        } else {
            System.out.println("No user found with ID=" + id);
        }
    }

    // List all users
    public void listUsers() {
        if (userMap.isEmpty()) {
            System.out.println("No users available.");
        } else {
            System.out.println("Listing all users:");
            for (Map.Entry<Integer, String> entry : userMap.entrySet()) {
                System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
            }
        }
    }

    public static void main(String[] args) {
        UserService service = new UserService();

        // Add some users
        service.addUser("Alice");
        service.addUser("Bob");

        // List all users
        service.listUsers();

        // Get a user by ID
        System.out.println("User with ID 1: " + service.getUserById(1));

        // Remove a user by ID
        service.removeUserById(1);

        // List all users again
        service.listUsers();
    }
}
