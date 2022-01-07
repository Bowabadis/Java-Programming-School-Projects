
import java.util.Scanner;
public class RentalDemo {
    public static void main(String []args){
        Rental[] rentals = new Rental[3];
        for(int i =0; i<rentals.length; i++){
            rentals[i] = new Rental(contractNum(), rentalTime(), contactNum(), typesOfEquipment());
        }
        SammysRentalPriceWithMethods.motto();
        for(int i =0; i<rentals.length; i++){
            calcPrice(rentals[i]);
        }
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
    public static void displayCompare(Rental rental){
        System.out.println("This object had a larger rental time of " + rental.getHours() + " hours and "
                + rental.getMinutes() + " minutes\nContract number: " +
                rental.getContractNum());
    }
    public static Rental largerRentTime(Rental rent1, Rental rent2){
        if(rent1.minutes>rent2.minutes){
            return rent1;
        } else {
            if(rent1.minutes<rent2.minutes){
                return rent2;
            } else {
                System.out.println("Values were the same, returning first object");
                return rent1;
            }
        }
    }
}
