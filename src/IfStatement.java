public class IfStatement {
    public static void main(String[] args) {
        var nilai = 70;
        var absen = 90;

        if (nilai >= 75 && absen >= 75){
            System.out.println("Kamu Lulus!");
        } else {
            System.out.println("Kamut tidak Lulus!");
        }

        if (nilai >= 80 && absen >= 80){
            System.out.println("Nilai anda A");
        } else if (nilai >= 70 && absen >= 70) {
            System.out.println("Nilai anda B");
        } else if (nilai >= 60 && absen >= 60) {
            System.out.println("Nilai anda C");
        } else {
            System.out.println("Nilai anda D");
        }
    }
}
