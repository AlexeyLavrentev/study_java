package Seminar_03;

public class task_01 {
    public static void main(String[] args) {
        int[] arr = {5, 4, 7, 2, 3, 1, 6, 2};

        print(arr);
        new task_01().sort(arr, 0, arr.length - 1);
    }

    private void sort(int[] arr, int lo, int hi) {
        if (lo < hi) {
            int mid = (lo + hi) / 2;
            sort(arr, lo, mid);         
            sort(arr, mid + 1, hi);       
            merge(arr, lo, mid, hi);      
            print(arr);
        }
    }

    private void merge(int[] arr, int lo, int mid, int hi) {
        int[] left = new int[(mid - lo) + 2];
        int[] right = new int[hi - mid + 1];


        System.arraycopy(arr, lo, left, 0, left.length - 1);
        System.arraycopy(arr, mid + 1, right, 0, left.length - 1);

        left[left.length - 1] = 100;
        right[right.length - 1] = 100;

        int i = 0;
        int j = 0;

        for (; lo <= hi; lo++) {
            if (left[i] <= right[j]) {
                arr[lo] = left[i];
                i++;
            } else {
                arr[lo] = right[j];
                j++;
            }
        }
    }

    private static void print(int[] arr) {
        System.out.println();
        for (int i : arr) {
            System.out.print(i + ", ");
        }
    }
}