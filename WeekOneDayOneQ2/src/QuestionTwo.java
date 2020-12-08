import java.util.Scanner;

public class QuestionTwo {
	public static void main(String[] args) {
		int randomNumber = (int) (Math.random() * (100 - 1)) + 1;
	    int lowLimit = randomNumber - 10;
	    int upperLimit = randomNumber + 10;
	    int attemptsNum = 0;
	    boolean guessedRight = false;
	    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Guess a number between 1 and 100");

	    String input = myObj.nextLine();  // Read user input
	    int realGuess = Integer.parseInt(input);

	    while (attemptsNum < 4 && realGuess  <= 100 && realGuess >= 1 ) {
	        if(realGuess  <= upperLimit && realGuess >= lowLimit ) {
	              System.out.println("Close enough! The answer is " + randomNumber);
	              guessedRight = true;
	              break;
	        } 
	        else {
	          System.out.println("Try Again.");
	          attemptsNum++;
	          input = myObj.nextLine();
	        }
	      }
	    	if(!guessedRight) {
	      System.out.println ("Sorry! The number was " + randomNumber);
	    	}
	  }
	
}
