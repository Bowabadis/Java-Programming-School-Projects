import java.util.Scanner;
public class SecretPhrase2 {
    public static void main(String []args){
        String[] phrase = {"Java Programming", "Summer Break", "No man is an island", "Very Secret Phrase", "Computer Science", "Arrays are cool", "Michigan Virtual", "This is an Unknown Phrase", "The Best Phrase", "Enjoy the Outdoors"};
        String[] hiddenPhrase = {"**** ***********", "****** *****", "** *** ** ** ******", "**** ****** ******", "******** *******", "****** *** ****", "******** *******", "**** ** ** ******* ******", "*** **** ******", "***** *** ********"};
        String capital ="";
        int capPosition = -1;
        String guess;
        int randomPos = (int)(Math.random() * phrase.length + 1);
        boolean hasChanged = false;
        Scanner input = new Scanner(System.in);
        System.out.println("The phrase is >> " + hiddenPhrase[randomPos]);
        while (true){
            System.out.println("Guess a missing letter >> ");
            guess = input.nextLine();
            char b = guess.toLowerCase().charAt(0);
            if(guess.length() == 1){
                for(int i = 0; i< phrase[randomPos].length(); i++){
                    char c = phrase[randomPos].charAt(i);
                    if(Character.isUpperCase(c) && Character.toLowerCase(c) == b){
                        c = Character.toUpperCase(c);
                        capital = Character.toString(c);//capital will be uppercase
                        capPosition = i;
                    }
                    c = Character.toLowerCase(c);
                    char d = hiddenPhrase[randomPos].charAt(i);
                    if(b == c && d == '*'){
                        hiddenPhrase[randomPos] = hiddenPhrase[randomPos].substring(0, (i))+c+hiddenPhrase[randomPos].substring(i+1);
                        hasChanged = true;
                    }
                }
                if(!hasChanged){
                    System.out.println(b + " is not in the phrase or is already in the phrase");
                }
                hasChanged = false;
            }
            if(capPosition>-1){
                hiddenPhrase[randomPos] = changeToUppercase(capital, capPosition, hiddenPhrase[randomPos]);
            }
            System.out.println(hiddenPhrase[randomPos]);
            if(phrase[randomPos].equals(hiddenPhrase[randomPos])){
                System.out.println("You guessed the secret phrase!");
                break;
            }
        }
    }
    public static String changeToUppercase(String word, int place, String phrase){
        phrase = phrase.substring(0, (place))+word+phrase.substring(place+1);
        return phrase;
    }
}
