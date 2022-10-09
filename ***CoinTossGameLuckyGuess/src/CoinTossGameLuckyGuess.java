import java.util.Random;
import java.util.Scanner;

//since both have java.util/ at the beginning we could also use the following to include both
//import.java.util.*/ THE . AT THE END AND THE * IS IMPORTANT***

public class CoinTossGameLuckyGuess
{
    public static void main(String[] args)
    {
        Random randomGenerator =new Random();
        int r1=randomGenerator.nextInt();
        // any integer in the integer range

        int r2=randomGenerator.nextInt(100);
// in the range up to 100

        double r3=randomGenerator.nextDouble();

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);

        System.out.println(Math.random());

        int guess=(int)(100.0*Math.random())+1;
        System.out.println(guess);

        int x = (int)(Math.random()*((5-2)+1))+2;
        System.out.println(x);

// create a random integer called lucky
//Guess that will be a number between 1 and 25.
// Output the lucky Guess

        int luckyGuess=(int)(25*Math.random())+1;
        System.out.println("The lucky guess you randomly received is "+luckyGuess);
//this chooses a random number between 1 and 25.
//create another random integer called coin Toss to be a value between 1 and 2
//Create the Scanner and be sure to import the correct line
// Ask the user to enter in a value of 1 or 2 called valueChosen
//Use an if else statement to see if the random integer matches the value chosen
// if a match. say you win else say you lose

        int coinToss=(int)(2*Math.random())+1;
//chooses random number between 1 and 2


        Scanner kb=new Scanner(System.in);

        int valueChosen;
        System.out.print("Enter an integer value of 1 or 2 to represent a coin toss( 1 for Heads or 2 for Tails:");
        valueChosen=kb.nextInt();

        if(coinToss==valueChosen)
            System.out.println("You win. You have chosen the value that was tossed in the coin toss game.");
        else
            System.out.println("Sorry you lost. You did not choose the value of the coin that was tossed in the coin toss game");
// create a random integer called die to be a value between 1 and 6// using case and switch to switch the die value output what number was tossed with the die

        System.out.println("This will randomly simulate a toss of a die.");
        int die=(int)(6*Math.random())+1;
//chooses a random value between 1 and 6
        switch(die)
        {
            case 1:
            {
                System.out.println("The value tossed is 1.");
                break;
            }
            case 2:
            {
                System.out.println("The value tossed is 2.");
                break;
            }
            case 3:
            {
                System.out.println("The value tossed is 3.");
                break;
            }

            case 4:
            {
                System.out.println("The value tossed is 4.");
                break;
            }
            case 5:
            {
                System.out.println("The value tossed is 5.");
                break;
            }
            case 6:
            {
                System.out.println("The value tossed is 6.");
                break;
            }
            default:
            {
                System.out.println("INVALID... Should only be a value generated between 1 and 6");
            }}

//you can randomly generate a card using case and switch.
// the first will randomly choose a faceValue for a card 1 through 13 where 11 is Jack 12 is Queen and 13 is King. 1 is Ace
//the second case and switch is the suitValue for a card 1 is HEARTS, 
//2 is SPADES 3 is DIAMONDS 4 is CLUBS

        int faceValue=(int)(13*Math.random())+1;
//chooses random value between 1 and 13
        int suitValue=(int)(4*Math.random())+1;
//chooses random value between 1 and 4

        switch(faceValue)
        {
            case 1:
            {
                System.out.print("Ace of ");
                break;
            }
            case 2:
            {
                System.out.print("Two of ");
                break;
            }
            case 3:
            {
                System.out.print("Three of ");
                break;
            }
            case 4:
            {
                System.out.print("Four of ");
                break;
            }
            case 5:
            {
                System.out.print("Five of ");
                break;
            }
            case 6:
            {
                System.out.print("Six of ");
                break;
            }
            case 7:
            {
                System.out.print("Seven of ");
                break;
            }
            case 8:
            {
                System.out.print("Eight of ");
                break;
            }
            case 9:
            {
                System.out.print("Nine of ");
                break;
            }
            case 10:
            {
                System.out.print("Ten of ");
                break;
            }
            case 11:
            {
                System.out.print("Jack of ");
                break;
            }
            case 12:
            {
                System.out.print("Queen of ");
                break;
            }
            case 13:
            {
                System.out.print("King of ");
                break;
            }
            default:
                System.out.print("INVALID FaceValue for the card ");
        }
        switch(suitValue)
        {
            case 1:
            {
                System.out.println("HEARTS");
                break;
            }
            case 2:
            {
                System.out.println("SPADES");
                break;
            }
            case 3:
            {
                System.out.println("DIAMONDS");
                break;
            }
            case 4:
            {
                System.out.println("CLUBS");
                break;
            }
            default:
                System.out.println("INVALID suitValue for the card");
        }}}

/* * -530376153590.99438213725387050.7623847202218866933
 * The lucky guess you randomly received is 12
 * Enter an integer value of 1 or 2 to represent a coin toss
 * ( 1 for Heads or 2 for Tails:2
 * Sorry you lost. You did not choose the value of the coin that was tossed in the coin toss game
*/
	