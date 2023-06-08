package tinhdonggoi;


/*
* Đóng gói đề cập đến việc đóng gói các thuộc tính và phương thức trong một lớp duy nhất.
  Đóng gói các thuộc tính và phương thức giống nhau trong một lớp cũng giúp ẩn bớt dữ liệu.
*
* */
public class Tinhdonggoi {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setAge(24);
        System.out.println("My age is " + p1.getAge());
    }
}

//vi du: Dong goi cac thuoc tinh va phuong thuc cung nhau
class Rectangle {
    int length;
    int breadth;

    public void getArea() {
    }
}

//An du lieu:
/*
* Public: hiển thị bất cứ đâu
* Private: chỉ hiển thị trong lớp
* Protected: hiển trị trong gói và trong subclass của chúng
* Default: hiển thị trong gói
* */
//Vi du

class Person {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
