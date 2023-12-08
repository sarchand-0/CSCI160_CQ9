import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {

        Collections.sort(arr);

        long min = 0;
        long max = 0;

        // Calculate the minisum by not including the largest number
        for (int i = 0; i < arr.size() - 1; i++) {
            min += arr.get(i);
        }

        // Calculate the maximum sum by not including the smallest number
        for (int i = 1; i < arr.size(); i++) {
            max += arr.get(i);
        }

        // Print the results
        System.out.println(min + " " + max);

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}
