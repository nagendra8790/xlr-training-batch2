public class GreatestOfThreeNumbers {
    public static void main(String[] args) {
        // Assign the numbers
        int num1 = 10;
        int num2 = 20;
        int num3 = 15;

        // Determine the greatest number
        int greatest;
        if (num1 >= num2 && num1 >= num3) {
            greatest = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            greatest = num2;
        } else {
            greatest = num3;
        }

        // Output the result
        System.out.println("The greatest number is: " + greatest);
    }
}