package week9;

public class testPractice {
    private int whatever = 0; // attributes private can only be accessed inside of the class from the constructors
    // constructors usually are all public and same name as class
    public testPractice() {
        //attributes are private and can only be accessed inside of the class
    }


    // can only be accessed in testpractice and not outside of the class
    private testPractice(String i) {  


    }
    public void testing() {
         // return types: double = decimals, int = whole numbers, string = returns a string, boolean = true/false, void = nothing
        // is a method because its private so it cant be a constructor and needs a return type

    }
            //a.testing()
            //^ uses the object attributes for variables in the method
    // the main difference between static/nonstatic is the way they are accessed
    private static int whatever2 = 0; // static exists in the class and called by the class
    private int whatever3 = 0; // nonstatic means it exists in the object
    // object.whatever3 // makes a call for the whatever3 variable in the specific object
    public static void test2() {

    }
    //example// public class testPractice extends test
    // super refers to parent class which is the class
    
}

// would have to be in another file
public class test extends testPractice {
    //explicit call if i call it myself
    //implicit call because java does it not just super
}
