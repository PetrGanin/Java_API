// Реализуйте структуру телефонной книги с помощью HashMap.
// Программа также должна учитывать, что во входной структуре будут повторяющиеся имена с разными телефонами, 
// их необходимо считать, как одного человека с разными телефонами. 
// Вывод должен быть отсортирован по убыванию числа телефонов.

// Пример меню:
// 1) Добавить контакт
// 2) Вывести всех
// 3) Выход

// Иванов 123432
// Иванов 546457
// Иванов 788354


// import java.util.ArrayList;
import java.util.HashMap;
// import java.util.List;
import java.util.Map;
import java.util.Scanner;

// import javax.swing.text.html.HTMLDocument.Iterator;

public class work_5_home {
    public static void main(String[] args) {
        System.out.println("Если вы хотите поработать с записной книгой нажмите 1");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        
        Map<String, Integer> mapList = new HashMap<>();
        
        while(number < 2){
            System.out.println("1 - добавить контак:\n2 - вывести всех:\n3 - выход");
            int number1 = sc.nextInt();
            if(number1 == 1){
                PutContact(mapList);
            }
            if(number1 == 2){
                printMap(mapList);
            }
            if(number1 == 3){
                System.out.println("приятно было с вами работать");
                break;
            } 
        }}
        

    static Map<String, Integer> PutContact (Map<String, Integer> mapList) {
        
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите Имя: ");
            String name = sc.nextLine();
            System.out.println("Введите телефон: ");
            int phone = sc.nextInt();

            mapList.put(name, phone);
            // System.out.println(name + " - " + phone);
            return mapList;
  
    }
    static void printMap(Map<String, Integer> strIntMap) {
        for (Map.Entry<String, Integer> entry : strIntMap.entrySet())
            System.out.println(entry.getKey() + " : " + entry.getValue());
    }
}

 
    
