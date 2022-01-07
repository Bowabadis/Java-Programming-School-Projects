public class FullDeck2 {

    private static Card2[] deck = new Card2[52];
    public static void main(String[] args){
        for(int i = 0; i < 13; i++){
            deck[i] = new Card2(Suit.TheSuit.CLUBS, i+1);
        }
        for(int i = 13; i < 26; i++){
            deck[i] = new Card2(Suit.TheSuit.DIAMONDS, i-12);
        }
        for(int i = 26; i < 39; i++){
            deck[i] = new Card2(Suit.TheSuit.HEARTS, i-25);
        }
        for(int i = 39; i < 52; i++){
            deck[i] = new Card2(Suit.TheSuit.SPADES, i-38);
        }
        displayDeck();
    }
    public static void displayDeck()
    {
        System.out.println("Rank:       Suit:");
        for(int i = 0; i < deck.length; i++)
        {
            System.out.print(i + 1 + ": " + deck[i].getRank() + " of " + deck[i].getSuit().toString());
            System.out.println();
        }
    }

}
