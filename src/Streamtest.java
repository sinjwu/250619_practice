import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Streamtest {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        Stream<Integer> stream = numbers.stream();
        System.out.println(stream);

        numbers.stream().filter((n) -> n % 2 == 0); //2, 4
    }
}
