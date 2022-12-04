//guess the number game

public class Guess_the_number extends getInput{
    
    Guess_the_number(){}

    public int run(){

        int lower_range=0;
        int upper_range=0;
        int tries=0;
        int guess=0;
        int i=0;

        System.out.println("Guess the Number:");
        System.out.println("You will specify a range of numbers and how many chances you have to guess. You will be playing against the computer; therefore");
        System.out.println("the computer will randomly generate an integer within the range you give, and you will be entering guesses to try and guess that number");
        System.out.println("The constraint here is the number of guesses cannot be more than half the number of values in the range. For example, if therange is from 1-10,");
        System.out.println("the user can make at most 5 guesses. You will have the chosen number of guesses to correctly get the unknown number.");
        System.out.println(" ");
        System.out.println("---Enter the min number in the range the number must be an integer---");


        lower_range=getNum(-1000,1000);
        
        System.out.println("enter the maximum number in the range the number must be an integer");


        upper_range=getNum(lower_range,1000);


        System.out.println("The range of number is from "+lower_range+" to "+upper_range);
        // System.out.println(lower_range+"= The minimum "+upper_range+"=the maximum");
        
        int number = (int)(((Math.random()*upper_range-lower_range))+lower_range+lower_range/2);

        
      

        System.out.println("Enter the number of guesses (this will be the number of attempts you have to guess the unknown number");
        System.out.println("You must enter a positive integer. The number of guesses cannot be more than half the number of values in the range.");
        
        tries= getNum(0,upper_range-lower_range);

        
        
        System.out.println("You will have "+tries+" attemps to guess the unknown number");
        System.out.println("You are the guesser. The computer will now choose a number");
        System.out.println("The computer has chosen a number between "+lower_range+" to "+upper_range);
        System.out.println("");
        System.out.println("");
        System.out.println("Enter a guess for the unknown integer in range "+lower_range +" to "+ upper_range);

        int attempts=tries;
        for (i = 0; i < tries; i++) {
            

            guess =getNum(lower_range,upper_range);
            
            System.out.println("You guessed "+guess);
            
            
            if (number == guess) {
                System.out.println("Congratulations you won! you correctly guessed that the number was "+number);
                return 1;
                
            }
            else if (number != guess && i != tries - 1) {
              attempts=attempts-1;
              System.out.println("Your guess was incorrect. "+guess+" was not the number. Try again, you have "+attempts+" more tries");

              System.out.println("attemps="+attempts);
            }
        }
            
              System.out.println("Game Over. You lost agaist the computer. Better luck next time");
              return 0;
        
    }
  }