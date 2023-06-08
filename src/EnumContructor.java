public class EnumContructor {
    public static void main(String[] args) {
        Size size = Size.SMALL;
        System.out.println(size.getSize());
    }

}

enum Size {
    SMALL("The size is small"),
    MEDIUM("The size is medium"),
    LARGE("The size is large");

    private final String pizzaSize;
    //Ham tao nhan gia tri chuoi lam tham so
    private Size(String pizzaSize) {
        this.pizzaSize = pizzaSize;
    }

    public String getSize() {
        return pizzaSize;
    }
}