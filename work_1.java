import java.util.Scanner;

/**1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
 * work_1
 */
public class work_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число n: ");
        int number = sc.nextInt();
        int sum = 0;
        for(int i = 0;i<=number;i++) 
        {
            sum += i;
        }
        System.out.printf("Сумма %d%n", sum);
        int multiplier =number*(number+1)/2;
        System.out.printf("Произведение %d%n", multiplier);
    }
}