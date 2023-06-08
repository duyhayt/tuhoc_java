/*
 * interface định nghĩa một tập hợp các đặc tả mà class khác phải thực hiện
 * */

public class interface_java {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();

        rectangle.getArea();
        rectangle.getSides();

        Square s1 = new Square();
        s1.getArea();

    }
}

interface Polygon {
    public void getArea(); //bat buoc phai implements

    default void getSides() { // k bat buoc
        System.out.println("Ican say Hello");
    }
}

class Rectangle implements Polygon {

    @Override
    public void getArea() {
        int length = 6;
        int breadth = 5;
        int area = length * breadth;
        System.out.println("The area of the rectangle is " + area);
    }

    @Override
    public void getSides() {
        System.out.println("I have 4 sides.");
    }
}

class Square implements Polygon {
    @Override
    public void getArea() {
        int length = 5;
        int area = length * length;
        System.out.println("The area of the square is " + area);
    }
}
