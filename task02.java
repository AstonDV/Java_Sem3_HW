// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка. Collections.max()

package Seminars.Sem03HW;

import java.util.ArrayList;
import java.util.Collections;

public class task02 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(5);
        numbers.add(15);
        numbers.add(20);
        numbers.add(30);
        numbers.add(25);
        numbers.add(35);
        numbers.add(40);

        int min = Collections.min(numbers);
        int max = Collections.max(numbers);

        double sum = 0.0;
        for (int number : numbers) {
            sum += number;
        }
        double average = sum / numbers.size();

        System.out.println("Минимальное значение: " + min);
        System.out.println("Максимальное значение: " + max);
        System.out.println("Среднее значение: " + average);
    }
}
