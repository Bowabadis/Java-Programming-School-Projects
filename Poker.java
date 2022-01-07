public class Poker extends CardGame{
    public Poker(){
        super();
        super.cardsDealt = 5;
    }
    public void displayDescription() {
        System.out.println("Poker is a family of card games in which players wager over which hand is best according to that specific game's rules");
    }
    public void deal() {
        System.out.println("Your cards are:");
        for(int i =0; i<cardsDealt; i++){
            System.out.println(deck[i].getRank() + " of "+ deck[i].getSuit());
        }
    }
}
