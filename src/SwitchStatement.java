public class SwitchStatement {
    public static void main(String[] args) {
        // Declare variable
        var nilai = "f";

        // Switch just only for assignment ==
        switch (nilai){
            case "A" :
                System.out.println("Woaw Anda lulus dengan baik");
                break;
            case "B":
            case "C":
                System.out.println("Nilai Anda cukup baik");
                break;
            case "D":
                System.out.println("Anda tidak lulus");
                break;
            default:
                System.out.println("Anda salah jurusan");
        }

        // Switch Lambda
        switch (nilai){
            case "A" -> System.out.println("Kamu lulus dengan baik!)");
            case "B", "C" -> System.out.println("Kamu lulus!");
            case "D" -> {
                System.out.println("Kamu tidak lulus!");
            }
            default -> System.out.println("Kamu salah jurusan!");
        }

        // Syntax yield for return value from switch statement
        String ucapan = switch (nilai){
            case "A" :
                yield "Kamu lulus dengan baik!)";
            case "B", "C" :
                yield  "Kamu lulus!";
            case "D" :
                yield "Kamu tidak lulus!";
            default :
                yield "Kamu salah jurusan!";
        };
        System.out.println(ucapan);
    }
}
