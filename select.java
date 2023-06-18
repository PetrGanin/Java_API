//  Дана строка sql-запроса "select * from students WHERE ". Сформируйте часть WHERE этого запроса, используя StringBuilder. Данные для фильтрации приведены ниже в виде json-строки.
// Если значение null, то параметр не должен попадать в запрос.
// Пример данной строки {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
// Вывод: select * from students WHERE name=Ivanov AND country=Russia AND city=Moscow

import java.util.Scanner;

public class select {
    public static void main(String[] args) {
        String str = "Select * From student Where";
        StringBuilder sb = new StringBuilder();
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String number = sc.next();


        sb.append(str);
        
        if (sc != null) {
            sb.append(" name = ");sb.append(number);
        }
        System.out.print("введите страну: ");
        String  country = sc.next();
        if (country != null) {
            sb.append(" AND country = ");sb.append(country);
            
        }

        System.out.print("введите город: ");
        String  city = sc.next();
        if (city != null) {
            sb.append(" AND city = ");sb.append(city);
            System.out.println(sb);
        }
    }
}
