import java.util.InputMismatchException;
import java.util.Scanner;
public class QuizWithExceptionsCaught {
    public static void main(String[] args)
    {
        String[] questions =
                {"How  many players on a basketball team?\nA. 5  B.  6   C. 7",
                        "How many points for a basket?\nA. 1   B. 2  C. 3",
                        "How many points for a free throw?\nA. 1  B. 2  C. 3",
                        "You can earn three points when you\nA. Make any basket\nB. Throw from inside the three-point line\nC. Throw from outside the three-point line",
                        "What is the name of Detroit's NBA team?\nA. Pistons  B. Lions  C. Tigers",
                        "Who may ask a referee about a rule interpretation?\nA. Team captain\"B. A player who receives a foul\nC. Any player on the floor",
                        "Suppose a shooter from team A makes a basket\nin team B's basket. Who gets credit for the basket?\nA. The player who made the basket\nB. The last player from team B who made a basket\nC. The player from team B nearest the shooter",
                        "A basketball game starts with a\nA. Jump ball\nB. Throw in from the side\nC. Throw in from the end",
                        "Bouncing a ball while walking is\nA. Slobbering  B. Dribbling  C. Dabbling",
                        "Taking steps with the ball without dribbling is called\nA. Stepping  B. Dunking   C. Travelling"};
        char[] answers = {'A', 'B', 'A', 'C', 'A', 'A', 'C', 'A', 'B', 'C'};
        char ans = ' ';
        int x, correct = 0;
        String entry;
        boolean isValid;
        Scanner input = new Scanner(System.in);
        for (x = 0; x < questions.length; ++x)
        {
            isValid = false;
            while (!isValid)
            {
                try {
                    System.out.println(questions[x]);
                    entry = input.nextLine();
                    ans = entry.toUpperCase().charAt(0);
                    if (ans == 'A' || ans == 'B' || ans == 'C') {
                        isValid = true;
                    }else {
                        throw new InputMismatchException();
                    }
                } catch(InputMismatchException e){
                    System.out.println("Enter a valid answer");
                } catch(StringIndexOutOfBoundsException e){
                    System.out.println("Enter a valid answer");
                }
            }
            if (ans == answers[x])
            {
                ++correct;
                System.out.println("Correct!");
            } else
            {
                System.out.println("The correct answer was " + answers[x]);
            }
        }
        System.out.println("You got " + correct + " right and\n" + (questions.length - correct) + " wrong");

    }
}
