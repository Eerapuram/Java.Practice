package hashset;

import java.util.HashSet;

public class ArraySum {
    public static void findPairs(int arr1[], int arr2[],
                                 int n, int m, int x)
    {

        HashSet<Integer> s = new HashSet<Integer>();

        for (int i = 0; i < n; i++)
            s.add(arr1[i]);


        for (int j = 0; j < m; j++)
            if (s.contains(x - arr2[j]))
                System.out.println(x - arr2[j] + " " + arr2[j]);
    }


    public static void main(String[] args)
    {
        int arr1[] = { 0 , 2 , 3 , 4 , 6};
        int arr2[] = { 6 , 8 , 2 , 5 , 7 };
        int x = 8;

        findPairs(arr1, arr2, arr1.length, arr2.length, x);
    }
}
