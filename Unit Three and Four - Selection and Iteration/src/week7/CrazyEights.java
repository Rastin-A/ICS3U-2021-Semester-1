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
      playRound();
   }
   private static String getCard ()
   {
     return getFace () + getSuit ();
   }
   

   private static String getSuit ()
  {
    int suit = (int) (Math.random () * NUM_SUITS);

    if (suit == 0)
      return HEARTS;
    else if (suit == 1)
      return DIAMONDS;
    else if (suit == 2)
      return CLUBS;
    else
      return SPADES;

  }

  private static String getFace ()
  {
    int suit = (int) (Math.random () * CARDS_PER_SUIT);
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

  private static String playRound ()
  {

    String playerHand = "";
    String c1Hand = "";
    String c2Hand = "";

    // create a for loop that executes five times and give each player a card each time through
    for (int i = 0; i < 5; i++)
      {
	playerHand += getCard () + " ";
	c1Hand += getCard () + " ";
	c2Hand += getCard () + " ";

      }

    playerHand = playerHand.trim ();
    c1Hand = c1Hand.trim ();
    c2Hand = c2Hand.trim ();

    String topCard = getCard ();	// no eights
    Scanner in = new Scanner (System.in);
    //
    String temp = "";
    boolean emptyHand = false;
    while (!emptyHand){
      temp = processPlayer (in, playerHand, topCard);
    playerHand = temp.substring (0, temp.indexOf ("-"));
    topCard = temp.substring (temp.indexOf ("-") + 1);
    if (playerHand.equals (""))
      {
	emptyHand = true;
      }
    temp = processComputer (c1Hand, topCard);
    c1Hand = temp.substring (0, temp.indexOf ("-"));
    topCard = temp.substring (temp.indexOf ("-") + 1);
    if (c1Hand.equals (""))
      {
	emptyHand = true;
      }
    temp = processComputer (c2Hand, topCard);
    c2Hand = temp.substring (0, temp.indexOf ("-"));
    topCard = temp.substring (temp.indexOf ("-") + 1);
    if (c2Hand.equals (""))
      {
	emptyHand = true;
      }
    }
      return playerHand + "-" + c1Hand + "-" + c2Hand;
  }

  private static String processComputer (String c1Hand, String topCard)
  {
    String topCardSuit = topCard.substring (topCard.length () - 1);
    String topCardFace = topCard.substring (0, topCard.length () - 1);
      if (c1Hand.contains (topCardSuit))
	  {
	  String currentCard = "";
	  String temp = c1Hand; while (temp.length () != 0)
	  {
	  Boolean isSpace = false; currentCard = ""; while (!isSpace)
	  {
	  if (temp.length () != 0)
	  {
	  if (temp.substring (0, 1).equals (" "))
	  {
	  temp = temp.substring (1); isSpace = true;}
	  else
	  {
	  currentCard += temp.substring (0, 1);
	  temp = temp.substring (1);}
	  }
	  else
	  {
	  isSpace = true;}
	  }
	  if (currentCard.substring (0, currentCard.length () - 1).
	      equals (topCardSuit))
	  {
	      System.out.println("The Computer played a card");
	  c1Hand = c1Hand.replace (currentCard, "");
	      topCard = currentCard;
	  }
	  }
	  } else if (c1Hand.contains (topCardFace)) {
	  String currentCard = "";
	  String temp = c1Hand; while (temp.length () != 0)
	  {
	  Boolean isSpace = false; currentCard = ""; while (!isSpace)
	  {
	  if (temp.length () != 0)
	  {
	  if (temp.substring (0, 1).equals (" "))
	  {
	  temp = temp.substring (1); isSpace = true;}
	  else
	  {
	  currentCard += temp.substring (0, 1);
	  temp = temp.substring (1);}
	  }
	  else
	  {
	  isSpace = true;}
	  }
	  if (currentCard.substring (0, currentCard.length () - 1).
	      equals (topCardFace))
	  {
	      System.out.println("The Computer played a card");
	  c1Hand = c1Hand.replace (currentCard, "");
	      topCard = currentCard;
	  }
	  }
	  } else if (c1Hand.contains("8")) {
	      String currentCard = "";
	  String temp = c1Hand; while (temp.length () != 0)
	  {
	  Boolean isSpace = false; currentCard = ""; while (!isSpace)
	  {
	  if (temp.length () != 0)
	  {
	  if (temp.substring (0, 1).equals (" "))
	  {
	  temp = temp.substring (1); isSpace = true;}
	  else
	  {
	  currentCard += temp.substring (0, 1);
	  temp = temp.substring (1);}
	  }
	  else
	  {
	  isSpace = true;}
	  }
	  if (c1Hand.contains("S")) {
	          System.out.println("The Computer played a card");
	          c1Hand = c1Hand.replace (currentCard, "");
	          topCard = "8S";
	      } else if (c1Hand.contains("C")) {
	          System.out.println("The Computer played a card");
	          c1Hand = c1Hand.replace (currentCard, "");
	          topCard = "8C";
	      } else if (c1Hand.contains("H")) {
	          System.out.println("The Computer played a card");
	          c1Hand = c1Hand.replace (currentCard, "");
	          topCard = "8H";
	      } else {
	          System.out.println("The Computer played a card");
	          c1Hand = c1Hand.replace (currentCard, "");
	          topCard = "8D";
	      }
	  }} else {
	      int numCards = 0;
	  String temp = c1Hand; while (temp.length () != 0)
	  {
	  if (temp.substring (0, 1).equals (" "))
	  {
	  numCards++; temp = temp.substring (1);}
	  else
	  {
	  temp = temp.substring (1);}
	  }
	  if (numCards < 5)
	  {
	  c1Hand += " " + getCard ();
	  System.out.println ("The Computer drew a card");} else {
	      System.out.println ("The Computer skipped a round");
	  }
	  }
	  return c1Hand + "-" + topCard;
	  }


   private static String processPlayer (Scanner in, String playerHand, String topCard)
	  {
	  System.out.println ("The Top Card is: " + topCard);
	  System.out.println ("Your hand is: " + playerHand);
	  boolean play = canPlay (playerHand, topCard); if (play)
	  {
	  System.out.println ("Choose which card you would like to play: ");
	   String input = in.next ().trim ().toUpperCase ();
	      if (playerHand.contains (input))
	   {
	      if (input.substring (0, input.length () - 1).equals (topCard.substring (0, topCard.length () - 1)) || input.substring (input.length () -1).equals (topCard.substring (topCard.length () -1)))
	  {
	      playerHand = playerHand.replace (input, "").trim ();
	      topCard = input;
	      System.out.println ("The Top Card is now: " + topCard + " and your hand is: " + playerHand);}
	  else
	      if (input.substring (0, input.length () - 1).equals ("8"))
	  {
	  playerHand = playerHand.replace (input, "").trim ();
	  topCard = "8" + crazySuit (in);
	  System.out.println ("The Top Card is now: " + topCard + " and your hand is: " + playerHand);}
	  else
	  {
	  System.out.println ("You can't play that card, try again.");
	  processPlayer (in, playerHand, topCard);}
	  }
	  else
	  {
	  System.out.println ("You don't have that card, try again.");
	  processPlayer (in, playerHand, topCard);}
	  }
	  else
	  {
	  System.out.println ("You don't have any playable cards");
	  int numCards = 0;
	  String temp = playerHand; while (temp.length () != 0)
	  {
	      if (temp.substring (0, 1).equals (" "))
	  {
	         numCards++; temp = temp.substring (1);}
	  else
	  {
	         temp = temp.substring (1);}
	  }
	      if (numCards < 5)
	  {
	         playerHand += " " + getCard ();
	         System.out.println ("You drew a card and your hand is now: " + playerHand);
         }
	  }

	  return playerHand + "-" + topCard;
   }

   private static String crazySuit (Scanner in)
	  {
	  System. out.println ("What suit would you like to make the top card?: ");
	  String input = in.next ().trim ().toUpperCase ();
	  if (input.equals ("S") || input.equals ("C") || input.equals ("H") || input.equals ("D"))
	  {
	  return input;}
	  else
	  {
	  System.out.println ("That is not a valid suit, try again");
	  input = crazySuit (in);
   }
	  return input;
   }


      private static boolean canPlay (String playerHand, String topCard)
      {
      // does the playerHand have the suit from topCard or the face or does the player have an 8
      int index = 0;
      String currentCard = ""; while (playerHand.length () != 0)
      {
      Boolean isSpace = false; currentCard = ""; while (!isSpace)
      {
      if (playerHand.length () != 0)
      {
      if (playerHand.substring (0, 1).equals (" "))
      {
      isSpace = true;}
      else
      {
      currentCard += playerHand.substring (0, 1);
      playerHand = playerHand.substring (1); index++;}
      }
      else
      {
      isSpace = true;
   }
      }
      if (currentCard.substring (currentCard.length () - 1).equals (topCard.substring (topCard.length () - 1)))
      {
      return true;}
      if (currentCard.substring (0, 1).equals ("8")) {
      return true;
}
      index = 0;
      }
      if (currentCard.substring (0, 1).equals ("8"))
      {
      return true;
      }
      return false;
   }
   

   private static boolean gameOver(int p1Points, int c1Points, int c2Points) {
      return p1Points >= 100 || c1Points >= 100 || c2Points >= 100;
   }
}
 
