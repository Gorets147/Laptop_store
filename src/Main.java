import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Set<Laptop> laptops = new HashSet<>();
        laptops.add(new Laptop("Dell", 16, 512, "Windows", "Black"));
        laptops.add(new Laptop("Apple", 8, 256, "MacOS", "Silver"));
        laptops.add(new Laptop("Lenovo", 32, 1024, "Windows", "Gray"));
        laptops.add(new Laptop("Asus", 16, 256, "Linux", "White"));

        Map<String, Object> filters = new HashMap<>();

        Scanner scanner = new Scanner(System.in);



        int choice;
        while (true) {
            System.out.println("Выберите критерии для фильтрации:");
            System.out.println("1 - ОЗУ");
            System.out.println("2 - Объем ЖД");
            System.out.println("3 - Операционная система");
            System.out.println("4 - Цвет");
            System.out.println("0 - Завершить выбор");
            choice = scanner.nextInt();
            if (choice == 0) {
                break;
            }
            switch (choice) {
                case 1:
                    System.out.println("Минимальный объем ОЗУ?");
                    filters.put("ram", scanner.nextInt());
                    break;
                case 2:
                    System.out.println("Минимальный объем SSD?");
                    filters.put("SSD", scanner.nextInt());
                    break;
                case 3:
                    System.out.println("Операционная система?");
                    System.out.println("Доступные ОС:\n Windows\nMacOS\nLinux");
                    filters.put("operatingSystem", scanner.next());
                    break;
                case 4:
                    System.out.println("Цвет?");
                    System.out.println("Доступные Цвета:\n White\nBlack\nSilver\nGray");
                    filters.put("color", scanner.next());
                    break;
                default:
                    System.out.println("Неверный выбор. Попробуйте снова.");
            }
        }


        Set<Laptop> filteredLaptops = laptops.stream()
                .filter(laptop -> filters.getOrDefault("ram", 0) instanceof Integer && laptop.getRam() >= (int) filters.getOrDefault("ram", 0))
                .filter(laptop -> filters.getOrDefault("hdd", 0) instanceof Integer && laptop.getSsd() >= (int) filters.getOrDefault("hdd", 0))
                .filter(laptop -> filters.getOrDefault("operatingSystem", "").equals("") || laptop.getOperatingSystem().equalsIgnoreCase((String) filters.getOrDefault("operatingSystem", "")))
                .filter(laptop -> filters.getOrDefault("color", "").equals("") || laptop.getColor().equalsIgnoreCase((String) filters.getOrDefault("color", "")))
                .collect(Collectors.toSet());

        System.out.println("Отфильтрованные ноутбуки:");
        for (Laptop laptop : filteredLaptops) {
            System.out.println(laptop);

        }
    }
}