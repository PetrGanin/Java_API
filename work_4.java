import java.util.LinkedList;
import java.util.Scanner;
import java.util.ArrayDeque;
import java.util.Deque;

public class work_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Первое число: ");
        Deque<Integer> firstNumber = inputDeque(sc.next());
        System.out.print("Второе число: ");
        Deque<Integer> secondNumber = inputDeque(sc.next());
        sc.close();

        PrintResult(firstNumber, secondNumber);
        // addition(firstNumber, secondNumber);
    }

    public static Integer intDeque(Deque<Integer> deque) {
        int result = 0;
        if (deque.getLast() > 0) {
            for (int i = deque.size() - 1; i >= 0; --i) {
                int pos = (int) Math.pow(10, i);
                result += deque.pollLast() * pos;
            }
        } else {
            result += deque.pollLast() * Math.pow(10, deque.size());
            for (int i = deque.size() - 1; i >= 0; --i) {

                int pos = (int) Math.pow(10, i);
                result += (deque.pollLast() * -1) * pos;
            }
        }
        return result;
    }

    public static Deque<Integer> inputDeque(String input) {
        Deque<Integer> listDeque = new ArrayDeque<>();
        char[] chr = input.toCharArray();
        if (input.charAt(0) != '-') {
            for (char c : chr) {
                listDeque.addFirst(Integer.parseInt(String.valueOf(c)));
            }
        } else {
            listDeque.addFirst(Integer.parseInt(String.valueOf(input.charAt(1))) * -1);
            if (chr.length > 2) {
                for (int i = 2; i < chr.length; i++) {
                    listDeque.addFirst(Integer.parseInt(String.valueOf(chr[i])));
                }
            }
        }
        return listDeque;
    }

    public static void PrintResult(Deque<Integer> firstDeque, Deque<Integer> secondDeque) {
        LinkedList<Integer> resullist = new LinkedList<>();
        Integer result = intDeque(firstDeque) * intDeque(secondDeque);
        while (result != 0) {
            resullist.addFirst(result % 10);
            result /= 10;
        }
        System.out.println("Умножение: ");
        System.out.println(resullist);
    }

    public static void addition(Deque<Integer> firstDeque, Deque<Integer> secondDeque) {
        LinkedList<Integer> resultlist = new LinkedList<>();
        Integer result = intDeque(firstDeque) + intDeque(secondDeque);
        while (result != 0) {
            resultlist.addFirst(result % 10);
            result /= 10;
        }
        System.out.print("Cложение: ");
        System.out.println(resultlist);
    }
}
