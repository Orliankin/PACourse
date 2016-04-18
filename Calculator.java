import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Евгений on 16.04.2016.
 */
public class Calculator {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input: number 1, symbol(\"/\",\"*\", \"+\" or \"-\") and number 2");
        int num1 = Integer.parseInt(reader.readLine());
        String symbol = reader.readLine();
        int num2 = Integer.parseInt(reader.readLine());
        try {
            action(symbol, num1, num2);
        } catch (ArithmeticException ae) {
            System.out.println("divide by zero!" + " number one = " + num1 + " number two = " + num2);
            ae.printStackTrace();
        } catch (Throwable t) {
            System.out.println("Случилось что-то страшное и непонятное!");
        }
    }

    public static void action(String symbol, int number1, int number2) {
        if ("/".equals(symbol)) {
            System.out.println(number1 / number2);
        } else if ("*".equals(symbol)) {
            System.out.println(number1 * number2);
        } else if ("+".equals(symbol)) {
            System.out.println(number1 + number2);
        } else if ("-".equals(symbol)) {
            System.out.println(number1 - number2);
        }
    }
}
