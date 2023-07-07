import java.util.*;

// Урок 6. Хранение и обработка данных ч3: множество коллекций Set
// Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
// Создать множество ноутбуков.
// Написать метод, который будет запрашивать у пользователя критерий фильтрации и выведет ноутбуки, отвечающие фильтру.
// NoteBook notebook1 = new NoteBook
// NoteBook notebook2 = new NoteBook
// NoteBook notebook3 = new NoteBook
// NoteBook notebook4 = new NoteBook
// NoteBook notebook5 = new NoteBook

// Например: “Введите цифру, соответствующую необходимому критерию:
// 1 - ОЗУ
// 2 - Объем ЖД
// 3 - Операционная система
// 4 - Цвет

// Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.

// Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.

// Класс сделать в отдельном файле

// приветствие
// Выбор параметра
// выбор конкретнее
// вывод подходящих
public class price {
    public static void main(String[] args) {

        List<Notebook> notebooks = Arrays.asList(
                new Notebook(8, 2000, "windows", "оранжевый", "asus"),
                new Notebook(16, 500, "Linux", "коричнеый", "Samsung"),
                new Notebook(8, 1000, "windows", "фиолетовый", "Acer"),
                new Notebook(14, 500, "linux", "черный", "hp"),
                new Notebook(32, 1000, "windows", "пурпурный", "apple"));

        filter(notebooks);
    }
    public static void filter(List<Notebook> notebooks) {
        System.out.println("обЪем ОЗУ от:");
        Scanner sc = new Scanner(System.in);
        Integer ram = Integer.valueOf(sc.nextLine());
        System.out.println("HDD от:");
        Integer hdd = Integer.valueOf(sc.nextLine());
        for (var i : notebooks) {
            if(i.getRam()>=ram && i.getHdd()>=hdd)
            System.out.println(i);
          
        }
            
            
    }
}