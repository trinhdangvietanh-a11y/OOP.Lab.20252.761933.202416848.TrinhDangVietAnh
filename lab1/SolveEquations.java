import javax.swing.JOptionPane;

public class SolveEquations {
    public static void main(String[] args) {

        String choice = JOptionPane.showInputDialog(
                "------SOLVE EQUATIONS -----\n"
              + "1. Linear equation (ax + b = 0) \n"
              + "2. System of 2 linear equations \n"
              + "3. Quadratic equation (ax^2 + bx + c = 0) \n"
              + "Choose an option:"
        );

        if (choice == null) return;

        switch (choice) {

            case "1": {
                double a = Double.parseDouble(JOptionPane.showInputDialog("Enter a:"));
                double b = Double.parseDouble(JOptionPane.showInputDialog("Enter b:"));
                JOptionPane.showMessageDialog(null,
                        "Equation: " + a + "x + " + b + " = 0");

                String result;

                if (a == 0) {
                    if (b == 0) 
                        result = "Infinite solutions";
                    else 
                        result = "No solution";
                } 
                else 
                    {
                        result = "x = " + (-b / a);
                    }
                JOptionPane.showMessageDialog(null, result);
                break;
            }

            case "2": {
                double a11 = Double.parseDouble(JOptionPane.showInputDialog("Enter a11:"));
                double a12 = Double.parseDouble(JOptionPane.showInputDialog("Enter a12:"));
                double b1  = Double.parseDouble(JOptionPane.showInputDialog("Enter b1:"));

                double a21 = Double.parseDouble(JOptionPane.showInputDialog("Enter a21:"));
                double a22 = Double.parseDouble(JOptionPane.showInputDialog("Enter a22:"));
                double b2  = Double.parseDouble(JOptionPane.showInputDialog("Enter b2:"));

                JOptionPane.showMessageDialog(null,
                        "System:\n"
                      + a11 + "x + " + a12 + "y = " + b1 + "\n"
                      + a21 + "x + " + a22 + "y = " + b2);

                double D  = a11 * a22 - a12 * a21;
                double D1 = b1 * a22 - b2 * a12;
                double D2 = a11 * b2 - a21 * b1;

                String result;

                if (D == 0) 
                {
                    if (D1 == 0 && D2 == 0) 
                        result = "Infinite solutions";
                    else 
                        result = "No solution";
                } 
                else 
                {
                    double x = D1 / D;
                    double y = D2 / D;
                    result = "x = " + x + ", y = " + y;
                }
                JOptionPane.showMessageDialog(null, result);
                break;
            }

            case "3": {
                double a = Double.parseDouble(JOptionPane.showInputDialog("Enter a:"));
                double b = Double.parseDouble(JOptionPane.showInputDialog("Enter b:"));
                double c = Double.parseDouble(JOptionPane.showInputDialog("Enter c:"));

                JOptionPane.showMessageDialog(null, "Equation: " + a + "x^2 + " + b + "x + " + c + " = 0");

                String result;

                if (a == 0) {
                    if (b == 0) 
                    {
                        if (c == 0) 
                            result = "Infinite solutions";
                        else result = "No solution";
                    }
                     else 
                     {
                        result = "Linear solution x = " + (-c / b);
                    }
                } else {
                    double delta = b * b - 4 * a * c;

                    if (delta < 0) 
                    {  
                        result = "No solution";
                    } 
                    else if (delta == 0) 
                    {
                        result = "Double root x = " + (-b / (2 * a));
                    } 
                    else 
                    {
                        double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                        double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                        result = "x1 = " + x1 + ", x2 = " + x2;
                    }
                }

                JOptionPane.showMessageDialog(null, result);
                break;
            }

            default:
                JOptionPane.showMessageDialog(null, "Invalid!");
        }

        System.exit(0);
    }
}