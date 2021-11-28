/*
    Rock-Paper-Scissor Game
    Rules:
        The familiar game of Rock, Paper, Scissors is played like this: at the same time,
        two players display one of three symbols: a rock, paper, or scissors. 
        A "Rock" beats 'Scissor' by breaking it, "Scissors" beat "Paper" by cutting it, 
        and "Paper" beats "Rock" by covering it. Whenever one player wins, the other loses.
*/

//Importing java packages to be used
import java.util.Scanner;
import java.util.Random;

public class JavaRockPaperScissorGame{
    public static void main(String[] args) {
        //Initalizing all required variables
        String computerNumber = "";
        boolean flag = false;
        //Controling the value of loop using flag. It'll be true until user ask to exit the game
        while(!flag){

            //Creating object to create a random numbers
            Random randomNumber = new Random();
            int randomNum = randomNumber.nextInt(3);

            //Initializing random numbers some values
            if(randomNum == 0){
                computerNumber = "r";
            }
            else if(randomNum == 1){
                computerNumber = "p";
            }
            else{
                computerNumber = "s";
            }

            //Taking input for user his choice
            Scanner input = new Scanner(System.in);
            System.out.print("Enter 'r' for 'Rock', 'p' for 'Paper', 's' for 'Scissor': ");
            String userNumber = input.next();

            //Checking for Win/Loss
            /*
            The equalsIgnoreCase() method of the String class compares two strings irrespective of the case (lower or upper)
            of the string. This method returns a boolean value, true or false
            */
            if(userNumber.equalsIgnoreCase("r")){
                if (computerNumber.equals("s")){
                    System.out.println("You Won! ");
                    System.out.println("Computer Entered "+ computerNumber + " and You Entered "+ userNumber);
                }
                else if (computerNumber.equals("p")){
                    System.out.println("You Loss! ");
                    System.out.println("Computer Entered "+ computerNumber + " and You Entered "+ userNumber);
                }
                else{
                    System.out.println("This is a Tie! ");
                    System.out.println("Computer Entered "+ computerNumber + " and You Entered "+ userNumber);
                }

            }

            else if(userNumber.equalsIgnoreCase("p")){
                if (computerNumber.equals("r")){
                    System.out.println("You Won! ");
                    System.out.println("Computer Entered "+ computerNumber + " and You Entered "+ userNumber);
                }
                else if (computerNumber.equals("s")){
                    System.out.println("You Loss! ");
                    System.out.println("Computer Entered "+ computerNumber + " and You Entered "+ userNumber);
                }
                else{
                    System.out.println("This is a Tie! ");
                    System.out.println("Computer Entered "+ computerNumber + " and You Entered "+ userNumber);
                }

            }

            else if(userNumber.equalsIgnoreCase("s")){
                if (computerNumber.equals("p")){
                    System.out.println("You Won! ");
                    System.out.println("Computer Entered "+ computerNumber + " and You Entered "+ userNumber);
                }
                else if (computerNumber.equals("r")){
                    System.out.println("You Loss! ");
                    System.out.println("Computer Entered "+ computerNumber + " and You Entered "+ userNumber);
                }
                else{
                    System.out.println("This is a Tie! ");
                    System.out.println("Computer Entered "+ computerNumber + " and You Entered "+ userNumber);
                }

            }

            //For invalid input case
            else{
                System.out.println("Invalid Input! Please Try again");
            }
            //If user enter no, loop'll be terminated
            System.out.print("Do you want to Play Again? Yes/No? ");
                    String choice = input.next();
                    if(choice.equalsIgnoreCase("No"))
                        flag = true;
        }
    }
}
