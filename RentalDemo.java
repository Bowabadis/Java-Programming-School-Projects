
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
public class RentalDemo {
    public static void main(String []args){
        Rental[] rentals = new Rental[8];
        for(int i =0; i<rentals.length; i++){
            rentals[i] = new Rental(contractNum(), rentalTime(), contactNum(), typesOfEquipment());
            }
        //SammysRentalPriceWithMethods.motto();
        for(int i =0; i<rentals.length; i++){
            calcPrice(rentals[i]);
        }
        display(rentals);
    }
    public static int rentalTime() {
        int rentTime = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter how long (in minutes) you are renting sports equipment >> ");
        rentTime = input.nextInt();
        while(rentTime<60 || rentTime > 7200){
            System.out.println("Invaild Number, minutes must be at least 60 and no more than 7200\nEnter how long (in minutes) you are renting sports equipment >> ");
            rentTime = input.nextInt();
        }
        return rentTime;
    }
    public static String contractNum(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter contract number >> ");
        String num = input.nextLine();
        return num;

    }
    public static String contactNum(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter contact number >> ");
        String num = input.nextLine();
        return num;

    }
    public static int typesOfEquipment(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an equipment type\n1: Personal Watercraft \n2: Pontoon Boat \n3: Rowboat \n4: Canoe \n5: Kayak \n6: Beach Chair \n7: Umbrella \n8: Other >> ");
        int num = input.nextInt();
        num = num -1;
        return num;

    }
    public static void calcPrice(Rental rental){
        System.out.println("You are renting '" + rental.getTypesOfEquipment() + "' for " + rental.getHours() + " hours and "
                + rental.getMinutes() + " minutes for a total of \n $" + rental.getPrice() +"\nContract number: " +
                rental.getContractNum() + "\nContact number: " + rental.getContactPhone());
    }
    public static void display(Rental[] rental){
        Scanner input = new Scanner(System.in);
        boolean hasQuit = false;
        while(!hasQuit){
            System.out.println("Enter (Q) to quit\nWhat would you like to sort?\n(C)Contract Num   (P)Price   (E)Equipment Type");
            char c = input.nextLine().toUpperCase().charAt(0);
            if(c == 'C'){
                sortContract(rental);
            } else if(c == 'P'){
                sortPrice(rental);
            } else if(c == 'E'){
                sortEquipmentType(rental);
            }
            if(c == 'Q'){
                hasQuit = true;
            } else{
                for(int i =0; i<rental.length; i++){
                    System.out.println("Contract #"+rental[i].getContractNum()+": Renting "+rental[i].getTypesOfEquipment()+" for "+rental[i].getHours()+" hours and "+rental[i].getMinutes()+
                            " minutes for $"+rental[i].getPrice()+" Contact: "+rental[i].getContactPhone());
                }
            }
        }
    }
    public static void sortContract(Rental[] rental){
        for (int a = 1; a < rental.length; a++) {
            Rental temp = rental[a];
            Rental b = rental[a-1];
            if (b.getContractNum().compareTo(temp.getContractNum()) > 0) {
                rental[a] = rental [a-1];
                rental[a-1] = temp;
            }
        }
    }
    public static void sortPrice(Rental[] rental){
        for (int a = 1; a < rental.length; a++) {
            Rental temp = rental[a];
            Rental b = rental[a-1];
            if (b.getPrice()>temp.getPrice()) {
                rental[a] = rental [a-1];
                rental[a-1] = temp;
            }
        }
    }
    public static void sortEquipmentType(Rental[] rental){
        for (int a = 1; a < rental.length; a++) {
            Rental temp = rental[a];
            Rental b = rental[a-1];
            if (b.getEquipmentType()>temp.getEquipmentType()) {
                rental[a] = rental [a-1];
                rental[a-1] = temp;
            }
        }
    }

}
