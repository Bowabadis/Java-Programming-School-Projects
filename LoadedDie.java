public class LoadedDie extends Die{
    public LoadedDie(){
        while(true){
            if(super.value == 1){
                super.value = (int)(Math.random() * 6) + 1;
            } else {
                break;
            }
        }
    }
    @Override
    public void roll(){
        while(true){
            if(super.value == 1){
                super.value = (int)(Math.random() * 6) + 1;
            } else {
                break;
            }
        }
    }
}
