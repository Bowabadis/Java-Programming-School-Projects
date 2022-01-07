import java.util.Random;

public class War3 {

    public static void main(String []args){
        FullDeck deck = new FullDeck();
        Card[] theDeck = deck.createDeck();
        theDeck = shuffle(theDeck);
        Card[] player = new Card[26];
        Card[] computer = new Card[26];
        for(int i =0; i<52; i++){
            if(i<26){
                player[i] = theDeck[i];
            } else {
                computer[i-26] = theDeck[i];
            }
        }
        int plrWin =0, comWin =0, tie = 0;
        String message1 = "Your", message2 = "The computer's";
        for(int i =0; i<26; i++){
            pickCard(player[i], message1);
            pickCard(computer[i], message2);
            if(computer[i].getNum()==player[i].getNum()){
                System.out.println("BOTH CARDS ARE EQUAL");
                tie++;
            } else {
                if(player[i].getNum()>computer[i].getNum()){
                    System.out.println("YOU WON");
                    plrWin++;
                } else {
                    System.out.println("THE COMPUTER WON");
                    comWin++;
                }
            }

        }
        System.out.println("You won " + plrWin +" times\nComputer won " + comWin+" times\nThere was " + tie +" tie(s)");
    }
    public static Card[] shuffle(Card[] array){
        int index;
        Card placeHolder;
        Random random = new Random();
        for (int i = array.length -1; i>0; i--){
            index = random.nextInt(i + 1);
            placeHolder = array[index];
            array[index] = array[i];
            array[i] = placeHolder;
        }
        return array;
    }

    public static void pickCard(Card cardPick, String msg){
        System.out.println(msg + " card is the " + cardPick.getRank()+" of " + cardPick.getSuit() + "\n---------------");
    }
}

