public class Variable {
    public static void main(String[] args) {

        // Declare variable name
        String name;
        // Set variable name
        name = "Andi Ahmad Yusup";

        int age = 17;
        String address = "Indonesia";

        System.out.println(name);
        System.out.println(age);
        System.out.println(address);

        // Change value variable name
        name = "Kaori Miyazono";
        System.out.println(name);

        // Create variable without declare type data (using syntax var). Automaticaly set type data by java
        var firstName = "Naruto";
        var lastName = "Uzumaki";

        // Create constant using final syntax
        final String Company = "PT Mencari Cinta";
    }
}
