import java.util.*;
public class array1 {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int size = sc.nextInt();
            String names[] = new String[size];

            for(int i=0; i<size; i++){
                names[i]= sc.next();
            }
            
            for(int i=0; i<size; i++){
                System.out.println("name " + (i+1) +" is : " + names[i]);
            }
        }
    }
    
}
