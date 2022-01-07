public class TestLoadedDie {
    public static void main(String []args){
        int firstDieWins = 0;
        int secondDieWins = 0;
        int tie = 0;
        Die d1 = new Die();
        Die d2 = new Die();
        for(int i =0; i<1000; i++){
            d1.roll();
            d2.roll();
            if(d1.returnValue()>d2.returnValue()){
                firstDieWins++;
            } else if(d1.returnValue()==d2.returnValue()){
                tie++;
            } else {
                secondDieWins++;
            }
        }
        System.out.println("With two regular dice, the first die won "+firstDieWins+" times out of 1000");
        System.out.println("Die 1 wins: "+firstDieWins+" | Die 2 wins: "+secondDieWins+" | Ties: "+tie);
        System.out.println();
        Die d3 = new Die();
        LoadedDie d4 = new LoadedDie();
        firstDieWins = 0;
        tie =0;
        secondDieWins = 0;
        for(int i =0; i<1000; i++){
            d3.roll();
            d4.roll();
            if(d3.returnValue()>d4.returnValue()){
                firstDieWins++;
            } else if(d3.returnValue()==d4.returnValue()){
                tie++;
            } else {
                secondDieWins++;
            }
        }
        System.out.println("With one die and one loaded die, the first die won "+firstDieWins+" times out of 1000");
        System.out.println("Die 1 wins: "+firstDieWins+" | Loaded Die wins: "+secondDieWins+" | Ties: "+tie);
    }
}
