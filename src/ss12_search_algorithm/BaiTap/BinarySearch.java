package ss12_search_algorithm.BaiTap;

public class BinarySearch {

    public BinarySearch() {
    }

    public int binarySearch(int[] array, int left, int right, int value) {
        while (left <= right) {
            int mid = (left + right) / 2;
            if (array[mid] == value) {
                return mid;
            } else if (array[mid] > value) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
}
}
