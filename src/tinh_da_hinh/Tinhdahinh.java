package tinh_da_hinh;


/*
* Tính đa hình là một khái niệm quan trọng của lập trình hướng đối tượng.
* Nó đơn giản có nghĩa là nhiều hơn một hình thức.
* Đó là cùng một thực thể (phương thức, toán tử hoặc đối tượng) nhưng sẽ hoạt động khác nhau trong các tình huống khác nhau
* */
public class Tinhdahinh {
    public static void main(String[] args) {
        Demo d1 = new Demo();
        d1.displayPattern();
        System.out.println("\n");
        d1.displayPattern('#');
    }
}
// Nap chong phuong thuc
class Demo {
    public void displayPattern(){
        for(int i = 0; i < 10; i++) {
            System.out.print("*");
        }
    }

    public void displayPattern(char symbol) {
        for(int i = 0; i < 10; i++) {
            System.out.print(symbol);
        }
    }
}