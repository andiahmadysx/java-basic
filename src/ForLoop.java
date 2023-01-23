public class ForLoop {
    public static void main(String[] args) {
        // Loop without init statement
//        for(;;){
//            // Infinity Looping
//            System.out.println("Looping"); // Deadlock or stuck
//        }

        // Looping with init statement
        var counter = 10;
        for(;counter >= 0;){
            System.out.println("Perulangan ke-" + counter);
            counter--;
        }

        // Looping with post statement
        // for (init statement; kondisi; post statement)
        for (int i = 0; i <= 10; i++ ){
            System.out.println("Perulangan ke-" + i);
        }
    }
}
