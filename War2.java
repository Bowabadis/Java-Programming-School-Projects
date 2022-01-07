public class War2 {

    public static void main(String []args){
        Card card1 = new Card();
        Card card2 = new Card();
        card1 = randomCard(pickSuit());
        card2 = randomCard(pickSuit());
        String message1 = "Your", message2 = "The computer's";
        if(card1.getNum()==card2.getNum() && card1.getSuit()==card2.getSuit() && card1.getSuit() == "Clubs"){
            card2.setSuit("Spades");
        } else if(card1.getNum()==card2.getNum() && card1.getSuit()==card2.getSuit()){
            card2.setSuit("Clubs");
        }
        pickCard(card1, message1);
        pickCard(card2, message2);
        if(card1.getNum()==card2.getNum()){
            System.out.println("BOTH CARDS ARE EQUAL");
        } else {
            if(card1.getNum()>card2.getNum()){
                System.out.println("YOU WON");
            } else {
                System.out.println("THE COMPUTER WON");
            }
        }


    }


    public static void pickCard(Card cardPick, String msg){
        System.out.println(msg + " card is the " + cardPick.getRank()+" of " + cardPick.getSuit() + "\n---------------");
    }
    public static Card randomCard(String suit){
        Card pickCard = new Card();
        int cardNum = ((int)(Math.random() * 100) % 13 +1);
        pickCard.setNum(cardNum);
        pickCard.setSuit(suit);
        return pickCard;
    }
    public static String pickSuit(){
        int randNum = ((int)(Math.random() * 100) % 4 +1);
        String suit = "";
        switch (randNum){
            case 1: suit = "Spades"; break;
            case 2: suit = "Diamonds"; break;
            case 3: suit = "Hearts"; break;
            case 4: suit = "Clubs"; break;
        }
        return suit;
    }
}


