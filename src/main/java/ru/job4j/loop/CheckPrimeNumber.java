package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = true;
        for (int i = 2; i <= number - 1; i++) {
          if ((number % i) == 0) {
              System.out.println("чилло " + number + " не простое");
              prime = false;
              break;
          } else {
              System.out.println("чилло " + number + " простое");
              break;
          }
        }
        return prime;
    }

    public static void main(String[] arg) {
        check(25);
        check(6);
        check(7);
    }
}
