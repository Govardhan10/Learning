package codechef.practice;

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
     * Complete the 'minimumMoves' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY m
     */

    public static int diff(int a, int b) {
        int sum = 0;
        if (a == b) {
            return 0;
        }
        while (a > 0) {
            int digit1 = a % 10;
            int digit2 = b % 10;
            sum += Math.abs(digit1 - digit2);
            a = a / 10;
            b = b / 10;
        }
        return sum;
    }

    public static int minimumMoves(List<Integer> a, List<Integer> m) {
        // Write your code here
        int sol = 0;
        for (int i = 0; i < a.size(); i++) {
            sol += diff(a.get(i), m.get(i));
        }
        return sol;
    }
}
    public class Solution_TEMP {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            int aCount = Integer.parseInt(bufferedReader.readLine().trim());

            List<Integer> a = IntStream.range(0, aCount).mapToObj(i -> {
                try {
                    return bufferedReader.readLine().replaceAll("\\s+$", "");
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            })
                    .map(String::trim)
                    .map(Integer::parseInt)
                    .collect(toList());

            int mCount = Integer.parseInt(bufferedReader.readLine().trim());

            List<Integer> m = IntStream.range(0, mCount).mapToObj(i -> {
                try {
                    return bufferedReader.readLine().replaceAll("\\s+$", "");
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            })
                    .map(String::trim)
                    .map(Integer::parseInt)
                    .collect(toList());

            int result = Result.minimumMoves(a, m);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();

            bufferedReader.close();
            bufferedWriter.close();
        }
    }
