package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        int index2 = 0;
        for (int index = word.length  - post.length; index < word.length; index++) {
            if (word[index] != post[index2]) {
                result = false;
                break;
            }
            index2++;
        }
        return result;
    }
}
