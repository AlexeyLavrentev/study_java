package Seminar_03;

import java.util.ArrayList;
import java.util.Arrays;

public class task_02 {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        ArrayList <Integer> listRes = new ArrayList<>();
        for(int item: list) {
            if (item % 2 != 0) {
                listRes.add(item);
            }
        }
        System.out.println(listRes);
    }
}