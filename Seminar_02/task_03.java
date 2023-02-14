package Seminar_02;

import java.io.*;

public class task_03 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("file2.txt"))) {
            String str = br.readLine();
            if (str != null) {
                System.out.println("Строка из файла:\n");
                System.out.print(str);
                
                String s = str.substring(1, str.length()-1);
                String[] ss = s.split(", ");
               
                System.out.println("\n\nРезультат - новый массив строк:\n");
                String[] result = reformArrayString(ss);
                System.out.println(printArrayStr(result));
            }
        } catch (IOException ex) {
            System.out.println("Не удалось открыть файл");
        }
    }

    public static String printArrayStr(String[] data) {
        StringBuilder output = new StringBuilder();
        int count = data.length;
        int index = 0;

        while (index < count) {
            output.append(data[index]);
            output.append("\n");
            index++;
        }
        return output.toString();
    }
    
    public static String[] reformArrayString(String[] arr) {
        String[] out = new String[arr.length];
        
        for (int i = 0; i < arr.length; i++) {
            StringBuilder result = new StringBuilder();
            String st = arr[i].substring(1, arr[i].length()-1);
            String[] sm = st.split(":|,");
            
            result.append("Студент ");
            result.append(sm[1].substring(1, sm[1].length()-1));
            result.append(" получил ");
            result.append(sm[3].substring(1, sm[3].length()-1));
            result.append(" по предмету ");
            result.append(sm[5].substring(1, sm[5].length()-1));
            result.append(".");
            
            out[i] = result.toString();
        }
        return out;
    }
}