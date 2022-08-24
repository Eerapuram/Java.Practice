package arrays;

public class MaxMin {
    public int max(int [] array) {
        int max = 0;

        for(int i=0; i<array.length; i++ ) {
            if(array[i]>max) {
                max = array[i];
            }
        }
        return max;
    }
    public int min(int [] array) {
        int min = array[0];

        for(int i=0; i<array.length; i++ ) {
            if(array[i]<min) {
                min = array[i];
            }
        }
        return min;
    }
    public static void main(String args[]) {
        int[] a = {4,6,2,8,0};
        MaxMin m = new MaxMin();
        System.out.println("Maximum value is::"+m.max(a));
        System.out.println("Minimum value is::"+m.min(a));
    }
}
