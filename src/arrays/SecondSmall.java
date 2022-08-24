package arrays;

public class SecondSmall {
    public static void main(String[] args) {

        int arr[] = {4,6,2,8,0};
        int small = arr[0];
        int secondSmall = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < small) {
                secondSmall = small;
                small = arr[i];

            } else if (arr[i] < secondSmall) {
                secondSmall = arr[i];

            }
        }

        System.out.println("\nSecond smallest number is:" + secondSmall);

    }
}
