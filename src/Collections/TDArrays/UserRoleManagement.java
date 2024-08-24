package Collections.TDArrays;

public class UserRoleManagement {

    public static void main(String[] args) {
        // USER & ROLES
        String[][] userRoles = {
            {"Alice", "Admin"},
            {"Bob", "User"},
            {"Charlie", "Admin"},
        };

        for (int i = 0; i < userRoles.length; i++) {
            String user = userRoles[i][0];
            String role = userRoles[i][1];
            System.out.println(user + " is assigned to the role: " + role);
        }
    
    }
}
