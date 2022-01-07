public class CreateAliens {
    public static void main(String []args){
        Martian alien1 = new Martian();
        Jupiterian alien2 = new Jupiterian();
        display(alien1.toString());
        display(alien2.toString());
    }
    public static void display(String c){
        System.out.println(c);
    }
}
