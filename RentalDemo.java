
import java.util.Scanner;
public class RentalDemo {
    public static void main(String []args){
        Rental[] rentals = new Rental[3];
        for(int i =0; i<rentals.length; i++){
            rentals[i] = new Rental(contractNum(), rentalTime(), typesOfEquipment());
        }
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
        return num;

    }
    public static void calcPrice(Rental rental){
        System.out.println("You are renting '" + rental.equipment.getEquipmentName() + "' for " + rental.getHours() + " hours and "
                + rental.getMinutes() + " minutes\n" + rental.equipment.isLessonRequired() + "\n Total: $" + rental.getPrice() +"\nContract number: " +
                rental.getContractNum());
    }
}
