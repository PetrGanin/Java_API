
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class task {
    public static void main(String[] args) {
        HashSet<Laptops> laptops = new HashSet<>();
        laptops.add(new Laptops("Huawei", 16, 256, 15, "Windows11", "black", 4, 43_459));
        laptops.add(new Laptops("Acer", 8, 128, 16, "Eshel", "black", 5, 52_500));
        laptops.add(new Laptops("HP", 16, 512, 16, "Windows11", "grey", 3, 64_499));
        laptops.add(new Laptops("Lenovo", 8, 256, 15, "Windows10", "silver", 3, 49_999));
        laptops.add(new Laptops("HP", 16, 512, 15, "Linux", "purple", 5, 72_350));
        laptops.add(new Laptops("Apple", 8, 256, 14, "MacOS", "silver", 3, 84_990));
        laptops.add(new Laptops("Asus", 16, 512, 15, "None", "grey", 5, 69_890));
        laptops.add(new Laptops("Acer", 16, 256, 16, "Linux", "black", 4, 75_500));
        laptops.add(new Laptops("Apple", 16, 512, 16, "MacOS", "black", 3, 115_000));
        laptops.add(new Laptops("Samsung", 8, 256, 15, "Linux", "red", 3, 76_590));
        laptops.add(new Laptops("Huawei", 16, 128, 14, "Windows10", "silver", 4, 65_000));
        laptops.add(new Laptops("Asus", 32, 512, 16, "WindowsXP", "blue", 5, 93_990));
        laptops.add(new Laptops("HP", 8, 256, 15, "Linux", "black", 3, 59_999));
        laptops.add(new Laptops("Huawei", 32, 512, 16, "Windows11Home", "silver", 5, 78_890));
        laptops.add(new Laptops("Apple", 32, 512, 16, "MacOS", "white", 4, 107_340));
        laptops.add(new Laptops("Samsung", 8, 512, 15, "Windows10Home", "blue", 4, 72_790));
        laptops.add(new Laptops("Lenovo", 16, 256, 15, "LinuxMint", "black", 5, 49_999));
        laptops.add(new Laptops("HP", 16, 512, 16, "None", "red", 4, 72_350));
        Filter(userRequest(), laptops);

    }

    public static HashMap<String, String> userRequest() {
        HashMap<String, String> userRequest = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Перед Вами фильтр поиска ноутбуков. Введите значение параметра или оставьте поле пустым");
        System.out.print("Выберите брэнд:");
        userRequest.put("brand", scanner.nextLine());
        System.out.print("Введите объем жесткого диска:");
        userRequest.put("HHD", scanner.nextLine());
        System.out.print("Введите объем оперативной памяти:");
        userRequest.put("RAM", scanner.nextLine());
        System.out.print("Введите диагональ дисплея:");
        userRequest.put("display_size", scanner.nextLine());
        System.out.print("Введите тип операционной системы: ");
        userRequest.put("OS", scanner.nextLine());
        System.out.print("Введите цвет корпуса:");
        userRequest.put("color", scanner.nextLine());
        System.out.print("Введите количество USB-портов:");
        userRequest.put("USB_count", scanner.nextLine());
        System.out.print("Введите стоимость ноутбука:");
        userRequest.put("price", scanner.nextLine());

        scanner.close();
        return userRequest;
    }

    public static void Filter(HashMap<String, String> userRequest, HashSet<Laptops> catalog) {
        Boolean noResultsFlag = true;
        for (Laptops laptop : catalog) {
            if (userRequest.get("brand").equals(laptop.getBrand()) || userRequest.get("brand") == "") {
                if (userRequest.get("color").equals(laptop.getBrand()) || userRequest.get("color") == "") {
                    if (userRequest.get("OS").equals(laptop.getOS()) || userRequest.get("OS") == "") {
                        if (laptop.getDisplay() >= Integer.parseInt(userRequest.get("display_size")) &&
                                (laptop.getHHD() >= Integer.parseInt(userRequest.get("HHD"))) &&
                                (laptop.getRAM() >= Integer.parseInt(userRequest.get("RAM"))) &&
                                (laptop.getUSB() >= Integer.parseInt(userRequest.get("USB_count"))) &&
                                (laptop.getPrice() >= Integer.parseInt(userRequest.get("price")))) {
                            System.out.println(laptop);
                            noResultsFlag = false;
                        }
                    }
                }
            }
        }

        if (noResultsFlag) {
            System.out.print("Введенные Вами параметры поиска не дали результатов.");
        }
    }
}