package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] postfix) {
        boolean result = true;
        for (int i = 0; i < postfix.length; i++) {
            if (postfix[postfix.length - 1 - i] != word[word.length - i - 1]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
