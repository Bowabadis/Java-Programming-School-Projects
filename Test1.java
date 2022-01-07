public class Test1 {
    public static void main(String []args){
        int[] score = {1, 3, 5, 7, 9};
        int sum = 0;
        for(int i = 0; i<score.length; i++){
            score[i]++;
        }
        for(int i : score){
            System.out.println(i);
        }
    }
}
