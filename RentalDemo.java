
import java.util.Scanner;
public class RentalDemo {
    public static void main(String []args){
        Rental rental1 = new Rental(contractNum(), rentalTime(), contactPhone());
        Rental rental2 = new Rental(contractNum(), rentalTime(), contactPhone());
        Rental rental3 = new Rental(contractNum(), rentalTime(), contactPhone());
        SammysRentalPriceWithMethods.motto();
        calcPrice(rental1);
        calcPrice(rental2);
        calcPrice(rental3);
        for (int i = 0; i < rental3.getHours(); ++i){
            System.out.println("coupon good for 10 percent off next rental");
        }
        displayCompare(largerRentTime(rental1, rental2));
        displayCompare(largerRentTime(rental1, rental3));
        displayCompare(largerRentTime(rental3, rental2));
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
    public static String contactPhone(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a phone number >> ");
        String num = input.nextLine();
        return num;

    }
    public static void calcPrice(Rental rental){
        System.out.println("You are renting for " + rental.getHours() + " hours and "
                + rental.getMinutes() + " minutes for a total of \n $" + rental.getPrice() + "\nPhone Number: " + rental.getContractPhone() +
                "\nContract number: " +
                rental.getContractNum());
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
