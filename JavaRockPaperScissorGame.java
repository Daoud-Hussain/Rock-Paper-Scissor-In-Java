/*
    Rock-Paper-Scissor Game
    Rules:
        The familiar game of Rock, Paper, Scissors is played like this: at the same time,
        two players display one of three symbols: a rock, paper, or scissors. 
        A "Rock" beats 'Scissor' by breaking it, "Scissors" beat "Paper" by cutting it, 
        and "Paper" beats "Rock" by covering it. Whenever one player wins, the other loses.
*/

import java.util.Scanner;
import java.util.Random;

public class JavaRockPaperScissorGame{
    public static void main(String[] args) {
        
        //Initalizing all required variables
        String computerNumber = "";
        int userScore = 0, compScore = 0;

        //Starting loop for 10 rounds
        for(int i = 1; i <= 10; i++){ 

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

            System.out.println("Round: " + i);
            //Taking choice of user as input
            Scanner input = new Scanner(System.in);
            System.out.print("Enter 'R' for 'Rock', 'P' for 'Paper', 'S' for 'Scissor': ");
            String userNumber = input.next();

            /*
            The equalsIgnoreCase() method of the String class compares two strings irrespective of the case (lower or upper)
            of the string. This method returns a boolean value, true or false
            */
            if(userNumber.equalsIgnoreCase("r")){
                if (computerNumber.equals("s")){
                    System.out.println("Computer Entered "+ computerNumber + " and You Entered "+ userNumber);
                    userScore += 1;           //Updating User Score as he won!
                    System.out.println();

                }
                else if (computerNumber.equals("p")){
                    System.out.println("Computer Entered "+ computerNumber + " and You Entered "+ userNumber);
                    compScore += 1;         //Updating Computer Score as he won!
                    System.out.println();
                }
                else{
                    System.out.println("Computer Entered "+ computerNumber + " and You Entered "+ userNumber);
                    System.out.println();
                }

            }

            else if(userNumber.equalsIgnoreCase("p")){
                if (computerNumber.equals("r")){
                    System.out.println("Computer Entered "+ computerNumber + " and You Entered "+ userNumber);
                    userScore += 1;           //Updating User Score as he won!
                    System.out.println();
                }
                else if (computerNumber.equals("s")){
                    System.out.println("Computer Entered "+ computerNumber + " and You Entered "+ userNumber);
                    compScore += 1;         //Updating Computer Score as he won!
                    System.out.println();
                }
                else{
                    System.out.println("Computer Entered "+ computerNumber + " and You Entered "+ userNumber);
                    System.out.println();
                }

            }

            else if(userNumber.equalsIgnoreCase("s")){
                if (computerNumber.equals("p")){
                    System.out.println("Computer Entered "+ computerNumber + " and You Entered "+ userNumber);
                    userScore += 1;           //Updating User Score as he won!
                    System.out.println();
                }
                else if (computerNumber.equals("r")){
                    System.out.println("Computer Entered "+ computerNumber + " and You Entered "+ userNumber);
                    compScore += 1;         //Updating computer Score as he won!
                    System.out.println();
                }
                else{
                    System.out.println("Computer Entered "+ computerNumber + " and You Entered "+ userNumber);
                    System.out.println();
                }

            }

            //For invalid input case
            else{
                System.out.println("Invalid Input! Please Try again");
                System.out.println();
            }
            if(i == 10){
              //Checking for Win/Loss
                if(userScore > compScore){
                    System.out.println("Congratulations! You Won.");
                    System.out.println("Computer Scored: "+ compScore + " and you Scored: "+ userScore);
                }
                else if(compScore > userScore){
                    System.out.println("You Loss. Try Again!");
                    System.out.println("Computer Scored: "+ compScore + " and you Scored: "+ userScore);
                } 
                else{
                    System.out.println("This is a Tye!");
                    System.out.println("Computer Scored: "+ compScore + " and you Scored: "+ userScore);
                }

                //Asking user if he want to play again
                System.out.print("Do you want to Play Again? Yes/No? ");
                    String choice = input.next();
                    System.out.println();
                    if(choice.equalsIgnoreCase("No")){
                        break;  
                    }
                    //If user want to play again, reinitialized the program to start again
                    else if(choice.equalsIgnoreCase("Yes")){
                        i=0;  
                        userScore = 0;
                        compScore = 0;
                    }
            }
            
        }

    }
}
