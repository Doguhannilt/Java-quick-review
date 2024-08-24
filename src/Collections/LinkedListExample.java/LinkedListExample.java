import java.util.LinkedList;

public class LinkedListExample {

    // It's expensive because you have next and previous pointers in the list
    // Head and tail pointers
    // Null [Next,Prev] >> Head >> [Next,Prev] 1 >> [Next,Prev] 2 >> [Next,Prev] 3 >> [Next,Prev] 4 >> [Next,Prev]  Tail
    // It's faster because you can get the size of the list

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("Blue");
        list.add("Purple");
        list.add("Green");
        list.add("Red");


        System.out.println(list);


        String firstElement = list.getFirst();
        System.out.println(firstElement);


        String lastElement = list.getLast();
        System.out.println(lastElement);

        list.removeFirst();
        System.out.println(list);

        list.removeLast();
        System.out.println(list);
    }
}