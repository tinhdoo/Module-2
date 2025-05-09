package ss1_introduction_to_java.BaiTap;
import java.util.Scanner;

public class UngDungChuyenDoiTienTe {
  public static void main(String[] args) {
    double VND;
    double USD;
    final double rate = 26000;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter USD: ");
    USD = scanner.nextDouble();

    VND = USD * rate;
    System.out.println(VND);
  }
}
