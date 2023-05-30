public class tukhoa_this {
    public static void main(String[] args) {
        tukhoa_this obj = new tukhoa_this();

        obj.setName("Duy Ha");
        System.out.println(obj.getName());
    }

    String name;

    //setter
    void setName(String name) {
        this.name = name;
    }

    //getter
    String getName() {
        return this.name;
    }

}
