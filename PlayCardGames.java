public class PlayCardGames {
    public static void main(String []args){
        System.out.println("Poker Game");
        Poker g1 = new Poker();
        g1.displayDescription();
        System.out.println("Dealing "+g1.cardsDealt+" cards");
        g1.deal();

        System.out.println("\nBridge Game");
        Bridge g2 = new Bridge();
        g2.displayDescription();
        System.out.println("Dealing "+g2.cardsDealt+" cards");
        g2.deal();
    }
}
