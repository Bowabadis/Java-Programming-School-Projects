public class Test {
    public static void insertionSort(int array[]) {
        for (int a = 1; a < array.length; a++) {
            int temp = array[a];
            int b = a-1;
            while ( (b > -1) && ( array [b] > temp ) ) {
                array [b+1] = array [b];
                b--;
            }
            array[b+1] = temp;
        }
    }

    public static void main(String a[]){
        int[] arr1 = {9,14,3,2,43,11,58,22};
        System.out.println("Before Insertion Sort");
        for(int i:arr1){
            System.out.print(i+" ");
        }
        System.out.println(-1/3);

        insertionSort(arr1);//sorting array using insertion sort

        System.out.println("After Insertion Sort");
        for(int i:arr1){
            System.out.print(i+" ");
        }
    }
}
