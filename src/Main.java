import java.util.Random;

public class Main {
   static Random random = new Random();
    private static final int n = random.nextInt(8) + 2;
    private static final int sumOfDigitsN = random.nextInt(9998) + 2;
    private static final int a = random.nextInt(9998) + 2;
    private static final int b = random.nextInt(9998) + 2;

    public static void main(String[] args) {
        long factorialRecursionResult = Task1.recursionExecute (n);
        long factorialCycleResult = Task1.cycleExecute(n);
        long fibonacciRecursionResult = Task2.recursionExecute (n);
        long fibonacciCycleResult = Task2.cycleExecute(n);


        assert factorialRecursionResult == factorialCycleResult : "Different values factorial";
        System.out.println("Fibonacci of " + n + ": " + factorialRecursionResult);

        assert fibonacciRecursionResult == fibonacciCycleResult : "Different values fibonacci";
        System.out.println("Fibonacci of " + n + ": " + fibonacciRecursionResult);

        int sumOfDigitsResult = Task3.execute(sumOfDigitsN);
        int sumWithoutOperatorResult = Task4.execute(a, b);

        System.out.println("SumOfDigits(" + sumOfDigitsN + ") = " + sumOfDigitsResult);

        assert sumWithoutOperatorResult == a + b : "Different values sum";
        System.out.println("SumWithoutOperator(" + a + ", "+ b + ") = " + sumWithoutOperatorResult);
    }
}