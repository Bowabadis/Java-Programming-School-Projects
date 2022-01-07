
import java.util.Scanner;
public class SammysRentalPriceWithMethods {
    public static void main(String[] args){
        int rentalTime = rentalTime();
        motto();
        calcPrice(rentalTime);
    }
    public static int rentalTime(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter how long (in minutes) you are renting sports equipment >> ");
        int rentTime = input.nextInt();
        return rentTime;
    }
    public static void motto(){
        System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
        System.out.println("S  Sammy's makes it fun in the sun  S");
        System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
    }
    public static void calcPrice(int time){
        int hours = time/60;
        int minutes = time%60;
        int hoursMoney = hours*40;
        int totalPrice = hoursMoney+minutes;
        System.out.println("You are renting for " + hours + " hours and "
                + minutes + " minutes for a total of $" + totalPrice);
    }

}

