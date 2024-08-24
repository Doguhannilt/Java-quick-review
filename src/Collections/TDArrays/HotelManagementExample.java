package Collections.TDArrays;

public class HotelManagementExample {
    String[][] rooms = new String[3][3];
    



    void addCustomer(int floor, int roomNumber, String customerDescription) {
        if (floor >= 0 && floor < rooms.length && roomNumber >= 0 && roomNumber < rooms[floor].length) {
            rooms[floor][roomNumber] = customerDescription;
            System.out.println("Customer added: " + customerDescription);
        } else {
            System.out.println("Invalid floor or room number.");
        }
    }
}
