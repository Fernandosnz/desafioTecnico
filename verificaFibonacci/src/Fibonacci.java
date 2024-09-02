public class Fibonacci {
    public boolean isFibonacci(int num) {
        int a = 0, b = 1, c = 0;

        if (num == 0 || num == 1) {
            return true;
        }

        while (c < num) {
            c = a + b;
            a = b;
            b = c;
        }

        return c == num;
    }
}
