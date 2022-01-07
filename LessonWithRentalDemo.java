import java.util.Scanner;
public class LessonWithRentalDemo {
    public static void main(String []args){
        LessonWithRental[] rentals = new LessonWithRental[4];
        for(int i =0; i<rentals.length; i++){
            rentals[i] = new LessonWithRental(contractNum(), rentalTime(), contactNum(), typesOfEquipment());
        }
        for(int i =0; i<rentals.length; i++){
            calcPrice(rentals[i]);
        }
        display(rentals);
        for(int i =0; i<rentals.length; i++){
            System.out.println(rentals[i].getInstructor(rentals[i]));
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
    public static void display(Rental[] rental){
        Scanner input = new Scanner(System.in);
        boolean hasQuit = false;
        while(!hasQuit){
            System.out.println("Enter (Q) to quit\nWhat would you like to sort?\n(C)Contract Num   (P)Price   (E)Equipment Type");
            char c = input.nextLine().toUpperCase().charAt(0);
            sortContract(rental, c);
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
    public static void sortContract(Rental[] rental, char c){
        Rental temp;
        for(int i = 0; i < rental.length - 1; i++)
        {
            for(int x = 0; x < rental.length - 1 - i; x++)
            {
                if(c == 'P')
                {
                    if (rental[x].getPrice() > rental[x + 1].getPrice())
                    {
                        temp = rental[x];
                        rental[x] = rental[x + 1];
                        rental[x + 1] = temp;
                    }
                }
                else if(c == 'C')
                {
                    if (rental[x].getContractNum().compareTo(rental[x + 1].getContractNum()) > 0)
                    {
                        temp = rental[x];
                        rental[x] = rental[x + 1];
                        rental[x + 1] = temp;
                    }
                }
                else if(c == 'E')
                {
                    if (rental[x].getEquipmentType() > rental[x + 1].getEquipmentType())
                    {
                        temp = rental[x];
                        rental[x] = rental[x + 1];
                        rental[x + 1] = temp;
                    }
                }
            }
        }
    }

}
