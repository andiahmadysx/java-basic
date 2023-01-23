public class MethodParameter {
    public static void main(String[] args) {

        // Call method
        sayHello("Andi", "Ahmad");

    }
    // Create method which receive two parameter (firstName and lastName)
    static void sayHello(String firstName, String lastName){
        System.out.println("Hello, " + firstName + " " + lastName);
    }
}
