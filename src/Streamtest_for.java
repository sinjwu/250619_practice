import java.util.Arrays;
import java.util.List;

public class Streamtest_for {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        for(int n : numbers) {
            if(n % 2 ==0) {
                System.out.println(n);
            }
        }
    }
}