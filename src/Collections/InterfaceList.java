package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InterfaceList {

  public static void main(String[] args) {
    //Khởi tạo 1 list String
    List<String> listString = Arrays.asList("Duy Ha", "Vy Khanh", "Thuy Dung");
    for (String element : listString
    ) {
      System.out.println(element);
    }
    //Tạo 1 danh sách
    List<Integer> numbers = new ArrayList<>();

    numbers.add(2);
    numbers.add(1);
    numbers.add(3);
    numbers.add(-2);

    System.out.println(numbers);
    //Truy xuat phan tu:
    System.out.println("Phan tu o vtri 1 la: " + numbers.get(1));
    //Thay the:
    numbers.set(1, 7);
    System.out.println(numbers);
    //In ra danh sách
    for (int e : numbers
    ) {
      System.out.println(e);
    }
    //Kich thuoc cua mang
    System.out.println("Kich thuoc cua mang la: " + numbers.size());
  }

}
