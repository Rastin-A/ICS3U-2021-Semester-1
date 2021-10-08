package week5;

import java.util.Scanner;

public class CrossCountry {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      processRunner(in);
      processRunner(in);
      processRunner(in);
      in.close();
   }

   /**
    *
    * @param in
    */
   private static void processRunner(Scanner in) {
      String firstName, lastName;
      String mileOne, mileTwo, finishTime;
      String splitTwo, splitThree;

      System.out.println("Please enter your first name: ");
      firstName = in.nextLine();

      System.out.println("Please enter your last name: ");
      lastName = in.nextLine();

      System.out.println("Please enter mile one time: ");
      mileOne = in.nextLine();
      
      System.out.println("Please enter mile two time: ");
      mileTwo = in.nextLine();

      System.out.println("Please enter finish time: ");
      finishTime = in.nextLine();





      splitTwo = subtractTimes(mileTwo, mileOne);
      splitThree = subtractTimes(finishTime, mileTwo);
      System.out.println();

      System.out.println("The Runners Name is: " + firstName + " " + lastName);
      System.out.println("Rastin's Time for the first mile is: " + mileOne);
      System.out.println("Rastin's Time for the second mile is: " + mileTwo);
      System.out.println("Rastin's Final Time is: " + finishTime);


   }

   private static String subtractTimes(String endTime, String startTime) {
      double endInSeconds = convertToSeconds(endTime);
      double startInSeconds = convertToSeconds(startTime);

      double diffInSeconds = endInSeconds - startInSeconds;

      return convertToTime(diffInSeconds);
   }

   private static String convertToTime(double diffInSeconds) {
      return String.format("%d:%06.3f", getMinutes(diffInSeconds), getSeconds(diffInSeconds));

   }

   private static double getSeconds(double diffInSeconds) {
      double seconds = (diffInSeconds%60);
      return seconds;
   }

   private static int getMinutes(double diffInSeconds) {
      int minutes = (int) (diffInSeconds/60);
      return minutes;
   }

   private static double convertToSeconds(String endTime) {
      int end = endTime.indexOf(":");
      String min = endTime.substring(0, end);
      String sec = endTime.substring(end+1);
      double seconds = Double.valueOf(sec);
      double minutes = Double.valueOf(min);
      return (minutes*60) + seconds;
      
    }
}