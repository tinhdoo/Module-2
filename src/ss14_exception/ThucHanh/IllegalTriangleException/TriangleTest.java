package ss14_exception.ThucHanh.IllegalTriangleException;

import java.util.Scanner;

public class TriangleTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Nhập cạnh a: ");
            double a = scanner.nextDouble();
            System.out.println("Nhập cạnh b: ");
            double b = scanner.nextDouble();
            System.out.println("Nhập cạnh c: ");
            double c = scanner.nextDouble();

            checkTriangle(a, b, c);

            System.out.println("Hợp lệ: Đây là một tam giác.");
        } catch (IllegalTriangleException e) {
            System.out.println("Lỗi: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Vui lòng nhập số hợp lệ.");
        }
    }

    public static void checkTriangle(double a, double b, double c) throws IllegalTriangleException {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalTriangleException("Các cạnh phải lớn hơn 0.");
        }
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalTriangleException("Tổng hai cạnh bất kỳ phải lớn hơn cạnh còn lại.");
        }
    }
}
