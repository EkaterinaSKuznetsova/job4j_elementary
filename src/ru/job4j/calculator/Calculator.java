package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class Calculator {
      public static void plus(int first, int second) {
            int result = first + second;
            System.out.println(result);
      }

      public static double sumAndMultiply(double first, double second) {
            return sum(first, second) + multiply(first, second);
      }

      public static double quotientPlusResidual(double first, double second) {
            return difference(first, second) + division(first, second);
      }

      public static double sumAllOperation(double first, double second) {
            return sum(first, second) + multiply(first, second)
                  + difference(first, second) + division(first, second);
      }

      public static void main(String[] args) {
            System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
            System.out.println("Результат расчета равен: " +  quotientPlusResidual(10, 20));
            System.out.println("Результат расчета равен: " + sumAllOperation(10, 20));
      }

}