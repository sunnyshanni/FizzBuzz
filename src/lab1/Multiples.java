package lab1;

public class Multiples {
    public static void main(String[] args) {

    }

    public static void multiples() {
        int i = 1;
        int count = 0;
        while (i < 1000) {
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;
            if (divisibleBy3) {

                count++;

            } else if (divisibleBy5) {

                count++;

            }

            i++;

        }
        System.out.println(count);
    }
}