public class Die {

    protected int value;

    Die() {
        value = (int)(Math.random() * 6) + 1;
    }
    public void roll(){
        value = (int)(Math.random() * 6) + 1;
    }

    public int returnValue(){
        return value;
    }
}
