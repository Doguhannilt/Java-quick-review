package Collections.TDArrays;

import java.util.Arrays;

public class TDArraysExample {
    public static void main(String[] args) {
        // 2 dimensions Arrays    
        // 0,0  0,1 0,2
        // 1,0  1,1 1,2
        // 2,0  2,1 2,2
    

        char[][] board = new char[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }


        board[0][0] = '0';
        board[1][0] = '0';
        board[2][0] = '0';
        System.out.println(Arrays.deepToString(board));

        HotelManagementExample hotelManagementExample = new HotelManagementExample();
        hotelManagementExample.addCustomer(1, 0, "Customer 1");
        hotelManagementExample.addCustomer(1, 0, "Customer 1");

    }
}
