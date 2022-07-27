// Importing the Random library
import java.util.Random;

class Magic8Ball {

    public static void main(String[] args) {

        // Creating a random number generator
        Random randomGenerator = new Random();

        // Generate a number between 1 and 6
        int randomInt = randomGenerator.nextInt(20) + 1;

        //System.out.println(randomInt);
        // Switch
        switch (randomInt) {
            case 1 -> System.out.println("It is certain.");
            case 2 -> System.out.println("As I see it, yes.");
            case 3 -> System.out.println("Reply hazy, try again.");
            case 4 -> System.out.println("Don't count on it.");
            case 5 -> System.out.println("It is decidedly so.");
            case 6 -> System.out.println("Most likely.");
            case 7 -> System.out.println("Ask again later.");
            case 8 -> System.out.println("My reply is no.");
            case 9 -> System.out.println("Without a doubt.");
            case 10 -> System.out.println("Outlook good.");
            case 11 -> System.out.println("Better not tell you now.");
            case 12 -> System.out.println("My sources say no.");
            case 13 -> System.out.println("Yes definitely.");
            case 14 -> System.out.println("Yes.");
            case 15 -> System.out.println("Cannot predict now.");
            case 16 -> System.out.println("Outlook not so good.");
            case 17 -> System.out.println("You may rely on it.");
            case 18 -> System.out.println("Signs point to yes.");
            case 19 -> System.out.println("Concentrate and ask again.");
            case 20 -> System.out.println("Very doubtful.");
            default -> System.out.println("There must be an error. Try again.");
        }

    }

}

