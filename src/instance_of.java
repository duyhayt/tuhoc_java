public class instance_of {

    public static void main(String[] args) {
        String name = "Programiz";
        Integer age = 22;

        System.out.println("Is name an instance of String: " + (name instanceof String));
        System.out.println("Is age an instance of Integer: " + (age instanceof Integer));
        Dog2 d1 = new Dog2();
        System.out.println("Is d1 an instance of Dog: " + (d1 instanceof Dog2));
        System.out.println("Is d1 an instance of Animal: " + (d1 instanceof Animal2));
    }


}

class Animal2 {

}

class Dog2 extends Animal2 {

}
