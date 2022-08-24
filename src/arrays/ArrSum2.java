package arrays;

public class ArrSum2 {
    static void value(int array[],int a)
    {
        for(int i =0;i < array.length; i++){
            for(int j = i+1; j<array.length;j++){
                if(array[i]+array[j] == a)
                {
                    System.out.println(array[i]+" + "+array[j]+" = "+a);
                }
            }
        }
    }
    public static void main(String[] args)
    {
        value(new int[] {0,2,3,4,6},8);
        value(new int[] {6,8,2,5,7},8);
    }
}