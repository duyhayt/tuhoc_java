package tinh_ke_thua;

public class tinh_ke_thua {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.eat();
        dog.sleep();
        dog.bark();
    }


}

class Animal {
    public void eat() {
        System.out.println("I can eat");
    }

    public void sleep() {
        System.out.println("I can sleep");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("I can bark");
    }

}