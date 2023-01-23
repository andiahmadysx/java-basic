public class MethodOverloading {
    public static void main(String[] args) {

        sayHello();
        sayHello("Andi");
        sayHello("Ahmad", "Yusup");
    }

    // Possible to create same name method, but method overloading have a rules.
    // The method must have different parameter
    static void sayHello(){
        System.out.println("Hello");
    }
    static void sayHello(String name){
        System.out.println("Hello " + name);
    }
    static void sayHello(String firstName, String lastName){
        System.out.println("Hello " + firstName + " " + lastName);
    }

}
