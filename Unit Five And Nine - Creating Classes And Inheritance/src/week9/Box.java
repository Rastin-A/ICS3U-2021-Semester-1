package week9;

public class Box extends Rectangle{
 /*
    public Box() {
        super();
    }
*/

    private double height;


    public Box(double l, double w, double h) {
        //length = l;     // you get everything your parent has BUT the private stuff isn't visible. its there but not visible
        //width = w;



        super(l, w);
        height = h;
    }

    public boolean isCube(){
        return isSquare() && height == getLength();
    }
    
}
