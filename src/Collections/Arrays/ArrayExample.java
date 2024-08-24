package Collections.Arrays;

import java.util.Arrays;

public class ArrayExample { // Renamed the class to avoid conflict
    public static void main(String[] args) {
        // Fixed in size
        // Fast for data retrievals
        // Compact memory usage if size is known
        // ! Delete operation is very hard
        // 2D Arrays

        // Data Type[] = new Data Type[size]
        String[] colors = new String[4];
        colors[0] = "purple"; // Arrays start from 0 index
        colors[1] = "blue";
        colors[2] = "green";
        colors[3] = "red";
        
        System.out.println(Arrays.toString(colors)); // Use java.util.Arrays.toString
        System.out.println(colors[0]); // Use [] notation

        // Reassign
        colors[0] = "black";
        System.out.println(Arrays.toString(colors));

        // Arrays are fixed in size and can't be resized
        int[] numbers = { 1, 2, 3, 4, 5 };
        System.out.println(Arrays.toString(numbers));

        // How do you loop through an array? - 1
        for (int i = 0; i < colors.length; i++) {
            System.out.println(colors[i]);
        }

        // How do you loop through an array? - 2 - Get every element in the array and print it.
        for (String color : colors) {
            System.out.println(color);
        }

        // How do you access the length of an array?
        System.out.println(colors.length);

        // How do you sort an array?
        Arrays.sort(colors);
        System.out.println(Arrays.toString(colors));

    }
}
