public class GreatestOfTwoNumbers {
    public static void main(String[] args) {
        // Assign the first number
        int num1 = 10;

        // Assign the second number
        int num2 = 20;

        // Determine the greatest number
        int greatest;
        if (num1 > num2) {
            greatest = num1;
        } else {
            greatest = num2;
        }

        // Output the result
        System.out.println("The greatest number is: " + greatest);
    }
}
