public class Card2 {
    int cardNum;
    String rank;
    Suit.TheSuit suit;
    Card2(Suit.TheSuit suit, int num){
        this.suit = suit;
        setNum(num);
    }
    public int getNum(){
        return cardNum;
    }
    public void setNum(int num){
        this.cardNum = num;
        switch (num){
            case 1: rank = "Ace"; break;
            case 11: rank = "Jack";  break;
            case 12: rank = "Queen"; break;
            case 13: rank = "King"; break;
            default: rank = Integer.toString(num);
        }
    }
    public String getRank(){
        return rank;
    }
    public Suit.TheSuit getSuit(){
        return suit;
    }
    public void setSuit(String enteredSuit){
        enteredSuit = enteredSuit.toUpperCase();
        suit = Suit.TheSuit.valueOf(enteredSuit);
    }
}
