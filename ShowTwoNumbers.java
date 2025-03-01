import javax.swing.JOptionPane;
public class ShowTwoNumbers {
    public static void main(String[] args) {
        String strNum1; 
        String strNum2;
        String strNotification = "You've just entered ";
        strNum1 = JOptionPane.showInputDialog(null, "Please input the first number: ", "Input the first number", JOptionPane.INFORMATION_MESSAGE);
        double num1 = Double.parseDouble(strNum1);
        strNotification += "num1 = " + num1 + "\n";
        strNum2 = JOptionPane.showInputDialog(null, "Please input the second number: ", "Input the second number",JOptionPane.INFORMATION_MESSAGE);
        double num2 = Double.parseDouble(strNum2); 
        strNotification += "num2 = " + num2 + "\n";   
        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1*num2;
        double quotient = num1 / num2;
        strNotification += "Sum = " + sum + "\n";
        strNotification += "Difference = " + difference + "\n";
        strNotification += "Product =  "+ product + "\n";
        strNotification += "Quotient =  " + quotient + "\n";
        JOptionPane.showMessageDialog(null,strNotification,"Show two numbers", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
