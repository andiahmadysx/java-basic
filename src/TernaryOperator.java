public class TernaryOperator {
    public static void main(String[] args) {

        // Without ternary operator
        var nilai = 75;
        String ucapan;

        if (nilai >= 75){
            ucapan = "Kamu lulus";
        } else {
            ucapan = "Kamu tidak lulus";
        }
        System.out.println(ucapan);

        // With ternary operator
        String ucapan2 = nilai >= 75 ? "Selamat, Anda lulus" : "Maaf, Anda tidak lulus";
        System.out.println(ucapan2);
    }
}
