package stopwatch;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        long[] numbers = new long[100000];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Math.round(Math.random() * 100000);
        }
        StopWatch rolex = new StopWatch();
        Arrays.sort(numbers);
        rolex.stop();
        System.out.println("sort array 100.000 random integer need " + rolex.getElapsedTime() + " milliseconds");
    }
}
