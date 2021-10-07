package week5;

public class Formatting {

    public static void main(String[] args) {
        int minutes = 5;
        double seconds = 3.272676786;
        double seconds1 = 3.2;


        //placeholders
        //%d -> ints
        //%f -> floating points
        //System.out.printf("blah%dtest %f", minutes, seconds);
        System.out.printf("%d:$06.3f", seconds, minutes);
    }
}
