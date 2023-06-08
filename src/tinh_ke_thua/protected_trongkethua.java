package tinh_ke_thua;

public class protected_trongkethua {
    public static void main(String[] args) {
        Dog1 dog1 = new Dog1();
        dog1.eat();
        dog1.sleep();
        dog1.bark();

        dog1.type = "mammal";
        dog1.setColor("black");
        dog1.displayInfo(dog1.getColor());
    }

}

class Animal1 {
    protected String type;
    private String color;

    public void eat() {
        System.out.println("I can eat");
    }

    public void sleep() {
        System.out.println("I can sleep");
    }
//getter
    public String getColor() {
        return color;
    }
//setter
    public void setColor(String col) {
        color = col;
    }
}

class Dog1 extends Animal1 {
    public void displayInfo(String c) {
        System.out.println("I am a " + type);
        System.out.println("My color is " + c);
    }

    public void bark() {
        System.out.println("I can bark");
    }
}
