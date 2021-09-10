package week1;

/**
 * Variables
 * Primitive Data Types (int / double / char / booleon)
 * Assignments / Assignment operator - used to store values/data in variable
 */

 public class ExampleFour {

    public static void main(String[] args) {
        int markOne, markTwo, markThree;

        markOne = 75; // mark one is assigned 75
        markTwo = 80; // mark two is assigned 80
        markThree = 87; // mark three is assignt 87


        int average = (markOne+markTwo+markThree)/3;

        System.out.println(average);
        System.out.println("The average is:" + average);  // string concatanation - joined the string with something else

    }
 }