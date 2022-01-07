public abstract class Alien {
    protected int eyes;
    protected int arms;
    protected String name;
    public Alien(int e, int a, String n){
        eyes = e;
        arms = a;
        name = n;
    }
    public String toString(){
        return "Alien named: "+name+" has "+eyes+" eyes and "+arms+" arms";
    }
}
