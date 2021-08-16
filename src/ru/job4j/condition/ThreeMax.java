package ru.job4j.condition;

public class ThreeMax {
    public static int max(int first, int second, int third) {
        int max = third;
        if (first >= second && first >= third) {
            max = first;
        }
        if (second >= first && second >= third) {
            max = second;
        }
        return max;
    }
}
