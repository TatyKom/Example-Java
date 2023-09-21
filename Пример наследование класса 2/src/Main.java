import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("Чары Индиго", "Р.Мид", "Мистика", 650.0, "Эксмо");
        Book b2 = new Book("Приключение котобоя", "А.А.Усачев", "Приключения", 500.0, "Москва");
        Book b3 = new Book("Рокировка", "Д.Черкасов", "Детектив", 250.0, "Валери СПД");
        Journal j1 = new Journal("Охота", "-", "Публикация", 150.0, 3);
        Journal j2 = new Journal("КРОТ", "-", "Кроссворды", 100.0, 5);
        Journal j3 = new Journal("Мурзилка", "-", "Детские публикации", 50.0, 3);

        ArrayList<Literature> mas = new ArrayList<>();
        mas.add(b1);
        mas.add(b2);
        mas.add(b3);
        mas.add(j1);
        mas.add(j2);
        mas.add(j3);
        register(mas);
        System.out.println();

        mas.sort(Comparator.comparing(Literature::getName));
        ArrayList<Literature> mas2 = new ArrayList<>(mas);
        int Index;
        for(int i = 0; i < mas2.size(); ++i) {
            Index = i + 1;
            System.out.println(Index + " " + mas2.get(i));
        }
        System.out.println();
        System.out.println("Введите номер книги из списка, которую хотите купить.");
        int num = enterNumber();
        System.out.println("Введите сумму денег для оплаты");
        double sum = enterSum();
        double change = 0;
        for(int i = 0; i < mas2.size(); ++i) {
            Index = i + 1;
            if (num == Index)
                change = sum - mas2.get(i).getPrice();
        }
        if (change >= 0)
            System.out.println("Ваша сдача: " + change + " руб.");
        if (change < 0)
            System.out.println("Не хватает денег для покупки. Внесите " + Math.abs(change) + " руб.");
    }
    public static void register(ArrayList<Literature> list) {
        double sum = 0;
        for(Literature e : list) {
            sum += e.getPrice();
        }
        System.out.println("Средняя стоимость всех литературных произведений: " + sum/ list.size());
    }
    public static int enterNumber () {
        Scanner sc = new Scanner(System.in);
        int number;
        for(;;) {
            if (!sc.hasNextInt()) {
                System.out.println("вы ввели не число. Повторите воод.");
                sc.nextLine();
                continue;
            }
            number = sc.nextInt();
            if (number >0&&number < 7) return number;
            else System.out.println("Введите номер книги от 1 до 6");
        }
    }
    public static double enterSum () {
        Scanner sc = new Scanner(System.in);
        double number;
        for(;;) {
            if (!sc.hasNextDouble()) {
                System.out.println("вы ввели не число. Повторите ввод.");
                sc.nextLine();
                continue;
            }
            number = sc.nextDouble();
            if (number >0) return number;
            else System.out.println("Сумма денег должна быть больше 0");
        }
    }
}


