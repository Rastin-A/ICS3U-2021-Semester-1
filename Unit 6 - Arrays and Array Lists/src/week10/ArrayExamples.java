package week10;

public class ArrayExamples {
    public static void main(String[] args) {
        primitiveArray();
        arrayObjectExample();
    }

    private static void primitiveArray() {
        int[] arr = new int [5];

        arr[0] = 2;
        arr[1] = 4;
        arr[2] = 8;
        arr[3] = 16;
        arr[4] = 32;
        System.out.println(arr[2]);
    }

    private static void arrayObjectExample() {
        Animal[] animals = new Animal[3];
        animals[0] = new Animal();

    }
}