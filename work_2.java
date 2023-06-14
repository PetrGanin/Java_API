
// 2) Вывести все простые числа от 1 до 1000
public class work_2 {
    public static void main(String[] args) {
        System.out.print("простые числа: ");
        int number = 1000;
        int i =0;
        int j =0;
        for (i=2; i<number; i++){
            int count = 0;
            for(j=2; j<number; j++){
                if ((i%j) == 0)
                    count++;}
            if (count<2)
                System.out.printf(",%d",i);
        }

    }
}
