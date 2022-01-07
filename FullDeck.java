public class FullDeck {
    public Card[] createDeck(){
        Card[] card = new Card[52];
        for (int i = 0; i<52; i++){
            card[i] = new Card();
        }
        for(int i = 0; i < 13; i++){
            card[i].setNum(i +1);
            card[i].setSuit("Clubs");
        }
        for(int i = 13; i < 26; i++){
            card[i].setNum(i - 12);
            card[i].setSuit("Diamonds");
        }
        for(int i = 26; i < 39; i++){
            card[i].setNum(i - 25);
            card[i].setSuit("Hearts");
        }
        for(int i = 39; i < 52; i++){
            card[i].setNum(i - 38);
            card[i].setSuit("Spades");
        }
        return card;
    }

}
