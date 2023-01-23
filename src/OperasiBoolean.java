public class OperasiBoolean {
    public static void main(String[] args) {
        // Buat variable absen dan nilai akhir
        var absen = 80;
        var nilaiAkhir = 70;

        // Kondisi jika variable absen dan nilai akhir >= 75 maka nilainya true
        boolean lulusAbsen = absen >= 75;
        boolean lulusNilai = nilaiAkhir >= 75;

        //
        boolean lulus = lulusAbsen && lulusNilai;

        System.out.println(lulus);
    }
}
