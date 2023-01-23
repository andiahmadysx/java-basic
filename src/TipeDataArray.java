public class TipeDataArray {
    public static void main(String[] args) {
        // Declare array
        String[] arrayString;
        arrayString = new String[3];

        String[] arrayString2 = new String[3];

        // Set data array
        arrayString[0] = "Andi";
        arrayString[1] = "Ahmad";
        arrayString[2] = "Yusup";

        System.out.println(arrayString[0]);
        System.out.println(arrayString[1]);
        System.out.println(arrayString[2]);

        // Change data array
        arrayString[2] = "Egi";
        System.out.println(arrayString[2]);

        int[] intArray = new int[]{
          12,24,43,54,64
        };
        long[] longArray = {
          10,345,4,45
        };

        // Array length is fixed, can't delete array
        longArray[0] = 0;

        System.out.println(longArray.length);

        // Nested  array
        String[][] nestedArray = {
                {"Andi", "Ahmad", "Yusup"},
                {"Sofware", "Engineer"}
        };

        System.out.println(nestedArray[1][1]);
    }
}
