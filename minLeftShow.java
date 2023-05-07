import java.util.*;
public class minLeftShow {
    
        public static void main (String[] args){
             int arr_size = 0;
             try (Scanner sc = new Scanner(System.in)) {
                if (sc.hasNextInt()) {
                    arr_size = sc.nextInt();
                }
     
                int[] arr = new int[arr_size];
     
                for (int i = 0; i < arr_size; i++) {
                    if (sc.hasNextInt()) {
                        arr[i] = sc.nextInt();
                    }
                    
                }
                for (int i = 0; i < arr_size; i++) {
                if(arr[i] >= 24){
                    System.out.println("Yes");
                }else{
                    System.out.println("No");
                }
                 }
            }
        }
}
