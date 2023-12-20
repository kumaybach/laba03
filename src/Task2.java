public class Task2 {
    public static long recursionExecute (int n) {
        if (n <= 1) {
            return n;
        }
        return recursionExecute (n - 1) + recursionExecute (n - 2);
    }

    public static long cycleExecute(int n) {
        if (n <= 1) {
            return n;
        }
        long a = 0, b = 1, result = 0;
        for (int i = 2; i <= n; i++) {
            result = a + b;
            a = b;
            b = result;
        }
        return result;
    }
}