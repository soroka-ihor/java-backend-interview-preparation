package interview;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {

    // Find what symbol is at k index
    // Find how many times this symbol occures in the given string (x)
    // Find index of X-th occurrence of A/B

    public static void main(String[] args) {
        String n = "12 3333333333333333333333333333333333333333333333333333333";
        validateFirstLine(n);
    }

    public static void process() {
        List<String> input = readInput("d:/input.txt");
        for (int i = 2; i < input.size(); i++) {
            int l = Integer.parseInt(String.valueOf(input.get(i).charAt(0))) - 1;
            int r = Integer.parseInt(String.valueOf(input.get(i).charAt(2)));
            int k = Integer.parseInt(String.valueOf(input.get(i).charAt(4)));
            String substring = input.get(1).substring(l, r);
            processQuery(substring, k-1 /*!!!*/ );
        }
    }

    public static void processQuery(String substring, int k) {
        processQuery(substring, k, substring.charAt(k));
    }

    public static void processQuery(String line, int k, char ch) {
        int x = findAmountOfOccurrences(line, ch, 0, k);
        int indexOfXthOccurrence = findIndexOfOccurrence(
                ch == 'A' ? 'B' : 'A', x, line
        );
        // write to file
        System.out.println(indexOfXthOccurrence > 0 ? indexOfXthOccurrence + 1 : indexOfXthOccurrence);
    }

    public static void validateInput(List<String> input) {
        if (input.size() < 3) {
            throw new RuntimeException("Input must have at least 3 strings.");
        }
        validateFirstLine(input.get(0));
        validateSecondLine(input);
        validateQueries(input);
    }

    public static void validateFirstLine(String firstLine) {
        RuntimeException mismatchException = new RuntimeException("First line mismatches the pattern.");
        if (!Pattern.compile("\\b\\d+\\s\\d+\\b").matcher(firstLine).matches()) {
            throw mismatchException;
        }
        try {
            int n = Integer.parseInt(firstLine.substring(0, firstLine.indexOf(" ")));
            int q = Integer.parseInt(firstLine.substring(firstLine.indexOf(" ") + 1));
            if (n > Math.pow(10, 5) || n < 1 || q > Math.pow(10, 5) || q < 1) {
                throw new RuntimeException("The number n must lays in the range from 1 to 10^5");
            };
        } catch (NumberFormatException e) {
            throw mismatchException;
        }
    }

    public static void validateSecondLine(List<String> input) {

    }

    public static void validateQueries(List<String> input) {

    }

    public static List<String> readInput(String path) {
        List<String> input = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(path)))) {
            while (reader.ready()) {
                input.add(reader.readLine().trim());
            }
        } catch (IOException e) {
            // log(e)
        }
        return input;
    }

    public static int findAmountOfOccurrences(String line, char ch, int from, int to) {
        int x = 0;
        for (int i = from; i <= to; i++) {
            if (line.charAt(i) == ch) {
                x++;
            }
        }
        return x;
    }

    public static int findIndexOfOccurrence(char ch, int numberOfOccurrence, String line) {
        int x = 0;
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == ch) {
                x++;
                if (x == numberOfOccurrence) {
                    return i;
                }
            }
        }
        return -1;
    }
}

