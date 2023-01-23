public class MethodVariableArgument {
    public static void main(String[] args) {

        // Without variable argument, must create array before
        int[] values = {100, 89, 90, 78};
        sayCongrats("Andi", values);

        // With variable argument
        sayCongratsV("Ahmad", 100, 32, 32, 32);
    }
    static void sayCongrats(String name, int[] values){
        var total = 0;
        for (var value : values){
             total += value;
        }

        var finalValue = total / values.length;

        if(finalValue >= 75){
            System.out.println("Selamat " + name + ", kamu lulus" );
        } else {
            System.out.println("Maaf " + name + ", kamu belum lulus");
        }
    }

    static void sayCongratsV(String name, int... values){
        var total = 0;
        for (var value : values){
            total += value;
        }

        var finalValue = total / values.length;

        if(finalValue >= 75){
            System.out.println("Selamat " + name + ", kamu lulus" );
        } else {
            System.out.println("Maaf " + name + ", kamu belum lulus");
        }
    }
}
