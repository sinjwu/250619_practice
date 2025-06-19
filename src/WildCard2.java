import java.util.Arrays;
import java.util.List;

public class WildCard2 {
    public static double sumList(List <? extends Number> list) {
        double sum = 0;
        for(Number n: list) {
            sum += n.doubleValue();
        }
        return sum;
    }
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(10, 20, 30, 40, 50);
        List<Double> doubleList = Arrays.asList(0.1, 0.2, 0.3, 0.4, 0.5);
        System.out.println("합계: " + sumList(intList));
        System.out.println("합계: " + sumList(doubleList));
    }
}