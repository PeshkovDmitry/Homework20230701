import java.util.*;

public class Main {
    public static void main(String[] args) {
        int size = 3;
        int min = 20;
        int max = 100;
        List<Integer> data = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            data.add(min + new Random().nextInt(max - min));
        }
        System.out.print("Исходный массив: ");
        System.out.println(data);
        System.out.print("После удаления четных значений: ");
        deleteEven(data);
        System.out.println(data);
        if (data.size() > 0) {
            System.out.print("Минимальное значение: ");
            System.out.println(Collections.min(data));
            System.out.print("Максимальное значение: ");
            System.out.println(Collections.max(data));
            System.out.print("Среднее значение: ");
            System.out.println(getAverage(data));
        } else {
            System.out.print("После удаления четных значений массив пуст");
        }

    }

    public static void deleteEven(List<Integer> data) {
        Iterator<Integer> iterator = data.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() % 2 == 0) {
                iterator.remove();
            }
        }
    }

    public static float getAverage(List<Integer> data) {
        float average = 0;
        Iterator<Integer> iterator = data.iterator();
        while (iterator.hasNext()) {
            average += iterator.next();
        }
        return average / data.size();
    }

}

