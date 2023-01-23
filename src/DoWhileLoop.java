public class DoWhileLoop {
    public static void main(String[] args) {
        var counter = 100;

        // Do while di eksekusi sekali, walaupun value nya bernilai false
        do{
            // jalankan program
            System.out.println("Perulangan ke-"+counter);
            counter++;

            // lalu cek kondisi
        } while(counter <= 10);
    }
}
