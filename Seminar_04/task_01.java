package Seminar_04;

import java.util.Arrays;
import java.util.LinkedList;

public class task_01 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>(Arrays.asList(10, 9, 8, 7, 6, 5, 4, 3, 2, 1));

    for(int i = 0, mid = list.size()/2, j = list.size() - 1; i < mid; i++, j--) {
        list.set(i, list.set(j, list.get(i)));
        }
        System.out.println(list);
    }
}