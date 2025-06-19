import java.util.ArrayList;
import java.util.List;

class Box3 {
    public static <T> void displayArray(List<T> array) {
        for(T element: array) {
            System.out.println(element);
        }
    }
}
public class Generic_arraylist {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        List<String> words = new ArrayList<>();
        words.add("Apple");
        words.add("Banana");
        words.add("Cherry");
        words.add("Pomegranate");
        words.add("Jujube");

        Box3.displayArray(numbers);
        Box3.displayArray(words);
    }
}
