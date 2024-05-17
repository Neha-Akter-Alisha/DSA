public class Methods5 {
    // Function to find the sum of digits of a number
    static int findSum(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10; // Find the last digit and add it to the sum
            number /= 10; // Remove the last digit from the number
        }
        return sum;
    }

    public static void main(String[] args) {
        int inputNumber = 674;
        int result = findSum(inputNumber);
        System.out.println("Sum of digits of " + inputNumber + ": " + result);
    }
}
