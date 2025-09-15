package lab1;

public class Reduce {
    public static void main(String[] args) {
    int steps = reduce(100);  // start with 100
    System.out.println(steps);  // print number of steps
}

    public static int reduce(int n) {
        int count = 0;
        while (n > 0) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n -= 1;
            }
            count++;
        }
        return count;
        //3
    }
}

