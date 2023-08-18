import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ScientificCalculator extends JFrame implements ActionListener {

    private JTextField inputField;
    private JButton addButton, subtractButton, multiplyButton, divideButton,
            modulusButton, squareRootButton, squareButton;

    public ScientificCalculator() {
        super("Scientific_Calculator");

        // Create components
        inputField = new JTextField(10);
        addButton = new JButton("+");
        subtractButton = new JButton("-");
        multiplyButton = new JButton("*");
        divideButton = new JButton("/");
        modulusButton = new JButton("%");
        squareRootButton = new JButton("sqrt");
        squareButton = new JButton("x^2");

        // Register event listeners
        addButton.addActionListener(this);
        subtractButton.addActionListener(this);
        multiplyButton.addActionListener(this);
        divideButton.addActionListener(this);
        modulusButton.addActionListener(this);
        squareRootButton.addActionListener(this);
        squareButton.addActionListener(this);

        // Set layout and add components
        setLayout(new GridLayout(4, 2));
        add(inputField);
        add(addButton);
        add(subtractButton);
        add(multiplyButton);
        add(divideButton);
        add(modulusButton);
        add(squareRootButton);
        add(squareButton);

        // Display window
        setSize(500, 500);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent evt) {
        double result = 0;
        double operand = Double.parseDouble(inputField.getText());

        if (evt.getSource() == addButton) {
            result = Calculator.add(operand);
        } else if (evt.getSource() == subtractButton) {
            result = Calculator.subtract(operand);
        } else if (evt.getSource() == multiplyButton) {
            result = Calculator.multiply(operand);
        } else if (evt.getSource() == divideButton) {
            result = Calculator.divide(operand);
        } else if (evt.getSource() == modulusButton) {
            result = Calculator.modulus(operand);
        } else if (evt.getSource() == squareRootButton) {
            result = Calculator.squareRoot(operand);
        } else if (evt.getSource() == squareButton) {
            result = Calculator.square(operand);
        }

        inputField.setText(Double.toString(result));
    }

    public static void main(String[] args) {
        new ScientificCalculator();
    }
}

class Calculator {

    public static double add(double x) {
        double y = Double.parseDouble(JOptionPane.showInputDialog("Enter second operand:"));
        return x + y;
    }

    public static double subtract(double x) {
        double y = Double.parseDouble(JOptionPane.showInputDialog("Enter second operand:"));
        return x - y;
    }

    public static double multiply(double x) {
        double y = Double.parseDouble(JOptionPane.showInputDialog("Enter second operand:"));
        return x * y;
    }

    public static double divide(double x) {
        double y = Double.parseDouble(JOptionPane.showInputDialog("Enter second operand:"));
        return x / y;
    }

    public static double modulus(double x) {
        double y = Double.parseDouble(JOptionPane.showInputDialog("Enter second operand:"));
        return x % y;
    }

    public static double squareRoot(double x) {
        return Math.sqrt(x);
    }

    public static double square(double x) {
        return x * x;
    }
}