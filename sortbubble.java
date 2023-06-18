//2. Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.

import java.io.FileWriter;
import java.io.IOException;

public class sortbubble {
    public static int[] sortBubble(int[] array) {
        int index;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    index = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = index;
                }
            }
            writeLog(array);
        }
        return array;
    }
        public static void main(String[] args) {
        int[] array = {2,4,5,7,3,5,7,1};
        sortBubble(array);
    }

    public static void writeLog(int[] array) {
        try (FileWriter writer = new FileWriter("file.txt", true)) {
            for (int i = 0; i < array.length; i++) {
                writer.write(array[i] + " ");
            }
            writer.write("\n");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}