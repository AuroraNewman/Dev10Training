package learn;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

    public int fibonacci(int n){
        if (n <= 0){
            throw new RuntimeException("Cannot process nonpositive ns");
        } else if (n == 1){
            return 0;
        } else if (n == 2){
            return 1;
        }

        int current = 0;

        List<Integer> values = new ArrayList<>();
        values.add(0);
        values.add(1);

        for (int i = 2; i < n; i++){
            int prev = values.get(values.size() - 1);
            int prevPrev = values.get(values.size() - 2);

            current = prevPrev + prev;
            values.add(current);
        }
        return current;
    }

    public static void main(String[] args) {
        for (int i = 1; i < 10; i++){
            System.out.println(new Fibonacci().fibonacci(i));
        }
    }
}
