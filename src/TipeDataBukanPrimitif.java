public class TipeDataBukanPrimitif {
    public static void main(String[] args) {

        // long adalah primitif. sedangkan Long bukan primitif
        Integer iniInteger = 100;
        Long iniLong = 1000L;

        // Jika variable non primitif tidak diisi, null value agar bisa di print
        Byte iniByte = null; // non primitif tidak memiliki default value

        System.out.println(iniByte);

        iniByte = 100;
        System.out.println(iniByte);

        // Konversi primitif ke non primitif
        int iniInt = 1500;
        Integer iniObject = iniInt;

        // Konversi primitif ke non primitif lintas tipe data
        // Harus menggunakan .xxxValue(); ketika konversi lintas tipe data
        short iniShort = iniObject.shortValue();
        long iniLong2 = iniObject.longValue();
        float iniFloat = iniObject.floatValue();

        Long amount = 100000L;
        long amount2 = amount.longValue();
    }
}
