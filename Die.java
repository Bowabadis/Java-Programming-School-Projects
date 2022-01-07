public class Die {
    int value;

    Die() {
        value = (int)(Math.random() * 6) + 1;
    }

    public int returnValue(){
        return value;
    }
}
