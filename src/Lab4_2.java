
// File Name : Lab4_2.java
import java.util.Scanner;

public class Lab4_2 {
    boolean done = true;
    public static void main(String[] args) {
        Lab4_2 ob = new Lab4_2();
        ob.inPut();
    }

    public void inPut() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Program Calculator.");
        System.out.print("Enter first value : ");
        int num1 = scan.nextInt();
        System.out.println();
        System.out.print("Enter second value : ");
        int num2 = scan.nextInt();
        System.out.println();
        System.out.print("Enter operator(+, -, *, /, %) : ");
        String message = scan.next();
        Lab4_2 ob = new Lab4_2();
        ob.calcuLator(num1, num2, message);
    }

    public void calcuLator(int num1, int num2, String message) {

        double result = 0;
        char operator = message.charAt(0);
        switch (operator) {
        case '+':
            result = num1 + num2;
            message = "result = num1 + num2 = ";
            break;
        case '-':
            result = num1 - num2;
            message = "result = num1 - num2 = ";
            break;
        case '*':
            result = num1 * num2;
            message = "result = num1 * num2 = ";
            break;
        case '/':
            result = (double) num1 / num2;
            message = "result = num1 / num2 = ";
            break;
        case '%':
            result = num1 % num2;
            message = "result = num1 % num2 = ";
            break;
        default:
            done = false;
        }
        if (done) {
            Lab4_2 ob = new Lab4_2();
            ob.outPut(message, result);
        } else {
            System.out.println("Invalid Operator.");
        }

    }

    public void outPut(String message, double result) {

        System.out.println(message+ result);
        ;
        System.out.println("End Program.");
    }
}
