package ss1_introduction_to_java.ThucHanh;

import java.util.Scanner;

public class TinhSoNgayTrongThang {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Which month that you want to count days? ");
    int month = scanner.nextInt();

    switch (month){
      case 2:
        System.out.print("The month '2' has 28 or 29 days!");
        break;
      case 1:
        System.out.print("The month '" + month + "'has 31 days!");
      case 3:
      case 5:
      case 7:
      case 8:
      case 10:
      case 12:
        System.out.print("The month'" + month + "' has 31 days!");
        break;
      case 4:
      case 6:
      case 9:
      case 11:
        System.out.print("The mont '" + month + "'has 30 days!");
        break;
      default:
        System.out.print("Invalid input!");
        break;
    }
  }
}
