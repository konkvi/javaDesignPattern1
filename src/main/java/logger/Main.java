package logger;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();

        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести входные данные для списка");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер списка: ");
        int size = scanner.nextInt();
        logger.log("размер списка = " + size);
        System.out.print("Введите верхнюю границу значений: ");
        int upToSize = scanner.nextInt();
        logger.log("верхняя граница значений = " + upToSize);

        logger.log("Создаём и наполняем список");
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < size; i++){
            list.add(random.nextInt(upToSize));
        }
        logger.log("Вот случайный список:" + list);

        logger.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.print("Введите порог для фильтрации: ");
        int step = scanner.nextInt();
        logger.log("порог для фильтрации = " + step);

        logger.log("Запускаем фильтрацию");
        Filter filter = new Filter(step);
        List filteredList = filter.filterOut(list);
        logger.log("Выводим результат на экран");
        logger.log("Отфильтрованный список: " + filteredList);
        logger.log("Завершаем программу");
    }

}
