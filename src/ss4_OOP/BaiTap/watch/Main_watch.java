import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[100000];
        Random random = new Random();

        // Sinh mảng ngẫu nhiên 100,000 phần tử
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100000);
        }

        StopWatch watch = new StopWatch();
        watch.start(); // bắt đầu đo thời gian

        selectionSort(array);

        watch.stop(); // dừng đo

        System.out.println("Thời gian thực hiện selection sort: " + watch.getElapsedTime() + " ms");
    }

    // Thuật toán selection sort
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            // Hoán đổi
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
}
