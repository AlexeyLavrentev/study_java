package Seminar_02;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class task_02 {
    public static String sortArray() {
        int[] array = {1, 9, 3, 0, 2, 1, 6, 83, 9, 22, 20};
        int temp = 0;
        String result = "";
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j + 1] < array[j]) {
                    temp = array[j + 1]; 
                    array[j + 1] = array[j]; 
                    array[j] = temp;
                }
            }
        }
        for (int n = 0; n < array.length; n++) {
            if (n == array.length - 1) {
                result += array[n] + "\n";
            } else {
                result += array[n] + " ";
            }
        }
        return result;
    }

    public static void WriteStringToFile(String s, String filepath) throws Exception {
        File f = new File(filepath);
        FileWriter fr = null;
        try {
            fr = new FileWriter(f, true);
            fr.write(s);
           
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        try {
            WriteStringToFile(sortArray(), "logs.txt");
        } catch (Exception e) {
            System.out.printf("Exception: %s", e);
        }
    }
}