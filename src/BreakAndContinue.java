public class BreakAndContinue {
    public static void main(String[] args) {

        // Break used for stop looping
        var counter = 0;

        while(true){
            System.out.println("Perulangan ke-"+counter);
            counter++;

            if(counter > 10){
                break;
            }

        }
            System.out.println("Perulangan berhenti");

        // Continue syntax used for skip current looping and continue to next looping
        for (counter = 0; counter <= 100; counter++){
            if (counter % 2 == 0){
                continue;
            }
            System.out.println(counter + " - adalah bilangan ganjil");
        }


    }
}
