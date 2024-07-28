/****************************************
*
* Student Name: Andrew Cart
* Date Due: 10/31/2023
* Date Submitted: 10/30/2023
* Program Name: Game: Heads or Tails
* Program Description: The program generates an integer of 0 or 1 depicting heads or tails and the asks the user to guess which one it is. I
* It repeats over and over again until the user guesses the right one.
*
*
****************************************/

package Package1;
import java.util.Scanner;
public class Homework5Question1 {
	
	public static void main(String[] args) {
		Scanner userinput = new Scanner(System.in);
		
		int userguess;
		
		int randomnumber;
		
		
		do {
			System.out.println("Guess head or tail? Enter 0 for head and 1 for tail:");
		     userguess = userinput.nextInt();
			
			 randomnumber = (int)(Math.random()*2);	
			 
			 if(userguess!= randomnumber) {
				 System.out.println("Sorry, it is a tail");
			 }
			 
			
		}while(userguess != randomnumber);
		
		System.out.println("Correct Guess");
	}

}
