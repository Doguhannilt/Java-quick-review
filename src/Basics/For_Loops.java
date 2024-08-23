package Basics;
public class For_Loops {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        String[] Variables = {"Hello", "World"};
        for (String variable : Variables) {
            System.out.println(variable);
        }
    }
}