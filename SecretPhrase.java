import java.util.Scanner;
public class SecretPhrase {
    public static void main(String []args){
        String phrase = "Java Programming";
        String hiddenPhrase = "**** ***********";
        String capital ="";
        int capPosition = -1;
        String guess;
        boolean hasChanged = false;
        Scanner input = new Scanner(System.in);
        System.out.println("The phrase is >> " + hiddenPhrase);
        while (true){
            System.out.println("Guess a missing letter >> ");
            guess = input.nextLine();
            char b = guess.toLowerCase().charAt(0);
            if(guess.length() == 1){
                for(int i = 0; i< phrase.length(); i++){
                    char c = phrase.charAt(i);
                    if(Character.isUpperCase(c) && Character.toLowerCase(c) == b){
                        c = Character.toUpperCase(c);
                        capital = Character.toString(c);//capital will be uppercase
                        capPosition = i;
                    }
                    c = Character.toLowerCase(c);
                    char d = hiddenPhrase.charAt(i);
                    if(b == c && d == '*'){
                        hiddenPhrase = hiddenPhrase.substring(0, (i))+c+hiddenPhrase.substring(i+1);
                        hasChanged = true;
                    }
                }
                if(!hasChanged){
                    System.out.println(b + " is not in the phrase or is already in the phrase");
                }
                hasChanged = false;
            }
            if(capPosition>-1){
                hiddenPhrase = changeToUppercase(capital, capPosition, hiddenPhrase);
            }
            System.out.println(hiddenPhrase);
            if(phrase.equals(hiddenPhrase)){
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

