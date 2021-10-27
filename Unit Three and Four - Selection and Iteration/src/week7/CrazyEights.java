package week7;

import java.util.Scanner;

public class CrazyEights {

   private static final int NUM_SUITS = 4;
   private static final String HEARTS = "H";
   private static final String DIAMONDS = "D";
   private static final String CLUBS = "C";
   private static final String SPADES = "S";
   private static final double CARDS_PER_SUIT = 13;
   private static final String ACE = "A";
   private static final String JACK = "J";
   private static final String QUEEN = "Q";
   private static final String KING = "K";
   public static void main(String[] args) {
      int p1Points = 0, c1Points = 0, c2Points = 0;

      while (!gameOver(p1Points, c1Points, c2Points)) {
         String result = playRound();
         int firstDash = result.indexOf("-");
         int secondDash = result.indexOf("-", firstDash + 1);
         p1Points += Integer.parseInt(result.substring(0, firstDash));
         c1Points += Integer.parseInt(result.substring(firstDash + 1, secondDash));
         c2Points += Integer.parseInt(result.substring(secondDash + 1));

         System.out.println("Current Score: " + p1Points + " " + c1Points + " " + c2Points);
      }

   }

   private static String getCard() {
     return getFace() + getSuit();
   }

   private static String getSuit() {
      int suit = (int) (Math.random() * NUM_SUITS);

      if (suit == 0)
         return HEARTS;
      else if (suit == 1)
         return DIAMONDS;
      else if (suit == 2)
         return CLUBS;
      else
         return SPADES;

   }

   private static String getFace() {
      int suit = (int) (Math.random() * CARDS_PER_SUIT);
      if (suit >= 2 && suit <= 10)
         return suit + "";
      else if (suit == 1)
         return ACE;
      else if (suit == 11)
         return JACK;
      else if (suit == 12)
         return QUEEN;
      else
         return KING;

   }

   private static String playRound() {

      String playerHand = "";
      String c1Hand = "";
      String c2Hand = "";

      // create a for loop that executes five tomes and give each player a card each time through
      for (int i = 0; i < 5; i++ ){
         playerHand += getCard() + " ";
         c1Hand += getCard() + " ";
         c2Hand += getCard() + " ";

      }

      playerHand = playerHand.trim();
      c1Hand = c1Hand.trim();
      c2Hand = c2Hand.trim();

      String topCard = getCard(); // no eights
      Scanner in = new Scanner(System.in);
      // "7H 3D AC JS-9D"
      String temp = processPlayer(in, playerHand, topCard);
      playerHand = temp.substring(0, temp.indexOf("-"));
      topCard = temp.substring(temp.indexOf("-") + 1);
      temp = processComputer(c1Hand, topCard);
      c1Hand = temp.substring(0, temp.indexOf("-"));
      topCard = temp.substring(temp.indexOf("-") + 1);
      temp = processComputer(c2Hand, topCard);
      c2Hand = temp.substring(0, temp.indexOf("-"));
      topCard = temp.substring(temp.indexOf("-") + 1);

      return "37-0-12";
   }

   private static String processComputer(String c1Hand, String topCard) {
      return "-4D";
   }

   private static String processPlayer(Scanner in, String playerHand, String topCard) {
      
      boolean play = canPlay(playerHand, topCard);
      
      
      
      return "7H 3D 4C-2D";
   }

   private static boolean canPlay(String playerHand, String topCard) {
      // does the playerHand have the suit from topCard or the face or does the player have an 8


   }

   private static boolean gameOver(int p1Points, int c1Points, int c2Points) {
      return p1Points >= 100 || c1Points >= 100 || c2Points >= 100;
   }

}