package ss3_array.BaiTap;

import java.util.Scanner;

public class Count {
  public static void main(String[] args) {
    String[] str = {"c", "o", "d", "e"};

    Scanner scanner = new Scanner(System.in);
    String var = scanner.next();

    int count = 0;
    for (int i = 0; i < str.length;i++){
      if (var.equals(str[i])){
       count++;
      }
    }
    System.out.println("Số lần xuất hiện của \"" + var + "\": " + count);
  }
}
