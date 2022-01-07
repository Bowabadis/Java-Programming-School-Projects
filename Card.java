public class Card {
    String suit;
    int cardNum;
    String rank;
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
    public String getSuit(){
        return suit;
    }
    public void setSuit(String suit){
        this.suit = suit;
    }
}

