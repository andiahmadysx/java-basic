public class Foreach {
    public static void main(String[] args) {
        // Foreach used to access array data
        String[] array = {
                "Andi", "Ahmad", "Yusup", "Anak", "Sekolahan"
        };

        // Access array data using for loop
        for (var i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }

        // Access array data using foreach
        for (var value : array){
            System.out.println(value);
        }

    }
}
