public class Bridge extends CardGame{
    public Bridge(){
        super();
        super.cardsDealt = 13;
    }
    public void displayDescription() {
        System.out.println("Bridge is a four-player partnership trick-taking game with thirteen tricks per deal");
    }
    public void deal() {
        System.out.println("Your cards are:");
        for(int i =0; i<cardsDealt; i++){
            System.out.println(deck[i].getRank() + " of "+ deck[i].getSuit());
        }
    }
}
