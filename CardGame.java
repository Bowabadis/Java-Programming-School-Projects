import java.util.Random;
public abstract class CardGame {
    Card[] deck = new Card[52];
    int cardsDealt = 0;
    public CardGame(){
        for(int i = 0; i< deck.length; i++){
            if(i<13){
                deck[i] =  new Card((i+1), "Clubs");
            }
            if(i<26 && i>12){
                deck[i] =  new Card((i-12), "Hearts");
            }
            if(i<39 && i>25){
                deck[i] =  new Card((i-25), "Diamonds");
            }
            if(i>38){
                deck[i] =  new Card((i-38), "Spades");
            }
        }
        shuffle();
    }
    public void display(){
        for(Card a : deck){
            System.out.println(a.getRank()+" of "+a.getSuit());
        }
    }
    public void shuffle(){
        Random random = new Random();
        for (int i = 0; i < deck.length; i++) {
            int randomInt = random.nextInt(deck.length);
            Card temp = deck[randomInt];
            deck[randomInt] = deck[i];
            deck[i] = temp;
        }
    }
    public abstract void displayDescription();
    public abstract void deal();

}
