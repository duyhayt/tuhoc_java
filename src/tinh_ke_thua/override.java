package tinh_ke_thua;

public class override {
    public static void main(String[] args) {
        Dog3 dog3 = new Dog3();
        dog3.eat();
        dog3.sleep();
        dog3.bark();
        /*
        * Ở đây, phương thức eat() vừa xuất hiện bên trong superclass Animal và vừa xuất hiện bên trong subclass dog. Chúng ta đã khởi tạo một đối tượng là dog1 của subclass dog.

           Khi chúng ta gọi phương thức eat() sử dụng đối tượng dog1, phương thức bên trong class Dog sẽ được gọi, và phương thức tương tự trong superclass sẽ không được gọi. Điều này được gọi là ghi đè phương thức.

           Trong ví dụ trên, chúng ta đã sử dụng thẻ @Override để báo cho trình biên dịch rằng chúng ra đang ghi đè một phương thức
         * */
    }

}

class Animal3 {
    protected String type = "animal";

    public void eat() {
        System.out.println("I can eat");
    }

    public void sleep() {
        System.out.println("I can sleep");
    }
}

class Dog3 extends Animal3 {
    @Override
    public void eat() {
        System.out.println("I eat dog food");
    }

    public void bark() {
        System.out.println("I can bark");
    }
}
