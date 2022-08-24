package arrays;

public class ArrSum {
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

        value(new int[] {4,6,2,8,0},8);
    }
}