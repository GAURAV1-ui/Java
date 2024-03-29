import java.io.*;
public class SubsetSum {

    public static boolean isSubsetSum(int set[], int n ,int sum) {
    //     boolean subset[][] = new boolean[sum+1][n+1];

    //     for (int i =0; i<=n; i++) {
    //         subset[0][i] = true; 
    //     }

    //     for(int i = 1; i<=sum; i++){
    //         subset[i][0] = false;
    //     }

    //     for(int i =1; i<=sum; i++){
    //         for(int j =1; j<=n; j++ ){
    //             if(arr[i-1] <= j) {
    //             subset[i][j] = subset[i][j-arr[i-1]] || subset[i-1][j];
    //             } else {
    //                 subset[i][j] = subset[i-1][j];
    //             }
    //         }
    //     }

    //     return subset[sum][n];
    // }
    // public static void main(String[] args) {
    //     int arr[] = new int[] { 10, 20, 30 };
    //     int sum = 50;
    //     int n = arr.length;
    //     // SubsetSum(arr,sum,n);
    //     if (SubsetSum1(arr, sum, n) == true)
    //         System.out.println("Found a subset"
    //                            + " with given sum");
    //     else
    //         System.out.println("No subset with"
    //                            + " given sum");
    // }

    boolean subset[][] = new boolean[sum + 1][n + 1];
 

    for (int i = 0; i <= n; i++)
        subset[0][i] = true;


    for (int i = 1; i <= sum; i++)
        subset[i][0] = false;

   
    for (int i = 1; i <= sum; i++) {
        for (int j = 1; j <= n; j++) {
            subset[i][j] = subset[i][j - 1];
            if (i >= set[j - 1])
                subset[i][j]
                    = subset[i][j]
                      || subset[i - set[j - 1]][j - 1];
        }
    }

    // for (int i = 0; i <= sum; i++)
    // {
    for (int j = 0; j <= n; j++){
        System.out.print(subset[n][j]);
        if(subset[n][j]){
            System.out.println(sum);
        }
    }
    // }

    return subset[sum][n];
}

public static void main(String args[])
{
    int set[] = { 3, 34, 4, 12, 5, 2 };
    int sum = 9;
    int n = set.length;
    if (isSubsetSum(set, n, sum) == true)
        System.out.println("Found a subset"
                           + " with given sum");
    else
        System.out.println("No subset with"
                           + " given sum");
}

}
