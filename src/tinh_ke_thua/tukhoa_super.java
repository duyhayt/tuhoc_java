package tinh_ke_thua;

public class tukhoa_super {
    public static void main(String[] args) {
        Dog4 dog4 = new Dog4();
        dog4.eat();
        dog4.bark();
        dog4.hello();
    }

}

class Animal4 {
    public Animal4() {
        System.out.println("I am an Animal");
    }

    public void eat() {
        System.out.println("I can eat");
    }

    public void hello() {
        System.out.println("Say hello");
    }
}

class Dog4 extends Animal4 {
    public Dog4() {
        super();
        System.out.println("I am a dog");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("I eat dog food");
    }

    public void bark() {
        System.out.println("I can bark");
    }

    public void hello() {
        super.hello();
        System.out.println("Dog say hello");
    }

}
