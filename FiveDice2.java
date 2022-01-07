public class FiveDice2 {
    public static void main(String []args){
        int[] plrDice = new int[5];
        int[] comDice = new int[5];
        for(int i =0; i<5; i++){
            Die dice1 = new Die();
            plrDice[i] = dice1.returnValue();
            Die dice2 = new Die();
            comDice[i] = dice2.returnValue();
        }
        System.out.print("You rolled these 5 numbers: ");
        for(int i =0; i<5; i++){
            System.out.print(plrDice[i] + " ");
        }
        System.out.println();
        System.out.print("The computer rolled these 5 numbers: ");
        for(int i =0; i<5; i++){
            System.out.print(comDice[i] + " ");
        }
        System.out.println();
        int plrOfAKind = AmountOfAKind(plrDice);
        int compOfAKind = AmountOfAKind(comDice);
        switch (plrOfAKind){
            case 1: System.out.println("You didn't have any of a kind"); break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6: System.out.println("You have "+plrOfAKind+" of a kind"); break;
        }
        switch (compOfAKind){
            case 1: System.out.println("The computer doesn't have any of a kind"); break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6: System.out.println("Computer has "+compOfAKind+" of a kind"); break;
        }
        if(plrOfAKind > compOfAKind){
            System.out.println("You win");
        } else if(plrOfAKind < compOfAKind){
            System.out.println("Computer wins");
        } else {
            System.out.println("It's a draw");
        }
    }

    public static int AmountOfAKind(int[] array){
        int ofAKind = 1;
        int[] diceNumCount = {0, 0, 0, 0, 0, 0};
        for(int i =0; i<5; i++){
            diceNumCount[array[i]-1]++;
        }
        int lastDiceNumCount = 0;
        for(int i =0; i<6; i++){
            if(diceNumCount[i] > lastDiceNumCount){
                lastDiceNumCount = diceNumCount[i];
                ofAKind = diceNumCount[i];
            }
        }
        return ofAKind;
    }
}
