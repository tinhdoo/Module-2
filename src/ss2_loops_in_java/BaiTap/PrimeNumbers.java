package ss2_loops_in_java.BaiTap;

import java.util.Enumeration;
import java.util.Scanner;

public class PrimeNumbers {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Nhập số cần kiểm tra: ");
    int numbers = input.nextInt();

    if (isPrime(numbers)) {
      System.out.println(numbers + " là số nguyên tố");
    } else {
      System.out.println(numbers + " không phải là số nguyên tố");
    }
  }

  public static boolean isPrime(int n) {
    if (n < 2) {
      return false;
    }

    for (int i = 2; i <= Math.sqrt(n); i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }
}

