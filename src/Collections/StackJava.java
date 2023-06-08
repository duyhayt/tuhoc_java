package Collections;

import java.util.Scanner;
import java.util.Stack;

public class StackJava {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Stack<String> listString = new Stack<String>();

    // Ví dụ về đảo ngược chuỗi
    System.out.println("Nhập vào chuỗi : ");
    String string = scanner.nextLine();

    for (int i = 0; i < string.length(); i++) {
      listString.push(string.charAt(i) + "");
    }
    System.out.println("Gía trị chuỗi đảo ngược: ");
    for (int i = 0; i < string.length(); i++) {
      System.out.println(
          listString.pop()
      );
    }

    //Ví dụ chuyển từ hệ thập phân sang nhị phân
    System.out.println("Nhập 1 số nguyên dương từ bàn phím: ");
    int x = scanner.nextInt();
    while (x > 0){
      int soDu = x % 2;

    }
  }
}
