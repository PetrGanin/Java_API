// Задание

// Пусть дан произвольный список целых чисел.

// 1) Нужно удалить из него чётные числа
// 2) Найти минимальное значение
// 3) Найти максимальное значение
// 4) Найти среднее ариф. значение

import java.util.ArrayList;
import java.util.Arrays;

public class work_3sem {
    public static void main(String[] args){ 
        ArrayList<Integer> array = new ArrayList<>(Arrays.asList(2,3,4,2,4,5,3,9,13,18,14));
        System.out.println(array);
        System.out.println(maxnumbInteger(array));
        System.out.println(minnumbInteger(array));
        System.out.println(Average(array));    

        System.out.println(Deletenumber(array));
    
    }
        // int min = 34;
        // int max = 0;
        // for (int i = 0; i < array.size()-1; i++) {
        //     if(array.get(i) > max);
        //         max = array.get(i);
        //     }
        // System.out.println(max);

        // for (int i = 0; i < array.size(); i++) {
        //     if(min > array.get(i));
        //         min = array.get(i);
        //     }
        // System.out.println(min);
    public static Integer maxnumbInteger(ArrayList<Integer> array) {
        int max = 0;
        for (int i = 0; i < array.get(i); i++) {
            if(array.get(i) > max);
                max = array.get(i);
        }
        return max;
    }
    public static Integer minnumbInteger(ArrayList<Integer> array) {
        int min = 18;
        for (int i = 0; i < array.get(i); i++) {
            if(array.get(i) < min);
                min = array.get(i);
        }
        return min;
    }
      public static Integer Average(ArrayList<Integer> array) {
        int sum = 0;
        Integer sredn = 0;
        for (int i = 0; i < array.size(); i++) {
            sum += array.get(i);
        }
        sredn = sum / array.size();
        return sredn;
    }
    public static ArrayList<Integer> Deletenumber(ArrayList<Integer> array) {
        for (int i = 0; i < array.size(); i++) {
            if(array.get(i) % 2 == 0) {
                array.remove(i);
                i--;
            }
        }
        return array;
    }
}
