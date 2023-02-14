package Seminar_02;

import java.io.*;
import java.util.*;

public class task_01 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new FileReader("file1.txt"));
        String str = br.readLine();
        br.close();
        System.out.println("Строка из файла:\n");
        System.out.printf(" %s \n\n", str);
        
        String s = str.substring(1, str.length()-1);
        String[] strArr = s.split(", ");
        
        System.out.println("Результат - строка запроса SQL:");
        String result = stringSQLrequest(strArr);
        System.out.println(result);
    }
    
    // Строка SQL запроса
    public static String stringSQLrequest(String[] arr) {
        StringBuilder result = new StringBuilder();
        result.append("\nSELECT * FROM students WHERE ");

        List<String> arrList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (!arr[i].contains("null")) {
                arrList.add(arr[i]);
            }
        }

        for (int i = 0; i < arrList.size(); i++) {
            String[] temp = arrList.get(i).split(":");
            String str0 = temp[0].substring(1, temp[0].length()-1);
            result.append(str0);
            result.append(" = ");
            result.append(temp[1]);
            if (i < arrList.size() - 1) {
                result.append(" AND ");
            } else {
                result.append(";");
            }
        }
        return result.toString();
    }
}