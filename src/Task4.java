public class Task4 {
    public static int execute(int a, int b) {
        if (b == 0) {
            return a;
        }
        int carry = a & b;
        a = a ^ b;
        b = carry << 1;
        return execute(a, b);
    }
}
