import javax.swing.JOptionPane;

public class CalculateTwoNumbers {
    public static void main(String[] args) {
        String strNum1, strNum2;
        double num1, num2;

        strNum1 = JOptionPane.showInputDialog(null,
                "Please input the first number:",
                "Input first number",
                JOptionPane.INFORMATION_MESSAGE);

        strNum2 = JOptionPane.showInputDialog(null,
                "Please input the second number:",
                "Input second number",
                JOptionPane.INFORMATION_MESSAGE);

        num1 = Double.parseDouble(strNum1);
        num2 = Double.parseDouble(strNum2);

        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;

        String result = "Sum: " + sum +
                        "\nDifference: " + difference +
                        "\nProduct: " + product;

        if (num2 != 0) {
            double quotient = num1 / num2;
            result += "\nQuotient: " + quotient;
        } else {
            result += "\nQuotient: Cannot divide by zero!";
        }

        JOptionPane.showMessageDialog(null, result, "Result", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}