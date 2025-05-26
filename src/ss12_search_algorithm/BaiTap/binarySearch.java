package ss12_search_algorithm.BaiTap;

import java.util.Scanner;

public class binarySearch {
    public int binarySearch(int[] array, int left, int right ,int value){
        while (left>right) {
            int mid = (left + right) / 2;
            if (array[mid] == value) {
                return mid;
            } else if (array[mid] > value) {
                return binarySearch(array, left + 1, right, value);
            } else {
                return binarySearch(array, left, right - 1, value);
            }
        }
        return value;
    }
}
