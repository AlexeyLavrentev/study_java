package Seminar_03;

import java.util.ArrayList;
import java.util.Arrays;

public class task_03 {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>(Arrays.asList(10, 9, 8, 7, 6, 5, 4, 3, 2, 1));
        System.out.println(list);
        int maxValue = list.get(list.size() - 1);
        int minValue = list.get(0);
        float middleValue = 0;
        for(int item: list) {
            if (item > maxValue) maxValue = item;
            else if (item < minValue) minValue = item;
            middleValue += item;
        }
        middleValue /= list.size();
        System.out.printf("Максимальное значение = %d \nМинимальное значение = %d \nСреднее значение = %f", maxValue, minValue, middleValue);
    }
}