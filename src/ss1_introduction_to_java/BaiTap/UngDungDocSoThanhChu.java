package ss1_introduction_to_java.BaiTap;

import java.util.Scanner;

public class UngDungDocSoThanhChu {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Nhập số cần đọc: ");
    int read = scanner.nextInt();

    switch (read) {
      case 1 -> System.out.println("One");
      case 2 -> System.out.println("Two");
      case 3 -> System.out.println("Three");
      case 4 -> System.out.println("four");
      case 5 -> System.out.println("five");
      case 6 -> System.out.println("Six");
      case 7 -> System.out.println("Seven");
      case 8 -> System.out.println("Eight");
      case 9 -> System.out.println("Nine");
      case 10 -> System.out.println("Ten");
      default -> System.out.println("Out of ability");
    }
  }
}
