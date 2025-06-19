class Box2 {
    public static <T> void displayArray(T[] array) {
        for(T element: array) {
            System.out.println(element);
        }
    }
}

public class Generic2 {
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String[] words = {"Apple", "Banana", "Cherry", "Ginseng", "Mango"};
        Box2.displayArray(numbers);
        Box2.displayArray(words);
    }
}
