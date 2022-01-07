import java.util.InputMismatchException;
import java.util.Scanner;
public class RandomGuess4
{
    public static void main(String[] args)
    {
        int number = (1 + (int)(Math.random() * 10));
        int guess = 0;
        Scanner input = new Scanner(System.in);

        while(guess != number){
            boolean valid = false;
            while(!valid) {
                try {
                    System.out.println("Enter a number 1-10");
                    String a = input.nextLine();
                    guess = Integer.parseInt(a);
                    if(guess>10 || guess<0) {
                        throw new InputMismatchException();
                    } else {
                        valid = true;
                    }
                }
                catch (InputMismatchException e) {
                    System.out.println("Please enter a valid integer");
                }
                catch (Exception e){
                    System.out.println("Please enter a valid integer");
                }
            }
            if(guess > number)
                System.out.println("Your guess was too high");
            if(guess < number)
                System.out.println("Your guess was too low");
        }
        System.out.println("Your guess was correct");
    }
}