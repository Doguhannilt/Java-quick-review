package Basics;
public class List_Arrays {
    public static void main(String[] args) {
        int[] ArrayForIntegerParameters = new int[5];
        String[] ArrayForStringParameters = new String[5];

        // {"Hello -> 0","Hi -> 1","Bye -> 2","Goodbye -> 3","Hello -> 4"}

        ArrayForIntegerParameters[0] = 0;
        ArrayForIntegerParameters[1] = 1;
        ArrayForIntegerParameters[2] = 2;
        ArrayForIntegerParameters[3] = 3;
        ArrayForIntegerParameters[4] = 4;

        ArrayForStringParameters[0] = "Hello";
        ArrayForStringParameters[1] = "Hi";
        ArrayForStringParameters[2] = "Bye";
        ArrayForStringParameters[3] = "Goodbye";
        ArrayForStringParameters[4] = "Hello";
        
        System.out.println(ArrayForStringParameters[2]);

        int[] nums = {1, 2, 3, 4, 5};
        System.out.println(nums[2]);
    }
}