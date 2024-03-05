package interview.codingproblems;

import java.util.HashMap;
import java.util.Map;

public class BracketBalanceCheck {
    private static final String BRACKETS = "(){}[]";

    public static void main(String[] args) {
        BracketBalanceCheck bracketBalanceCheck = new BracketBalanceCheck();
        System.out.println(bracketBalanceCheck.check("{}(("));
    }
    // Problem Description: Given a string containing just the characters ‘(‘, ‘)’, ‘{‘, ‘}’, ‘[‘ and ‘]’, determine if
    // the input string is valid. An input string is valid if open brackets are closed by the same type of brackets and
    // in the correct order.
    public boolean check(String s) {
        Map<String, String> brackets = new HashMap<>();
        for (int i = 0; i < BRACKETS.length() - 1; i += 2) {
            brackets.put(
                    Character.toString(BRACKETS.charAt(i)),
                    Character.toString(BRACKETS.charAt(i + 1))
            );
        }
        String[] splittedLine = s.split("");
        for (int i = 0; i < splittedLine.length - 1; i += 2) {
            if (brackets.containsKey(splittedLine[i])) {
                if (!splittedLine[i + 1].equals(brackets.get(splittedLine[i]))) {
                    return false;
                }
            }
        }
        return true;
    }
}
