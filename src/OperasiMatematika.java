public class OperasiMatematika {
    public static void main(String[] args) {
        // Declare Variable
        int a = 100;
        int b = 10;

        //
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        // Augmented Assignment
        int c = 1000;
        c += 10;
        System.out.println(c);

        c -= 10;
        System.out.println(c);

        c *= 10;
        System.out.println(c);

        // Unary operator
        int d = 200;
        int e = -20;

        d++;
        System.out.println(d);

        d--;
        System.out.println(d);

        System.out.println(!true);

    }
}
