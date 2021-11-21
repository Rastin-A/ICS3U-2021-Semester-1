package week8;

public class Die {
    
    
   // attributes - defines the state of the Object

   // The attributes SHOULD be private
   // private -> visible(accessible) in this class
   private int numSides;
   private int topSide;

   // constructor
   // has the same name as the class
   // you should create at least 1
   // they are used to obtain (construct an instance of this class)
   // In this case it will give a Die
   // Purpose is to initialize the state (attributes)
   public Die() {
      /* constructor initializes the attributes */
      numSides = 6;
      roll();
   }

   public Die(int numSides) {
      /* The word this refers to the Object that we are working with. */
      // The object the called the method.
      this.numSides = numSides;
      roll();
   }

   public void roll() {
      topSide = (int) (Math.random() * numSides) + 1;
   }

   public int getTopSide() {
      return topSide;
   }

   public boolean equals(Object obj) {
       if (obj == this)
            return true;

        if (obj instanceof Die) {
            return this.topSide == ((Die) obj).topSide;
        } else {
            return false;
        }
   }

   public String toString() {
       return "" + topSide;
   }
}
