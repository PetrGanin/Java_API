import java.util.Scanner;

public class work_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double num1 = sc.nextInt();
        System.out.print("Введите операцию +, -, /, * : ");
        String symbol = sc.next();
        System.out.print("Введите второе число: ");
        double num2 = sc.nextInt();
        double result = 0;
        switch (symbol){
            case "+":
                result = num1 + num2;
                System.out.printf("%f %s %f = %f", num1, symbol, num2, result);
                break;
            case "-":
                result = num1 - num2;
                System.out.printf("%f %s %f = %f", num1, symbol, num2, result);
                break;
            case "*":
                result = num1 * num2;
                System.out.printf("%f %s %f = %f", num1, symbol, num2, result);
                break;
            case "/":
                result = num1 / num2;
                System.out.printf("%f %s %f = %f", num1, symbol, num2, result);
                break;
            default:
                System.out.print("Неверно");
                break;
        }
    }
}
