import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Box4 {
    public static <T> void displayArray(List<T> array) {
        for(T element: array) {
            System.out.println(element);
        }
    }
}
public class Generic_arraylist2 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        List<String> words = new ArrayList<>(Arrays.asList("Apple", "Banana", "Cherry", "Pomegranate", "Jujube"));
        Box4.displayArray(numbers);
        Box4.displayArray(words);
    }
}
